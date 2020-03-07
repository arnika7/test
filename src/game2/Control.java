package game2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Control {

	public void save(Data data, Gui ui) throws IOException {
		data.trigger = 0;
		OutputStream os = new FileOutputStream("jungle.ser"); // 1: 스트림 오픈
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(data);
		out.close();
		ui.addText("저장 완료");
	}

	public Data load(Data data, Gui ui) throws ClassNotFoundException, IOException {
		InputStream is = new FileInputStream("jungle.ser");
		ObjectInputStream in = new ObjectInputStream(is);
		data = (Data) in.readObject();
		in.close();
		
		return data;
	}

	public Data playerMove(Data data, Gui ui) throws IOException, ClassNotFoundException {
		Data savefile = new Data();
		ui.btn1.setText("1. SAVE");
		ui.btn2.setText(" ");
		ui.btn3.setText("2. LOAD");
		ui.btn4.setText(" ");
		ui.setData(data);

		ActionListener acUp = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.playY == 8) {
					ui.addText("그 쪽으로는 이동할 수 없습니다");
				} else {
					data.playY += 1;
					ui.setData(data);
					noti();
				}
			}
		};
		ui.btnUp.addActionListener(acUp);

		ActionListener acDown = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.playY == 0) {
					ui.addText("그 쪽으로는 이동할 수 없습니다");
				} else {
					data.playY -= 1;
					ui.setData(data);
					noti();
				}
			}
		};
		ui.btnDown.addActionListener(acDown);

		ActionListener acLeft = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.playX == 0) {
					ui.addText("그 쪽으로는 이동할 수 없습니다");
				} else {
					data.playX -= 1;
					ui.setData(data);
					noti();
				}
			}
		};
		ui.btnLeft.addActionListener(acLeft);

		ActionListener acRight = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.playX == 9) {
					ui.addText("그 쪽으로는 이동할 수 없습니다");
				} else {
					data.playX += 1;
					ui.setData(data);
					noti();
				}
			}
		};
		ui.btnRight.addActionListener(acRight);

		ActionListener saveBtn = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.trigger = 1;
				ui.addText("저장중...");
				noti();
			}
		};
		ui.btn1.addActionListener(saveBtn);

		ActionListener loadBtn = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.trigger = 2;
				ui.addText("마지막 저장 지점을 불러옵니다... ");
				noti();
			}
		};
		ui.btn3.addActionListener(loadBtn);

		try {
			synchronized (this) {
				wait();
				if (data.trigger == 1) {
					ui.btn1.removeActionListener(saveBtn);
					ui.btn3.removeActionListener(loadBtn);
					save(data, ui);
					wait();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ui.btnUp.removeActionListener(acUp); // 방향 버튼 초기화
		ui.btnDown.removeActionListener(acDown);
		ui.btnRight.removeActionListener(acRight);
		ui.btnLeft.removeActionListener(acLeft);
		ui.btn1.removeActionListener(saveBtn);
		ui.btn3.removeActionListener(loadBtn);
		
		if(data.trigger == 2) {
			try {
				ui.textArea.append("불러오는중 ...");
				Thread.sleep(200);
				ui.textArea.append("...");
				Thread.sleep(200);
				ui.textArea.append("...");
				Thread.sleep(200);
				ui.textArea.append("...");
				Thread.sleep(200);
				ui.textArea.append("...");
				Thread.sleep(200);
				ui.textArea.append("...");
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			savefile = load(data,ui);
			ui.textArea.append("... 완료!\n");
			return savefile;
		}
		
		for (int i = 0; i < 10; i++) {
			if (data.playX == data.star[i][0] && data.playY == data.star[i][1]) {
				ui.addText("★★ 별을 획득했습니다! ★★");
				data.star[i][1] = 9;
				ui.setData(data);
				return data;
			}
		}
		if (data.star[0][1] == 9 && data.star[1][1] == 9 && data.star[2][1] == 9 && data.star[3][1] == 9
				&& data.star[4][1] == 9 && data.star[5][1] == 9 && data.star[6][1] == 9 && data.star[7][1] == 9
				&& data.star[8][1] == 9 && data.star[9][1] == 9) {
			return data;
		}

		if (ui.checkRed(data.playX, data.playY) == 1) {
			ui.addText("불길속으로 들어가 체력이 감소합니다");
			data.playH = data.playH - (int) (data.playMaxHp * 0.4);
		}

		if (data.playH <= 0) {
			ui.setData(data);
			ui.addText("  GAME OVER  ");
			return data;
		}
		checkRandom(data, ui);
		check(data, ui);
		return data;

	}

	public void monMove(Data data, Gui ui) {
//		try {
//			ui.textArea.append("몬스터 이동중  1..");
//			Thread.sleep(150);
//			ui.textArea.append(" 0..");
//			Thread.sleep(150);
//			ui.textArea.append(" 이동완료! \n");
//			ui.textArea.setCaretPosition(ui.textArea.getDocument().getLength());
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
		for (int i = 0; i < 10; i++) {
			int way = randMove(data, i);// 랜덤이동
			switch (way) {
			case 0: // right
				for (int j = 0; j < 10; j++) {
					if ((data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1])
							|| (data.monStat[i][3] == data.randomX && data.monStat[i][4] == data.randomY)) {
						data.monStat[i][3] -= 1;
						break;
					} else if (data.monStat[i][3] == data.monStat[j][3] && data.monStat[i][4] == data.monStat[j][4]) {
						if (i == j)
							continue;
						data.monStat[i][3] -= 1;
						break;
					}
				}
				break;
			case 1: // left
				for (int j = 0; j < 10; j++) {
					if ((data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1])
							|| (data.monStat[i][3] == data.randomX && data.monStat[i][4] == data.randomY)) {
						data.monStat[i][3] += 1;
						break;
					} else if (data.monStat[i][3] == data.monStat[j][3] && data.monStat[i][4] == data.monStat[j][4]) {
						if (i == j)
							continue;
						data.monStat[i][3] += 1;
						break;
					}
				}
				break;
			case 2: // up
				for (int j = 0; j < 10; j++) {
					if ((data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1])
							|| (data.monStat[i][3] == data.randomX && data.monStat[i][4] == data.randomY)) {
						data.monStat[i][4] -= 1;
						break;
					} else if (data.monStat[i][3] == data.monStat[j][3] && data.monStat[i][4] == data.monStat[j][4]) {
						if (i == j)
							continue;
						data.monStat[i][4] -= 1;
						break;
					}
				}
				break;
			case 3: // down
				for (int j = 0; j < 10; j++) {
					if ((data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1])
							|| (data.monStat[i][3] == data.randomX && data.monStat[i][4] == data.randomY)) {
						data.monStat[i][4] += 1;
						break;
					} else if (data.monStat[i][3] == data.monStat[j][3] && data.monStat[i][4] == data.monStat[j][4]) {
						if (i == j)
							continue;
						data.monStat[i][4] += 1;
						break;
					}
				}
				break;
			case 4:
				break;

			}
		}
		ui.setData(data);
		check(data, ui);
	}

	public int randMove(Data data, int i) {
		int rd = (int) (Math.random() * 5);
		if (data.monStat[i][4] != 9) {
			switch (rd) {
			case 0:
				if (data.monStat[i][3] != 9) {
					data.monStat[i][3] += 1; // right
					return 0;
				}
				break;
			case 1:
				if (data.monStat[i][3] != 0) {
					data.monStat[i][3] -= 1; // left
					return 1;
				}
				break;
			case 2:
				if (data.monStat[i][4] != 8) {
					data.monStat[i][4] += 1; // up
					return 2;
				}
				break;
			case 3:
				if (data.monStat[i][4] != 0) {
					data.monStat[i][4] -= 1; // down
					return 3;
				}
				break;
			case 4:
				break;
			}
		}
		return 4;
	}

	public void check(Data data, Gui ui) {
		Battle bat;
		if (data.playY != 8) {// 상 확인 시작
			for (int i = 0; i < 10; i++) {
				if (data.playX == data.monStat[i][3]) {
					if (data.playY + 1 == data.monStat[i][4]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  " + ui.monster[i]);
						bat.start();
						try {
							synchronized (this) {
								wait();
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} // 상 확인 종료

		if (data.playY != 0) { // 하 확인 시작
			for (int i = 0; i < 10; i++) {
				if (data.playX == data.monStat[i][3]) {
					if (data.playY - 1 == data.monStat[i][4]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  " + ui.monster[i]);
						bat.start();
						try {
							synchronized (this) {
								wait();
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} // 하 확인 종료

		if (data.playX != 0) { // 좌 확인 시작
			for (int i = 0; i < 10; i++) {
				if (data.playY == data.monStat[i][4]) {
					if (data.playX - 1 == data.monStat[i][3]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  " + ui.monster[i]);
						bat.start();
						try {
							synchronized (this) {
								wait();
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} // 좌 확인 종료

		if (data.playX != 9) { // 우 확인 시작
			for (int i = 0; i < 10; i++) {
				if (data.playY == data.monStat[i][4]) {
					if (data.playX + 1 == data.monStat[i][3]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  " + ui.monster[i]);
						bat.start();
						try {
							synchronized (this) {
								wait();
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} // 우 확인 종료
	}

	public void battle(Data data, Gui ui, int i) {
		ui.btn1.setText(" ");
		ui.btn2.setText("1. 일반 공격");
		ui.btn3.setText(" ");
		ui.btn4.setText("2. 스킬 사용");
		int rdbox = (int) (Math.random() * 3);
		ui.monHp.setText(" " + ui.monster[i] + " HP: " + data.monStat[i][0] + " / 공격력: " + data.monStat[i][2]);
		ActionListener bt2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dmg = data.playAtk + data.playAtk * (Math.random() * 0.4 - 0.2);
				data.monStat[i][0] -= dmg;
				if (data.monStat[i][0] <= 0) {
					ui.addText(" Me 의 공격!  ▶   Mon Hp: 0" + "  ( -" + (int) dmg + " )");
					ui.addText("-- 처치했습니다! --\n");
					data.monStat[i][4] = 9;
					data.monStat[i][3] = i;
					if (rdbox == 0 && data.randomY == 9) {
						ui.addText("※※※ 랜덤 상자가 등장했습니다!! ※※※");
						randomBox(data, ui);
					}

					ui.setData(data);
					ui.monHp.setText("");
					noti();
				} else {
					ui.addText(" Me 의 공격!  ▶   Mon Hp: " + data.monStat[i][0] + "  ( -" + (int) dmg + " )");
					dmg = (data.monStat[i][2] + data.monStat[i][2] * (Math.random() * 0.4 - 0.2)) - data.playDef;
					if (dmg < 0)
						dmg = 0;
					data.playH -= dmg;
					ui.addText(ui.monster[i] + "의 공격!  ▶   Me Hp: " + data.playH + "  ( -" + (int) dmg + " )\n");
					ui.setData(data);
					ui.monHp.setText(
							" " + ui.monster[i] + " HP: " + data.monStat[i][0] + " / 공격력: " + data.monStat[i][2]);
					if (data.playH <= 0) {
						ui.addText("  GAME OVER  ");
						ui.btn1.removeActionListener(this);
					}
				}
			}
		};
		ui.btn2.addActionListener(bt2);

		try {
			synchronized (this) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ui.btn2.removeActionListener(bt2); // 전투 버튼 초기화
	}

	public void noti() {
		synchronized (this) {
			notifyAll();
		}
	}

	public void monAppear(Data data, int i) {
		if (i < 4)
			i = 4;
		switch (i) {
		case 4:
			data.monStat[0][4] = (int) (Math.random() * 6 + 3);
			data.monStat[0][3] = (int) (Math.random() * 4);

			data.monStat[1][4] = (int) (Math.random() * 6 + 3);
			data.monStat[1][3] = (int) (Math.random() * 2 + 4);

			data.monStat[2][4] = (int) (Math.random() * 6 + 3);
			data.monStat[2][3] = (int) (Math.random() * 4 + 6);

			data.monStat[3][4] = (int) (Math.random() * 3);
			data.monStat[3][3] = (int) (Math.random() * 8 + 2);
			break;
		case 5:
			data.monStat[0][4] = (int) (Math.random() * 6 + 3);
			data.monStat[0][3] = (int) (Math.random() * 4);

			data.monStat[1][4] = (int) (Math.random() * 6 + 3);
			data.monStat[1][3] = (int) (Math.random() * 3 + 7);

			data.monStat[2][4] = (int) (Math.random() * 6 + 3);
			data.monStat[2][3] = (int) (Math.random() * 3 + 4);

			data.monStat[3][4] = (int) (Math.random() * 3);
			data.monStat[3][3] = (int) (Math.random() * 4 + 3);

			data.monStat[4][4] = (int) (Math.random() * 3);
			data.monStat[4][3] = (int) (Math.random() * 3 + 7);
			break;
		case 6:
			data.monStat[0][4] = (int) (Math.random() * 5 + 4);
			data.monStat[0][3] = (int) (Math.random() * 4);

			data.monStat[1][4] = (int) (Math.random() * 5 + 4);
			data.monStat[1][3] = (int) (Math.random() * 3 + 7);

			data.monStat[2][4] = (int) (Math.random() * 5 + 4);
			data.monStat[2][3] = (int) (Math.random() * 3 + 4);

			data.monStat[3][4] = (int) (Math.random() * 3);
			data.monStat[3][3] = (int) (Math.random() * 4 + 3);

			data.monStat[4][4] = (int) (Math.random() * 3);
			data.monStat[4][3] = (int) (Math.random() * 3 + 7);

			data.monStat[5][4] = 3;
			data.monStat[5][3] = (int) (Math.random() * 10);
			break;

		}
	}

	public boolean checkStar(Data data, int j) {
		if (data.star[j][0] == 0 && data.star[j][1] == 0)
			return false;
		for (int i = 0; i < 10; i++) {
			if (data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1]) {
				return false;
			} else if (data.star[j][0] == data.star[i][0] && data.star[j][1] == data.star[i][1]) {
				if (i == j)
					continue;
				return false;
			}
		}
		return true;
	}

	public void makeStar(Data data, int i) {
		int x;
		int y;
		while (true) {
			x = (int) (Math.random() * 10);
			y = (int) (Math.random() * 9);
			data.star[i][0] = x;
			data.star[i][1] = y;
			if (checkStar(data, i))
				break;
		}
		if (i == 0)
			return;
		makeStar(data, --i);
	}

	public void starAppear(Data data, int i) {
		int x;
		int y;
		switch (i) {
		case 1:
			makeStar(data, 2);
			break;
		case 2:
			makeStar(data, 3);
			break;
		case 3:
			makeStar(data, 4);
			break;
		case 4:
			makeStar(data, 5);
			break;
		case 5:
			makeStar(data, 7);
			break;
		case 6:
			makeStar(data, 9);
			break;
		}
	}

	public void randomBox(Data data, Gui ui) {
		int x = 1;
		int y = 1;
		boolean con = true;
		while (con) {
			x = (int) (Math.random() * 9 + 1);
			y = (int) (Math.random() * 8 + 1);
			for (int i = 0; i < 10; i++) {
				if ((x != data.star[i][0] && y != data.star[i][1])
						&& (x != data.monStat[i][3] && y != data.monStat[i][4])) {
					con = false;
				}
			}
		}
		data.randomX = x;
		data.randomY = y;
	}

	public void checkRandom(Data data, Gui ui) {
		int rd = (int) (Math.random() * 6);
		if (data.playX == data.randomX && data.playY == data.randomY) {
			switch (rd) {
			case 0:
				ui.addText("\n------랜덤 상자 발견!!------");
				ui.addText(" 최대 체력이 늘어납니다!");
				ui.addText("----------------------------------\n");
				data.playMaxHp += 250;
				data.playReHp += 3;
				break;
			case 1:
				ui.addText("\n------랜덤 상자 발견!!------");
				ui.addText(" 공격력이 증가합니다!");
				ui.addText("----------------------------------\n");
				data.playAtk += 30;
				break;
			case 2:
				ui.addText("\n------랜덤 상자 발견!!------");
				ui.addText(" 체력 재생이 증가합니다!");
				ui.addText("----------------------------------\n");
				data.playReHp += 10;
				break;
			case 3:
				ui.addText("\n------랜덤 상자 발견!!------");
				ui.addText(" 방어력이 증가합니다!");
				ui.addText("----------------------------------\n");
				data.playDef += 15;
				break;
			case 4:
				ui.addText("\n------랜덤 상자 발견!!------");
				ui.addText(" 체력 포션을 발견했습니다!");
				ui.addText("----------------------------------\n");
				data.potion += 1;
				break;
			case 5:
				ui.addText("\n------랜덤 상자 발견!!------");
				ui.addText(" 최대 체력이 늘어납니다!");
				ui.addText("----------------------------------\n");
				data.playMaxHp += 250;
				data.playReHp += 3;
				break;
			}
			data.randomX = 0;
			data.randomY = 9;
			ui.setData(data);
		}
	}

}

class Move extends Thread {
	Control con;
	Data data;
	Gui ui;

	Move(Control con, Data data, Gui ui) {
		this.con = con;
		this.data = data;
		this.ui = ui;
	}

	public void run() {
		ui.addText("*********************************************");
		ui.addText("    동물과 불을 피해 별을 다 모으세요!");
		ui.addText("*********************************************");
		ui.addText(" (불에 닿으면 최대체력의 40% 피해를 입습니다)");
		ui.addText(" (동물을 사냥할 시 일정 확률로 랜덤상자가 리젠됩니다)");

		while (true) {
			ui.stage.setText("   Stage " + data.turn + " ");
			ui.addText("");
			ui.addText("  Stage " + data.turn + ". START!!");
			ui.makeTrap(data, data.turn);
			con.monAppear(data, data.turn);
			con.starAppear(data, data.turn);
			con.randomBox(data, ui);
			while (true) {
				try {
					data = con.playerMove(data, ui);
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				}
				if (data.playH <= 0) {
					return;
				}
				if (data.star[0][1] == 9 && data.star[1][1] == 9 && data.star[2][1] == 9 && data.star[3][1] == 9
						&& data.star[4][1] == 9 && data.star[5][1] == 9 && data.star[6][1] == 9 && data.star[7][1] == 9
						&& data.star[8][1] == 9 && data.star[9][1] == 9) {
					ui.addText("-------------------------------");
					ui.addText("*** 스테이지 클리어 ***");
					ui.addText("-------------------------------");
					data.playX = 0;
					data.playY = 0;
					data.playH = data.playMaxHp;
					for (int i = 0; i < 10; i++) {
						data.monStat[i][0] = 1000;
						data.monStat[i][2] += 15;
					}
					ui.allWhite();
//					turn = 1;
					break;
				} else {
					con.monMove(data, ui);
					data.playH += data.playReHp;
					if (data.playH > data.playMaxHp)
						data.playH = data.playMaxHp;
					data.playM += 5;
					if (data.playM > 100)
						data.playM = 100;
//					turn++;
				}

			}
			if (data.playH <= 0) {
				return;
			}
			data.turn++;
		}
	}
}

class Battle extends Thread {
	Control con;
	Data data;
	Gui ui;
	int i;

	Battle(Control con, Data data, Gui ui, int i) {
		this.con = con;
		this.data = data;
		this.ui = ui;
		this.i = i;
	}

	public void run() {
		con.battle(data, ui, i);
	}
}

package game2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {

	public void playerMove(Data data, Gui ui) {
		ui.btn1.setText("");
//		ui.btn2.setText("2. 아이템 사용");
//		ui.btn3.setText("3. 장비 교체");
//		ui.btn4.setText("4. 게임 종료");
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

		try {
			synchronized (this) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ui.btnUp.removeActionListener(acUp); // 방향 버튼 초기화
		ui.btnDown.removeActionListener(acDown);
		ui.btnRight.removeActionListener(acRight);
		ui.btnLeft.removeActionListener(acLeft);
		for (int i = 0; i < 10; i++) {
			if (data.playX == data.star[i][0] && data.playY == data.star[i][1]) {
				ui.addText("★★ 별을 획득했습니다! ★★");
				data.star[i][1] = 9;
				ui.setData(data);
				break;
			}
		}
		if (data.star[0][1] == 9 && data.star[1][1] == 9 && data.star[2][1] == 9 && data.star[3][1] == 9
				&& data.star[4][1] == 9 && data.star[5][1] == 9 && data.star[6][1] == 9 && data.star[7][1] == 9
				&& data.star[8][1] == 9 && data.star[9][1] == 9) {
			return;
		}

		if (ui.checkRed(data.playX, data.playY) == 1) {
			ui.addText("불길속으로 들어가 체력이 300 감소합니다");
			data.playH -= 300;

		}
		if (data.playH <= 0) {
			ui.setData(data);
			ui.addText("  GAME OVER  ");
			return;
		}
		check(data, ui);

	}

	public void monMove(Data data, Gui ui) {
		try {
			ui.textArea.append("몬스터 이동중  1..");
			Thread.sleep(200);
			ui.textArea.append(" 0..");
			Thread.sleep(200);
			ui.textArea.append(" 이동완료! \n");
			ui.textArea.setCaretPosition(ui.textArea.getDocument().getLength());
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < 6; i++) {
			int way = randMove(data, i);// 랜덤이동
			switch (way) {
			case 0: // right
				for (int j = 0; j < 6; j++) {
					if (data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1]) {
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
				for (int j = 0; j < 6; j++) {
					if (data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1]) {
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
				for (int j = 0; j < 6; j++) {
					if (data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1]) {
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
				for (int j = 0; j < 6; j++) {
					if (data.monStat[i][3] == data.star[j][0] && data.monStat[i][4] == data.star[j][1]) {
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
			for (int i = 0; i < 6; i++) {
				if (data.playX == data.monStat[i][3]) {
					if (data.playY + 1 == data.monStat[i][4]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  Moster " + i);
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
			for (int i = 0; i < 6; i++) {
				if (data.playX == data.monStat[i][3]) {
					if (data.playY - 1 == data.monStat[i][4]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  Moster " + i);
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
			for (int i = 0; i < 6; i++) {
				if (data.playY == data.monStat[i][4]) {
					if (data.playX - 1 == data.monStat[i][3]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  Moster " + i);
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
			for (int i = 0; i < 6; i++) {
				if (data.playY == data.monStat[i][4]) {
					if (data.playX + 1 == data.monStat[i][3]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  Moster " + i);
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
		ui.btn1.setText("1. 일반 공격");
//		ui.btn2.setText("2. 스킬 사용");
//		ui.btn3.setText("3. 아이템 사용");
//		ui.btn4.setText("4. 도망");
		ui.monHp.setText("  Monster " + i + " HP: " + data.monStat[i][0]);
		ActionListener bt1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dmg = data.playAtk + data.playAtk * (Math.random() * 0.4 - 0.2);
				data.monStat[i][0] -= dmg;
				if (data.monStat[i][0] <= 0) {
					ui.addText("Me 의 공격!  ▶   Mon Hp: 0" + "  ( -" + (int) dmg + " )");
					ui.addText("-- 처치했습니다! --\n");
					data.monStat[i][4] = 9;
					data.monStat[i][3] = i;
					ui.setData(data);
					ui.monHp.setText("");
					noti();
				} else {
					ui.addText("Me 의 공격!  ▶   Mon Hp: " + data.monStat[i][0] + "  ( -" + (int) dmg + " )");
					dmg = data.monStat[i][2] + data.monStat[i][2] * (Math.random() * 0.4 - 0.2);
					data.playH -= dmg;
					ui.addText("Monster " + i + " 의 공격!  ▶   Me Hp: " + data.playH + "  ( -" + (int) dmg + " )\n");
					ui.setData(data);
					ui.monHp.setText("  Monster " + i + " HP: " + data.monStat[i][0]);
					if (data.playH <= 0) {
						ui.addText("  GAME OVER  ");
						ui.btn1.removeActionListener(this);
					}
				}
			}
		};
		ui.btn1.addActionListener(bt1);

		ui.btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		ui.btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		ui.btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		try {
			synchronized (this) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ui.btn1.removeActionListener(bt1); // 전투 버튼 초기화
	}

	public void noti() {
		synchronized (this) {
			notifyAll();
		}
	}

	public void monAppear(Data data, int i) {
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
			
			break;
		case 6:
			
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

}

class Move extends Thread {
	Control con;
	Data data;
	Gui ui;
	int i = 1;

	Move(Control con, Data data, Gui ui) {
		this.con = con;
		this.data = data;
		this.ui = ui;
	}

	public void run() {
		ui.addText("*********************************************");
		ui.addText("  몬스터들과 불을 피해 별을 다 모으세요!");
		ui.addText("  몬스터는 숫자가 높을수록 더 강합니다.");
		ui.addText("*********************************************");

		while (true) {
			ui.stage.setText("     Stage " + i + " ");
			ui.addText("");
			ui.addText("  Stage " + i + ". START!!");
			ui.makeTrap(i);
			con.monAppear(data, 4);
			con.starAppear(data, i);
			while (true) {
				con.playerMove(data, ui);
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
					data.playH = 1000;
					for (int i = 0; i < 6; i++) {
						data.monStat[i][0] = 1000;
					}
					ui.allWhite();
					break;
				} else {
					con.monMove(data, ui);
					if (data.playH < 996)
						data.playH += 5;
					if (data.playM < 96)
						data.playM += 5;
				}
			}
			if (data.playH <= 0) {
				return;
			}
			i++;
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

package game2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {

	public void playerMove(Data data, Gui ui) {
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
		ui.btnUp.removeActionListener(acUp);  //방향 버튼 초기화
		ui.btnDown.removeActionListener(acDown);
		ui.btnRight.removeActionListener(acRight);
		ui.btnLeft.removeActionListener(acLeft);
		check(data, ui);
	}

	public void check(Data data, Gui ui) {
		Battle bat;
		if (data.playY != 8) {// 상 확인 시작
			for (int i = 0; i < 6; i++) {
				if (data.playX == data.monStat[i][3]) {
					if (data.playY + 1 == data.monStat[i][4]) {
						bat = new Battle(this, data, ui, i);
						ui.addText("Me  VS  Moster "+i );
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
						ui.addText("Me  VS  Moster "+i );
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
						ui.addText("Me  VS  Moster "+i );
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
						ui.addText("Me  VS  Moster "+i );
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
		ActionListener bt1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.monStat[i][0] -= 50;
				ui.addText("MonHp: " + data.monStat[i][0]);
				if (data.monStat[i][0] <= 0) {
					ui.addText("승리했습니다!!");
					data.monStat[i][4] = 9;
					data.monStat[i][3] = i;
					ui.setData(data);
					noti();
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
		ui.btn1.removeActionListener(bt1);  //전투 버튼 초기화
	}

	
	public void noti() {
		synchronized (this) {
			notifyAll();
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
		while (true) {
			con.playerMove(data, ui);
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

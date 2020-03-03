package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Move extends Thread {
	Data data;
	Gui ui;

	Sh sh = new Sh();

	Move(Sh sh,Data data, Gui ui) {
		this.data = data;
		this.ui = ui;
		this.sh = sh;
	}

	public void run() {
		sh.MoveP(data, ui);
	}
}

class Lh extends Thread {
	Data data;
	Gui ui;

	Sh sh = new Sh();

	Lh(Sh sh,Data data, Gui ui) {
		this.data = data;
		this.ui = ui;
		this.sh = sh;
	}

	public void run() {
		sh.check(data, ui);
	}
}

class Sh {
	int i = 0;

	public void MoveP(Data data, Gui ui) {
		Lh lh = new Lh(this,data, ui);
		data.turn = 1;
		ui.btnUp.addActionListener(new ActionListener() { // Up 버튼
			public void actionPerformed(ActionEvent e) {
				if (data.turn == 1) {
					data.turn = 2;
					ui.setData(data);
					ui.addText("대기합시다");

				}
			}
		});
		try {
			synchronized (this) {
				System.out.println("대기중");
				wait();
				System.out.println("대기종료");
			}
		} catch (Exception e2) {
		}
	}

	public void check(Data data, Gui ui) {
		
		ui.btn1.addActionListener(new ActionListener() { // Up 버튼
			public void actionPerformed(ActionEvent e) {
				i += 1;
				ui.addText("버튼 눌러짐 i=" + i);
				System.out.println("체크 실행");
				synchronized (this) {
					notifyAll();
					ui.addText("노티파이");
				}
			}
		});

	}
}

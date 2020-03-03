package game;
//스레드 순서 규칙화

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//공유클래스
class Trol {
	

	public void getTodayNews(Data data,Gui ui) {
		Noti noti = new Noti(this,ui);
		ui.btnUp.addActionListener(new ActionListener() { // Up 버튼
			public void actionPerformed(ActionEvent e) {
					ui.setData(data);
					ui.addText("대기합시다");
			}
		});
		noti.start();
		try {
			synchronized (this) { // wait 와 notify 동시호출 방지 위래 wait 완료 기다림
				wait(); // 스레드 제어를 위해 오브젝트가 상속해준 메서드 (신호가 오기 전까지 스레드가 sleep)
				ui.addText("깨어남");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void Noti(Gui ui) {
		ui.btn1.addActionListener(new ActionListener() { // Up 버튼
		public void actionPerformed(ActionEvent e) {
			ui.addText("노티파이");
			Notif(ui);
		}
	});
	}
	
	public void Notif( Gui ui) {
		synchronized (this) {
			notifyAll();
			ui.addText("노티파이");
		}
	}

}

//스레드 클래스
//Writer & Reader 동시 실행 , Writer 완료까지 Reader 대기
//Writer -> NewsPaper -> Reader

class Noti extends Thread {
	Trol tr;
	Gui ui;

	Noti(Trol paper,Gui ui) {
		this.tr = paper;
		this.ui = ui;
	}

	public void run() {
		tr.Noti(ui);
	}
}

class Up extends Thread {
	Trol tr;
	Data data; 
	Gui ui;

	Up(Trol paper, Data data, Gui ui) {
		this.tr = paper;
		this.ui = ui;
		this.data = data;
	}

	public void run() {
		tr.getTodayNews(data,ui);
	}
}

public class NewsPaperStory {
	public static void main(String[] args) {
		Trol tr = new Trol();
		Data data = new Data(); 
		Gui ui = new Gui();

//		Noti noti = new Noti(tr,ui);
		Up up = new Up(tr,data,ui);
		
		ui.setVisible(true);
		
		up.start();
		
		try {
//			write.start();
//			write.join();
			up.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

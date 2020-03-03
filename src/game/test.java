package game;

import java.util.Scanner;

public class test {
	public static void main(String[] args) throws InterruptedException {
		Sh sh = new Sh();
		Data data = new Data();
		Gui ui = new Gui();
		Lh ls = new Lh(sh,data , ui);
		Move move = new Move(sh,data , ui);
		ui.setVisible(true);
		move.start();
		ls.start();
		move.join();
	}
}

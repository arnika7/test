package game;

public class Start {
	public static void main(String[] args) throws InterruptedException {
		Data data = new Data();
		Control con = new Control();
		Gui ui = new Gui();
		ui.setVisible(true);

		data.playX = 0;
		data.playY = 0;
		data.turn = 1;
		con.MonAppear4(data);
		ui.setData(data);
		ui.setT(data.playX, data.playY, "Me");
		con.PlayerMove(data, ui);

	}

}

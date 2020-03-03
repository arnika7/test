package game2;

public class Start {
	public static void main(String[] args) {
		Data data = new Data();
		Gui ui = new Gui();
		Control con = new Control();
		
		ui.setVisible(true);
		
		Move move = new Move(con , data ,ui);
		move.start();

	}
}

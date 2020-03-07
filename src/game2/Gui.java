package game2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.io.Serializable;
import java.awt.Font;
import javax.swing.UIManager;

public class Gui extends JFrame {
	JPanel contentPane;
	JTextField tx08;
	JTextField tx07;
	JTextField tx18;
	JTextField tx17;
	JTextField tx06;
	JTextField tx05;
	JTextField tx16;
	JTextField tx15;
	JTextField tx04;
	JTextField tx03;
	JTextField tx14;
	JTextField tx13;
	JTextField tx02;
	JTextField tx01;
	JTextField tx12;
	JTextField tx11;
	JTextField tx28;
	JTextField tx27;
	JTextField tx38;
	JTextField tx37;
	JTextField tx26;
	JTextField tx25;
	JTextField tx36;
	JTextField tx35;
	JTextField tx24;
	JTextField tx23;
	JTextField tx34;
	JTextField tx33;
	JTextField tx22;
	JTextField tx21;
	JTextField tx32;
	JTextField tx31;
	JTextField tx48;
	JTextField tx47;
	JTextField tx58;
	JTextField tx57;
	JTextField tx46;
	JTextField tx45;
	JTextField tx56;
	JTextField tx55;
	JTextField tx44;
	JTextField tx43;
	JTextField tx54;
	JTextField tx53;
	JTextField tx68;
	JTextField tx67;
	JTextField tx78;
	JTextField tx77;
	JTextField tx66;
	JTextField tx65;
	JTextField tx76;
	JTextField tx75;
	JTextField tx88;
	JTextField tx87;
	JTextField tx98;
	JTextField tx97;
	JTextField tx86;
	JTextField tx85;
	JTextField tx96;
	JTextField tx95;
	JTextField tx84;
	JTextField tx83;
	JTextField tx94;
	JTextField tx93;
	JTextField tx82;
	JTextField tx81;
	JTextField tx92;
	JTextField tx91;
	JTextField tx62;
	JTextField tx61;
	JTextField tx72;
	JTextField tx71;
	JTextField tx42;
	JTextField tx41;
	JTextField tx52;
	JTextField tx51;
	JTextField tx64;
	JTextField tx63;
	JTextField tx74;
	JTextField tx73;
	JTextField tx00;
	JTextField tx10;
	JTextField tx20;
	JTextField tx30;
	JTextField tx80;
	JTextField tx90;
	JTextField tx60;
	JTextField tx70;
	JTextField tx40;
	JTextField tx50;
	JButton btnLeft;
	JButton btnDown;
	JButton btnRight;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextArea textArea = new JTextArea();
	JButton btnUp;
	private JTextField hp;
	private JTextField mp;
	JTextField monHp;
	JTextField stage;
	String[] monster = {"다람쥐"," 토끼"," 사슴"," 여우","멧돼지"," 늑대"," 사자","호랑이","  곰","코끼리"};
	private JTextField maxHp;
	private JTextField atk;
	private JTextField def;
	private JTextField re;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Gui frame = new Gui();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public void allWhite() {
		tx00.setBackground(Color.WHITE);
		tx01.setBackground(Color.WHITE);
		tx02.setBackground(Color.WHITE);
		tx03.setBackground(Color.WHITE);
		tx04.setBackground(Color.WHITE);
		tx05.setBackground(Color.WHITE);
		tx06.setBackground(Color.WHITE);
		tx07.setBackground(Color.WHITE);
		tx08.setBackground(Color.WHITE);
		tx10.setBackground(Color.WHITE);
		tx11.setBackground(Color.WHITE);
		tx12.setBackground(Color.WHITE);
		tx13.setBackground(Color.WHITE);
		tx14.setBackground(Color.WHITE);
		tx15.setBackground(Color.WHITE);
		tx16.setBackground(Color.WHITE);
		tx17.setBackground(Color.WHITE);
		tx18.setBackground(Color.WHITE);
		tx20.setBackground(Color.WHITE);
		tx21.setBackground(Color.WHITE);
		tx22.setBackground(Color.WHITE);
		tx23.setBackground(Color.WHITE);
		tx24.setBackground(Color.WHITE);
		tx25.setBackground(Color.WHITE);
		tx26.setBackground(Color.WHITE);
		tx27.setBackground(Color.WHITE);
		tx28.setBackground(Color.WHITE);
		tx30.setBackground(Color.WHITE);
		tx31.setBackground(Color.WHITE);
		tx32.setBackground(Color.WHITE);
		tx33.setBackground(Color.WHITE);
		tx34.setBackground(Color.WHITE);
		tx35.setBackground(Color.WHITE);
		tx36.setBackground(Color.WHITE);
		tx37.setBackground(Color.WHITE);
		tx38.setBackground(Color.WHITE);
		tx40.setBackground(Color.WHITE);
		tx41.setBackground(Color.WHITE);
		tx42.setBackground(Color.WHITE);
		tx43.setBackground(Color.WHITE);
		tx44.setBackground(Color.WHITE);
		tx45.setBackground(Color.WHITE);
		tx46.setBackground(Color.WHITE);
		tx47.setBackground(Color.WHITE);
		tx48.setBackground(Color.WHITE);
		tx50.setBackground(Color.WHITE);
		tx51.setBackground(Color.WHITE);
		tx52.setBackground(Color.WHITE);
		tx53.setBackground(Color.WHITE);
		tx54.setBackground(Color.WHITE);
		tx55.setBackground(Color.WHITE);
		tx56.setBackground(Color.WHITE);
		tx57.setBackground(Color.WHITE);
		tx58.setBackground(Color.WHITE);
		tx60.setBackground(Color.WHITE);
		tx61.setBackground(Color.WHITE);
		tx62.setBackground(Color.WHITE);
		tx63.setBackground(Color.WHITE);
		tx64.setBackground(Color.WHITE);
		tx65.setBackground(Color.WHITE);
		tx66.setBackground(Color.WHITE);
		tx67.setBackground(Color.WHITE);
		tx68.setBackground(Color.WHITE);
		tx70.setBackground(Color.WHITE);
		tx71.setBackground(Color.WHITE);
		tx72.setBackground(Color.WHITE);
		tx73.setBackground(Color.WHITE);
		tx74.setBackground(Color.WHITE);
		tx75.setBackground(Color.WHITE);
		tx76.setBackground(Color.WHITE);
		tx77.setBackground(Color.WHITE);
		tx78.setBackground(Color.WHITE);
		tx80.setBackground(Color.WHITE);
		tx81.setBackground(Color.WHITE);
		tx82.setBackground(Color.WHITE);
		tx83.setBackground(Color.WHITE);
		tx84.setBackground(Color.WHITE);
		tx85.setBackground(Color.WHITE);
		tx86.setBackground(Color.WHITE);
		tx87.setBackground(Color.WHITE);
		tx88.setBackground(Color.WHITE);
		tx90.setBackground(Color.WHITE);
		tx91.setBackground(Color.WHITE);
		tx92.setBackground(Color.WHITE);
		tx93.setBackground(Color.WHITE);
		tx94.setBackground(Color.WHITE);
		tx95.setBackground(Color.WHITE);
		tx96.setBackground(Color.WHITE);
		tx97.setBackground(Color.WHITE);
		tx98.setBackground(Color.WHITE);
	}
	
	public void addText(String txt) {
		textArea.append(txt + "\n");
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public void setData(Data data) {
		tx00.setText("");
		tx01.setText("");
		tx02.setText("");
		tx03.setText("");
		tx04.setText("");
		tx05.setText("");
		tx06.setText("");
		tx07.setText("");
		tx08.setText("");
		tx10.setText("");
		tx11.setText("");
		tx12.setText("");
		tx13.setText("");
		tx14.setText("");
		tx15.setText("");
		tx16.setText("");
		tx17.setText("");
		tx18.setText("");
		tx20.setText("");
		tx21.setText("");
		tx22.setText("");
		tx23.setText("");
		tx24.setText("");
		tx25.setText("");
		tx26.setText("");
		tx27.setText("");
		tx28.setText("");
		tx30.setText("");
		tx31.setText("");
		tx32.setText("");
		tx33.setText("");
		tx34.setText("");
		tx35.setText("");
		tx36.setText("");
		tx37.setText("");
		tx38.setText("");
		tx40.setText("");
		tx41.setText("");
		tx42.setText("");
		tx43.setText("");
		tx44.setText("");
		tx45.setText("");
		tx46.setText("");
		tx47.setText("");
		tx48.setText("");
		tx50.setText("");
		tx51.setText("");
		tx52.setText("");
		tx53.setText("");
		tx54.setText("");
		tx55.setText("");
		tx56.setText("");
		tx57.setText("");
		tx58.setText("");
		tx60.setText("");
		tx61.setText("");
		tx62.setText("");
		tx63.setText("");
		tx64.setText("");
		tx65.setText("");
		tx66.setText("");
		tx67.setText("");
		tx68.setText("");
		tx70.setText("");
		tx71.setText("");
		tx72.setText("");
		tx73.setText("");
		tx74.setText("");
		tx75.setText("");
		tx76.setText("");
		tx77.setText("");
		tx78.setText("");
		tx80.setText("");
		tx81.setText("");
		tx82.setText("");
		tx83.setText("");
		tx84.setText("");
		tx85.setText("");
		tx86.setText("");
		tx87.setText("");
		tx88.setText("");
		tx90.setText("");
		tx91.setText("");
		tx92.setText("");
		tx93.setText("");
		tx94.setText("");
		tx95.setText("");
		tx96.setText("");
		tx97.setText("");
		tx98.setText("");
		for (int i = 0; i < 20; i++) {
			setRed(data.redZone[i]);
		}

		setT(data.playX, data.playY, "Me");
		for (int i = 0; i < 6; i++) {
			setT(data.monStat[i][3], data.monStat[i][4], monster[i]);
		}
		for (int j = 0; j < 10; j++) {
			setT(data.star[j][0],data.star[j][1],"   ★");
		}
		setT(data.randomX,data.randomY,"    ?");
		
		hp.setText(" HP: " + data.playH);
		mp.setText(" MP: " + data.playM);
		maxHp.setText(" 체력 : "+data.playMaxHp);
		atk.setText(" 공격 : "+data.playAtk);
		def.setText(" 방어 : "+data.playDef);
		re.setText(" 재생 : "+data.playReHp);
	}

	public void setT(int x, int y, String name) {
		int num = (x * 10) + y;
		switch (num) {
		case 0:
			tx00.setText(name);
			break;
		case 1:
			tx01.setText(name);
			break;
		case 2:
			tx02.setText(name);
			break;
		case 3:
			tx03.setText(name);
			break;
		case 4:
			tx04.setText(name);
			break;
		case 5:
			tx05.setText(name);
			break;
		case 6:
			tx06.setText(name);
			break;
		case 7:
			tx07.setText(name);
			break;
		case 8:
			tx08.setText(name);
			break;
		case 10:
			tx10.setText(name);
			break;
		case 11:
			tx11.setText(name);
			break;
		case 12:
			tx12.setText(name);
			break;
		case 13:
			tx13.setText(name);
			break;
		case 14:
			tx14.setText(name);
			break;
		case 15:
			tx15.setText(name);
			break;
		case 16:
			tx16.setText(name);
			break;
		case 17:
			tx17.setText(name);
			break;
		case 18:
			tx18.setText(name);
			break;
		case 20:
			tx20.setText(name);
			break;
		case 21:
			tx21.setText(name);
			break;
		case 22:
			tx22.setText(name);
			break;
		case 23:
			tx23.setText(name);
			break;
		case 24:
			tx24.setText(name);
			break;
		case 25:
			tx25.setText(name);
			break;
		case 26:
			tx26.setText(name);
			break;
		case 27:
			tx27.setText(name);
			break;
		case 28:
			tx28.setText(name);
			break;
		case 30:
			tx30.setText(name);
			break;
		case 31:
			tx31.setText(name);
			break;
		case 32:
			tx32.setText(name);
			break;
		case 33:
			tx33.setText(name);
			break;
		case 34:
			tx34.setText(name);
			break;
		case 35:
			tx35.setText(name);
			break;
		case 36:
			tx36.setText(name);
			break;
		case 37:
			tx37.setText(name);
			break;
		case 38:
			tx38.setText(name);
			break;
		case 40:
			tx40.setText(name);
			break;
		case 41:
			tx41.setText(name);
			break;
		case 42:
			tx42.setText(name);
			break;
		case 43:
			tx43.setText(name);
			break;
		case 44:
			tx44.setText(name);
			break;
		case 45:
			tx45.setText(name);
			break;
		case 46:
			tx46.setText(name);
			break;
		case 47:
			tx47.setText(name);
			break;
		case 48:
			tx48.setText(name);
			break;
		case 50:
			tx50.setText(name);
			break;
		case 51:
			tx51.setText(name);
			break;
		case 52:
			tx52.setText(name);
			break;
		case 53:
			tx53.setText(name);
			break;
		case 54:
			tx54.setText(name);
			break;
		case 55:
			tx55.setText(name);
			break;
		case 56:
			tx56.setText(name);
			break;
		case 57:
			tx57.setText(name);
			break;
		case 58:
			tx58.setText(name);
			break;
		case 60:
			tx60.setText(name);
			break;
		case 61:
			tx61.setText(name);
			break;
		case 62:
			tx62.setText(name);
			break;
		case 63:
			tx63.setText(name);
			break;
		case 64:
			tx64.setText(name);
			break;
		case 65:
			tx65.setText(name);
			break;
		case 66:
			tx66.setText(name);
			break;
		case 67:
			tx67.setText(name);
			break;
		case 68:
			tx68.setText(name);
			break;
		case 70:
			tx70.setText(name);
			break;
		case 71:
			tx71.setText(name);
			break;
		case 72:
			tx72.setText(name);
			break;
		case 73:
			tx73.setText(name);
			break;
		case 74:
			tx74.setText(name);
			break;
		case 75:
			tx75.setText(name);
			break;
		case 76:
			tx76.setText(name);
			break;
		case 77:
			tx77.setText(name);
			break;
		case 78:
			tx78.setText(name);
			break;
		case 80:
			tx80.setText(name);
			break;
		case 81:
			tx81.setText(name);
			break;
		case 82:
			tx82.setText(name);
			break;
		case 83:
			tx83.setText(name);
			break;
		case 84:
			tx84.setText(name);
			break;
		case 85:
			tx85.setText(name);
			break;
		case 86:
			tx86.setText(name);
			break;
		case 87:
			tx87.setText(name);
			break;
		case 88:
			tx88.setText(name);
			break;
		case 90:
			tx90.setText(name);
			break;
		case 91:
			tx91.setText(name);
			break;
		case 92:
			tx92.setText(name);
			break;
		case 93:
			tx93.setText(name);
			break;
		case 94:
			tx94.setText(name);
			break;
		case 95:
			tx95.setText(name);
			break;
		case 96:
			tx96.setText(name);
			break;
		case 97:
			tx97.setText(name);
			break;
		case 98:
			tx98.setText(name);
			break;
		}
	}

	public void setRed(int num) {
		switch (num) {
		case 0:
			tx00.setBackground(Color.RED);
			break;
		case 1:
			tx01.setBackground(Color.RED);
			break;
		case 2:
			tx02.setBackground(Color.RED);
			break;
		case 3:
			tx03.setBackground(Color.RED);
			break;
		case 4:
			tx04.setBackground(Color.RED);
			break;
		case 5:
			tx05.setBackground(Color.RED);
			break;
		case 6:
			tx06.setBackground(Color.RED);
			break;
		case 7:
			tx07.setBackground(Color.RED);
			break;
		case 8:
			tx08.setBackground(Color.RED);
			break;
		case 10:
			tx10.setBackground(Color.RED);
			break;
		case 11:
			tx11.setBackground(Color.RED);
			break;
		case 12:
			tx12.setBackground(Color.RED);
			break;
		case 13:
			tx13.setBackground(Color.RED);
			break;
		case 14:
			tx14.setBackground(Color.RED);
			break;
		case 15:
			tx15.setBackground(Color.RED);
			break;
		case 16:
			tx16.setBackground(Color.RED);
			break;
		case 17:
			tx17.setBackground(Color.RED);
			break;
		case 18:
			tx18.setBackground(Color.RED);
			break;
		case 20:
			tx20.setBackground(Color.RED);
			break;
		case 21:
			tx21.setBackground(Color.RED);
			break;
		case 22:
			tx22.setBackground(Color.RED);
			break;
		case 23:
			tx23.setBackground(Color.RED);
			break;
		case 24:
			tx24.setBackground(Color.RED);
			break;
		case 25:
			tx25.setBackground(Color.RED);
			break;
		case 26:
			tx26.setBackground(Color.RED);
			break;
		case 27:
			tx27.setBackground(Color.RED);
			break;
		case 28:
			tx28.setBackground(Color.RED);
			break;
		case 30:
			tx30.setBackground(Color.RED);
			break;
		case 31:
			tx31.setBackground(Color.RED);
			break;
		case 32:
			tx32.setBackground(Color.RED);
			break;
		case 33:
			tx33.setBackground(Color.RED);
			break;
		case 34:
			tx34.setBackground(Color.RED);
			break;
		case 35:
			tx35.setBackground(Color.RED);
			break;
		case 36:
			tx36.setBackground(Color.RED);
			break;
		case 37:
			tx37.setBackground(Color.RED);
			break;
		case 38:
			tx38.setBackground(Color.RED);
			break;
		case 40:
			tx40.setBackground(Color.RED);
			break;
		case 41:
			tx41.setBackground(Color.RED);
			break;
		case 42:
			tx42.setBackground(Color.RED);
			break;
		case 43:
			tx43.setBackground(Color.RED);
			break;
		case 44:
			tx44.setBackground(Color.RED);
			break;
		case 45:
			tx45.setBackground(Color.RED);
			break;
		case 46:
			tx46.setBackground(Color.RED);
			break;
		case 47:
			tx47.setBackground(Color.RED);
			break;
		case 48:
			tx48.setBackground(Color.RED);
			break;
		case 50:
			tx50.setBackground(Color.RED);
			break;
		case 51:
			tx51.setBackground(Color.RED);
			break;
		case 52:
			tx52.setBackground(Color.RED);
			break;
		case 53:
			tx53.setBackground(Color.RED);
			break;
		case 54:
			tx54.setBackground(Color.RED);
			break;
		case 55:
			tx55.setBackground(Color.RED);
			break;
		case 56:
			tx56.setBackground(Color.RED);
			break;
		case 57:
			tx57.setBackground(Color.RED);
			break;
		case 58:
			tx58.setBackground(Color.RED);
			break;
		case 60:
			tx60.setBackground(Color.RED);
			break;
		case 61:
			tx61.setBackground(Color.RED);
			break;
		case 62:
			tx62.setBackground(Color.RED);
			break;
		case 63:
			tx63.setBackground(Color.RED);
			break;
		case 64:
			tx64.setBackground(Color.RED);
			break;
		case 65:
			tx65.setBackground(Color.RED);
			break;
		case 66:
			tx66.setBackground(Color.RED);
			break;
		case 67:
			tx67.setBackground(Color.RED);
			break;
		case 68:
			tx68.setBackground(Color.RED);
			break;
		case 70:
			tx70.setBackground(Color.RED);
			break;
		case 71:
			tx71.setBackground(Color.RED);
			break;
		case 72:
			tx72.setBackground(Color.RED);
			break;
		case 73:
			tx73.setBackground(Color.RED);
			break;
		case 74:
			tx74.setBackground(Color.RED);
			break;
		case 75:
			tx75.setBackground(Color.RED);
			break;
		case 76:
			tx76.setBackground(Color.RED);
			break;
		case 77:
			tx77.setBackground(Color.RED);
			break;
		case 78:
			tx78.setBackground(Color.RED);
			break;
		case 80:
			tx80.setBackground(Color.RED);
			break;
		case 81:
			tx81.setBackground(Color.RED);
			break;
		case 82:
			tx82.setBackground(Color.RED);
			break;
		case 83:
			tx83.setBackground(Color.RED);
			break;
		case 84:
			tx84.setBackground(Color.RED);
			break;
		case 85:
			tx85.setBackground(Color.RED);
			break;
		case 86:
			tx86.setBackground(Color.RED);
			break;
		case 87:
			tx87.setBackground(Color.RED);
			break;
		case 88:
			tx88.setBackground(Color.RED);
			break;
		case 90:
			tx90.setBackground(Color.RED);
			break;
		case 91:
			tx91.setBackground(Color.RED);
			break;
		case 92:
			tx92.setBackground(Color.RED);
			break;
		case 93:
			tx93.setBackground(Color.RED);
			break;
		case 94:
			tx94.setBackground(Color.RED);
			break;
		case 95:
			tx95.setBackground(Color.RED);
			break;
		case 96:
			tx96.setBackground(Color.RED);
			break;
		case 97:
			tx97.setBackground(Color.RED);
			break;
		case 98:
			tx98.setBackground(Color.RED);
			break;
		}
	}

	public void randomRed(Data data,int i) {
		if (i == 0)
			return;
		int rd;
		while (true) {
			rd = (int) (Math.random() * 100);
			data.redZone[i] = rd;
			if (rd % 10 != 9)
				break;
		}
		randomRed(data,--i);
	}

	public void makeTrap(Data data,int i) {
		switch (i) {
		case 1:
			randomRed(data,5);
			break;
		case 2:
			randomRed(data,7);
			break;
		case 3:
			randomRed(data,9);
			break;
		case 4:
			randomRed(data,11);
			break;
		case 5:
			randomRed(data,14);
			break;
		case 6:
			randomRed(data,17);
			break;
		}
	}

	public int checkRed(int x, int y) {
		int num = (x * 10) + y;
		switch (num) {
		case 0:
			if (tx00.getBackground() == Color.RED)
				return 1;
			break;
		case 1:
			if (tx01.getBackground() == Color.RED)
				return 1;
			break;
		case 2:
			if (tx02.getBackground() == Color.RED)
				return 1;
			break;
		case 3:
			if (tx03.getBackground() == Color.RED)
				return 1;
			break;
		case 4:
			if (tx04.getBackground() == Color.RED)
				return 1;
			break;
		case 5:
			if (tx05.getBackground() == Color.RED)
				return 1;
			break;
		case 6:
			if (tx06.getBackground() == Color.RED)
				return 1;
			break;
		case 7:
			if (tx07.getBackground() == Color.RED)
				return 1;
			break;
		case 8:
			if (tx08.getBackground() == Color.RED)
				return 1;
			break;
		case 10:
			if (tx10.getBackground() == Color.RED)
				return 1;
			break;
		case 11:
			if (tx11.getBackground() == Color.RED)
				return 1;
			break;
		case 12:
			if (tx12.getBackground() == Color.RED)
				return 1;
			break;
		case 13:
			if (tx13.getBackground() == Color.RED)
				return 1;
			break;
		case 14:
			if (tx14.getBackground() == Color.RED)
				return 1;
			break;
		case 15:
			if (tx15.getBackground() == Color.RED)
				return 1;
			break;
		case 16:
			if (tx16.getBackground() == Color.RED)
				return 1;
			break;
		case 17:
			if (tx17.getBackground() == Color.RED)
				return 1;
			break;
		case 18:
			if (tx18.getBackground() == Color.RED)
				return 1;
			break;
		case 20:
			if (tx20.getBackground() == Color.RED)
				return 1;
			break;
		case 21:
			if (tx21.getBackground() == Color.RED)
				return 1;
			break;
		case 22:
			if (tx22.getBackground() == Color.RED)
				return 1;
			break;
		case 23:
			if (tx23.getBackground() == Color.RED)
				return 1;
			break;
		case 24:
			if (tx24.getBackground() == Color.RED)
				return 1;
			break;
		case 25:
			if (tx25.getBackground() == Color.RED)
				return 1;
			break;
		case 26:
			if (tx26.getBackground() == Color.RED)
				return 1;
			break;
		case 27:
			if (tx27.getBackground() == Color.RED)
				return 1;
			break;
		case 28:
			if (tx28.getBackground() == Color.RED)
				return 1;
			break;
		case 30:
			if (tx30.getBackground() == Color.RED)
				return 1;
			break;
		case 31:
			if (tx31.getBackground() == Color.RED)
				return 1;
			break;
		case 32:
			if (tx32.getBackground() == Color.RED)
				return 1;
			break;
		case 33:
			if (tx33.getBackground() == Color.RED)
				return 1;
			break;
		case 34:
			if (tx34.getBackground() == Color.RED)
				return 1;
			break;
		case 35:
			if (tx35.getBackground() == Color.RED)
				return 1;
			break;
		case 36:
			if (tx36.getBackground() == Color.RED)
				return 1;
			break;
		case 37:
			if (tx37.getBackground() == Color.RED)
				return 1;
			break;
		case 38:
			if (tx38.getBackground() == Color.RED)
				return 1;
			break;
		case 40:
			if (tx40.getBackground() == Color.RED)
				return 1;
			break;
		case 41:
			if (tx41.getBackground() == Color.RED)
				return 1;
			break;
		case 42:
			if (tx42.getBackground() == Color.RED)
				return 1;
			break;
		case 43:
			if (tx43.getBackground() == Color.RED)
				return 1;
			break;
		case 44:
			if (tx44.getBackground() == Color.RED)
				return 1;
			break;
		case 45:
			if (tx45.getBackground() == Color.RED)
				return 1;
			break;
		case 46:
			if (tx46.getBackground() == Color.RED)
				return 1;
			break;
		case 47:
			if (tx47.getBackground() == Color.RED)
				return 1;
			break;
		case 48:
			if (tx48.getBackground() == Color.RED)
				return 1;
			break;
		case 50:
			if (tx50.getBackground() == Color.RED)
				return 1;
			break;
		case 51:
			if (tx51.getBackground() == Color.RED)
				return 1;
			break;
		case 52:
			if (tx52.getBackground() == Color.RED)
				return 1;
			break;
		case 53:
			if (tx53.getBackground() == Color.RED)
				return 1;
			break;
		case 54:
			if (tx54.getBackground() == Color.RED)
				return 1;
			break;
		case 55:
			if (tx55.getBackground() == Color.RED)
				return 1;
			break;
		case 56:
			if (tx56.getBackground() == Color.RED)
				return 1;
			break;
		case 57:
			if (tx57.getBackground() == Color.RED)
				return 1;
			break;
		case 58:
			if (tx58.getBackground() == Color.RED)
				return 1;
			break;
		case 60:
			if (tx60.getBackground() == Color.RED)
				return 1;
			break;
		case 61:
			if (tx61.getBackground() == Color.RED)
				return 1;
			break;
		case 62:
			if (tx62.getBackground() == Color.RED)
				return 1;
			break;
		case 63:
			if (tx63.getBackground() == Color.RED)
				return 1;
			break;
		case 64:
			if (tx64.getBackground() == Color.RED)
				return 1;
			break;
		case 65:
			if (tx65.getBackground() == Color.RED)
				return 1;
			break;
		case 66:
			if (tx66.getBackground() == Color.RED)
				return 1;
			break;
		case 67:
			if (tx67.getBackground() == Color.RED)
				return 1;
			break;
		case 68:
			if (tx68.getBackground() == Color.RED)
				return 1;
			break;
		case 70:
			if (tx70.getBackground() == Color.RED)
				return 1;
			break;
		case 71:
			if (tx71.getBackground() == Color.RED)
				return 1;
			break;
		case 72:
			if (tx72.getBackground() == Color.RED)
				return 1;
			break;
		case 73:
			if (tx73.getBackground() == Color.RED)
				return 1;
			break;
		case 74:
			if (tx74.getBackground() == Color.RED)
				return 1;
			break;
		case 75:
			if (tx75.getBackground() == Color.RED)
				return 1;
			break;
		case 76:
			if (tx76.getBackground() == Color.RED)
				return 1;
			break;
		case 77:
			if (tx77.getBackground() == Color.RED)
				return 1;
			break;
		case 78:
			if (tx78.getBackground() == Color.RED)
				return 1;
			break;
		case 80:
			if (tx80.getBackground() == Color.RED)
				return 1;
			break;
		case 81:
			if (tx81.getBackground() == Color.RED)
				return 1;
			break;
		case 82:
			if (tx82.getBackground() == Color.RED)
				return 1;
			break;
		case 83:
			if (tx83.getBackground() == Color.RED)
				return 1;
			break;
		case 84:
			if (tx84.getBackground() == Color.RED)
				return 1;
			break;
		case 85:
			if (tx85.getBackground() == Color.RED)
				return 1;
			break;
		case 86:
			if (tx86.getBackground() == Color.RED)
				return 1;
			break;
		case 87:
			if (tx87.getBackground() == Color.RED)
				return 1;
			break;
		case 88:
			if (tx88.getBackground() == Color.RED)
				return 1;
			break;
		case 90:
			if (tx90.getBackground() == Color.RED)
				return 1;
			break;
		case 91:
			if (tx91.getBackground() == Color.RED)
				return 1;
			break;
		case 92:
			if (tx92.getBackground() == Color.RED)
				return 1;
			break;
		case 93:
			if (tx93.getBackground() == Color.RED)
				return 1;
			break;
		case 94:
			if (tx94.getBackground() == Color.RED)
				return 1;
			break;
		case 95:
			if (tx95.getBackground() == Color.RED)
				return 1;
			break;
		case 96:
			if (tx96.getBackground() == Color.RED)
				return 1;
			break;
		case 97:
			if (tx97.getBackground() == Color.RED)
				return 1;
			break;
		case 98:
			if (tx98.getBackground() == Color.RED)
				return 1;
			break;
		}
		return 0;
	}

	public Gui() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		JTextArea battle = new JTextArea();
//		battle.setEditable(false);
//		battle.setBounds(12, 10, 525, 445);
//		contentPane.add(battle);
//		battle.setVisible(false);

		tx08 = new JTextField();
		tx08.setBackground(Color.WHITE);
		tx08.setEditable(false);
		tx08.setBounds(24, 10, 40, 40);
		contentPane.add(tx08);
		tx08.setColumns(10);

		tx07 = new JTextField();
		tx07.setBackground(Color.WHITE);
		tx07.setEditable(false);
		tx07.setColumns(10);
		tx07.setBounds(24, 60, 40, 40);
		contentPane.add(tx07);

		tx18 = new JTextField();
		tx18.setBackground(Color.WHITE);
		tx18.setEditable(false);
		tx18.setColumns(10);
		tx18.setBounds(76, 10, 40, 40);
		contentPane.add(tx18);

		tx17 = new JTextField();
		tx17.setBackground(Color.WHITE);
		tx17.setEditable(false);
		tx17.setColumns(10);
		tx17.setBounds(76, 60, 40, 40);
		contentPane.add(tx17);

		tx06 = new JTextField();
		tx06.setBackground(Color.WHITE);
		tx06.setEditable(false);
		tx06.setColumns(10);
		tx06.setBounds(24, 110, 40, 40);
		contentPane.add(tx06);

		tx05 = new JTextField();
		tx05.setBackground(Color.WHITE);
		tx05.setEditable(false);
		tx05.setColumns(10);
		tx05.setBounds(24, 160, 40, 40);
		contentPane.add(tx05);

		tx16 = new JTextField();
		tx16.setBackground(Color.WHITE);
		tx16.setEditable(false);
		tx16.setColumns(10);
		tx16.setBounds(76, 110, 40, 40);
		contentPane.add(tx16);

		tx15 = new JTextField();
		tx15.setBackground(Color.WHITE);
		tx15.setEditable(false);
		tx15.setColumns(10);
		tx15.setBounds(76, 160, 40, 40);
		contentPane.add(tx15);

		tx04 = new JTextField();
		tx04.setBackground(Color.WHITE);
		tx04.setEditable(false);
		tx04.setColumns(10);
		tx04.setBounds(24, 210, 40, 40);
		contentPane.add(tx04);

		tx03 = new JTextField();
		tx03.setBackground(Color.WHITE);
		tx03.setEditable(false);
		tx03.setColumns(10);
		tx03.setBounds(24, 260, 40, 40);
		contentPane.add(tx03);

		tx14 = new JTextField();
		tx14.setBackground(Color.WHITE);
		tx14.setEditable(false);
		tx14.setColumns(10);
		tx14.setBounds(76, 210, 40, 40);
		contentPane.add(tx14);

		tx13 = new JTextField();
		tx13.setBackground(Color.WHITE);
		tx13.setEditable(false);
		tx13.setColumns(10);
		tx13.setBounds(76, 260, 40, 40);
		contentPane.add(tx13);

		tx02 = new JTextField();
		tx02.setBackground(Color.WHITE);
		tx02.setEditable(false);
		tx02.setColumns(10);
		tx02.setBounds(24, 310, 40, 40);
		contentPane.add(tx02);

		tx01 = new JTextField();
		tx01.setBackground(Color.WHITE);
		tx01.setEditable(false);
		tx01.setColumns(10);
		tx01.setBounds(24, 360, 40, 40);
		contentPane.add(tx01);

		tx12 = new JTextField();
		tx12.setBackground(Color.WHITE);
		tx12.setEditable(false);
		tx12.setColumns(10);
		tx12.setBounds(76, 310, 40, 40);
		contentPane.add(tx12);

		tx11 = new JTextField();
		tx11.setBackground(Color.WHITE);
		tx11.setEditable(false);
		tx11.setColumns(10);
		tx11.setBounds(76, 360, 40, 40);
		contentPane.add(tx11);

		tx28 = new JTextField();
		tx28.setBackground(Color.WHITE);
		tx28.setEditable(false);
		tx28.setColumns(10);
		tx28.setBounds(128, 10, 40, 40);
		contentPane.add(tx28);

		tx27 = new JTextField();
		tx27.setBackground(Color.WHITE);
		tx27.setEditable(false);
		tx27.setColumns(10);
		tx27.setBounds(128, 60, 40, 40);
		contentPane.add(tx27);

		tx38 = new JTextField();
		tx38.setBackground(Color.WHITE);
		tx38.setEditable(false);
		tx38.setColumns(10);
		tx38.setBounds(180, 10, 40, 40);
		contentPane.add(tx38);

		tx37 = new JTextField();
		tx37.setBackground(Color.WHITE);
		tx37.setEditable(false);
		tx37.setColumns(10);
		tx37.setBounds(180, 60, 40, 40);
		contentPane.add(tx37);

		tx26 = new JTextField();
		tx26.setBackground(Color.WHITE);
		tx26.setEditable(false);
		tx26.setColumns(10);
		tx26.setBounds(128, 110, 40, 40);
		contentPane.add(tx26);

		tx25 = new JTextField();
		tx25.setBackground(Color.WHITE);
		tx25.setEditable(false);
		tx25.setColumns(10);
		tx25.setBounds(128, 160, 40, 40);
		contentPane.add(tx25);

		tx36 = new JTextField();
		tx36.setBackground(Color.WHITE);
		tx36.setEditable(false);
		tx36.setColumns(10);
		tx36.setBounds(180, 110, 40, 40);
		contentPane.add(tx36);

		tx35 = new JTextField();
		tx35.setBackground(Color.WHITE);
		tx35.setEditable(false);
		tx35.setColumns(10);
		tx35.setBounds(180, 160, 40, 40);
		contentPane.add(tx35);

		tx24 = new JTextField();
		tx24.setBackground(Color.WHITE);
		tx24.setEditable(false);
		tx24.setColumns(10);
		tx24.setBounds(128, 210, 40, 40);
		contentPane.add(tx24);

		tx23 = new JTextField();
		tx23.setBackground(Color.WHITE);
		tx23.setEditable(false);
		tx23.setColumns(10);
		tx23.setBounds(128, 260, 40, 40);
		contentPane.add(tx23);

		tx34 = new JTextField();
		tx34.setBackground(Color.WHITE);
		tx34.setEditable(false);
		tx34.setColumns(10);
		tx34.setBounds(180, 210, 40, 40);
		contentPane.add(tx34);

		tx33 = new JTextField();
		tx33.setBackground(Color.WHITE);
		tx33.setEditable(false);
		tx33.setColumns(10);
		tx33.setBounds(180, 260, 40, 40);
		contentPane.add(tx33);

		tx22 = new JTextField();
		tx22.setBackground(Color.WHITE);
		tx22.setEditable(false);
		tx22.setColumns(10);
		tx22.setBounds(128, 310, 40, 40);
		contentPane.add(tx22);

		tx21 = new JTextField();
		tx21.setBackground(Color.WHITE);
		tx21.setEditable(false);
		tx21.setColumns(10);
		tx21.setBounds(128, 360, 40, 40);
		contentPane.add(tx21);

		tx32 = new JTextField();
		tx32.setBackground(Color.WHITE);
		tx32.setEditable(false);
		tx32.setColumns(10);
		tx32.setBounds(180, 310, 40, 40);
		contentPane.add(tx32);

		tx31 = new JTextField();
		tx31.setBackground(Color.WHITE);
		tx31.setEditable(false);
		tx31.setColumns(10);
		tx31.setBounds(180, 360, 40, 40);
		contentPane.add(tx31);

		tx48 = new JTextField();
		tx48.setBackground(Color.WHITE);
		tx48.setEditable(false);
		tx48.setColumns(10);
		tx48.setBounds(232, 10, 40, 40);
		contentPane.add(tx48);

		tx47 = new JTextField();
		tx47.setBackground(Color.WHITE);
		tx47.setEditable(false);
		tx47.setColumns(10);
		tx47.setBounds(232, 60, 40, 40);
		contentPane.add(tx47);

		tx58 = new JTextField();
		tx58.setBackground(Color.WHITE);
		tx58.setEditable(false);
		tx58.setColumns(10);
		tx58.setBounds(284, 10, 40, 40);
		contentPane.add(tx58);

		tx57 = new JTextField();
		tx57.setBackground(Color.WHITE);
		tx57.setEditable(false);
		tx57.setColumns(10);
		tx57.setBounds(284, 60, 40, 40);
		contentPane.add(tx57);

		tx46 = new JTextField();
		tx46.setBackground(Color.WHITE);
		tx46.setEditable(false);
		tx46.setColumns(10);
		tx46.setBounds(232, 110, 40, 40);
		contentPane.add(tx46);

		tx45 = new JTextField();
		tx45.setBackground(Color.WHITE);
		tx45.setEditable(false);
		tx45.setColumns(10);
		tx45.setBounds(232, 160, 40, 40);
		contentPane.add(tx45);

		tx56 = new JTextField();
		tx56.setBackground(Color.WHITE);
		tx56.setEditable(false);
		tx56.setColumns(10);
		tx56.setBounds(284, 110, 40, 40);
		contentPane.add(tx56);

		tx55 = new JTextField();
		tx55.setBackground(Color.WHITE);
		tx55.setEditable(false);
		tx55.setColumns(10);
		tx55.setBounds(284, 160, 40, 40);
		contentPane.add(tx55);

		tx44 = new JTextField();
		tx44.setBackground(Color.WHITE);
		tx44.setEditable(false);
		tx44.setColumns(10);
		tx44.setBounds(232, 210, 40, 40);
		contentPane.add(tx44);

		tx43 = new JTextField();
		tx43.setBackground(Color.WHITE);
		tx43.setEditable(false);
		tx43.setColumns(10);
		tx43.setBounds(232, 260, 40, 40);
		contentPane.add(tx43);

		tx54 = new JTextField();
		tx54.setBackground(Color.WHITE);
		tx54.setEditable(false);
		tx54.setColumns(10);
		tx54.setBounds(284, 210, 40, 40);
		contentPane.add(tx54);

		tx53 = new JTextField();
		tx53.setBackground(Color.WHITE);
		tx53.setEditable(false);
		tx53.setColumns(10);
		tx53.setBounds(284, 260, 40, 40);
		contentPane.add(tx53);

		tx68 = new JTextField();
		tx68.setBackground(Color.WHITE);
		tx68.setEditable(false);
		tx68.setColumns(10);
		tx68.setBounds(336, 10, 40, 40);
		contentPane.add(tx68);

		tx67 = new JTextField();
		tx67.setBackground(Color.WHITE);
		tx67.setEditable(false);
		tx67.setColumns(10);
		tx67.setBounds(336, 60, 40, 40);
		contentPane.add(tx67);

		tx78 = new JTextField();
		tx78.setBackground(Color.WHITE);
		tx78.setEditable(false);
		tx78.setColumns(10);
		tx78.setBounds(388, 10, 40, 40);
		contentPane.add(tx78);

		tx77 = new JTextField();
		tx77.setBackground(Color.WHITE);
		tx77.setEditable(false);
		tx77.setColumns(10);
		tx77.setBounds(388, 60, 40, 40);
		contentPane.add(tx77);

		tx66 = new JTextField();
		tx66.setBackground(Color.WHITE);
		tx66.setEditable(false);
		tx66.setColumns(10);
		tx66.setBounds(336, 110, 40, 40);
		contentPane.add(tx66);

		tx65 = new JTextField();
		tx65.setBackground(Color.WHITE);
		tx65.setEditable(false);
		tx65.setColumns(10);
		tx65.setBounds(336, 160, 40, 40);
		contentPane.add(tx65);

		tx76 = new JTextField();
		tx76.setBackground(Color.WHITE);
		tx76.setEditable(false);
		tx76.setColumns(10);
		tx76.setBounds(388, 110, 40, 40);
		contentPane.add(tx76);

		tx75 = new JTextField();
		tx75.setBackground(Color.WHITE);
		tx75.setEditable(false);
		tx75.setColumns(10);
		tx75.setBounds(388, 160, 40, 40);
		contentPane.add(tx75);

		tx88 = new JTextField();
		tx88.setBackground(Color.WHITE);
		tx88.setEditable(false);
		tx88.setColumns(10);
		tx88.setBounds(440, 10, 40, 40);
		contentPane.add(tx88);

		tx87 = new JTextField();
		tx87.setBackground(Color.WHITE);
		tx87.setEditable(false);
		tx87.setColumns(10);
		tx87.setBounds(440, 60, 40, 40);
		contentPane.add(tx87);

		tx98 = new JTextField();
		tx98.setBackground(Color.WHITE);
		tx98.setEditable(false);
		tx98.setColumns(10);
		tx98.setBounds(492, 10, 40, 40);
		contentPane.add(tx98);

		tx97 = new JTextField();
		tx97.setBackground(Color.WHITE);
		tx97.setEditable(false);
		tx97.setColumns(10);
		tx97.setBounds(492, 60, 40, 40);
		contentPane.add(tx97);

		tx86 = new JTextField();
		tx86.setBackground(Color.WHITE);
		tx86.setEditable(false);
		tx86.setColumns(10);
		tx86.setBounds(440, 110, 40, 40);
		contentPane.add(tx86);

		tx85 = new JTextField();
		tx85.setBackground(Color.WHITE);
		tx85.setEditable(false);
		tx85.setColumns(10);
		tx85.setBounds(440, 160, 40, 40);
		contentPane.add(tx85);

		tx96 = new JTextField();
		tx96.setBackground(Color.WHITE);
		tx96.setEditable(false);
		tx96.setColumns(10);
		tx96.setBounds(492, 110, 40, 40);
		contentPane.add(tx96);

		tx95 = new JTextField();
		tx95.setBackground(Color.WHITE);
		tx95.setEditable(false);
		tx95.setColumns(10);
		tx95.setBounds(492, 160, 40, 40);
		contentPane.add(tx95);

		tx84 = new JTextField();
		tx84.setBackground(Color.WHITE);
		tx84.setEditable(false);
		tx84.setColumns(10);
		tx84.setBounds(440, 210, 40, 40);
		contentPane.add(tx84);

		tx83 = new JTextField();
		tx83.setBackground(Color.WHITE);
		tx83.setEditable(false);
		tx83.setColumns(10);
		tx83.setBounds(440, 260, 40, 40);
		contentPane.add(tx83);

		tx94 = new JTextField();
		tx94.setBackground(Color.WHITE);
		tx94.setEditable(false);
		tx94.setColumns(10);
		tx94.setBounds(492, 210, 40, 40);
		contentPane.add(tx94);

		tx93 = new JTextField();
		tx93.setBackground(Color.WHITE);
		tx93.setEditable(false);
		tx93.setColumns(10);
		tx93.setBounds(492, 260, 40, 40);
		contentPane.add(tx93);

		tx82 = new JTextField();
		tx82.setBackground(Color.WHITE);
		tx82.setEditable(false);
		tx82.setColumns(10);
		tx82.setBounds(440, 310, 40, 40);
		contentPane.add(tx82);

		tx81 = new JTextField();
		tx81.setBackground(Color.WHITE);
		tx81.setEditable(false);
		tx81.setColumns(10);
		tx81.setBounds(440, 360, 40, 40);
		contentPane.add(tx81);

		tx92 = new JTextField();
		tx92.setBackground(Color.WHITE);
		tx92.setEditable(false);
		tx92.setColumns(10);
		tx92.setBounds(492, 310, 40, 40);
		contentPane.add(tx92);

		tx91 = new JTextField();
		tx91.setBackground(Color.WHITE);
		tx91.setEditable(false);
		tx91.setColumns(10);
		tx91.setBounds(492, 360, 40, 40);
		contentPane.add(tx91);

		tx62 = new JTextField();
		tx62.setBackground(Color.WHITE);
		tx62.setEditable(false);
		tx62.setColumns(10);
		tx62.setBounds(336, 310, 40, 40);
		contentPane.add(tx62);

		tx61 = new JTextField();
		tx61.setBackground(Color.WHITE);
		tx61.setEditable(false);
		tx61.setColumns(10);
		tx61.setBounds(336, 360, 40, 40);
		contentPane.add(tx61);

		tx72 = new JTextField();
		tx72.setBackground(Color.WHITE);
		tx72.setEditable(false);
		tx72.setColumns(10);
		tx72.setBounds(388, 310, 40, 40);
		contentPane.add(tx72);

		tx71 = new JTextField();
		tx71.setBackground(Color.WHITE);
		tx71.setEditable(false);
		tx71.setColumns(10);
		tx71.setBounds(388, 360, 40, 40);
		contentPane.add(tx71);

		tx42 = new JTextField();
		tx42.setBackground(Color.WHITE);
		tx42.setEditable(false);
		tx42.setColumns(10);
		tx42.setBounds(232, 310, 40, 40);
		contentPane.add(tx42);

		tx41 = new JTextField();
		tx41.setBackground(Color.WHITE);
		tx41.setEditable(false);
		tx41.setColumns(10);
		tx41.setBounds(232, 360, 40, 40);
		contentPane.add(tx41);

		tx52 = new JTextField();
		tx52.setBackground(Color.WHITE);
		tx52.setEditable(false);
		tx52.setColumns(10);
		tx52.setBounds(284, 310, 40, 40);
		contentPane.add(tx52);

		tx51 = new JTextField();
		tx51.setBackground(Color.WHITE);
		tx51.setEditable(false);
		tx51.setColumns(10);
		tx51.setBounds(284, 360, 40, 40);
		contentPane.add(tx51);

		tx64 = new JTextField();
		tx64.setBackground(Color.WHITE);
		tx64.setEditable(false);
		tx64.setColumns(10);
		tx64.setBounds(336, 210, 40, 40);
		contentPane.add(tx64);

		tx63 = new JTextField();
		tx63.setBackground(Color.WHITE);
		tx63.setEditable(false);
		tx63.setColumns(10);
		tx63.setBounds(336, 260, 40, 40);
		contentPane.add(tx63);

		tx74 = new JTextField();
		tx74.setBackground(Color.WHITE);
		tx74.setEditable(false);
		tx74.setColumns(10);
		tx74.setBounds(388, 210, 40, 40);
		contentPane.add(tx74);

		tx73 = new JTextField();
		tx73.setBackground(Color.WHITE);
		tx73.setEditable(false);
		tx73.setColumns(10);
		tx73.setBounds(388, 260, 40, 40);
		contentPane.add(tx73);

		tx00 = new JTextField();
		tx00.setBackground(Color.WHITE);
		tx00.setEditable(false);
		tx00.setColumns(10);
		tx00.setBounds(24, 410, 40, 40);
		contentPane.add(tx00);

		tx10 = new JTextField();
		tx10.setBackground(Color.WHITE);
		tx10.setEditable(false);
		tx10.setColumns(10);
		tx10.setBounds(76, 410, 40, 40);
		contentPane.add(tx10);

		tx20 = new JTextField();
		tx20.setBackground(Color.WHITE);
		tx20.setEditable(false);
		tx20.setColumns(10);
		tx20.setBounds(128, 410, 40, 40);
		contentPane.add(tx20);

		tx30 = new JTextField();
		tx30.setBackground(Color.WHITE);
		tx30.setEditable(false);
		tx30.setColumns(10);
		tx30.setBounds(180, 410, 40, 40);
		contentPane.add(tx30);

		tx80 = new JTextField();
		tx80.setBackground(Color.WHITE);
		tx80.setEditable(false);
		tx80.setColumns(10);
		tx80.setBounds(440, 410, 40, 40);
		contentPane.add(tx80);

		tx90 = new JTextField();
		tx90.setBackground(Color.WHITE);
		tx90.setEditable(false);
		tx90.setColumns(10);
		tx90.setBounds(492, 410, 40, 40);
		contentPane.add(tx90);

		tx60 = new JTextField();
		tx60.setBackground(Color.WHITE);
		tx60.setEditable(false);
		tx60.setColumns(10);
		tx60.setBounds(336, 410, 40, 40);
		contentPane.add(tx60);

		tx70 = new JTextField();
		tx70.setBackground(Color.WHITE);
		tx70.setEditable(false);
		tx70.setColumns(10);
		tx70.setBounds(388, 410, 40, 40);
		contentPane.add(tx70);

		tx40 = new JTextField();
		tx40.setBackground(Color.WHITE);
		tx40.setEditable(false);
		tx40.setColumns(10);
		tx40.setBounds(232, 410, 40, 40);
		contentPane.add(tx40);

		tx50 = new JTextField();
		tx50.setBackground(Color.WHITE);
		tx50.setEditable(false);
		tx50.setColumns(10);
		tx50.setBounds(284, 410, 40, 40);
		contentPane.add(tx50);

		btn2 = new JButton("");
		btn2.setFont(new Font("굴림", Font.PLAIN, 14));
		btn2.setBounds(381, 628, 151, 46);
		contentPane.add(btn2);

		btn4 = new JButton("");
		btn4.setFont(new Font("굴림", Font.PLAIN, 14));
		btn4.setBounds(381, 701, 151, 46);
		contentPane.add(btn4);

		btnUp = new JButton("");
		btnUp.setBounds(260, 628, 40, 40);
		contentPane.add(btnUp);

		btnLeft = new JButton("");
		btnLeft.setBounds(216, 668, 40, 40);
		contentPane.add(btnLeft);

		btnDown = new JButton("");
		btnDown.setBounds(260, 707, 40, 40);
		contentPane.add(btnDown);

		btnRight = new JButton("");
		btnRight.setBounds(302, 668, 40, 40);
		contentPane.add(btnRight);

		btn1 = new JButton("");
		btn1.setFont(new Font("굴림", Font.PLAIN, 14));
		btn1.setBounds(24, 628, 151, 46);
		contentPane.add(btn1);

		btn3 = new JButton("");
		btn3.setFont(new Font("굴림", Font.PLAIN, 14));
		btn3.setBounds(24, 701, 151, 46);
		contentPane.add(btn3);

		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(24, 500, 508, 96);

		contentPane.add(textArea);
		JScrollPane scrollPane = new JScrollPane(textArea); // 스크롤판 추가
		scrollPane.setLocation(24, 502);
		scrollPane.setSize(404, 116);
		getContentPane().add(scrollPane);

		hp = new JTextField();
		hp.setForeground(Color.RED);
		hp.setFont(new Font("굴림", Font.PLAIN, 14));
		hp.setEditable(false);
		hp.setBackground(new Color(255, 204, 204));
		hp.setBounds(24, 460, 93, 32);
		contentPane.add(hp);
		hp.setColumns(10);

		mp = new JTextField();
		mp.setFont(new Font("굴림", Font.PLAIN, 14));
		mp.setForeground(Color.BLUE);
		mp.setEditable(false);
		mp.setBackground(new Color(204, 255, 255));
		mp.setBounds(128, 460, 93, 32);
		contentPane.add(mp);
		mp.setColumns(10);

		monHp = new JTextField();
		monHp.setForeground(new Color(255, 102, 0));
		monHp.setFont(new Font("굴림", Font.PLAIN, 13));
		monHp.setBackground(new Color(255, 255, 204));
		monHp.setEditable(false);
		monHp.setBounds(336, 460, 196, 32);
		contentPane.add(monHp);
		monHp.setColumns(10);

		stage = new JTextField();
		stage.setFont(new Font("굴림", Font.PLAIN, 15));
		stage.setForeground(Color.BLUE);
		stage.setEditable(false);
		stage.setBackground(SystemColor.control);
		stage.setBounds(232, 460, 92, 32);
		contentPane.add(stage);
		stage.setColumns(10);
		
		maxHp = new JTextField();
		maxHp.setEditable(false);
		maxHp.setBackground(SystemColor.menu);
		maxHp.setBounds(438, 504, 94, 21);
		contentPane.add(maxHp);
		maxHp.setColumns(10);
		
		atk = new JTextField();
		atk.setBackground(SystemColor.menu);
		atk.setEditable(false);
		atk.setColumns(10);
		atk.setBounds(438, 535, 94, 21);
		contentPane.add(atk);
		
		def = new JTextField();
		def.setEditable(false);
		def.setBackground(SystemColor.menu);
		def.setColumns(10);
		def.setBounds(438, 566, 94, 21);
		contentPane.add(def);
		
		re = new JTextField();
		re.setBackground(SystemColor.menu);
		re.setEditable(false);
		re.setColumns(10);
		re.setBounds(438, 597, 94, 21);
		contentPane.add(re);
//		this.getContentPane().add(scrollPane);

	}
}

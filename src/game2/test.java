package game2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class fuck implements Serializable{
	int i = 12;
	int j = 17;
}

public class test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Data data = new Data ();
		Gui ui = new Gui();
		ui.setVisible(true);
//		data.playX = 5;
//
		OutputStream os = new FileOutputStream("ii.ser"); // 1: 스트림 오픈
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(data);
		out.close();
		System.out.println("저장완료");
//		
//			InputStream is = new FileInputStream("data.ser");
//			ObjectInputStream in = new ObjectInputStream(is);
//			data = (Data) in.readObject();
//			in.close();
//			ui.setData(data);
	}
}

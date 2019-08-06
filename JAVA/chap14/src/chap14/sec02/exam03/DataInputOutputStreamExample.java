package chap14.sec02.exam03;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args)  throws Exception{
		DataOutputStream dos = new DataOutputStream (new FileOutputStream("C:/Temp/data.db"));
		dos.writeInt(500);
		dos.writeDouble(25.5);
		dos.writeBoolean(true);
		dos.writeUTF("홍길동");
		dos.flush();
		dos.close();
		
		DataInputStream dis = new DataInputStream (new FileInputStream ("C:/Temp/data.db"));
		dis.readInt();
		
	}

}

package co.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFile {
public static void main(String[] args) throws IOException {
	String source="C:\\Users\\LENOVO\\Pictures\\prabhu.jpg";
	String target = "C:\\Users\\LENOVO\\Pictures\\newprabhu.jpg ";
	
	FileInputStream in=new FileInputStream(source);
	FileOutputStream out=new FileOutputStream(target);
	
	int ch=in.read();
	while(ch!=-1) {
		out.write(ch);
		ch=in.read();
	}
	in.close();
	out.close();
	System.out.println("DONE");
}
}

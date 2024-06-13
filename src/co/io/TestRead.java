package co.io;

import java.io.FileReader;
import java.io.IOException;

public class TestRead {
public static void main(String[] args) throws IOException {
	
	FileReader f=new FileReader("C:\\Users\\LENOVO\\Desktop\\Github\\CoreJava\\io.java ");
	int ch = f.read(); //read a character
	while (ch  !=-1) {//-1 is end of file
		System.out.println((char)ch);
		ch=f.read();
	}
}
}

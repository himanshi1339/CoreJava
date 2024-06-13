package co.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("C:\\Users\\LENOVO\\Desktop\\Github\\CoreJava\\io.java ");
	BufferedReader in = new BufferedReader(file);
	
	String line =in.readLine();
	while(line!=null) {
System.out.println(line);
line=in.readLine();
	}
	file.close();
}
}

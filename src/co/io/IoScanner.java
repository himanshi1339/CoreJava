package co.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IoScanner {
public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("C:\\Users\\LENOVO\\Desktop\\Github\\CoreJava\\io.java");
	Scanner sc=new Scanner(reader);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	reader.close();
}
}

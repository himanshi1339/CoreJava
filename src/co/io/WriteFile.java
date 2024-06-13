package co.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws IOException {
	FileWriter out= new FileWriter("C:\\Users\\LENOVO\\Desktop\\Github\\CoreJava\\io.input");
	out.write('A');//yaha se direct file bna skte h apn
	out.write('\n'); //new line character
	out.write("this is line one ");
	out.write("this is line two");
	out.close();
	System.out.println("Check f:/newtest.txt");
}
}

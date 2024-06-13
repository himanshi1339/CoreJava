package co.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineByLinePrint {
public static void main(String[] args) throws IOException {
	FileWriter out=new FileWriter("C:\\Users\\LENOVO\\Desktop\\Github\\CoreJava\\io.txt");
    PrintWriter pw=new PrintWriter(out);
    for(int i=0 ; i<5 ; i++) {
    	pw.println(i + ":hello");
    }
    pw.close();
    out.close();
    
    System.out.println("Check c:/newtest.txt");
}
}

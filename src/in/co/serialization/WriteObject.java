package in.co.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//ye ek serialization program h

public class WriteObject {
public static void main(String[] args) throws IOException {
	
   FileOutputStream file= new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Github\\CoreJava\\new.java ");
   ObjectOutputStream out = new ObjectOutputStream(file);
   
   Marksheet m = new Marksheet();
   m.name="Himanshi";
   m.maths=92;
   m.physics=44;
   m.chemistry=43;
   
   out.writeObject(m);
   out.close();
   file.close();
   System.out.println("done");
   
}
}

package in.co.java;

public class splitname {
String s="Himanshi Sharma";
String[] s1=s.split(" ");
for (int i=0;i<s1.length();i++) {
	for (int j=s1[i].length()-1;j>=0;j--) {
	System.out.println(s1[i].charAt(j));	
	}
	System.out.println(" ");
}
}}

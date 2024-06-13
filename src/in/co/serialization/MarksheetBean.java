package in.co.serialization;

import java.io.Serializable;

//ye run nhi hota h bcoz its transient value

public class MarksheetBean implements Serializable {
String name = null;
int maths=0;
int physics=0;
int chemistry=0;

transient int total=0;
transient double percentage=0;
transient int temp=0;

public int getTotal() {
	return total;
	
}
public double getPercentage() {
	return percentage;
	
}

}

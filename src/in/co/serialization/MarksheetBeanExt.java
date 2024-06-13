package in.co.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetBeanExt implements Externalizable {
String name = null;
int chemistry =0;
int physics = 0;
int maths =0;
transient int temp= 0;
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeInt(chemistry);
	out.writeInt(physics);
	out.writeInt(maths);
	out.writeInt(temp);
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	name = (String) in.readObject();
	physics = in.readInt();
	chemistry = in.readInt();
	maths = in.readInt();
	temp =in.readInt();
}


}

package argument;

public class HelloName {
public static void main(String[] args) {
	if(args.length==2) {
		System.out.println(" himanshi " +args[0]);
	}
	else {
		System.out.println("parameter name is required");
	}
}
}

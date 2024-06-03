package test;

public class Method {
	public static void raman() {
		System.out.println("it is a static class");
	}

	
		public void megha() {
			System.out.println("it is non static method");
		}

		public static void main(String[] args) {
			Method m = new Method();
			m.megha();
			Method.raman();
		}
	}


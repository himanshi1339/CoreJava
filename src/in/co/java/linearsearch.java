package in.co.java;

public class linearsearch {
public static void main(String[] args) {
	int number[]= {2,3,4,5};
	//int key=100;
	int key =3; 
	
	int index = Search(number,key);
	if(index==-1) {
		System.out.println("key not found"+key);
	}
	else {
		System.out.println("key is at index"+key);
	}}
	public static int Search(int num[],int key) {
		for (int i=0;i<num.length;i++) {
			if(num[i]==key) {
				return i;
			}
		}
		return-1;
	}
}


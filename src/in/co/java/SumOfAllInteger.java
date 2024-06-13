package in.co.java;

public class SumOfAllInteger {
public static void main(String[] args) {
	int sum=0, count =0;
	for(int i=101 ; i<200 ; i++) {
		if (i%7==0) {
			sum=sum+i;
			count++;
		}
	}
	System.out.println("the sum of the between 100 to 200 which are visible by is:" +sum);
	System.out.println("total no. between 100 to 200 which are divisible by 7 is :" +count);
}
}

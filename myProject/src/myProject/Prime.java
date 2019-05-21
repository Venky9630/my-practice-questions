package myProject;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		

		
		for(int i=0;i<=n;i++) {
			
			if((isPrime(i))) {
				System.out.print(i+" ");
			}
		}
	}

	private static boolean isPrime(int i) {
		if(i<=1) {
			return false;
		}
		if(i==2) {
			return true;
		}else {
			
		if(i%2==0) {
			return false;
		}
		for(int j=3;j<=Math.sqrt(i);j=j+2) {
			double maxnumber = Math.sqrt(i);
			System.out.println("i value is:"+i);
			System.out.println("math.sqrt of "+i+" is:"+maxnumber);
			if(i%j==0) {
				return false;
			}
		}
		return true;
		}
	}

}

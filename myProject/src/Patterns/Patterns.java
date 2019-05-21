package Patterns;

public class Patterns {
	public static void main(String[] args) {
		int odd = 1;
		int noOfSpaces = 3;
		for(int j = 1; j <= 4; j++) {
			int k=0;
			for(int l = 1; l<=noOfSpaces; l++) {
				System.out.print(" ");
			}
			for (int i = 1; i<= odd; i++) {
				if(i<=j) {
					k=k+1;
				}
				else {
					k=k-1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd = odd+2;
			noOfSpaces = noOfSpaces-1;
		}
	}
}

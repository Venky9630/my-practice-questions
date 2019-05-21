package myProject;

public class Vamsi {
	public static void main(String s[]) {
		int k,j;
		for(int i=1;i<4;i++) {
			for( j=1;j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			for( k=i+1;k<=6-i;k++) {
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int m=k;m<=6;m++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<4;i++) {
			for(j=4;j>i;j--) {
				System.out.print("*");
				System.out.print(" ");
			}
			for( k=i+2;k<j;k--) {
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int m=1;m<=k;m++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

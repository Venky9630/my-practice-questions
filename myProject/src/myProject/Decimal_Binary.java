package myProject;

public class Decimal_Binary {
static void decimal(int i){
	int count = 0;
	int [] b = new int[20];
	while(i>0) {
		b[count] = i%2;
		i = i/2;
		count = count+1;
	}
	for(int j = count-1; j>=0;j--) {
		System.out.print(b[j]);

	}
	System.out.println();
}
	private static void binary(int i) {
		// TODO Auto-generated method stub
		int n=0;
		double d = 1;
		while(i>0) {
			int r = i%10;
//			d = d+r*Math.pow(2,n);
			for(int m=0;m<n&&r==1;m++) {
				d = d*2;
			}
			i=i/10;
			n=n+1;
		}
		System.out.println(d);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Decimal_Binary. decimal(10);
  Decimal_Binary.binary(1011);
	}
 
	}



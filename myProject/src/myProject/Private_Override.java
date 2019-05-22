package myProject;

public class Private_Override {
	private void m1() {
		System.out.println("A m1");
	}
	static void m2() {
		System.out.println("A m2");

	}
}
class B15 extends Private_Override{
    private void m1() {
		System.out.println("B m1");
	}
	static void m2() {
		System.out.println("B m2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B15 b = new B15();
		b.m1();
		b.m2();
		Private_Override a = new B15();
//     	a.m1();//compile-time error.
		a.m2();
	}
}

package myProject;

public class Parent {
 public void m1() {
	 int p = 10;
	 System.out.println("parent "+p);
	 System.out.println("Parent m1 method");
 }
 public void m2() {
	 System.out.println("parent m2 method");
 }
}
class Child extends Parent{
	public void m1() {
		int p = 10;
		System.out.println("child "+p);
		System.out.println("Child m1 method");
	}
}
class SubChild extends Child{
	
}

class Test{
	public static void main(String[] args) {
//		Child c = new Child();
//		c.m1();
//		c.m2();
//		Child c = new Parent();
//		Parent p = new Parent();
//		p.m1();
//		p.m2();
		Parent p = new Child();
		p.m1();
		p.m2();
	}
}


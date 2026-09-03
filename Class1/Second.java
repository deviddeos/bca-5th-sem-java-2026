class Demo{
	static void fun1() {
		System.out.println("A");
	}
	void fun2() {
		System.out.println("B");
	}
}
public class Second {
	public static void main(String[] args) {
		System.out.println("Hello");
		Demo.fun1();
		Demo obj = new Demo();
		obj.fun2();
		obj.fun1();		
	}
}
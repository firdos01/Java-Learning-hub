package newpackage;

public class Methods {
	//Method with Return a value - Non-Static
	
	public int add(int a, int b) {
		int result=a+b;
		return result;
	}
	//Method with Return a value - Static
	public static int substract(int a, int b) {
		int result = a-b;
		return result;
	}
	//Method with without Return a value - Non-Static
	public void compare(int a, int b) {
		if(a==b) {
		System.out.println("both integers are same");
		}
		else {
		System.out.println("both are not idendical integers");
		}			
		}
	//Method with without Return a value - Static
	public static void compare2(int a, int b) {
		if(a==b) {
			System.out.println("both integers are same");
			}
			else {
			System.out.println("both are not idendical integers");
			}
	}
	
	public static void main(String[] args) {
	
	Methods obj = new Methods();
	System.out.println(obj.add(10, 20));
	System.out.println(Methods.substract(20,10));
	Methods obj2 = new Methods();
	obj2.compare(10, 10);
	Methods.compare2(10, 20);
	
	}
}

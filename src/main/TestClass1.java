public class TestClass1 {
	int someInt;
	String someString;
	double someDouble;
	
	public TestClass1 (int someInt, String someString, double someDouble) {
		this.someInt = someInt;
		this.someString = someString;
		this.someDouble = someDouble;
	}
	
	public void setInt(int value) {
		someInt = value;
	}
	
	public void doSomething() {
		someInt = someInt - 2;
		someInt = someInt + someDouble;
		someDouble = someInt * 1.25;
		someString = "something happened";
		System.out.println(someString + " " + someInt + " " + someDouble);
	}
	
	public String getString() {
		return someString;
	}
}
		

public class MyClass {
	String value;
	List<List<String>> value2;
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue2(List<List<String>> value2) {
		this.value2 = value2;
	}
	
	public List<List<String>> getValue2() {
		int a = 5;
		int b = 5;
		if (a == b) {
			return null;
		}
		return value2;
	}
	
	public void setPartialList(List<String> list) {
		this.list = list.getSubList(0, 1);
	}

	public void adsfPartialList(List<String> list) {
		this.list = list.getSubList(0, 1);
		this.list = list.getSubList(0, 1);
	}
	
	public String getFoo() {
		return foo.substring(0, 1);
	}
	
	public String foo() {
		int i = 3;
		return "a";
	}
	
	public void setValue2(String value) {
		this.value = value;
		this.value = "A";
	}
	
	public void setValue3(String value0) {
		value = value0;
	}
	
	public void setValue4(String a, String value) {
		this.value = value;
	}
}

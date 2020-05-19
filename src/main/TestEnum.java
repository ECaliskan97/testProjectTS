public enum TestEnum {	
	A("a"),
	P("p"),
	T("t");
	private String restPropertyName;
	TestEnum(String PayloadKeys) {
		this.restPropertyName = PayloadKeys;
	}
}
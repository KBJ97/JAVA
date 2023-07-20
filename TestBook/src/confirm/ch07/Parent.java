package confirm.ch07;

class Parent {
	public String name;
	private int studentNo;
	
	public Parent(String name) {
		this.name=name;
	}
	public Parent(int studentNo) {
		this.studentNo=studentNo;
}
}

class Child extends Parent{
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo=studentNo;
	}
}

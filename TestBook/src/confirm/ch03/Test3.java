package confirm.ch03;

public class Test3 {
	public static void main(String[] args) {
		// 3번
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}
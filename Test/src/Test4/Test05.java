package Test4;

public class Test05 {
	public static void main(String[] args) {
		
		String strCsv="60,72,82,86,92";
		String[] scores = strCsv.split(","); //문자열을 "," 로 쪼개서 배열로 만듬
				
		int total = 0;
		
		for(int i=0 ; i <scores.length; i++) {
			total += Integer.parseInt(scores[i]);
		}
		
		System.out.println("총점 : "+total);
	}
}

package bj05;

public class sada {

	public static void main(String[] args) {
		
		String c = "a";
		String b = "ㄴ";
		boolean d;
		
		Object obj = c;
		
		if(obj.equals(b)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}

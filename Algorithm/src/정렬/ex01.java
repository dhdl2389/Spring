package 정렬;

import java.util.*;

public class ex01 {
	public static void main(String[] args) {
	    ex01 jy = new ex01();
	    Scanner sc = new Scanner(System.in);
	    
	    int n;
	    
	    do {
	        System.out.println("1부터 9이하의 수를 입력하세요: ");
	        n = sc.nextInt();
	    } while (n > 9);

	    String str = sc.next();
	    
	    System.out.println(jy.answer(n, str));
	}

	public String answer(int n, String a) {

		String result = "";

		for (int i = 0; i < n; i++) {
			String str = a.substring(0, 7).replace('*', '0').replace('#', '1');

			int num = Integer.valueOf(str, 2);
			result = result + (char) num;
			a = a.substring(7);
		}
		return result;
	}

}
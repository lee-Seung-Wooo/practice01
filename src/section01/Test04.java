package section01;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			System.out.println("숫자 입력 : ");
			int num = sc.nextInt();
			
			if(i == 1 || i == 4 || i == 7) {
				System.out.println("num : " + num);
			} 
		}
	}

}

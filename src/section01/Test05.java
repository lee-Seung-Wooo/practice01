package section01;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 숫자나 입력해주세요. 0을 입력하면 종료");
		BigInteger bigNum = new BigInteger("1");
		int num = sc.nextInt();
		
		
			
			while(num != 0) {
				
				System.out.println("곱할 숫자를 입력해주세요 : , 구분자를 사용해서 여러개 입력해주세요.");
				String[] arr = sc.next().split(",");
				for(int i = 0; i < arr.length; i++) {
					BigInteger bigResult = new BigInteger(arr[i]);
					bigNum = bigResult.multiply(bigResult);
				}
				System.out.println("결과 : " + bigNum);
				System.out.println("아무 숫자나 입력해주세요. 0을 입력하면 종료");
				num = sc.nextInt();
			}
			
			
		
		
//		if(num != 0) {
//			
//			System.out.println("곱할 숫자를 입력해주세요.");
//			long midNum = sc.nextLong();
//			BigInteger sum = BigInteger.valueOf(midNum);
//			
//			bigNum = sum.multiply(sum);
//			System.out.println("결과 : " + bigNum);
//			System.out.println("그만두시려면 0을 입력해주세요.");
//			num = sc.nextInt();
//		} else {
//			sc.close();
//		}
	}

}

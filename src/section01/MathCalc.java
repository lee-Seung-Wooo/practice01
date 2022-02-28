package section01;

import java.util.Scanner;

public class MathCalc {

	public static void main(String[] args) {

//		System.out.println("정수 최대값 : " + Integer.MAX_VALUE);
//		System.out.println("정수 최대값 : " + Integer.MIN_VALUE);
//		
		
//		System.out.print("숫자를 입력해주세요 : ");
//		int num = sc.nextInt();
//		int num2 = (int)(Math.sqrt(num) * 1000);
//		int result = num2 - num;
//		System.out.println(result);
		
//		System.out.println("100m 기록을 입력해주세요(초단위) : ");
//		double num = sc.nextDouble();
//		double num2 = (42.195 * 1000) / 100;
//		System.out.println(num2);
//		int num3 = (int)(num * num2);
//		System.out.println("num3 : " + num3);
//		int hour = (num3 / 3600);
//		int minute = (num3 % 3600) / 60;
//		int seconds = (num3 % 60);
//		System.out.println(hour + "시간 " + minute + "분 " + seconds + "초");
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이에 숫자를 맞춰보세요 : ");
		int num = sc.nextInt();
		
		int randomNum = (int)(Math.random() * 100 + 1);
		int i = 1;
		
		while(true) {
			
			if(num > randomNum) {
				System.out.println("DOWN");
				i++;
				
			} else if(num < randomNum) {
				System.out.println("UP");
				i++;
				
			} else if(num == randomNum) {
				System.out.println("정답입니다." + i + "회 만에 맞췄어요.");
				break;
			}
			
			System.out.println("1~100 사이에 숫자를 맞춰보세요 : ");
			num = sc.nextInt();
		};
		
		
	}

}

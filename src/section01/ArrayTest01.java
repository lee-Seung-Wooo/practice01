package section01;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		System.out.println("배열 얕은복사");
		
		String[] strArr = new String[] {"이승우", "이준우", "이은숙"};
		String[] strArr2 = strArr;
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println("strArr2 [" + i + "] = " + strArr2[i]);
		}
		
		strArr[0] = "이승철";
		strArr2[2] = "이성수";
		
		for(int i = 0; i < strArr2.length; i++) {
			System.out.println("strArr[" + i + "] = " + strArr[i] + " strArr2[" + i + "] = " + strArr2[i]);
		}
		
		System.out.println("strArr 참조값 : " + strArr);
		System.out.println("strArr2 참조값 : " + strArr2);
	}

}

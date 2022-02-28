package section01;

public class Test06 {
	public static void main(String[] args) {
		
		String[] oxArr = {"O", "O", "O", "O", "O", "X", "O", "O"};
		int result = 0;
		int count = 0;
		
		for(int i = 0; i < oxArr.length; i++) {
			
			if(oxArr[i] == "O") {
				++result;
				result += count;
				++count;
				
			} else if(oxArr[i] == "X") {
				count = 0;
			}
		}
		
		System.out.println("점수. : " + result);
	}
}

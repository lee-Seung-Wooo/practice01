package section01;

import java.io.IOException;

public class Test01 extends Test02{

	public static void main(String[] args) throws IOException {
		
		// JVM은 운영체제와 소통하니까 운영체제의 명령어를 사용하는 것도 가능하다.
		// cmd 창에서 하는 것 처럼 명령어를 입력하면 프로그램을 사용할 수 있다.
		Runtime jvmRuntime = Runtime.getRuntime();
		jvmRuntime.exec("notepad");
	}
	
	@Override
	public void hello() {
		System.out.println("하이요!");
	}
	
}

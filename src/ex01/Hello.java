package ex01;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello world!!");
			System.out.println("------------------------");
			int kor;  //변수 선언
			kor=20;  //변수 초기화
			int kor1 = 020;  //변수 선언 및 초기화
			int kor2 = 0x20;
			
			System.out.println("kor");
			System.out.println(kor);
			System.out.println(kor1);
			System.out.println(kor2);
			
			kor+=10;
			System.out.println(kor);
			
			double f = 0;
			for(int i=0; i<30; i++)
				f+=0.1;
			System.out.println(f);

			double pi = 3.14;
			System.out.println(pi);
			
			char a = '\uac22';
			char b = 88;
			char c = 'D';
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

			boolean flag = true;  //거짓 : false, 0, 0.0
			
			if(flag)
				System.out.println("참일 때 실행");
			else
				System.out.println("거짓 일 때 실행");
			
			String s1 = "Java"; //변수 외.... 첫글자 대문자이면 클래스
			String s2 = "Study";
			
			System.out.println(s1 + " " + s2 + 2);
			
			
	}

}

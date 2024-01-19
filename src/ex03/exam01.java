package ex03;

public class exam01 {

	public static void main(String[] args) {
		
		int exam = 4000;
		System.out.println(exam/3600+"시간 "+((exam/60)%60)+"분 "+(exam%60)+"초");
		
		int exam1 = 5000;
		System.out.println(exam1/3600+"시간 "+((exam1/60)%60)+"분 "+(exam1%60)+"초");
		//출력

		int a = 5;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		b = a++;
		c = ++a;
		d = ++c;
		e = b++;
		
		System.out.println( "a : "+ a );
		System.out.println( "b : "+ b );
		System.out.println( "c : "+ c );
		System.out.println( "d : "+ d );
		System.out.println( "e : "+ e );
		
		int x = 1;
		int y = 2;
		int z = ++x + -y;
		System.out.println("출력결과 : "+z);
	}

}
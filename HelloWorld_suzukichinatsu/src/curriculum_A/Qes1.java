package curriculum_A;

public class Qes1 {
	public static void main(String[]args) {
		//問題1
		byte byteNum=0;
		short shortNum=0;
		int intNum=0;
		long longNum=0L;
		float floatNum=0.0f;
		double doubleNum=0.0d;
		char letter='\u0000';
		String letters=null;
		boolean isBoolean=false;
		
		//問題2
		byteNum=10;
		shortNum=100;
		intNum=1000;
		longNum=10000;
		floatNum=9.5f;
		doubleNum=10.5d;
		letter='a';
		letters="ハロー";
		isBoolean=true;
		
		//問題3
		System.out.println(longNum+byteNum+shortNum+intNum);
		System.out.println(byteNum*2);
		System.out.println(letter+letters+isBoolean);
		System.out.println(longNum+intNum+shortNum+byteNum*3);
		System.out.println(byteNum*shortNum*intNum*longNum);
		System.out.println(doubleNum/100);
		System.out.println(byteNum-100);
		
		//問題4
		String name="山田太郎";
		System.out.println("こんにちは、"+name+"さん!");
		
		//問題5
		int  age=25;
		System.out.println("年齢:"+age+"歳");
		
		//問題6
		int num1=10;
		int num2=5;
		int sum=(num1+num2);
		System.out.println(sum);
		
		//問題7
		int score=80;
		score=score+20;
		System.out.println("最終スコア:"+score);
		
		//問題8
		double price=99.99;
		int p=(int)price;
		System.out.println("整数価格:"+p);
		
		//問題9
		String numStr="123";
		int c=Integer.parseInt(numStr);
		System.out.println(c+10);
		
		//問題10
		int num=50;
		String str=String.valueOf(num);
		System.out.println("得点:"+str+"点");
		
		//問題11
		int a=10;
		int b=20;
		boolean result=a<b;
		System.out.println(result);
		
		//問題12
		int x=15;
		String rst=x>=10?"OK":"NG";
		System.out.println(rst);
		
		//問題13
		String text="私はJavaが好きです。Javaは楽しい！";
		System.out.println(text.replace("Java","Python"));
		
		
		
		
		
				
		
		
	}
}

package curriculum_B;

public class Qus5 {
	public static void main(String[] args) {
		helloWorld();
		int a = 10;
		int result = doubleValue(a);
		System.out.println(a + "を2倍すると" + result + "です。");

		int num1 = 7;
		int num2 = 10;
		String str1 = isEven(num1) ? "偶数" : "奇数";
		String str2 = isEven(num2) ? "偶数" : "奇数";
		

		System.out.println(num1 + "は" + str1 + "です。");
		System.out.println(num2 + "は" + str2 + "です。");

		

	}

	// 問題1
	// helloWorldメソッド作成
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	//問題2
	//doubleValueメソッド作成
	public static int doubleValue(int num) { 
		return num * 2;

	}

	//問題3
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	//問題4
	

	//問題5

}

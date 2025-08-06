package curriculum_B;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Greeting greet = new Greeting();
		greet.sayhello();

		Animal am = new Animal();
		am.setName("ライオン");
		am.setBody(2.1);
		am.setFast(80);

		System.out.println("動物名："+am.getName());
		System.out.println("体長："+am.getBody()+"m");
		System.out.println("速度"+am.getFast()+"km/h");
	}

}

package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qus3 {
	public static void main(String[]args) {
		//問題1
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		//問題2
		for(int i=2;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
		}}
			
		//問題3
		for(int i=10;i>=1;i--){
			System.out.println(i);
		}
		
		//問題4
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum +=i;
		}
		System.out.println(sum);
	
		
		//問題5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
		//問題6
		int count=1;
		while(count<=10) {
			System.out.println(count);
			count++;
		}
		
		
		//問題7
		int n=2;
		while(n<=20) {
			if(n%2==0) {
			System.out.println(n);
		}
			n++;
		}
		
		
		//問題8
		int c=10;
		while(c>=1) {
			System.out.println(c);
			c--;
		}
		
		
		//問題9
		int t=1;
		int r=0;
		while(t<=100) {
			r+=t;
			t++;
		}
		System.out.println(r);

		
		
		
		//問題10
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字入力");
		int number = scanner.nextInt();
		while(number!=0) {
			System.out.println("再度入力");
			number = scanner.nextInt();
		}
		System.out.println("終了しました");
		
		

		
		
		//問題11
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j<=8) {
					System.out.print(String.format("%02d", i)+" * "+String.format("%02d", j)+" = "+String.format("%02d", i*j)+" || ");
				}else {
					System.out.print(String.format("%02d", i)+" * "+String.format("%02d", j)+" = "+String.format("%02d", i*j));	
				}
			}
			System.out.println();
			
		}
		
		
		//問題12
		Random random = new Random();
		int randomValue = random.nextInt(12);
		
		System.out.println("入力");
		String text = scanner.next();
		scanner.close();
		
		
		
		String[] split = text.split("、");
		
		
		
		
		 for (String score : split) {
			 switch(score) {
			 case "パソコン":
			 case"冷蔵庫":
			 case"扇風機":
			 case"洗濯機":
			 case"加湿器":
				  System.out.println(score+"の残りは"+randomValue+"台です");
				 break;
			 case"テレビ":
			 case"ディスプレイ":		 
				  System.out.println(score.equals("テレビ")?"テレビの残り台数は"+randomValue+"台です":
					  "ディスプレイの残り台数は"+(11-randomValue)+"台です");
				   break;
			default:
				System.out.println("『その他の商品』は指定の商品ではありません");
			 
			 }		 }
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}

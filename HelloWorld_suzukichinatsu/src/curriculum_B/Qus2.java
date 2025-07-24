package curriculum_B;

public class Qus2 {
	public static void main(String[]args) {
	
     //問題1
		int score=75;
		if(score>=60) {
			System.out.println("合格です");
		}
		
	 //問題2
		int age=25;
		if(age>=20&&age<=30) {
			System.out.println("適正年齢です");
		}
		else {
			System.out.println("対象外です");
		}
		
	 //問題3
		int age2=18;
		if(age2>=20){
			System.out.println("成人です");
		}
		else if(age2>=13&&age2<=19){
			System.out.println("ティーンエイジャーです");
		}
		else {
			System.out.println("子供です");
		}
		
	//問題4
		int x=30;
		int y=15;
		int z=50;
		int max;
		//xとyを比較して大きい方をmaxに代入
		if(x>y) {
			max=x;
		}
		else {
			max=y;
			
		}
		//比較して大きい方とｚとさらに比較してmaxに代入
		if(z>max) {
			max=z;
			
		}
		    System.out.println(max);
		
	
	//問題5
		int num=0;
		if(num>0){
			System.out.println("正の数です");
			}
		else if(num==0){
			System.out.println("0です");
		}
		else if(num<0){
			System.out.println("負の数です");
		}
		
	//問題6
		int num2=9;
		if(num2%2==0){
			System.out.println("偶数です");
			}
		else{
			System.out.println("奇数です");
			}
		
	//問題7
		int score2=96;
		if(score2>=90){
			System.out.println("優");
			}
		else if(score2>=70){
			System.out.println("良");
			}
		else if(score2>=50){
			System.out.println("可");
			}
		else{
			System.out.println("不可");
			}
		
	//問題8
		String str1=null;
		String str2="";
		String imput="文字";
		if(imput==str1||imput==str2){
			System.out.println("入力が無効です");
			}
		
	//問題9
		int day=1;
		switch(day) {
		case 1:
			System.out.println("月曜日");
		break;
		case 2:
			System.out.println("火曜日");
		break;
		case 3:
			System.out.println("水曜日");
		break;
		case 4:
			System.out.println("木曜日");
		break;
		case 5:
			System.out.println("金曜日");
		break;
		case 6:
			System.out.println("土曜日");
		break;
		case 7:
			System.out.println("日曜日");
		break;
		default:
		    System.out.println("無効な入力です");
		
		}
		
	//問題10
		int month=9;
		switch(month) {
		case 12,1,2:{
			System.out.println("冬");
			}
		break;
		case 3,4,5:{
			System.out.println("春");
			}
		break;
		case 6,7,8:{
			System.out.println("夏");
			}
		break;
		case 9,10,11:{
			System.out.println("秋");
			}
		break;
		default:
			System.out.println("無効な月です");
		
		}
		

		
		
		
	}}







































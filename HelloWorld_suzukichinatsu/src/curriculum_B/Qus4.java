package curriculum_B;

import java.util.Scanner;

public class Qus4 {
	public static void main(String[] args) {

		//問題1
		int[] numbers;
		numbers = new int[5];
		int[] scores = { 1, 2, 3, 4, 5 };
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		scores[3] = 4;
		scores[4] = 5;

		for (int i = 0; i <= 4; i++) {
			System.out.println(scores[i]);
		}

		//問題2
		int[] num;
		num = new int[5];
		int[] array1 = { 10, 20, 30, 40, 50 };
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;

		for (int j = 4; j >= 0; j--) {
			System.out.println(array1[j]);
		}

		//問題3
		int[] num2;
		num2 = new int[5];
		int[] resalt = { 3, 5, 7, 9, 11 };
		resalt[0] = 3;
		resalt[1] = 5;
		resalt[2] = 7;
		resalt[3] = 9;
		resalt[4] = 11;

		int k = 0;
		for (int r = 0; r < 5; r++) {
			k += resalt[r];
		}
		System.out.println(k);

		//問題4
		int[] num3 = { 12, 7, 9, 21, 5, 18 };

		int intMax = num3[0];
		for (int i = 1; i < num3.length; i++) {
			if (intMax < num3[i]) {
				intMax = num3[i];

			}
		}
		System.out.println(intMax);
		int intMin = num3[0];
		for (int j = 1; j < num3.length; j++) {
			if (intMin > num3[j]) {
				intMin = num3[j];
			}
		}
		System.out.println(intMin);

		//問題5
		int[] num4 = { 1, 2, 3, 4, 5 };
		for (int m : num4) {
			m = m * 2;
			System.out.println(m);
		}

		//問題6
		int[] array = { 4, 7, 10, 15, 20 };

		Scanner scanner = new Scanner(System.in);
		System.out.println("入力");
		int u = scanner.nextInt();
		boolean r = false;
		for (int value : array) {
			if (value == u) {
				r = true;
			}
		}
		if (r) {
			System.out.println(u + "は配列に含まれています");
		} else {
			System.out.println(u + "は配列に含まれていません");
		}
		//		Integer[] array = { 4, 7, 10, 15, 20 };
		//		List<Integer> ary = Arrays.asList(array);
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("入力");
		//		int u = scanner.nextInt();
		//		if (ary.contains(u)) {
		//			System.out.println(u + "は配列に含まれています");
		//		} else {
		//			System.out.println(u + "は配列に含まれていません");
		//		}
		scanner.close();

		//問題７
		int[][] array2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int t = 0; t < array2.length; t++) {
			for (int v = 0; v < array2[t].length; v++) {
				System.out.println(array2[t][v]);
			}
		}

		//問題8

		int[][] array3 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int num5 = 0;
		for (int o = 0; o < array3.length; o++) {
			for (int p = 0; p < array3[o].length; p++) {
				num5 += array3[o][p];
			}
		}
		System.out.println(num5);

		//問題9
		int[][] array4 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };

		int Max = array4[0][0];
		int Min = array4[0][0];

		for (int s = 0; s < array4.length; s++) {
			for (int q = 0; q < array4[s].length; q++) {
				if (Max < array4[s][q]) {
					Max = array4[s][q];
				}
				if (Min < array4[s][q]) {
					Min = array4[s][q];
				}

			}
		}
		System.out.println(Max);
		System.out.println(Min);

		//問題10
		int[][][] array5 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		for (int w = 0; w < array5.length; w++) {
			for (int x = 0; x < array5[w].length; x++) {
				for (int z = 0; z < array5[w][x].length; z++) {
					System.out.println(array5[w][x][z]);
				}
			}
		}

	}
}

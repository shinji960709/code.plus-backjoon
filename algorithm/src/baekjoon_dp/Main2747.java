package baekjoon_dp;

import java.util.Scanner;

public class Main2747 {

	//�Ǻ���ġ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int d[] = new int[100];
		
		d[0] = 1;
		d[1] = 2;
		
		for (int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];  
		}
		System.out.println(d[n-2]);
		

	}

}

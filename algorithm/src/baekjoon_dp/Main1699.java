package baekjoon_dp;

import java.util.Scanner;

//Á¦°ö¼öÀÇÇÕ 
public class Main1699 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] d = new int[n+1];
		d[1] = 1;
		for(int i = 2; i < n+1; i++) {
			d[i] = i;
			for(int j = 1; j*j <= i; j++)
				d[i] = Math.min(d[i], d[i-j*j] + 1);
		}
		
		System.out.println(d[n]);

	}
}

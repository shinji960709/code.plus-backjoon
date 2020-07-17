package baekjoon_dp;

import java.util.Scanner;

public class Main11052 {

	//ī�� �����ϱ�
	/*
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d[] = new int[1001];
		int p[] = new int[10001];
		
		while (n-- > 0) {
			int i = sc.nextInt();
			
		//	System.out.println(i+": i��     "+n+": n��");
			
			d[n-1] = d[n-2] + p[i-1];
			
		}
		*/
		
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n+1];
	        for (int i=1; i<=n; i++) {
	            a[i] = sc.nextInt();
	        }
	        int[] d = new int[n+1];
	        for (int i=1; i<=n; i++) {
	            for (int j=1; j<=i; j++) {
	                if (d[i] < d[i-j] + a[j]) {
	                    d[i] = d[i-j] + a[j];
	                }
	            }
	        }
	        System.out.println(d[n]);
	    }

}
package baekjoon_dp;

import java.util.Scanner;

public class Main10844 {

	//���� ��ܼ�
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] d = new long[101][11];	// ?
		 
		    for (int i = 1; i <= 9; i++) {
		        d[1][i] = 1;	// n=1�϶�, 
		    }
		 
		    for (int i = 2; i <= n; i++) {
		        d[i][0] = d[i - 1][1];	//������ ���� 0�϶�, +1�� ����
		        for (int j = 1; j <= 9; j++) {
		        	
		        	if (j == 9) {		//������ ���� 9�϶�, -1�� ����
		        		d[i][j] = d[i-1][j-1]; 
		        	} else { 
		        		d[i][j] = d[i-1][j-1] + d[i-1][j+1] % 1000000000;	//? 
		        	}
		        	
		        }
		    }
		 
		    long sum = 0;
		    for (int i = 0; i < 10; i++) {
		        sum += d[n][i];
		    }
		    System.out.println(sum % 1000000000);

	}

}

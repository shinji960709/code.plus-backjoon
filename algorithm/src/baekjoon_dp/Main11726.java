package baekjoon_dp;

import java.util.*;

public class Main11726 {

	//2*2Ÿ�� ä���
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d[] = new int[10000];	//�� ũ�⸦ [1001]�� �δ���?
		d[0] = 1;
		d[1] = 1;	
		
		for(int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];			
		}
		System.out.println(d[n]%10007);
		
	}

}

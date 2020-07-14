package baekjoon_dp;

import java.util.*;

//1로 만들기
public class Main1463 {

	public static void main(String[] args) {
		
		int n;//입력받은 숫자
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int d[] = new int[100];
		d[1] = 0;	//1일때 최소 연산 횟수 0
		
		for (int i = 2; i <= n; i++) {
			
				d[i] = d[i-1] + 1;
			
			if (d[i] % 2 == 0 && d[i] > d[i/2] + 1) {
				d[i] = d[i/2] + 1;
			}
			else if(d[i] % 3 == 0 && d[i] > d[i/3] + 1){
				d[i] = d[i/3] + 1;
			}
		}
		System.out.println(d[n]);
		
		
	}
	
}

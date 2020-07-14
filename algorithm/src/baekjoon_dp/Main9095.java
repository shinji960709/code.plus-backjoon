package baekjoon_dp;

import java.util.Scanner;

public class Main9095 {

	//123더하기
/*	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d[] = new int[11];	//정적 배열 크기
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		
		for (int i = 0; i <= n; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		
		System.out.println(d[n]);
		
	}*/
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int n;
        
        int[] d = new int[11]; 
        d[1] = 1; 
        d[2] = 2; 
        d[3] = 4; 
        
        for(int i=0; i<t; i++){
            n = sc.nextInt();
            
            for(int j=4; j<=n; j++){
                d[j] = d[j-1] + d[j-2] + d[j-3];
            }
            System.out.println(d[n]);
        }
        
 
    }
	

}

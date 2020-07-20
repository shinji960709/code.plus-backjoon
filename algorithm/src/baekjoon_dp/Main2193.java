package baekjoon_dp;

import java.util.Scanner;

//ÀÌÄ£¼ö
public class Main2193 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] d = new long[n+1];
        
        d[0] = 0;
        d[1] = 1;
 
        for(int i=2; i<=n; i++)
            d[i] = d[i-1]+d[i-2];
        
        System.out.println(d[n]);
	}

}

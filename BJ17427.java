package ct;

import java.util.Scanner;

public class BJ17427 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long ans = 0;
		
		for( int i=1; i<=n; i++ ) {
			
			ans += ( n/i ) * i; 
			
		}
							
		// n/i= n이하 i를 약수로 가지고있는 갯수,
		// ex n이 4고 i가 2라 하면 
		//1~4까지 2가 약수로 있는 갯수 2에서1개, 4에서1개 총 2개  2개 * 2 
		
		System.out.println( ans );
	}

}

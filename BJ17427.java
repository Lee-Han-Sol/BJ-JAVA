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
							
		// n/i= n���� i�� ����� �������ִ� ����,
		// ex n�� 4�� i�� 2�� �ϸ� 
		//1~4���� 2�� ����� �ִ� ���� 2����1��, 4����1�� �� 2��  2�� * 2 
		
		System.out.println( ans );
	}

}

package ct;

import java.util.Scanner;

public class BJ4375 {

	public static void main(String[] args) {

		int n,num,cnt;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			n = sc.nextInt();
			num=1;
			cnt=1;
				while(true) {
					if(num%n==0) {
						break;
					}
					num=(num*10+1)%n;
					cnt++;
				}
				System.out.println(cnt);
		}
	}

}

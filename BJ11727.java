package ct;

import java.util.Scanner;

public class BJ11727 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] noc = new int[1000]; //0~1000
        noc[1] = 1;
        noc[2] = 3;
        for (int i = 3; i <= n; i++) {
            noc[i] = (((noc[i - 1])%10007 + 2 * (noc[i - 2])%10007))%10007;
        }
        System.out.println(noc[n]);
	
	}
}

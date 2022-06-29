package ct;

import java.util.Scanner;

public class BJ2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h,m;
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m<45) {
			m=m+15;
			h=h-1;
			
			if(h==-1) {
				h=23;
			}
		}
		
		else {
			h=h;
			m=m-45;
		}
		
		System.out.println(h+" "+m);
	}

}

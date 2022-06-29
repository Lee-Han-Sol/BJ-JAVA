package ct;

import java.util.Scanner;

public class BJ1037 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] ys;
		int n=1;
		int i,j,tmp;
		ys = new int[m];
		
			for(i=0;i<m;i++) {
				ys[i]=sc.nextInt();
			}
			
			if(m==1) {
				n = ys[0]*ys[0];
			}
		
			else if (m>=2) {
				for(i=0;i<m-1;i++) {
					for(j=i;j<m;j++) {
						if(ys[i]>ys[j]) {
							tmp=ys[i];
							ys[i]=ys[j];
							ys[j]=tmp;
						}
					n=ys[0]*ys[m-1];
					}
				}
			}
		System.out.println(n);
		}
	
}

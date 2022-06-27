package Broze3;

import java.util.Scanner;

public class BJ1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int t = sc.nextInt();
		int[] ar = new int[t];
		double a,b;
		a=0;
		b=0;

		for(i=0;i<t;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(b%4==0) {
				b=4;
			}
			else {
				b=b%4;
			}
			ar[i] = (int)((Math.pow(a, b))%10);
			int multi = (ar[i]*(int)a)%10;
			if(a%10==0) {
				ar[i]=10;
			}

			else if(a==1) {
				ar[i]=1;
			}
			
			/*//한 자리수 제곱의 마지막 수는 규칙에 따름
			else if(b%4==1) {
				ar[i]=(int)a;
			}

			//제곱값 비교
			else if(b%4==2) {
				//끝자리 수 4
				if(ar[i]==4) {
					if(multi==8) {
						ar[i]=2;
					}
					if(multi==2) {
						ar[i]=8;
					}
				}
				//끝자리 수 6
				if(ar[i]==6) {
					if(multi==4) {
						ar[i]=4;
					}
					if(multi==6) {
						ar[i]=6;
					}
				}
				//끝자리 수 9
				if(ar[i]==9) {
					if(multi==7) {
						ar[i]=3;
					}
					if(multi==3) {
						ar[i]=7;
					}
				}
				//끝자리 수 1
				if(ar[i]==1) {
					ar[i]=9;
				}
				//끝자리 수 5
				if(ar[i]==5) {
					ar[i]=5;
				}
			}

			//세제곱 비교
			else if(b%4==3) {
				//끝자리 수 8
				if(ar[i]==8) {
					ar[i]=2;
				}
				//끝자리 수 7
				if(ar[i]==7) {
					ar[i]=3;
				}
				//끝자리 수 4
				if(ar[i]==4) {
					ar[i]=4;
				}
				//끝자리 수 5
				if(ar[i]==5) {
					ar[i]=5;
				}
				//끝자리 수 6
				if(ar[i]==6) {
					ar[i]=6;
				}
				//끝자리 수 3
				if(ar[i]==3) {
					ar[i]=7;
				}
				//끝자리 수 2
				if(ar[i]==2) {
					ar[i]=8;
				}
				//끝자리 수 9
				if(ar[i]==9) {
					ar[i]=9;
				}
			}

			//네제곱 비교
			else if(b%4==0) {
				//끝자리 수 6
				if(ar[i]==6) {
					if(multi==2) {
						ar[i]=2;
					}
					if(multi==4) {
						ar[i]=4;
					}
					if(multi==6) {
						ar[i]=6;
					}
				}
				//끝자리 수 1
				if(ar[i]==1) {
					if(multi==3) {
						ar[i]=3;
					}
					if(multi==7) {
						ar[i]=7;
					}
					if(multi==9) {
						ar[i]=9;
					}
				}
				//끝자리 수 5
				else if(ar[i]==5) {
					ar[i]=5;
				}
			}*/
		}
		for(i=0;i<t;i++) {
			System.out.println(ar[i]);
		}

	}

}

//많이 헤맸던 문제 여러번 다시생각해보니 간단하게 답이 나왔다.
//a의 b승에서 뒷자리 수만 고려하면 됐던 문제로
//a의 제곱은 1차,2차,3차,4차 까지 돌고 5차부터 1차와 값이 동일하게 나옴을 확인
//사실 b를 4로 나누고 나머지의 제곱수만 생각하면 된다.
//b를 4로 나누면 나머지가 0이기떄문에 4인 경우만 예외적으로 b값을 4로 줬음
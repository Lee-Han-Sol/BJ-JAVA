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
			
			/*//�� �ڸ��� ������ ������ ���� ��Ģ�� ����
			else if(b%4==1) {
				ar[i]=(int)a;
			}

			//������ ��
			else if(b%4==2) {
				//���ڸ� �� 4
				if(ar[i]==4) {
					if(multi==8) {
						ar[i]=2;
					}
					if(multi==2) {
						ar[i]=8;
					}
				}
				//���ڸ� �� 6
				if(ar[i]==6) {
					if(multi==4) {
						ar[i]=4;
					}
					if(multi==6) {
						ar[i]=6;
					}
				}
				//���ڸ� �� 9
				if(ar[i]==9) {
					if(multi==7) {
						ar[i]=3;
					}
					if(multi==3) {
						ar[i]=7;
					}
				}
				//���ڸ� �� 1
				if(ar[i]==1) {
					ar[i]=9;
				}
				//���ڸ� �� 5
				if(ar[i]==5) {
					ar[i]=5;
				}
			}

			//������ ��
			else if(b%4==3) {
				//���ڸ� �� 8
				if(ar[i]==8) {
					ar[i]=2;
				}
				//���ڸ� �� 7
				if(ar[i]==7) {
					ar[i]=3;
				}
				//���ڸ� �� 4
				if(ar[i]==4) {
					ar[i]=4;
				}
				//���ڸ� �� 5
				if(ar[i]==5) {
					ar[i]=5;
				}
				//���ڸ� �� 6
				if(ar[i]==6) {
					ar[i]=6;
				}
				//���ڸ� �� 3
				if(ar[i]==3) {
					ar[i]=7;
				}
				//���ڸ� �� 2
				if(ar[i]==2) {
					ar[i]=8;
				}
				//���ڸ� �� 9
				if(ar[i]==9) {
					ar[i]=9;
				}
			}

			//������ ��
			else if(b%4==0) {
				//���ڸ� �� 6
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
				//���ڸ� �� 1
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
				//���ڸ� �� 5
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

//���� ��̴� ���� ������ �ٽû����غ��� �����ϰ� ���� ���Դ�.
//a�� b�¿��� ���ڸ� ���� ����ϸ� �ƴ� ������
//a�� ������ 1��,2��,3��,4�� ���� ���� 5������ 1���� ���� �����ϰ� ������ Ȯ��
//��� b�� 4�� ������ �������� �������� �����ϸ� �ȴ�.
//b�� 4�� ������ �������� 0�̱⋚���� 4�� ��츸 ���������� b���� 4�� ����
package Broze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1212 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] eight0 = {"1","10","11","100","101","110","111"};
		String[] eight = {"000","001","010","011","100","101","110","111"};

		if (str.equals("0")) {
			System.out.println(0);
		}

		else {

			for(int i=49; i<eight0.length+49; i++) {
				if((int)str.charAt(0)==i) {
					System.out.print(eight0[i-49]);
				}
			}

			for(int i=1;i<str.length();i++) {
				for(int j=48; j<eight.length+48;j++) {
					if((int)str.charAt(i)==j) {
						System.out.print(eight[j-48]);
					}

				}

			}

		}

	}

}


//https://dundung.tistory.com/26
//ó�� ������ �Է°��� 10������ �޾Ƽ� 8������ ��ȯ�ѵ�
//8������ 10������ �ٽ� �ٲ� 2������ ��ȯ���Ѻ����� ����.
//�������� �����غ��� �׳� 10������ 2������ �ٲٴ°ų� �ٸ��� ������
//�Է°� 8������ String ���� �޾Ƽ� ���� �ϳ��ϳ��� �ٷ� 2������ ��Ÿ���°ɷ� ���ٺ���
//ù �迭�� eight�� ������ �Ϸ��� ���� �� �� ���ڰ� 1 ~ 3�Ͻ� 2������ ǥ���ҋ�
//0�� �������� ���� �ν��Ͽ���
//�� �� ������ �迭�� ���� ������ְ� ������� �����
//���ڸ� ���ؾ������� char�� ascii�ڵ�� ���Ͽ� 2������ ǥ��
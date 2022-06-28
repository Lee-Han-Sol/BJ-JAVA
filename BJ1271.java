package Broze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ1271 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger m = new BigInteger(st.nextToken());
		
		System.out.println(n.divide(m));
		System.out.print(n.remainder(m));
		
	}

}

//ù������ BigInteger ���� int n,m ���� �޾Ƽ�
//��°��� println(n/m),println(n%m)���� ������ ������
//��Ÿ�ӿ����� ����Ͽ� �߻� 10^1000�� ���� int�� ���� �� ������ �ľ�
//BigInteger Ŭ������ ã�� �ش� ������ �ذ� �Ͽ���
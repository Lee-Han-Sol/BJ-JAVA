package Broze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BJ2338 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
/*		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		*/
	
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
		/*Scanner sc = new Scanner(System.in);
		BigInteger c = sc.nextBigInteger();
		 */	
	}

}

//ó���� BigInteger �Ⱦ��� int�� �޾Ҵٰ� ��Ÿ�� ������ ����
//BufferedReader �Ⱦ��� Scanner�ε� �ǳ� Ȯ��.
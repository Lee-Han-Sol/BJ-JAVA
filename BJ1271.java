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

//첫시작을 BigInteger 말고 int n,m 으로 받아서
//출력값을 println(n/m),println(n%m)으로 나오게 했으나
//런타임에러가 계속하여 발생 10^1000의 값을 int로 받을 수 없음을 파악
//BigInteger 클래스를 찾아 해당 오류를 해결 하였음
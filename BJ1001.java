package Broze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1001 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		a=Integer.parseInt(st.nextToken()); 
		b=Integer.parseInt(st.nextToken());
		

		System.out.println(a-b);
		
	}

}
package Broze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1000 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		a=Integer.parseInt(st.nextToken()); 
		b=Integer.parseInt(st.nextToken());
		

		System.out.println(a+b);
		
	}

}


// 항상 scanner 써오다가 BufferedReader가 처리속도가 빠르다하여
// scanner 말고 써봤는데 읽어오는 메소드가 read()를 쓰게되면
// ascii값으로 가져와 원하는 값을 가져 올 수 없었음.
// 그래서 0을 해당하는 48을 입력에서 빼줘서 해당 ascii값을 10진수 형태로 출력 시켰음
// a=br.read()-'0'; or a = br.read()-48;
// 문제는 한줄로 다받아서 출력하는 것인데 read()는 한문자만 읽어와 10이상의 숫자를 읽지못함.
// read()에서 readLine()으로 메소드를 변경
// 문제는 공백마저 입력값으로 받아버림
// 구분자를 위해 StringTokenizer 클래스를 사용
// str이 문장 전체 String으로 받아 " "을 기준으로 토큰을 나눔
// a를 첫 토큰 부여 b를 두번째로 부여

//번외 배열 splilt

		/*
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		*/
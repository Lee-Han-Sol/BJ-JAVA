package Broze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1085 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int minx,miny;
		
		if(x<=w/2) {			
			minx = x;
		}
		else {
			minx = w-x;
		}
		
		if(y<=h/2) {
			miny = y;
		}
		else {
			miny = h-y;
		}
		
		if(minx<=miny) {
			System.out.println(minx);
		}
		else {
			System.out.println(miny);
		}
	}

}

//처음 문제를 잘못이해하여 x,y에서 w,h까지 가는 거리를 구하는 줄알고 잘못 풀었음
//x,y축 어디든 직사각형에 닿으면 되므로 x의 최솟값,y의 최솟값 구한뒤
//둘의 크기를 비교하고 작은 값을 출력

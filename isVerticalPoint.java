package LAB_8;

import java.util.Scanner;

public class isVerticalPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		Point p = new Point(8,6);
		
		System.out.println(isVertical(x,p));;
	}
	
	public static class Point {
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static boolean isVertical(int x, Point p) {
		return x == p.x;
	}
	
}

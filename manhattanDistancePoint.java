package LAB_8;

import java.util.Scanner;

public class manhattanDistancePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		Point p = new Point();
		
		System.out.println(manhattanDistancePoint(x,y,p));
	}
	
	public static class Point{
		int x = 5;
		int y = 2;
	}
	
	public static int manhattanDistancePoint(int x, int y, Point p) {
		int a = x - p.x;
		int b = y - p.y;
		return Math.abs(a) + Math.abs(b);
	}

}

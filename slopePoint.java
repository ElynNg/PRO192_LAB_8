package LAB_8;

import java.util.Scanner;

public class slopePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		Point p = new Point(10,10);
		
		System.out.println(slopePoint(x,y,p));
	}
	
	public static class Point{
		int x;
		int y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static double slopePoint(int x, int y, Point p) {
		if (x == p.x) {
			throw new IllegalArgumentException();
		}
		else {
			return (double)(y - p.y)/(double)(x-p.x);
			
		}
	}

}

package LAB_8;

import java.util.Scanner;

public class flipPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		int temp = x;
		x = -y;
		y = -temp;
		
		System.out.print(x + " " + y);
	}
	
}

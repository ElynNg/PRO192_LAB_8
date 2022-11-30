package LAB_8;

import java.util.Scanner;

public class quadrantPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(quadrant(x, y));
	}

	public static int quadrant(int x, int y) {
		if (x > 0 && y > 0) {
			return 1;
		}
		else if (x < 0 && y > 0) {
			return 2;
		}
		else if (x < 0 && y < 0) {
			return 3;
		}
		else if (x > 0 && y < 0) {
			return 4;
		}
		else {
			return 0;
		}
	}
	
}

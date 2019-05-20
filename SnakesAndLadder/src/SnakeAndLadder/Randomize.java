package SnakeAndLadder;

import java.util.*;

public class Randomize {
	static int RandomAverage(int ary[], int n) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		int nowPlace = 0;
		int number;
		int totalCount = 0;
		int count = 0;
		int divide = 100;
		for (int i = 0; i < divide; i++) {
			while (true) {
				number = rand.nextInt(6) + 1; // random dice
				count++;
				if(nowPlace+number < n-1)
				{
					nowPlace = ary[nowPlace + number];
					//System.out.print(nowPlace + " ");
				}
				else
				{
					totalCount += count; // totalcount += count
					count = 0; // init count
					nowPlace = 0;
					break;
				}
			}
			//System.out.println();
		}
		return totalCount/divide;
	}

	public static void main(String args[]) {
		int N = 100;
		int moves[] = new int[N];
		for (int i = 0; i < N; i++) // init ary to -1
			moves[i] = i;

		// Ladders
		moves[7] = 54;
		moves[18] = 75;
		moves[31] = 92;

		// Snakes
		moves[96] = 58;
		moves[55] = 3;
		moves[87] = 32;
		System.out.println("Average dice total number = " + RandomAverage(moves, N));
	}
}

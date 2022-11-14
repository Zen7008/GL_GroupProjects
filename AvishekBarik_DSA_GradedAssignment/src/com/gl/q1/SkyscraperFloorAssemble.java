package com.gl.q1;

import java.util.Scanner;

public class SkyscraperFloorAssemble {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building ");
		
		int floorSize = sc.nextInt();
		
		while(floorSize<1) {
			System.out.println("Invalid input try again");
			System.out.println("enter the total no of floors in the building ");
			floorSize = sc.nextInt();
			
		}
		
		
		int floorList[] = new int[floorSize + 1];
		
		for (int i = 1; i <= floorSize; i++) {
			System.out.println("enter the floor size given on day : " + i);
			int perDayFloorSize = sc.nextInt();
			floorList[perDayFloorSize] = i;
		}
		System.out.println();
		int j = floorSize;

		System.out.println("The order of construction is as follows ");
		
		for (int i = 1; i <= floorSize; i++) {
			System.out.println("Day: " + i);
			
			while (j >= 1 && floorList[j] <= i) {

				System.out.print(j + " ");
				j--;
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
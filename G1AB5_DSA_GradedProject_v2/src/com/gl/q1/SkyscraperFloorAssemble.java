package com.gl.q1;

import java.util.Scanner;

public class SkyscraperFloorAssemble {
			
	
	Scanner sc = new Scanner(System.in);
		
		int floorSize;
		int floorList[];
		
		public void getfloorSize() {
			System.out.println("enter the total no of floors in the building ");
			floorSize=sc.nextInt();			
		}
				
		public void getfloorList() {
			this.floorList= new int[floorSize+1];
			for (int i = 1; i <= floorSize; i++) {
				System.out.println("enter the floor size given on day : " + i);
				floorList[sc.nextInt()] = i;
			}		
		}
		
		public void displayConstruction() {
			
			int j = floorSize;
			System.out.println();
			System.out.println("The order of construction is as follows ");
			
			for (int i = 1; i <= floorSize; i++) {
				System.out.println("Day: " + i);
				
				while (j >= 1 && this.floorList[j] <= i) {

					System.out.print(j + " ");
					j--;
				}
				System.out.println();
			}
			
		}
		
		
		
}
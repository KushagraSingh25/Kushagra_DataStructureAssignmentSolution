package com.dsa.question1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Skyscraper {
	
    //Function for Floor Plan
	private static void floorPlan(int m,int floor[]) {
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		int max = m;
		for(int i=1;i<=m;i++) {
			q.add(floor[i]);
			System.out.println("\nDay:"+i);

			while(q.peek()!=null && q.peek()==max) {
				System.out.print(q.poll()+" ");
				max--;
			}
		}
	}
	
	//Driver Class
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building:");
		int size = in.nextInt();
		int floor[] = new int[size+1];
		for(int i=1;i<=size;i++) {
			System.out.println("Enter the floor size given on day:"+i);
			floor[i] = in.nextInt();
		}
		//Calling required function
		floorPlan(size,floor);
		in.close();
	}	
}

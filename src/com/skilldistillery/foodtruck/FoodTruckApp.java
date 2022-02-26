package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruck[] listOfTrucks = new FoodTruck[5];
		int rating = 0;


		boolean keepGoing = true;
		int count = 0;

		System.out.println("---------Welcome to Food Trucker----------");
		System.out.println("-----Please enter up to 5 food trucks!----");
		
		while (keepGoing && count < listOfTrucks.length) {

 			System.out.println("----Enter \"quit\" in truck name to quit----");
			System.out.print("Please enter food truck name: ");
			String truckName = kb.nextLine();

			if (truckName.equalsIgnoreCase("Quit")) {
				keepGoing = false;
				break;
			}
			
			
			System.out.print("Please enter the trucks food type: ");
			String foodType = kb.nextLine();

			System.out.print("What's you're rating for the truck?: ");
			rating = kb.nextInt();
			kb.nextLine(); //consumes rest of line after nextInt()

			while (rating <= 0 || rating > 5) {
				System.out.println();
				System.out.println("Rating must be between 1-5");
				System.out.print("Please enter a vaild rating: ");
				rating = kb.nextInt();
				kb.nextLine(); //consumes rest of line after nextInt()
			}

			for (int i = count; i == count; i++) {
				if (listOfTrucks[i] == null) {
					listOfTrucks[i] = new FoodTruck(truckName, foodType, rating);
				}
			}

			count++;
			System.out.println();
		}
		
		keepGoing = true;

		
		while (keepGoing) {
			
			System.out.println("------------Menu-------------");
			System.out.println("1. List all food trucks");
			System.out.println("2. See average rating of all food trucks");
			System.out.println("3. Display the highest-rated food truck");
			System.out.println("4. Quit");
			
			String choice;
			
			do {
				choice = kb.next();
				switch (choice) {
				case "1":
				case "all":
					listOfTrucks[0].listAllTrucks(listOfTrucks);
					break;
				case "2":
				case "average": 
					listOfTrucks[0].averageRating(listOfTrucks);
					break;
				case "3":
				case "highest-rated":
					listOfTrucks[0].highestRated(listOfTrucks);
					break;
				case "4":
				case "quit":
				case "Quit":
					System.exit(0);
				default:
					System.out.println("Please enter a vaild choice");
					choice = null;
				}
				
			} while (choice == null);
			System.out.println();
		}

		
		kb.close();
	}

}

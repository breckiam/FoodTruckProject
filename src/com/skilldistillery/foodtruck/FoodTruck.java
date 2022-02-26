package com.skilldistillery.foodtruck;

public class FoodTruck {
	private static int lastID = 122;
	private int uniqueID;
	private String truckName;
	private String foodType;
	private int rating;

	{
		uniqueID = lastID + 1;
		lastID = uniqueID;
	}

	public FoodTruck() {
	}

	public FoodTruck(String truckName, String foodType, int rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	// Getters and Setters

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String toString() {
		String truckInfo = "Truck ID: " + uniqueID + " | Name: " + truckName + " | Food type: " + foodType + " | Rating: "
				+ rating + "\n";
		return truckInfo;
	}

	public void listAllTrucks(FoodTruck[] listOfTrucks) {

		for (int i = 0; i < listOfTrucks.length; i++) {
			if (listOfTrucks[i] != null) {
				System.out.println(listOfTrucks[i].toString());
			}
		}

	}

	public void averageRating(FoodTruck[] listOfTrucks) {
		double average = 0;
		int numTrucks = 0;
		//TODO exception error line 69
		for (int i = 0; i < listOfTrucks.length; i++) {
			if (listOfTrucks[i] == null) {
				continue;
			}
			average += listOfTrucks[i].rating;
			numTrucks++;
		}
		average = average / numTrucks;
		System.out.println("Average Rating: " + average);

	}

	public void highestRated(FoodTruck[] listOfTrucks) {
		FoodTruck highest = listOfTrucks[0];
		//TODO: exception error line 83
		for (int i = 0; i < listOfTrucks.length; i++) {
			if (listOfTrucks[i] != null) {
				if (listOfTrucks[i].rating > highest.rating) {
					highest = listOfTrucks[i];
					
				}
			}

		}
		
		System.out.println("Highest rated: " + highest.toString());

	}

}

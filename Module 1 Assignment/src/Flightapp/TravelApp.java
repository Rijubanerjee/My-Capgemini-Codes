package Flightapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TravelApp {
	static Flight [] f1 = new Flight[10];
	static int count = 0;
	public static void main(String[] args) {
		/* Write code to call Flight constructor and Flight class setter methods */
		/*
		 * Flight flight = null;
		 * 
		 * 
		 * FlightDetails flightDetails = new FlightDetails();
		 * flightDetails.printFlightDetails(flight);2021, 1, 26
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Flight Number:");
		String FN = sc.nextLine();
		
		System.out.println("Enter Airliner:");
		String Al  = sc.nextLine();
		System.out.println("Enter Destination:");
		String des = sc.nextLine();
		System.out.println("Enter Source:");
		String src = sc.nextLine();
		System.out.println("Enter Arrival Time in yyyy-MM-dd HH:mm format:");
		String at = sc.nextLine();
		System.out.println("Enter Departure Time in yyyy-MM-dd HH:mm format:");
		String  dt = sc.nextLine();
		System.out.println("Domestic <false = 0> International <true = 1>:");
		int tf = Integer.parseInt(sc.nextLine());
		boolean type;
		if (tf == 0)
			type = false;
		else 
			type = true;
		System.out.println("Enter international fly tax if any else 0:");
		int intax = Integer.parseInt(sc.nextLine());
		System.out.println("Enter base fare:");
		int fare = Integer.parseInt(sc.nextLine());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime ar = LocalDateTime.parse(at, formatter);
		LocalDateTime de = LocalDateTime.parse(dt, formatter);
		
		Flight flight = new Flight(FN, Al, des, ar, src, de, type, intax, fare);
		flight.calculateCost();
		System.out.println("Enter number of haults:");
		int number_of_haults = Integer.parseInt(sc.nextLine());
		if (number_of_haults > 0) {
			Hault[] ht = new Hault[number_of_haults];
			for (int i = 0; i < number_of_haults; i++) {
				Hault temp = new Hault();
				System.out.println("Hault place:");
				String place = sc.nextLine();
				System.out.println("Hault duration:");
				int dur = Integer.parseInt(sc.nextLine());
				temp.setAirportName(place);
				temp.setDuration(dur);
				ht[i] = temp;
			}
			flight.setHault(ht);
		}
		setflight(flight);
		FlightDetails fp = new FlightDetails();
		fp.printFlightDetails(flight);
	}
	public static void setflight(Flight flight) {
		f1[count++] = flight;
	}
	public static void printflight()
	{
		for(Flight f: f1)
		{
			FlightDetails fp = new FlightDetails();
			fp.printFlightDetails(f);
		}
	}
}

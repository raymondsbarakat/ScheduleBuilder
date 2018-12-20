package scheduleBuilder;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Schedule {

	static ArrayList<Team_Member> Team = new ArrayList<Team_Member>();
	
	static PriorityQueue<Team_Member> Monday = new PriorityQueue<>();
	static PriorityQueue<Team_Member> Tuesday = new PriorityQueue<>();
	static PriorityQueue<Team_Member> Wednesday = new PriorityQueue<>();
	static PriorityQueue<Team_Member> Thursday = new PriorityQueue<>();
	static PriorityQueue<Team_Member> Friday = new PriorityQueue<>();
	static PriorityQueue<Team_Member> Saturday = new PriorityQueue<>();
	static PriorityQueue<Team_Member> Sunday = new PriorityQueue<>();
	
	
	
	Schedule(){
		
	}
	
	
	Team_Member getPriority(String day){
		
		System.out.println(day.toUpperCase());
		day.toLowerCase();
		
		if(day == "monday") {
			return Monday.peek();
			//System.out.println(Monday.peek());
		}
		else if(day == "tuesday") {
			return Tuesday.peek();
			//System.out.println(Tuesday.peek());
		}
		else if(day == "wednesday") {
			return Wednesday.peek();
			//System.out.println(Wednesday.peek());
		}
		else if(day == "thurdsay") {
			return Thursday.peek();
		}
		else if(day == "friday") {
			return Friday.peek();
		}
		else if(day == "saturday") {
			return Saturday.peek();
		}
		else if(day == "sunday") {
			return Sunday.peek();
		}
		else return null;
	}
	
	
	
	void PrintNames() {
		System.out.println("Names:");
		
		for(int i = 0; i < Team.size(); i++) {
			
			System.out.print(Team.get(i).toString());
			
			if(i != (Team.size() -1)) {
				System.out.print(", ");
			}
			
		}		
	}
	
	void PrintSchedule() {
				System.out.println("\nMonday:");
				PrintHelper("monday");
				System.out.println("\nTuesday:");
				PrintHelper("tuesday");
				System.out.println("\nWednesday:");
				PrintHelper("wednesday");
				System.out.println("\nThursday:");
				PrintHelper("thursday");
				System.out.println("\nFriday:");
				PrintHelper("friday");
				System.out.println("\nSaturday:");
				PrintHelper("saturday");
				System.out.println("\nSunday:");
				PrintHelper("sunday");
	}
	
	void PrintSchedule1(){
		System.out.println("\nMonday:");
		PrintHelper1("monday");
		System.out.println("\nTuesday:");
		PrintHelper1("tuesday");
		System.out.println("\nWednesday:");
		PrintHelper1("wednesday");
		System.out.println("\nThursday:");
		PrintHelper1("thursday");
		System.out.println("\nFriday:");
		PrintHelper1("friday");
		System.out.println("\nSaturday:");
		PrintHelper1("saturday");
		System.out.println("\nSunday:");
		PrintHelper1("sunday");
	}
	
	private void PrintHelper1(String day) {
		
		day.toLowerCase();
		
		if(day == "monday") {
	
			System.out.println(Monday.peek());
		}
		else if(day == "tuesday") {
			
			System.out.println(Tuesday.peek());
		}
		else if(day == "wednesday") {
			
			System.out.println(Wednesday.peek());
		}
		else if(day == "thurdsay") {
			System.out.println(Thursday.peek());
		}
		else if(day == "friday") {
			System.out.println(Friday.peek());
		}
		else if(day == "saturday") {
			System.out.println(Saturday.peek());
		}
		else if(day == "sunday") {
			System.out.println(Sunday.peek());
		}
		
	}
	
	private void PrintHelper(String day) {
	
				for (int k = 0; k < Team.size(); k++) {

					if (Team.get(k).isAvailable(day)) {
						
						System.out.print(Team.get(k).toString());
						
						if (k != (Team.size() - 1)) {
							
							System.out.print(", ");
						}
					}
				}

			}
		}

	
	


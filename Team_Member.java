package scheduleBuilder;

public class Team_Member implements Comparable<Team_Member> {

	int priority;
	String first_name;
	String last_name;
	String availability[];

	static Schedule Scadda = new Schedule();
	
	Team_Member(int number, String first_name, String last_name){
		this.availability = new String[7];
		this.priority = number;
		this.first_name = first_name;
		this.last_name = last_name;
		Scadda.Team.add(this);
	}
	
	public void change_availability(String available[]) {
		
		this.availability = new String[7];
		
		Scadda.Monday.remove(this);
		Scadda.Tuesday.remove(this);
		Scadda.Wednesday.remove(this);
		Scadda.Thursday.remove(this);
		Scadda.Friday.remove(this);
		Scadda.Saturday.remove(this);
		Scadda.Sunday.remove(this);
		
		for(int i = 0; i < available.length ; i++) {
			
			if(availability[i] == "None"){
				i++;
			}
			else {
			
				availability[i] = available[i].toLowerCase();
			
				if(available[i].toLowerCase() == "monday") {
					Scadda.Monday.add(this);
				}
				else if(available[i].toLowerCase() == "tuesday") {
					Scadda.Tuesday.add(this);
				}
				else if(available[i].toLowerCase() == "wednesday") {
					Scadda.Wednesday.add(this);
				}
				else if(available[i].toLowerCase() == "thursday") {
					Scadda.Thursday.add(this);
				}
				else if(available[i].toLowerCase() == "friday") {
					Scadda.Friday.add(this);
				}
				else if(available[i].toLowerCase() == "saturday") {
					Scadda.Saturday.add(this);
				}
				else if(available[i].toLowerCase() == "sunday") {
					Scadda.Sunday.add(this);
				}
	      	}
		}}
	
	
	
	
	boolean isAvailable(String day) {
		String myDay = day.toLowerCase();
		boolean flag = false;
		if(myDay != "monday" && myDay != "tuesday" && myDay != "wednesday" && myDay != "thursday"
				  && myDay != "friday" && myDay != "saturday" && myDay != "sunday") {
			return false;}
			else {
				for(int i =0; i<availability.length; i++) {
					if(myDay == this.availability[i]) {
						flag = true;
					}
				}
			}
			return flag;
		}  
		
	
	
	void changePriority(int i) {
		
		this.priority = i;
		
	}
	
	public String toString() { 
	    return this.first_name + " " + this.last_name;
	}

	@Override
	public int compareTo(Team_Member other) {
		return this.priority - other.priority;
	} 
		
	}
	


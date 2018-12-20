package scheduleBuilder;

import java.util.ArrayList;
import java.util.Random;

public class Builder {
	
	
	Schedule Scadda = new Schedule();
	
	ArrayList<Team_Member> getDay(String day){
		day.toLowerCase();
		
		ArrayList<Team_Member> dayList  = new ArrayList<>();
		
		if(day == "monday") {
			int n = Scadda.Monday.size();
			for(int i = 0; i < n; i ++) {
				dayList.add(Scadda.Monday.poll());
			}
		}
		if(day == "tuesday") {
			int n = Scadda.Tuesday.size();
			for(int i = 0; i < n; i ++) {
				dayList.add(Scadda.Tuesday.poll());
			}
		}
		return dayList;
	}
	
	Team_Member getRandom(String day){
		ArrayList<Team_Member> dayList  = this.getDay(day);
		Random randomGenerator;
		randomGenerator = new Random();
		
		int index = randomGenerator.nextInt(dayList.size());
		
		return dayList.get(index);
	}
	
	void Print(){
	System.out.println("|--------------------------------------------------------------------------------------------------|");
	System.out.println("|---Monday---|---Tuesday---|---Wednesday---|---Thursday---|---Friday---|---Saturday---|---Sunday---|");
	System.out.println("|--------------------------------------------------------------------------------------------------|");
	System.out.println("|" + this.getRandom("monday") +  "   |   " +  this.getRandom("tuesday") + "    |    " );

	}
}

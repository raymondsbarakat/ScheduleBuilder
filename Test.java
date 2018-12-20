package scheduleBuilder;

public class Test {
public static void main(String[] args) {
	
	Schedule Scadda = new Schedule();
	Team_Member john = new Team_Member(1, "John", "Baptist");
	
	String John_availability[] = {"monday","tuesday","wednesday"};
	john.change_availability(John_availability);
	
	System.out.println(john.isAvailable("monday"));
	
	String John_availability2[] = {"tuesday","wednesday"};
	john.change_availability(John_availability2);
	
	System.out.println(john.isAvailable("monday"));
	
	System.out.println(john.isAvailable("tuesday"));
	System.out.println(john.isAvailable("thursday"));
	
	Team_Member Mary = new Team_Member(2, "Mary", "Loo");
	
	String Mary_availability[] = {"monday","thursday"};
	Mary.change_availability(Mary_availability);
	

	Scadda.PrintNames();
	
	//Scadda.PrintSchedule();
	
	
	String Mary_availability2[] = {"monday","tuesday", "friday", "saturday"};
	Mary.change_availability(Mary_availability2);
	
	Scadda.PrintSchedule();
	
	Team_Member Sherry;
	
	Sherry = Scadda.getPriority("tuesday");
	System.out.println(Sherry.toString());
	
	Scadda.PrintSchedule1();
	
	Builder bob = new Builder();
	bob.Print();
}
}

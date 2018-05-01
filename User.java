import java.util.Scanner;
class User {
	private static Scanner usersInput;
	int usersPreference = 0;
	int usersExerciseTime = 0;
	double usersWeight = 0;;
	double usersHeight = 0;
	int usersAge = 0;
	int endUnits = 0;

User() {
	getUsersPreference();
	getUsersWeight();
	getUsersExerciseTime();
	getUsersHeight();
	getUsersAge();
	getUsersEndUnits();
}



	void getUsersPreference() {
		System.out.println("Hello welcome to the Water Intake app! Please answer the following questions or following directions to enter the following to get started!");
		
		while(usersPreference< 1 || usersPreference> 2) {
		System.out.println("Please select what system you want your units to be. \n 1. Imperial(US) \n 2. Metric");
		usersInput = new Scanner(System.in);
		String usersResponse= usersInput.nextLine();
		
		try{
			usersPreference = Integer.parseInt(usersResponse);	
		}
		catch (Exception ex){
		}
		}
		
	}
		void getUsersExerciseTime() {	
		if(usersExerciseTime!=0 || usersExerciseTime<300) {
			System.out.println("Please enter your time spent daily exercising in minutes");
			String usersResponse = usersInput.nextLine();
			
			try {
				usersExerciseTime = Integer.parseInt(usersResponse);
			}
			catch (Exception ex) {
				
			}
		}
			}
		
		
		void getUsersWeight() {
		
		String weightUnit = "pounds";
		if(usersPreference==2) {
			weightUnit = "kilograms";
		} 
		while(usersWeight==0) {
		System.out.println("Please enter your weight in " +weightUnit);
		
		String usersResponse = usersInput.nextLine();
		try{
			usersWeight = Double.parseDouble(usersResponse);	
		}
		catch (Exception ex){
		
		}
		}
		}
		
		void getUsersHeight() {
			String heightUnit = "inches";
			if(usersPreference==2) {
				heightUnit="centimeters";
			}
			//This while loop prompts the user to enter height based on unit preferences then changes to desired data type
			while(usersHeight==0) {
				System.out.println("Please enter your height in " +heightUnit);
				
				String usersResponse = usersInput.nextLine();
				try {
					usersHeight = Double.parseDouble(usersResponse);
				}
				catch (Exception ex) {
					
				}
			}
		
	}
		void getUsersAge() {
			//This while loop waits until the user enters an acceptable value within the range and then converts it into the desired data type
			while(usersAge< 1 || usersAge> 100) {
				System.out.println("Please enter your age.");
				
				String usersResponse = usersInput.nextLine();
				try {
				usersAge = Integer.parseInt(usersResponse);
			}
			
			catch (Exception ex) {
				
			}
		}
		}
		//This gets the units the user wants his or her water intake to be
		void getUsersEndUnits() {
			if(usersPreference==1) {
				System.out.println("Please select if you would like your water intake in \n 1. Fluid ounces \n 2. Cups");
				String usersResponse = usersInput.next();
				endUnits = Integer.parseInt(usersResponse);
			}
			
			else if(usersPreference==2) {
				System.out.println("Please select if you would like your water intake in \n 1. Liters \n 2. Milliliters");
				String usersResponse = usersInput.nextLine();
				endUnits = Integer.parseInt(usersResponse);
				
			}
			
		}
		
}
	

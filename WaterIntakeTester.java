import java.util.Timer;

public class WaterIntakeTester {
	
	static User  userOne = null;
	
	
	public static void main(String[] args) {
		
		userOne = new User();
		//The first section of this if loop allows the user to be able to call the first method of the WaterIntakeCalculations Class after the user chooses 1 for the userPreference in the User Class have been met.
	if(userOne.usersPreference==1) {
		//The next section of this if loop is activated if the user wanter to have his or her water intake in fluid ounces. Then calls the corresponding method from the WaterIntakeCalculations Class.
		if(userOne.endUnits==1) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.calculateImperialWaterIntake(userOne) +" fluid ounces");
		}
		//The last part of this if loop is activated if the user wants to have his or her water in take converted to cups. Then calls the corresponding method from the WaterIntakeCalculations Class.
		else if(userOne.endUnits==2) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.convertImperialWaterIntakeToCups(userOne) +" cups");
		}
	}
	//The second if loop works exactly the same as the previous if loop. However this loop is only activated when the user chooses 2 for the usersPreference in the User Class.
	if(userOne.usersPreference==2) {
		//This part of the if loop is activated when the user wants to have his or her water intake in liters.
		if(userOne.endUnits==1) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.convertWaterIntakeToMetric(userOne) +" liters");
		}
		//The last part of this if loop is activated when the user wants to have his or her water intake in milliliters.
		else if(userOne.endUnits==2) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.convertWaterIntakeToMilliliters(userOne) +" milliliters");
		}
	}
		
		//This part of the main method activates the Reminder Class. The Reminder Class uses inheritance from the Timer Class. 
		Timer reminder = new Timer();
		//This calls the reminder class to allow a timer to be created that goes off every 5 minutes for the length of 5 seconds every time it goes off.
		reminder.scheduleAtFixedRate(new Reminder(), Long.valueOf(5000), (5*60*1000));

	}
	
	}

 

import java.util.Timer;

public class WaterIntakeTester {
	static User  userOne = null;
	public static void main(String[] args) {
		userOne = new User();
	if(userOne.usersPreference==1) {
		if(userOne.endUnits==1) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.calculateImperialWaterIntake(userOne) +" fluid ounces");
		}
		else if(userOne.endUnits==2) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.convertImperialWaterIntakeToCups(userOne) +" cups");
		}
	}
	
	if(userOne.usersPreference==2) {
		if(userOne.endUnits==1) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.convertWaterIntakeToMetric(userOne) +" liters");
		}
		else if(userOne.endUnits==2) {
			System.out.println("Your daily water intake is " +WaterIntakeCalculations.convertWaterIntakeToMilliliters(userOne) +" milliliters");
		}
	}
		
		
		Timer reminder = new Timer();
		reminder.scheduleAtFixedRate(new Reminder(), Long.valueOf(5000), (5*60*1000));

	}
	
	}

 

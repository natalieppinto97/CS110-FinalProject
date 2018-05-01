
public class WaterIntakeCalculations {
static double ImperialWaterIntake;
static double MetricWaterIntake;
static double WaterIntakeCups;
static double WaterIntakeMilliliter;
static User  userOne = null;

WaterIntakeCalculations(){
	calculateImperialWaterIntake(userOne);
	convertWaterIntakeToMetric(userOne);
	convertImperialWaterIntakeToCups(userOne);
	convertWaterIntakeToMilliliters(userOne);
	
}
	//This method takes the users weight, exercise time and calculates the users water intake in fluid ounces.
	public static double calculateImperialWaterIntake(User userOne) {
			try {
				ImperialWaterIntake = (userOne.usersWeight/2)+((userOne.usersExerciseTime/30)*12);
			}
			catch (Exception ex) {
				
			}
			return ImperialWaterIntake;
		}



	//This method converts the users weight, and exercise time from having a water intake in fluid ounces to having a water intake of liters.
	public static double convertWaterIntakeToMetric(User userOne) {
		
			try {
				MetricWaterIntake = ((userOne.usersWeight/(1/0.453592)/2)+(((userOne.usersExerciseTime/30)*12))*(1/33.814));
			}
			catch (Exception ex) {
				
			}
			return MetricWaterIntake;
	
	}
	//This method converts the water intake of the user to cups.
	public static double convertImperialWaterIntakeToCups(User userOne) {
		try {
			WaterIntakeCups = ((userOne.usersWeight/2)+((userOne.usersExerciseTime/30)*12) *(1/8));
		}
		catch (Exception ex) {
			
		}
		return WaterIntakeCups;
	}
	//This converts the water intake of the user to milliliters.
	public static double convertWaterIntakeToMilliliters(User userOne) {
		try {
			WaterIntakeMilliliter = ((userOne.usersWeight/(1/0.453592)/2)+(((userOne.usersExerciseTime/30)*12))*(1/0.033814));
		}
		catch (Exception ex) {
			
		}
		return WaterIntakeMilliliter;
	}
}

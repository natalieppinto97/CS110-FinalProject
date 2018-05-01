
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

	public static double calculateImperialWaterIntake(User userOne) {
			try {
				ImperialWaterIntake = (userOne.usersWeight/2)+((userOne.usersExerciseTime/30)*12);
			}
			catch (Exception ex) {
				
			}
			return ImperialWaterIntake;
		}




	public static double convertWaterIntakeToMetric(User userOne) {
		
			try {
				MetricWaterIntake = ((userOne.usersWeight/(1/0.453592)/2)+(((userOne.usersExerciseTime/30)*12))*(1/33.814));
			}
			catch (Exception ex) {
				
			}
			return MetricWaterIntake;
	
	}
	
	public static double convertImperialWaterIntakeToCups(User userOne) {
		try {
			WaterIntakeCups = ((userOne.usersWeight/2)+((userOne.usersExerciseTime/30)*12) *(1/8));
		}
		catch (Exception ex) {
			
		}
		return WaterIntakeCups;
	}
	
	public static double convertWaterIntakeToMilliliters(User userOne) {
		try {
			WaterIntakeMilliliter = ((userOne.usersWeight/(1/0.453592)/2)+(((userOne.usersExerciseTime/30)*12))*(1/0.033814));
		}
		catch (Exception ex) {
			
		}
		return WaterIntakeMilliliter;
	}
}

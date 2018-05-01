import java.util.TimerTask;
//This class extends the timer class.
class Reminder extends TimerTask {
	//This method allows the mesage to be displayed every time the timer goes off.
	public void run() {
		System.out.println("You need to drink more water");
	}

}

package pomodoroApplication;

public class Countdown {

	//Variables 
	
	//This variable gets the minutes into seconds
	private static long totalTime;
	
	//This variable allows the system to operate by a second.
	private static long perSec = 1000;
	
	//Method
	
	//This function conducts the Countdown process
	public static void bySleep(int total) throws InterruptedException
	{
		//This expression changes the time to minutes
		totalTime = total * 60;
		
		for(long i = totalTime; i >= 0; i--)
		{
			//The function is paused for a second.
			Thread.sleep(perSec);
			
			//The function shows the time in the console
			TimeDisplay.remainTime(i);
		}
	}
}

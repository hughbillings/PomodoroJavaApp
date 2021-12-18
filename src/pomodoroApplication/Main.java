package pomodoroApplication;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		boolean isContinue = true;
		Timer pomodoroApp = new Timer();
		
		do 
		{
			for(int i = 0; i < pomodoroApp.getNumOfPomodoro(); i++)
			{
				messageDisplay.startPomodoro();
				Countdown.bySleep(pomodoroApp.getPomodoroTime());
				if(i == pomodoroApp.getNumOfPomodoro() - 1)
				{
					messageDisplay.startLongBreak();
					Countdown.bySleep(pomodoroApp.getLongBreakTime());
				} 
				else
				{
					messageDisplay.startShortBreak();
					Countdown.bySleep(pomodoroApp.getShortBreakTime());
				}
			}
			isContinue = messageDisplay.isContinue();
			
		} while (isContinue);
				
	}

}

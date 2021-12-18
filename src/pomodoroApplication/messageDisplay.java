package pomodoroApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class messageDisplay {
	
	public static boolean isContinue() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("Would you like to do another task? (Y/N) ");
			String answer = br.readLine();
			if(answer.equals("Y"))
			{
				System.out.println("Great!");
				return true;
			}
			else if(answer.equals("N"))
			{
				System.out.println("No problem");
				return false;
			}
			else 
			{
				continue;
			}
		}
	}
	
	
	public static void startPomodoro()
	{
		System.out.println("Your Pomodoro has begun");
		
	}
	
	public static void startShortBreak()
	{
		System.out.println("Your short break has started");
	}
	
	public static void startLongBreak()
	{
		System.out.println("Your long break has started");
	}
	
	
}

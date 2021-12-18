package pomodoroApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timer {
	
	//Variables for Distinguishing breaks and pomodoros
	private int shortBreak;
	private int longBreak;
	private int numOfPomodoro;
	private int pomodoroTime;
	private String task;
	
	
	//Constructor
	
	//Accepting input from the user to set the Pomodoro
	
	public Timer() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.print("Enter the task to be completed ");
		task = br.readLine();
		System.out.printf("Enter the number of Pomodoros to complete %s ", task);
		numOfPomodoro = Integer.parseInt(br.readLine());
		System.out.print("Enter the time for each Pomodoro ");
		pomodoroTime = Integer.parseInt(br.readLine());
		System.out.print("Enter the time for each short break ");
		shortBreak = Integer.parseInt(br.readLine());
		System.out.print("Enter the time for the long break ");
		longBreak = Integer.parseInt(br.readLine());
	}
	
	
	//Methods
	
	//Getters
	
	//This function gets the number of pomodoros
	public int getNumOfPomodoro()
	{
		return this.numOfPomodoro;
	}
	
	//This function gets the time of each Pomodoro
	public int getPomodoroTime()
	{
		return this.pomodoroTime;
	}
	
	//This function gets the time of each short break
	public int getShortBreakTime()
	{
		return this.shortBreak;
	}
	
	//This function gets the time of the long break
	public int getLongBreakTime()
	{
		return this.longBreak;
	}
	

}

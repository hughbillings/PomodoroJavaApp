package pomodoroApplication;

import java.text.DecimalFormat;

public class TimeDisplay {
	
	
	public static void remainTime(long timeBySec)
	{
		long min = timeBySec/60;
		long sec = timeBySec%60;
		
		
		DecimalFormat df = new DecimalFormat("00");
		
		System.out.println(df.format(min) + ":" + df.format(sec));
	}
}

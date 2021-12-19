package pomodoroApplication;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class musicApplication {
	
	void playMusic(String musicLocation)
	{
		try
		{
			//This function invokes the audio file.
			
			File musicPath = new File(musicLocation);
			
			if(musicPath.exists())
			{
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				
				Clip clip = AudioSystem.getClip();
				
				clip.open(audioInput);
				
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				
				clip.start();
				
				
				JOptionPane.showMessageDialog(null, "Press OK to stop playing");
				
			}
			else
			{
				System.out.println("This music file does not exist");
			}
			
			
			
			
			
			
		}
		catch (Exception ex)
		{
			//This prints out the error messages.
			ex.printStackTrace();
		}
	}
}

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;


public class TimerMessage
{
	public static void main(String[] args)
	{
		ActionListener listener = new TimePrinter();
		System.out.println("The time is: " + new Date());
		Timer t = new Timer(5000, listener);
		t.start();
		System.exit(0);
	}
}

class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		System.out.println("The time is: " + new Date());
	}
}

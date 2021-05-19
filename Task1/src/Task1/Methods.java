package Task1;

import java.util.Calendar;
import java.time.chrono.*;

public class Methods {
	public void PrintGregorianDate()
	{
		System.out.println(Calendar.getInstance().getTime());
	}
	
	public void PrintHijriDate()
	{
		System.out.println(HijrahDate.now());
	}
}

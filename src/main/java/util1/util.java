package util1;

import base.OrangeHRMBase;

public class util extends OrangeHRMBase{
public static int THREAD_sleep=500;
	
	public static void waits(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}

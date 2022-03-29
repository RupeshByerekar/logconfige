package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tpack.TC001;

public class Log {

	
	private static Logger Log = LogManager.getLogger(TC001.class.getName());
	
	public static void info(String msg)
	{
		Log.info(msg);
	}
}

package tpack;

import org.testng.annotations.Test;

import general.General;
import log4j.Log;

public class TC001 {

	
	@Test
	public void tc001() throws Exception
	{
		General ob = new General();
		ob.setup();
		ob.login();
		ob.logout();
		ob.closure();
		
	}
	
}


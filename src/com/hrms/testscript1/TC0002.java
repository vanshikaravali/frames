package com.hrms.testscript1;


	import org.testng.annotations.Test;
	import com.hrms.lib.General;
	import org.apache.log4j.xml.DOMConfigurator;

	public class TC0002 {
		@Test
		public void  tc0002() {
			DOMConfigurator.configure("log4g.xml");
			General  obj =new General();
			obj.openApplication();
			obj.login();
			obj.enterFrame();
			obj.addNewEmp();
			obj.exitFrame();
			obj.logout();
			obj.closeApplication();
		}

	}






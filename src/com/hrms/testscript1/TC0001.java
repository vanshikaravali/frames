package com.hrms.testscript1;


	import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;
	public class TC0001 {
//		public static void main(String args[]) {
		@Test
		public void tc001() {
			DOMConfigurator.configure("log4j.xml");
			General obj=new General();
			obj.openApplication();
			obj.login();
			obj.logout();
			obj.closeApplication();
		
			 
			  
			    
			      		
			

			

			
			
		}

	


}

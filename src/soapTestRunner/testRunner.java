package soapTestRunner;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class testRunner {

	@Test
	public void soaptest() throws Exception, Exception, SoapUIException {

		// Grab the project
		WsdlProject project = new WsdlProject("C:\\Intellipath\\SOAPUI\\Employee_Framework.xml");
		// Grab the testsuite
		WsdlTestSuite testsuite = project.getTestSuiteByName("Testing");
		for (int i = 0; i < testsuite.getTestCaseCount(); i++) {
			WsdlTestCase testcase = testsuite.getTestCaseAt(i);
			TestRunner runner = testcase.run(new PropertiesMap(), false);
			AssertJUnit.assertEquals(Status.FINISHED, runner.getStatus());
			// System.out.println("The result is " + runner);

		}

	}

}

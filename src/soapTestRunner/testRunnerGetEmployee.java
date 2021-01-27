package soapTestRunner;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class testRunnerGetEmployee {

	@Test
	public void getEmployeeTest() throws XmlException, IOException, SoapUIException {

		// Grab the project
		WsdlProject project = new WsdlProject("C:\\Intellipath\\SOAPUI\\Employee_Framework.xml");
		// grab the testsuite
		WsdlTestSuite testsuite = project.getTestSuiteByName("Testing");
		// grab the testcase by name
		WsdlTestCase testcase = testsuite.getTestCaseByName("GetEmployee");
		TestRunner runner = testcase.run(new PropertiesMap(), false);
		AssertJUnit.assertEquals(Status.FINISHED, runner.getStatus());

	}

}

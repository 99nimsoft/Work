package automationPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class retry1 implements IRetryAnalyzer{
	int counter = 0;
	int retryLimit = 0;
	int waitTime = 10000;
	@Override
	public boolean retry(ITestResult result) {
		if(counter < retryLimit)
		{
			try {
				System.out.println("Waiting for "+waitTime+" ,milli seconds before retry");
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter++;
			return true;
		}
		return false;
	}
}

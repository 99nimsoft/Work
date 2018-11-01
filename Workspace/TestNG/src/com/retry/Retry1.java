package com.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry1 implements IRetryAnalyzer{

	int numberOfTimes=2;
	long waitFor=10000;           // in ms
	int counter=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<numberOfTimes){
			counter++;
			return true;
		}
		else{
			return false;	
		}
	}

}

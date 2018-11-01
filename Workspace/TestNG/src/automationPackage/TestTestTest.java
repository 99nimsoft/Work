package automationPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestTestTest implements IAnnotationTransformer,IRetryAnalyzer{

	int i=1;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setInvocationCount(i);
		//annotation.setRetryAnalyzer(TestTestTest.class);
	}
	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int max=3;
		if(count<max){
			count++;
			return true;
		}
		else{
			return false;
		}
	}

}

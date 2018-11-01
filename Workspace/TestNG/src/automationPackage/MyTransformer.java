package automationPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;
import org.testng.internal.annotations.ITest;

import com.retry.Retry1;

public class MyTransformer implements IAnnotationTransformer {
@Override
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	//annotation.setInvocationCount(4);
	annotation.setRetryAnalyzer(Retry1.class);
}
}

//class retry1 implements IRetryAnalyzer{
//
//	int counter = 0;
//	int retryLimit = 7;
//	@Override
//	public boolean retry(ITestResult result) {
//		if(counter < retryLimit)
//		{
//			counter++;
//			return true;
//		}
//		return false;
//	}
//	
//}
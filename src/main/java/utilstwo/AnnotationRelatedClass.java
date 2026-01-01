package utilstwo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestClass;
import org.testng.annotations.ITestAnnotation;

import utilsone.RetryMechanism;

public class AnnotationRelatedClass implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryMechanism.class);
	}

}

package parallelTesting;

import org.testng.annotations.Test;

public class TestParallelClassOne  {
	
	@Test
	public void testCaseOne() {
		// Printing class name and Id of the thread on using which test method got executed
		System.out.println("TestParallelClassOne -- Test Case One in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}

	@Test
	public void testCaseTwo() {
		 //Printing class name and Id of the thread on using which test method got executed
		System.out.println("TestParallelClassOne -- Test Case Two in " + getClass().getSimpleName()
				+ " with Thread Id:- " + Thread.currentThread().getId());
	}
}

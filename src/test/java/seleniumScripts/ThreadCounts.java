package seleniumScripts;

import org.testng.annotations.Test;

public class ThreadCounts 
{
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("test2");

	}
	
	@Test(groups= {"integration"})
	public void test3()
	{
		System.out.println("test3");

	}
	
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("test4");

	}
	
	@Test(groups= {"adhoc"})
	public void test5()
	{
		System.out.println("test5");

	}

}

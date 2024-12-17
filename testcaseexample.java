package todaylistner;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
public class testcaseexample {

	@Test
	public void testmethod1() {
		System.out.println("this is test method 1");
		Assert.assertTrue(true);
		}
	@Test
	public void testmethod2() {
		System.out.println("this is test method 2");
		Assert.assertTrue(false);
		}
	@Test
	public void testmethod3() {
		System.out.println("this is test method 3");
		Assert.assertTrue(true);
		}
	@Test
	public void testmethod4() {
		System.out.println("this is test method 4");
		Assert.assertTrue(true);
		}
	@Test
	public void testmethod5() {
		System.out.println("this is test method 5");
     throw new SkipException("This test method is skipped");
		}
}

package production;

import org.testng.annotations.Test;

public class CampaignsTest {
	
	@Test
	public void launchBrowser()
	{
		String browser = System.getProperty("Browser");
		System.out.println(browser);

		String url = System.getProperty("URL");
		System.out.println(url);
	}
	@Test
	public void createCampaign()
	{
		System.out.println("Create Campaign");
	}
	@Test 
	public void addContact()
	{
		System.out.println("Contact added");
	}
	@Test 
	public void addContactAnd()
	{
		System.out.println("Contact added");
	}
	@Test 
	public void addContactAndDelete()
	{
		System.out.println("Contact added");
	}
}

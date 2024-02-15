package TestCase;

import java.io.IOException;
import org.testng.annotations.Test;

import PageObject.HomePage;
import TestBase.BaseClass;

public class TC01_HomePage extends BaseClass {

	HomePage hp;

	@Test(priority = 1, groups = { "sanity" })
	public void homepage() throws IOException {
		hp = new HomePage(driver);

		logger.info("*** Starting TC01_HomePage TestCase ***");
		
		
		sleep(2000);
		boolean actual = hp.newBikesDisplay();
		sa.assertEquals(actual, true, "New Bikes dropdown not displayed");
		logger.info("Validating the new bikes dropdown is displayed or not");
		
		hp.hoverOnNewBike();
		logger.info("Hovered on the NewBikes dropdown");
		
		screenshot("NewBikesDropDown");
		logger.info("Capture the screenshot, when hovered on the NewBikes");
		
		sleep(2000);
		boolean actual1=hp.upcomingBikesDisplay();
		sa.assertEquals(actual1, true, "Upcoming bikes is not displayed");
		logger.info("Validating the upcoming option is displayed or not");
		
		hp.UpcomingBikesClick();
		logger.info("clicked on the upcoming bikes");

		sa.assertAll();

		logger.info("*** Finishing TC01_HomePage TestCase ***");

	}

}

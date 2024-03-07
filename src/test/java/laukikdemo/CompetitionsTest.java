package laukikdemo;

import org.testng.annotations.Test;

import pageObjects.android.StartPage;
import utils.AndroidActions;

public class CompetitionsTest extends BaseTest{
	
	@Test
	public void openCompetition() {
		AndroidActions actions = new AndroidActions(driver);
		StartPage startPage = new StartPage(driver);
		startPage.login();
//		actions.scrollToText("Competitions");
		actions.scroll();
			
	}
}

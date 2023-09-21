package Search;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTests;

public class SearchTest extends BaseTests {
	@Test
    public void searchTestWithContainedWord(){
		String search = "Apple icam";
		 homePage.searchInput(search);
		 SearchPage SearchPage = homePage.clickSearchButton();
		 Assert.assertTrue(SearchPage.searchResultsContainWord(),"Incorrect search results");
    
	}
}

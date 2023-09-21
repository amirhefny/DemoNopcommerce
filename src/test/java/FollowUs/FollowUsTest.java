package FollowUs;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTests;

public class FollowUsTest extends BaseTests {
	
	@Test
	public  void followUs() {
		FollowUsPage  followUsPage = homePage.clickFaceBookButton();
		homePage.clickTwitterButton();
		homePage.clickYouTubeButton();
		String faceBookURI = "https://www.facebook.com/nopCommerce";
        String twitterURI = "https://twitter.com/nopCommerce";
        String youTubeURI = "https://www.youtube.com/user/nopCommerce";
        List<String> pagesTitles = followUsPage.getWindowsTitles();
        Assert.assertTrue(pagesTitles.stream().anyMatch(str -> str.contains(faceBookURI)),"Facebook page isn't opened");
        Assert.assertTrue(pagesTitles.stream().anyMatch(str -> str.contains(twitterURI)),"Twitter page isn't opened");
        Assert.assertTrue(pagesTitles.stream().anyMatch(str -> str.contains(youTubeURI)),"Youtube page isn't opened");
    
	}
}

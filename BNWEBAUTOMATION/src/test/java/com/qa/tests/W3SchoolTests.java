package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.W3SchoolsPage;
import org.testng.annotations.Test;

public class W3SchoolTests extends BaseTest {
 @Test
    public void searchW3Schools()
 {
     W3SchoolsPage w3SchoolsPage = new W3SchoolsPage(getDriver()).load();
     w3SchoolsPage.clickIframe();


 }
}

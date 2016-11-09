package com.practice.selenium;

/**
 * Created by thomas.le on 11/8/2016.
 */

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;


@Config(
        browser = Browser.CHROME,
        url = "http://www.seleniumhq.org/"
)

public class SeleniumConductorTest extends Locomotive{

    @Test
    public void downloadLinkExists() {
        validatePresent(HomePage.downloadSelenium);
    }

    @Test
    public void tabsExist() {
        validatePresent(HomePage.projectsTab)
                .validatePresent(HomePage.downloadTab)
                .validatePresent(HomePage.documentationTab)
                .validatePresent(HomePage.supportTab)
                .validatePresent(HomePage.aboutTab);
    }
}

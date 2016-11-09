package com.practice.selenium;

import org.openqa.selenium.By;

/**
 * Created by thomas.le on 11/8/2016.
 * Selenium practice; automation testing on SeleniumHQ home page.
 */
public class HomePage {

    // Available tabs
    public static final By projectsTab = By.xpath("//li[@id='menu_projects']/a[contains(@href, 'projects/')]");
    public static final By downloadTab = By.xpath("//li[@id='menu_download']/a[contains(@href, 'download/')]");
    public static final By documentationTab = By.xpath("//li[@id='menu_documentation']/a[contains(@href, 'docs/')]");
    public static final By supportTab = By.xpath("//li[@id='menu_support']/a[contains(@href, 'support/')]");
    public static final By aboutTab = By.xpath("//li[@id='menu_about']/a[contains(@href, 'about/')]");

    // Download link
    public static final By downloadSelenium = By.linkText("Download Selenium");
}

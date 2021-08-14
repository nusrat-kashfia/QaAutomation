package com.BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig {
    public static WebDriver firefoxDriver;
    public static WebDriver chromeDriver;
    public static WebDriver edgeDriver;

    public static void main(String[] args) {
        firefox_launch();
        firefox_close();


        chrome_launch();
        chrome_close();

        edge_launch();
        edge_close();
    }

    public static void firefox_launch()
    {
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
    }

    public static void firefox_close()
    {
        firefoxDriver.close();
    }

    public static void chrome_launch()
    {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }

    public static void chrome_close()
    {
        chromeDriver.close();
    }

    public static void edge_launch()
    {
        System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
        edgeDriver = new EdgeDriver();
    }

    public static void edge_close()
    {
        edgeDriver.close();
    }

}

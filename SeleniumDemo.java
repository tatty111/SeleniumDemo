package April7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser drivers\\chromedriver.exe");
        // 1. Open a browser
        WebDriver driver = new ChromeDriver(); // creates a new WebDriver session or opens a browser

        // 2. Navigate to Google.com
        driver.get("https://www.google.com/");

        // 3. Verify that the page title is Google

        String expectedTitle = "Google";
       String actualTitle = driver.getTitle();
      //  System.out.println(actualTitle);



        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test case PASSED. Actual title " + actualTitle + " matches " + expectedTitle);
        }else{
            System.out.println("Test case FAILED.Actual title " + actualTitle + " matches " + expectedTitle);
        }

        // 4. Verify that the page url is https://www.google.com/

        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

//        if (actualUrl.equals(expectedUrl)) System.out.println("Test case PASSED. Actual title " + actualTitle + " matches " + expectedTitle);
//    }else{
//        System.out.println("Test case FAILED.Actual title " + actualUrl + " matches " + expectedUrl;
//    }

//        String source = driver.getPageSource();
//        System.out.println(source);

        // 5. Verify that the word About is a part of this page

        String str = "About";
        String source = driver.getPageSource();

        if (str.contains(source)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed. The page does not contain the keyword " + str);
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

driver.quit();




    }

}

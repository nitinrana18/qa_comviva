package Selenium_ScoreCard;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Scorecard {
    public static void main(String[] args) {
        // Set up WebDriver for Firefox
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        try {
            // Open the cricket scorecard page
            String url = "https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/india-vs-pakistan-16th-match-group-2-1298150/full-scorecard";
            driver.get(url);

            // Locate the second innings scorecard table
            List<WebElement> scorecardTables = driver.findElements(By.className("ci-scorecard-table"));
            WebElement secondInningsTable = scorecardTables.get(1);

            // Display table headers
            displayTableHeaders(secondInningsTable);

            // Display table rows and columns
            displayTableData(secondInningsTable);

        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }

    private static void displayTableHeaders(WebElement table) {
        WebElement tableHeader = table.findElement(By.tagName("thead"));
        WebElement headerRow = tableHeader.findElement(By.tagName("tr"));
        List<WebElement> headerColumns = headerRow.findElements(By.tagName("th"));

        for (WebElement header : headerColumns) {
            System.out.print(header.getText() + "\t\t\t");
        }
        System.out.println();
    }

    private static void displayTableData(WebElement table) {
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t\t");
            }
            System.out.println();
        }
    }
}

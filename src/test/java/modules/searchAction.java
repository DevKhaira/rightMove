package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchAction {
    public static void Execute(WebDriver driver, String place, String propertyType){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        CharSequence placeChar = place;
        wait.until(ExpectedConditions.titleContains("number one property website for properties"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchLocation"))).sendKeys(placeChar);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy"))).click();
		Select select = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayPropertyType"))));

        select.selectByVisibleText(propertyType);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit"))).click();
		wait.until(ExpectedConditions.titleContains("Houses For Sale in " + place));
	}
}


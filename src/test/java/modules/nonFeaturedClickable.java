package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class nonFeaturedClickable {
    public static void Execute(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean exit = false;
        Actions actions = new Actions(driver);
        List<WebElement> searchSelection = driver.findElements(By.className("propertyCard"));
        for (WebElement selection: searchSelection) {
            actions.moveToElement(selection);
            wait.until(ExpectedConditions.visibilityOf(selection));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
            System.out.println(selection.getText());
            System.out.println("meeseeks");
            if(selection.getText().contains("FEATURED PROPERTY") == false){
                selection.click();
                break;
            }
		}
	}
}


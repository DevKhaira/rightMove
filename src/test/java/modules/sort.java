package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class sort {

	public static void Execute(WebDriver driver, String sortName) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Select select = new Select (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sortType"))));
		select.selectByVisibleText(sortName);

	}
}

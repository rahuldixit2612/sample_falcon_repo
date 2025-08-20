import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions {
    WebDriver driver;
    Actions actions;

    public void singleClick(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void doubleClick(String locator) {
        WebElement element = driver.findElement(By.id(locator));
        actions.doubleClick(element).perform();
    }

    public void rightClick(String locator) {
        WebElement element = driver.findElement(By.id(locator));
        actions.contextClick(element).perform();
    }
}

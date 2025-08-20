import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputActions {
    WebDriver driver;

    public void enterText(String locator, String text) {
        driver.findElement(By.id(locator)).sendKeys(text);
    }

    public void clearText(String locator) {
        driver.findElement(By.id(locator)).clear();
    }
}

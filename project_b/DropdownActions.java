import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownActions {
    WebDriver driver;

    public void selectByVisibleText(String locator, String text) {
        Select dropdown = new Select(driver.findElement(By.id(locator)));
        dropdown.selectByVisibleText(text);
    }

    public void selectByIndex(String locator, int index) {
        Select dropdown = new Select(driver.findElement(By.id(locator)));
        dropdown.selectByIndex(index);
    }
}

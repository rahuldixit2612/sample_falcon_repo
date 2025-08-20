import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTest {
    WebDriver driver;

    public void enterSearchText(String query) {
        driver.findElement(By.name("q")).sendKeys(query);
    }

    public void clickSearchButton() {
        driver.findElement(By.id("searchBtn")).click();
    }
}

import io.github.bonigarcia.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SeleniumExtension.class)
public class SeleniumEasyHomepageTest {

    @Test
    public void testTitle(ChromeDriver driver) {
        driver.get("http://www.seleniumeasy.com/test/");
        assertTrue(driver.getTitle().startsWith("Selenium Easy"));
    }

}

package windowsHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowdHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a/span")).click();


        Set<String> windowHandles= driver.getWindowHandles();
        Iterator<String> iterator=windowHandles.iterator();
        String parentWindow=iterator.next();
        String childWindows=iterator.next();
        driver.switchTo().window(childWindows);

        driver.findElement(By.name("UserFirstName")).sendKeys("Abdullah");
        driver.findElement(By.name("UserLastName")).sendKeys("Mamun");



    }
}

package exerciseJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicXpathGoogle {


    @Test
    public static void xpathDynamic(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://camelcamelcamel.com/product/B00347A8NK");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//td[text()='Current']/../td[@xp")).click();


    /*    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("flag");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//span[text()='Choice']")).click();
*/
     /*   List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::span[@style='display: block;']"));
       //"//ul[@role='listbox']//li/descendant::div[@class='sbl1']"
       System.out.println("total number of elements :"+list.size());
       for (int i=0;i<list.size();i++){
           System.out.println(list.get(i).getText());
           if(list.get(i).getText().contains("testing time")){
               list.get(i).click();
               break;
           }
       }*/
    }
}

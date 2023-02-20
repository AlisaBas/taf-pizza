import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;



public class terraPizzaTest {
    WebDriver driver;

   /* @BeforeAll
    public void warmUp(){

    }*/

    @Test
    public void testPizzaAdd(){
        driver=new SafariDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));
        driver.get(terraPizza.URL);
        WebElement buttonMenuElement= driver.findElement(By.xpath(terraPizza.BTN_MENU));
        Util.waitThreadFor(7);
        buttonMenuElement.click();
        Util.waitThreadFor(5);
        WebElement catalogPizzaElement= driver.findElement(By.xpath(terraPizza.CATALOG_PIZZA));
        Util.waitThreadFor(5);
        catalogPizzaElement.click();
        Util.waitThreadFor(5);
        WebElement buttonAddToBasketElement=driver.findElement(By.xpath(terraPizza.BTN_ADD_TO_BASKET));
        Util.waitThreadFor(5);
        buttonAddToBasketElement.click();
        Util.waitThreadFor(5);
        WebElement topBasketElement=driver.findElement(By.xpath(terraPizza.BTN_TOP_BASKET));
        Util.waitThreadFor(5);
        topBasketElement.click();
        Util.waitThreadFor(5);
        WebElement basketItemNameElement=driver.findElement(By.xpath(terraPizza.BASKET_ITEM_NAME));
        Util.waitThreadFor(3);
        Assertions.assertEquals("\n" +
                "                Пицца Маргарита                \n" +
                "                                            Классическая\n" +
                "                                                                32  см\n" +
                "                                    \n" +
                "            ",basketItemNameElement.getText());
    }

   /* @AfterAll
    public void tearDown(){
        driver.quit();
    }*/


}



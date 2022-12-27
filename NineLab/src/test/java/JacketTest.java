import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JacketTest {
    @FindBy(xpath = "/html/body/search-app//section/section/div/search-filter-dashboard//aside/section[2]/div/search-category-tree//section/ul/li[2]/button/span[1]")
    WebElement menFilter;
    private static String basicURL="https://www.pullandbear.com/by/%D0%B4%D0%BB%D1%8F-%D0%B6%D0%B5%D0%BD%D1%89%D0%B8%D0%BD-n6417";
    @Test
    public void WishListTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(basicURL);
        Thread.sleep(3000);
        WebElement clothes=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/ul/li[3]/a/p"));
        clothes.click();
        WebElement jacket=driver.findElement(By.xpath("//*[@id=\"subitems-cont-1030207046\"]/li[6]/a/p"));
        jacket.click();
        Thread.sleep(3000);
        WebElement country=driver.findElement(By.xpath("//*[@id=\"saveStore\"]"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(country)).click();
        WebElement filter=driver.findElement(By.xpath("/html/body/div[8]/div[3]/section/div[2]/div/button[1]/span[2]"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(filter)).click();
        WebElement size=driver.findElement(By.xpath("/html/body/div[9]/div/div[2]/div[3]/div[2]/div/button[2]"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(size)).click();
        WebElement singlejacket=driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[1]/a/div/div/figure/img"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(singlejacket)).click();
        WebElement wishlist=driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/div/div/div[3]/add-to-wishlist-button"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(wishlist)).click();
        Assert.assertTrue(wishlist.isEnabled());
    }
}

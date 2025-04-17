import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.manage().window().maximize();
       //String title=driver.getTitle();
    //System.out.println("");
//login ..............
        driver.findElement(By.id("ap_email")).sendKeys("physicists16@yahoo.com");
   driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("f12b12oo");
        driver.findElement(By.id("signInSubmit")).click();
        //search for sunglasses..........
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sunglasses");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //View product........
       WebElement image =driver.findElement(By.className("s-image"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",image);
        //Add to cart .........
        driver.findElement(By.id("a-autoid-5-announce")).click();
      //  view cart.........
        driver.findElement(By.id("nav-cart-count")).click();
        //check out ........
        driver.findElement(By.className("a-button-input")).click();
        if (driver.getCurrentUrl().contains("https://www.amazon.com/")){
            System.out.println(" Pass ");
        }else {
            System.out.println(" Fail ");
        }



            // Assert URL to check if we're still on Amazon

        }










        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
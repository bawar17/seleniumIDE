import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class playground  {
	WebDriver driver = new FirefoxDriver();
	public playground(){

		driver.get("http://timvroom.com/selenium/playground/");

	}

	public void Task1(){

		driver.findElement(By.id("answer1")).sendKeys(driver.getTitle());		
	}
	public void Task2(){

		driver.findElement(By.id("name")).sendKeys("Kilgore Trout");		
	}

	public void task3(){
		driver.findElement(By.id("occupation")).sendKeys("Science Fiction Author");
	}

	public  void task4(){
		List<WebElement> antal = driver.findElements(By.className("bluebox"));
		driver.findElement(By.id("answer4")).sendKeys(Integer.toString(antal.size()));

	}

	public void task5(){
		driver.findElement(By.linkText("click me")).click();

	}

	public void task6(){
		String txt = driver.findElement(By.id("redbox")).getAttribute("class");
		driver.findElement(By.id("answer6")).sendKeys(txt);

	}

	public void task7(){

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("ran_this_js_function()");
	}
	public void task8(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		Long uppgift8=(Long) executor.executeScript("return got_return_from_js_function()");
		driver.findElement(By.id("answer8")).sendKeys(Long.toString(uppgift8));
	}

	public void task9(){
		driver.findElement(By.name("wrotebook")).click();
	}
	public void task10(){

		String redBoxText = driver.findElement(By.id("redbox")).getText();
		driver.findElement(By.id("answer10")) .sendKeys(redBoxText);

	}
	public void task11(){

		Point orange = driver.findElement(By.id("orangebox")).getLocation();
		Point green = driver.findElement(By.id("greenbox")).getLocation();

		if (orange.y > green.y){
			//green
			driver.findElement(By.id("answer11")) .sendKeys("green");
		} else {
			driver.findElement(By.id("answer11")) .sendKeys("orange");
		}



	}
	public void task12(){

		Dimension d = new Dimension (850, 650);
		driver.manage().window().setSize(d);

	}
	public void task13(){

		List<WebElement> elementhere = driver.findElements(By.id("ishere"));
		if (elementhere.size()== 0){
			driver.findElement(By.id("answer13")) .sendKeys("no");
		} else {
			driver.findElement(By.id("answer13")) .sendKeys("yes");
		}

	}

	public void task14(){
		Boolean isElement = driver.findElement(By.id("purplebox")).isDisplayed();
		if (isElement ){
			//yes
			driver.findElement(By.id("answer14")) .sendKeys("yes");

		} else {
			driver.findElement(By.id("answer14")) .sendKeys("no");
		}

	}


	public void task15(){
		driver.findElement(By.xpath("//a[.='click then wait']")).click();
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='click after wait']")));
		wait.pollingEvery(10,  TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[.='click after wait']")).click();
		driver.switchTo().alert().accept();


	}

	public void task16(){
		driver.findElement(By.id("submitbutton")).click();

	}

}




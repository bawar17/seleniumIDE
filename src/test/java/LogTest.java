import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogTest {
	
	//Logger logger = Logger.getLogger(this.getClass());
	//WebDriver driver = new FirefoxDriver();
	playground start = new playground();
	
	
	@FindBy ( id = "answer1")
	WebElement answerFeild;
	
//	public LogTest(){
//		driver.get("http://timvroom.com/selenium/playground/");
//		PageFactory.initElements(driver, this);
//	}
	
	//@Test
//	public void testLog(){
//		
//		
//		logger.info("Starting...");
//		logger.debug("very detailed log");
//		logger.fatal("Terribly failing!");
//	}

	@Test
	public void Task(){
		start.Task1();
		start.Task2();
		start.task3();
		start.task4();
		start.task5();
		start.task6();
		start.task7();
		start.task8();
		start.task9();
		start.task10();
		start.task11();
		start.task12();
		start.task13();
		start.task14();
		start.task15();
		start.task16();
	}	
}

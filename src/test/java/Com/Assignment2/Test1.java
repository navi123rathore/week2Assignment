package Com.Assignment2;
import org.testng.annotations.Test;
import com.baseclass.TestBase;
import com.pageObjects.GooglePage;

public class Test1 extends TestBase{
	
	@Test
	public void GooglesearchTest() throws Throwable
	{
		
		GooglePage test=new GooglePage();
		test.enterSearchBox("Automation");
		test.clickSearchbtn();
	}
}

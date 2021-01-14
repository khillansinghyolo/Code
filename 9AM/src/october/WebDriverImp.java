package october;

public class WebDriverImp extends AbstractClass implements WebDriver {

	public WebDriverImp()
	{
		run();
		getTitle();
		getCurrentURL();
		driverName();
		
		hide();
		getDetails("khillan",300,"RPSK");
	}
	public void run() 
	{
		System.out.println("Run method of webdriver interface ");
	}
	public void getTitle() {
		System.out.println("GetTitle method of webdriver interface ");
	}
	public void getCurrentURL() {
	System.out.println("GetCurrentURL method of webdriver interface ");
	}
	public void driverName() {
		System.out.println("DriverName method of webdriver interface ");
	}
	public  void hide() {
		System.out.println("Hide method of abstractClass ");
	}

	public void  getDetails(String name , int rollNo, String clgName)
	{	
		System.out.println("GetDetials method of abstractClass ");
	}

	public static void main(String[] args) {
		WebDriverImp a=new WebDriverImp();

	}

}

package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Search extends BaseClass{

	public Search(WebDriver driver){
		super(driver);
        PageFactory.initElements(driver, this);

    }

	@FindBy(how=How.ID, using=  "searchLocation")
	public static WebElement searchLocation;

	@FindBy(how=How.ID, using= "buy")
	public static WebElement forSale;

	@FindBy(how=How.ID, using= "displayPropertyType")
	public static WebElement propertyTypeID;

    @FindBy(how=How.ID, using= "submit")
    public static WebElement submit;

	@FindBy(how=How.ID, using= "sortType")
	public static WebElement sortType;

	@FindAll(
        @FindBy(how=How.CLASS_NAME, using= "propertyCard")
	)
	public static FindBy[] selection;
    }
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

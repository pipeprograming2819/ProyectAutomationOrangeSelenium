package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.ButtonPages;

public class LoginPage {
	private WebDriver driver;
	private ButtonPages buttonPages;
	
	//elemento de busqueda en la pagina
    @FindBy(how = How.ID, using = "txtUsername")
    // nombre de la variable que guarda @FindBy
    	private WebElement inputUserName;
	

        @FindBy(how = How.ID, using = "txtPassword")
        private WebElement inputPassword;
        
    	//Este es el Constructor
        public LoginPage(WebDriver driver){
		
		//Esta linea es la que toma los elementos web
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}
	//Funcionalidad loguear 
	public void ingresarLogin(String userName, String pass) {
		inputUserName.sendKeys(userName);
		inputPassword.sendKeys(pass);
		buttonPages.btnLogin();
		
	}

}

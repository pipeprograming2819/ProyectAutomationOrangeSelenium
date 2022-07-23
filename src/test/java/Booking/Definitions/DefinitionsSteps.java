package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.LoginPage;
import Booking.Paginas.PimPage;
import Booking.Steps.Conexion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver); 
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	@And("^diligenciar usuario(.*) y password (.*)$")
	public void ingresarLogin(String userName, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.ingresarLogin(userName, pass);
	}
	@And("^llegar a la opcion agregar empleado$")
	public void llegarAddEmployee() {
		this.pimPage = new PimPage(driver);  
		this.pimPage.llegaAddEmployee();
	}
	@When("^diligencie nombre(.*) y apellido (.*)$")
	public void dilifenciaEmpleado(String firstName, String LastName) {
		this.pimPage =  new PimPage(driver);
		this.pimPage.diligenciaEmpleado(firstName, LastName); 
	}
}
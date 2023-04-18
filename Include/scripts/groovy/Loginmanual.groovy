import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.bs.A
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




public class Loginmanual {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebUI.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
	}
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		WebUI.setText(findTestObject('Object Repository/F2/Page_OrangeHRM/input_Username_username'), "Admin")
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), "admin123")
	}
	
	@And("clicks on login button some more")
	public void clicks_on_login_button_some_more() {
		WebUI.click(findTestObject('Object Repository/F2/Page_OrangeHRM/button_Login'))
		
	}
	
	@Then("user is navigated to home")
	public void user_is_navigated_to_home() {
		WebUI.closeBrowser()
		
	}
	
}

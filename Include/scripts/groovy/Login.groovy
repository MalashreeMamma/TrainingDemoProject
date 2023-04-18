import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Login {

	@Given("user is on login page Precondition")
	public void user_is_on_login_page_Precondition() {

		println "This is PC"
		WebUI.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
	}



	@When("user enters valid (.*) and (.*) Action")
	public void user_enters_valid_username_and_password_Action(String username, String password) {

		println "This is UN and PWD"
		WebUI.setText(findTestObject('Object Repository/F2/Page_OrangeHRM/input_Username_username'), username)
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), password)
	}


	@And("clicks on login button some more action")
	public void clicks_on_login_button_some_more_action() {

		println "This is Login Button"
		WebUI.click(findTestObject('Object Repository/F2/Page_OrangeHRM/button_Login'))
		WebUI.closeBrowser()
	}


	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {

		println "This is Home"
		WebUI.closeBrowser()
	}
}
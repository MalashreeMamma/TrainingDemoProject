import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Loginpractice1 {

	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebUI.openBrowser(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
	}

	@When("(.*) and (.*)")
	public void username_and_password(String Username, String Password) {
		WebUI.setText(findTestObject('Object Repository/F2/Page_OrangeHRM/input_Username_username'), Username)
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), Password)
	}

	@And("Click on login button")
	public void click_on_login_button() {
		WebUI.click(findTestObject('Object Repository/F2/Page_OrangeHRM/button_Login'))
	}

	@Then("Login page should be opened")
	public void login_page_should_be_opened() {
		WebUI.closeBrowser()
	}
}

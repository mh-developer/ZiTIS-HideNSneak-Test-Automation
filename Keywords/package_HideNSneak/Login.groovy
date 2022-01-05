package package_HideNSneak


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import internal.GlobalVariable
/*
 * Open browser
 * Navigate to URL -> get to Global variable
 * Provide username and password
 * Click on Login
 * */
/*
 * Will read value from Global Variable
 * */
public class Login {
	@Keyword
	def static void loginIntoApplication(String applicationURL,String username,String password){

		WebUI.openBrowser(applicationURL)
		WebUI.waitForPageLoad(GlobalVariable.waitPresentTimeOut)
		WebUI.maximizeWindow()

		WebUI.waitForElementVisible(findTestObject('Pages/Page_LoginHideNSneak/img_Log_logo'), GlobalVariable.waitPresentTimeOut)

		WebUI.sendKeys(findTestObject('Pages/Page_LoginHideNSneak/input_Email_ion-input-0'), username)
		WebUI.sendKeys(findTestObject('Pages/Page_LoginHideNSneak/input_Password_ion-input-1'), password)
		WebUI.click(findTestObject('Pages/Page_LoginHideNSneak/ion-button_LOG IN'))
		WebUI.delay(3)
	}

	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication(GlobalVariable.urlLogin, GlobalVariable.username, GlobalVariable.password)
	}

	//@Keyword
	//def static void logoutFromApplication(){
	//	WebUI.waitForElementPresent(findTestObject('Pages/MyAccount page/lnkMyAccount'), GlobalVariable.waitPresentTimeout)
	//	WebUI.click(findTestObject('Pages/MyAccount page/lnkMyAccount'))
	//	WebUI.waitForElementPresent(findTestObject('Pages/MyAccount page/lnkLogout'), GlobalVariable.waitPresentTimeout)
	//	WebUI.click(findTestObject('Pages/MyAccount page/lnkLogout'))
	//	WebUI.waitForElementVisible(findTestObject('Pages/MyAccount page/nav_HomeMyaccount'), GlobalVariable.waitPresentTimeout)
	//}
}

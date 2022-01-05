import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hidensneak.web.app/login')

WebUI.click(findTestObject('Pages/Page_LoginHideNSneak/img_Log_logo'))

WebUI.setText(findTestObject('Pages/Page_LoginHideNSneak/input_Email_ion-input-0'), 'demo')

WebUI.setEncryptedText(findTestObject('Pages/Page_LoginHideNSneak/input_Password_ion-input-1'), 'PblvLzUlPsM=')

WebUI.click(findTestObject('Pages/Page_LoginHideNSneak/ion-button_LOG IN'))

WebUI.delay(3)

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://hidensneak.web.app/home')

WebUI.closeBrowser()


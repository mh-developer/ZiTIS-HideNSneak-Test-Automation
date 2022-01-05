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

CustomKeywords.'hideNsneak.Login.loginIntoApplicationWithGlobalVariable'()

WebUI.navigateToUrl('https://hidensneak.web.app/rooms')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/p_Catch me if you can'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/ion-button_Cancel'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/ion-icon_Lobby_arrow-up-circle'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/ion-icon_Lobby_person-add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/input_Enter room code to join_ion-input-0'), 
    'og9b')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/ion-button_Join'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/p_Catch me if you can'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Page_Rooms.HideNSneak/Page_HideNSneak/ion-button_Quit now'), 
    0)

WebUI.closeBrowser()


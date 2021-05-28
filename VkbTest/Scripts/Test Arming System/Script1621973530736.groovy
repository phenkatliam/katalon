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

WebUI.navigateToUrl('https://www.virtualkeypad.com/')

WebUI.setText(findTestObject('Object Repository/VKB Test/Page_Log In  Virtual Keypad/input_Email_email'), 'phenkatliam@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/VKB Test/Page_Log In  Virtual Keypad/input_Password_password'), 
    'OgrgIAVBWcrD67L8CuO+8w==')

WebUI.sendKeys(findTestObject('Object Repository/VKB Test/Page_Log In  Virtual Keypad/input_Password_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/VKB Test/Page_System Overview  Virtual Keypad/button_SQA Test XR550'))

WebUI.click(findTestObject('Object Repository/VKB Test/Page_System Overview  Virtual Keypad/button_SQA Test XR550'))

WebUI.setText(findTestObject('Object Repository/VKB Test/Page_System Overview  Virtual Keypad/input_SQA Test XR550_user-code-field'), 
    '2222')

WebUI.click(findTestObject('Object Repository/VKB Test/Page_System Overview  Virtual Keypad/svg_SQA Test XR550_sc-AxjAm eNxHCC sc-pcwJP hlRElQ'))

WebUI.click(findTestObject('Object Repository/VKB Test/Page_System Overview  Virtual Keypad/button_Arm All'))

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://www.techlistic.com/p/selenium-practice-form.html')

WebUI.setText(findTestObject('Object Repository/deo_object3/Page_/input_First name_firstname'), 'asdsdsa')

WebUI.takeFullPageScreenshotAsCheckpoint('Testing')

WebUI.click(findTestObject('Object Repository/deo_object3/Page_/input_First name_firstname'))

WebUI.setText(findTestObject('Object Repository/deo_object3/Page_/input_Last name_lastname'), 'asdfsdgdgd')

WebUI.click(findTestObject('Object Repository/deo_object3/Page_/div_Gender MaleFemale'))

WebUI.doubleClick(findTestObject('Object Repository/deo_object3/Page_/input_Years of Experience_exp'))

WebUI.setText(findTestObject('Object Repository/deo_object3/Page_/input_Date_datepicker'), '122536')

WebUI.closeBrowser()


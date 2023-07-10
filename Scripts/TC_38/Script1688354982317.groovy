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

WebUI.navigateToUrl('https://www.makemytrip.com/')

WebUI.click(findTestObject('Object Repository/Object_2/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/span_Holiday Packages'))

WebUI.takeFullPageScreenshotAsCheckpoint('Testing')

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages, Indian Holidays, Hon_9f5851/button_Search'))

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages, Indian Holidays, Hon_9f5851/p_Select Date'))

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages, Indian Holidays, Hon_9f5851/p_6'))

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages, Indian Holidays, Hon_9f5851/p_Select Rooms'))

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages, Indian Holidays, Hon_9f5851/button_APPLY'))

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages, Indian Holidays, Hon_9f5851/button_Search'))

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages/button_SKIP'))

WebUI.setText(findTestObject('Object Repository/Object_2/Page_Holiday Packages/input_Name_firstName'), 'akashd')

WebUI.setText(findTestObject('Object Repository/Object_2/Page_Holiday Packages/input_Phone_phoneNumber'), '7879646446')

WebUI.setText(findTestObject('Object Repository/Object_2/Page_Holiday Packages/input_Email ID_email'), 'dadahdga@test.om')

WebUI.click(findTestObject('Object Repository/Object_2/Page_Holiday Packages/span_Customize your Plan_close closeIcon'))

WebUI.closeBrowser()


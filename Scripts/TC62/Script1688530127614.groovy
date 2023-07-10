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

WebUI.navigateToUrl('https://academy.katalon.com/dashboard/certifications/')

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Dashboard - Katalon Academy/a_Security'))

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Vulnerability Disclosure Program  Katalon/i_Start free trial_fa-solid fa-bars'))

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Vulnerability Disclosure Program  Katalon/div_Resources'))

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Vulnerability Disclosure Program  Katalon/a_Webinars'))

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Automation Testing Webinars  Katalon/div_Series'))

WebUI.takeAreaScreenshotAsCheckpoint('VisualTesting', null)

WebUI.closeBrowser()

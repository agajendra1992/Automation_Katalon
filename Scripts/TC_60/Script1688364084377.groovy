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

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Dashboard - Katalon Academy/a_Careers'))

WebUI.switchToWindowTitle('Katalon Careers | Drive your career to the next level')

WebUI.setText(findTestObject('Object Repository/Katalon_Objects/Page_Katalon Careers  Drive your career to _95bef3/input_starts here_input_job_search'), 
    'Automation')

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Katalon Careers  Drive your career to _95bef3/div_Enterprise Account Manager (SaaS, Autom_47b0db'))

WebUI.click(findTestObject('Object Repository/Katalon_Objects/Page_Enterprise Account Manager (SaaS, Auto_498d54/strong_Katalon is headquartered in Atlanta,_8990a1'))

WebUI.closeBrowser()


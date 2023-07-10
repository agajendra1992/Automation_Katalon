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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/div_Practice Form'))

WebUI.takeFullPageScreenshotAsCheckpoint('Testing')

WebUI.setText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/input_Name_firstName'), 'Gajendra')

WebUI.setText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/input_Name_lastName'), 'Saxena')

WebUI.setText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/input_Email_userEmail'), 'gajendra.akash@gmail.com')

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/input_(10 Digits)_userNumber'), '7879644646')

WebUI.verifyElementText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/input_(10 Digits)_userNumber'), '7879644646')

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/input_Subjects_subjectsInput'), 'Math')

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/label_Reading'))

WebUI.setText(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/textarea_Current Address_currentAddress'), 'New')

WebUI.verifyElementPresent(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/img'), 5)

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/img_Ad by_close_button_svg'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/div'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/img'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/span_Report this ad'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/button_Not appropriate'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/img'))

WebUI.click(findTestObject('Object Repository/Demo_Objects_1/Page_DEMOQA/div'))

WebUI.closeBrowser()


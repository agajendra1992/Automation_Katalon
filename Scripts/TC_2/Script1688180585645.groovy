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

WebUI.maximizeWindow()

WebUI.click(findTestObject(null))

WebUI.sendKeys(findTestObject(null), '')

WebUI.clearText(findTestObject(null))

WebUI.clickImage(findTestObject(null))

WebUI.verifyElementChecked(findTestObject(null), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Online Shopping Site for Mobiles, Elec_b3f752/span_Grocery'))

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Flipkart Grocery Store - Buy Groceries_f794ff/div_Select city'))

WebUI.setText(findTestObject('Object Repository/Flipkart_Object/Page_Flipkart Grocery Store - Buy Groceries_f794ff/input_Only available in selected cities_pincode'), 
    '560048')

WebUI.sendKeys(findTestObject('Object Repository/Flipkart_Object/Page_Flipkart Grocery Store - Buy Groceries_f794ff/input_Only available in selected cities_pincode'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Flipkart Grocery Store - Buy Groceries_f794ff/a_All'))

WebUI.setText(findTestObject('Object Repository/Flipkart_Object/Page_Dairy Products - Buy Dairy Products On_f9fedc/input_Discover More_q'), 
    'Shoes')

WebUI.sendKeys(findTestObject('Object Repository/Flipkart_Object/Page_Dairy Products - Buy Dairy Products On_f9fedc/input_Discover More_q'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Shoes- Buy Products Online at Best Pri_731dc4/span_Add Item'))

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Shoes- Buy Products Online at Best Pri_731dc4/a_Login'))

WebUI.setText(findTestObject('Object Repository/Flipkart_Object/Page_Shoes- Buy Products Online at Best Pri_731dc4/input_Get access to your Orders, Wishlist a_a7d639'), 
    '7829957229')

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Shoes- Buy Products Online at Best Pri_731dc4/button_Request OTP'))

WebUI.click(findTestObject('Object Repository/Flipkart_Object/Page_Shoes- Buy Products Online at Best Pri_731dc4/button_'))

WebUI.closeBrowser()


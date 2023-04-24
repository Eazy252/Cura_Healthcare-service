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

'Select from dropdown'
WebUI.selectOptionByLabel(findTestObject('make appointment page/Page_CURA Healthcare Service/select_from_drop_down'), 'Hongkong CURA Healthcare Center', 
    false)

'select a checkbox'
WebUI.click(findTestObject('make appointment page/Page_CURA Healthcare Service/CheckBox_Apply for hospital readmission'))

'Select Medicare'
WebUI.click(findTestObject('make appointment page/Page_CURA Healthcare Service/RadioButton_Medicare'))

'Select the calender icon\r\n'
WebUI.click(findTestObject('make appointment page/Page_CURA Healthcare Service/Calender Button'))

'Select day 12'
WebUI.click(findTestObject('make appointment page/Page_CURA Healthcare Service/Day_twelve'))

'Input comment'
WebUI.setText(findTestObject('make appointment page/Page_CURA Healthcare Service/Comment_field'), 'yet another automated test on on an healthcare service website')

'click on book Appintment'
WebUI.click(findTestObject('make appointment page/Page_CURA Healthcare Service/Book Appointment Button'))


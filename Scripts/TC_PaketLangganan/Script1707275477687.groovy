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

WebUI.navigateToUrl('https://www.dicoding.com/')

WebUI.click(findTestObject('Object Repository/PaketLangganan/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/PaketLangganan/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/input_Masuk_login_email'), 
    'hanamaria2307@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/PaketLangganan/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/input_Masuk_login_password'), 
    'hCc8x1UqSX8vfSLAHukwvg==')

WebUI.click(findTestObject('Object Repository/PaketLangganan/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/button_Masuk'))

WebUI.click(findTestObject('Object Repository/PaketLangganan/Page_Dicoding Indonesia/a_Lanjut berlangganan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/PaketLangganan/Page_Biaya Investasi Belajar Kurikulum Glob_5cbbe8/a_Pilih paket'))

WebUI.click(findTestObject('Object Repository/PaketLangganan/Page_Pembayaran Paket Langganan - Dicoding _c7409d/button_Bayar'))

WebUI.verifyElementText(findTestObject('Object Repository/PaketLangganan/Page_Checkout - f0c460accddd/h2_Order Summary'), 'Order Summary')

WebUI.delay(2)

WebUI.closeBrowser()


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class loginHealthcare {

	@Given ("Abro Chrome y voy a Healthcare")
	def Abro_Chrome_y_voy_a_Healthcare () {
		WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
	}

	@When ("Le doy click en Make Appointment")
	def Le_doy_click_en_Make_Appointment () {
		WebUI.click(findTestObject('btnMakeAppointment'))
	}

	@And("Pego el username")
	def Copio_el_username() {
		WebUI.setText(findTestObject('inputUsername'), 'John Doe')
	}

	@And("Pego el password")
	def Pego_el_password() {
		WebUI.setText(findTestObject('inputPassword'), 'ThisIsNotAPassword')
	}

	@And ("Doy click en el Login")
	def Doy_click_en_el_Login () {
		WebUI.click(findTestObject('btnLogin'))
	}

	@And ("Selecciono a Hongkong")
	def Selecciono_a_Hongkong () {
		WebUI.selectOptionByLabel(findTestObject('select'), 'Hongkong CURA Healthcare Center', false)
	}
	
	@And ("Doy click en el checkbox")
	def Doy_click_en_el_checkbox () {
		WebUI.click(findTestObject('checkbox'))
	}
	
	@And ("Doy click en Medicaid")
	def Doy_click_en_Medicaid () {
		WebUI.click(findTestObject('radio'))
	}
	
	@And("Pongo la fecha del covid")
	def Po_la_fecha_del_covid() {
		WebUI.setText(findTestObject('inputDate'), '11/11/2019')
	}

	@And("Escribo un comentario")
	def Escribo_un_comentario() {
		WebUI.setText(findTestObject('textArea'), 'Hola Quipux')
	}

	@And("Doy click en Book Appointment")
	def Doy_click_en_Book_Appointment() {
		WebUI.click(findTestObject('btnBookAppointment'))
	}

	@Then("Doy click en Go to Homepage")
	def Doy_click_en_Go_to_Homepage() {
		WebUI.click(findTestObject('btnGoToHomepage'))
	}

	@Then ("Cierro Chrome")
	def Cierro_Chrome () {
		WebUI.closeBrowser()
	}
}
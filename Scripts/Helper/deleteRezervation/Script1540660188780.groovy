import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

try {
    while (WebUI.verifyElementVisible(findTestObject('CalenderPage/rezervation'))) {
        WebUI.click(findTestObject('CalenderPage/rezervation'))

        WebUI.waitForElementClickable(findTestObject('CalenderPage/rezervationDetails'), GlobalVariable.waitElementDuration)

        WebUI.click(findTestObject('CalenderPage/rezervationDetails'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.waitForElementClickable(findTestObject('Rezervations/deleteButton'), GlobalVariable.waitElementDuration)

        WebUI.click(findTestObject('Rezervations/deleteButton'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.waitForElementClickable(findTestObject('Rezervations/deleteRezervationYesButton'), GlobalVariable.waitElementDuration)

        WebUI.click(findTestObject('Rezervations/deleteRezervationYesButton'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(3)

        WebUI.waitForElementClickable(findTestObject('Rezervations/saveButton'), GlobalVariable.waitElementDuration)

        WebUI.click(findTestObject('Rezervations/saveButton'), FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(2)

        WebUI.navigateToUrl(findTestData('Links').getValue(2, 2))

        WebUI.acceptAlert()

        WebUI.refresh()
    }
}
catch (Exception e) {
} 


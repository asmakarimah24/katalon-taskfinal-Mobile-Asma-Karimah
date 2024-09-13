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

Mobile.startApplication('C:\\Users\\asma.nasyith\\Downloads\\Todo_2.0_APKPure.apk', true)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/Delete Task/android.widget.EditText - Enter task title'), 'Belajar Matematika', 
    0)

Mobile.setText(findTestObject('Object Repository/Delete Task/android.widget.EditText - Enter your task'), 'Belajar materi Logaritma', 
    0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.view.View - 27'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.CheckedTextView - Personal'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('Object Repository/Delete Task/android.widget.EditText - Belajar Matematika'), 'Seminar Investasi', 
    0)

Mobile.setText(findTestObject('Object Repository/Delete Task/android.widget.EditText - Belajar materi Logaritma'), 'Materi Rekasadana', 
    0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.TextView - Delete'), 0)

Mobile.getText(findTestObject('Object Repository/Delete Task/android.widget.TextView - Delete Task'), 0)

Mobile.tap(findTestObject('Object Repository/Delete Task/android.widget.Button - DELETE'), 0)

Mobile.closeApplication()


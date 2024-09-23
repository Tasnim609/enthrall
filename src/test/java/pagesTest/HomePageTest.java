package pagesTest;


import org.testng.annotations.Test;
import static common.CommonActions.clickElement;
import static common.CommonActions.clickUsingJavascriptExecutor;
import static common.CommonActions.elementDisplayed;
import static common.CommonActions.elementEnabled;
import static common.CommonActions.elementSelected;
import static common.CommonActions.getAttributeValue;
import static common.CommonActions.inputTextUsingJavascriptExecutor;
import static common.CommonActions.pause;
import static common.CommonActions.scrollIntoViewTheElementUsingJavascriptExecutor;
import static common.CommonActions.verifyTextOfTheWebElement;
import static common.CommonWaits.waitUntilConditionThenClick;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseUtil.BaseClass;
import constants.Attribute;

public class HomePageTest extends BaseClass {
	
	// The test executed based on alphabetical order, if no priority given
	// (enabled = true) means The test case is not disable, it can run
	// (enabled = false) means The test case is disable, it is not running
	// priority = 1 means, this test case will run first, 2 means second .... ... so on
	
	@Test (enabled = true, priority = 1)
	public void clickLogoTest() {
		homePage.clickLogo();
	}
	
	@Test (enabled = true, priority = 2)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}
	
	@Test
	public void clickUserIdTest() {
		homePage.clickUserId();
	}
	
	@Test 
	public void clickPasswordTest() {
		homePage.clickPassword();
	}
	
	@Test
	public void clickNewUserRegistrationTest() {
		homePage.clickNewUserRegistration();
		// This method used try-catch block in home page, but here no change needed like line 20		
	}
	
	@Test
	public void clickUnlockTest() {
		homePage.clickUnlock();
	}
	
	// Test for implicitly wait and it shows No such element exception
	// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
	@Test
	public void implicitlyWaitTest() {
		homePage.clickIncorrectNewUserRegistration();
	}
	
	// Important interview question
	// This test case will fail 
	// To test this, you have to remove PageFactory class from HomePage Constructor code 
	// When PageFactory class is absent, you will find NullPointerException
	// Exception is: java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.WebElement.click()" 
	// because "element" is null	
	@Test
	public void nullPointerExceptionTest() {
		homePage.clickNewUserRegistration();
	}
	
	@Test
	public void inputTextInUserIdFieldTest () {
		homePage.inputTextInUserIdField();
	}
	
	@Test
	public void inputTextInUserIdAndPasswordFieldThenIAgreeAndClickToTheLoginButtonTest() {
		homePage.inputTextInUserIdAndPasswordFieldThenIAgreeAndClickToTheLoginButton();
	}
	
	@Test
	public void useOfByClassInLoginProcessTest() throws InterruptedException {
		homePage.useOfByClassInLoginProcess();
	}
		
	@Test
	public void use_of_linkText_as_locator_in_forgot_userId_hyperlink_test() {
		homePage.use_of_linkText_as_locator_in_forgot_userId_hyperlink();
	}
	
	@Test
	public void use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink_test() {
		homePage.use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink();
	}
	
	@Test
	public void why_we_use_cssSelector_as_locator_in_logo_test () {
		homePage.why_we_use_cssSelector_as_locator_in_logo ();
	}
	
	@Test
	public void role1_use_of_cssSelector_by_class_name_value_test() {
		homePage.role1_use_of_cssSelector_by_class_name_value();
	}
	
	@Test
	public void role2_use_of_cssSelector_by_id_value_test() {
		homePage.role2_use_of_cssSelector_by_id_value();
	}
	
	@Test
	public void role3_use_of_cssSelector_by_compund_class_name_value_test () {
		homePage.role3_use_of_cssSelector_by_compund_class_name_value ();
	}
	
	@Test
	public void role4_use_of_cssSelector_by_attribute_and_its_value_test () {
		homePage.role4_use_of_cssSelector_by_attribute_and_its_value ();
	}
	
	@Test
	public void role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value_test() {
		homePage.role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value();
	}
	
	@Test
	public void role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value_test() {
		homePage.role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value();
	}
	
	@Test
	public void use_of_tagName_as_locator_test() {
		homePage.use_of_tagName_as_locator();
	}
	
	@Test
	public void use_of_isDisplayed_test_01() {
		homePage.use_of_isDisplayed_01();
	}
	
	@Test
	public void use_of_isDisplayed_test_02() {
		homePage.use_of_isDisplayed_02();
	}
	
	@Test
	public void use_of_isDisplayed_in_login_test() {
		homePage.use_of_isDisplayed_in_login();
	}
	
	@Test
	public void use_of_isEnabled_in_login_test() {
		homePage.use_of_isEnabled_in_login();
	}
	
	@Test
	public void use_of_isSelected_in_login() {
		homePage.use_of_isSelected_in_login();
	}
	
	@Test
	public void getMethodsOfThePageTest() {
		homePage.getMethodsOfThePage();
	}
	
	@Test
	public void newUserRegistrationPageValidationTest() {
		homePage.newUserRegistrationPageValidation();
	}
	
	@Test (enabled = true, priority = 3)
	public void use_of_clear_in_login_test() {
		homePage.use_of_clear_in_login();
	}
	
	@Test()
	public void switch_between_window_test() {
		homePage.switch_between_window();
	}
	
	@Test()
	public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_test_01 () {
		homePage.use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_01();
	}
	
	@Test()
	public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_test_02 () {
		homePage.use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_02();
	}
	
	@Test()
	public void use_of_sendKeys_method_then_click_by_return_key_of_the_laptop_test () {
		homePage.use_of_sendKeys_method_then_click_by_return_key_of_the_laptop();
	}
	
	@Test()
	public void use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop_test () {
		homePage.use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop();
	}
	
	@Test()
	public void use_of_navigate_method_test () {
		homePage.use_of_navigate_method ();
	}
	
	@Test()
	public void use_of_mouse_hoverAction_on_ourLocations_test () {
		homePage.use_of_mouse_hoverAction_on_ourLocations ();
	}
	
	@Test()
	public void alternate_of_click_method_test() {
		homePage.alternate_of_click_method();
	}
	
	@Test()
	public void alternate_of_send_keys_method_test() {
		homePage.alternate_of_send_keys_method();
	}
	
	@Test()
	public void login_process_by_JavascriptExecutor_test() {
		homePage.login_process_by_JavascriptExecutor();
	}
	
	@Test
	public void login_process_by_JavascriptExecutor_common_method_test(){
		homePage.login_process_by_JavascriptExecutor_common_method();
	}
	
	// it will fail
	@Test()
	public void how_to_handle_hidden_element_by_regular_selenium_method_test() {
		homePage.how_to_handle_hidden_element_by_regular_selenium_method();
	}
	
	@Test()
	public void how_to_handle_hidden_element_by_javascriptExecutor_test() {
		homePage.how_to_handle_hidden_element_by_javascriptExecutor();
	}
	
	@Test()
	public void use_of_explicitly_wait_01_test() {
		homePage.use_of_explicitly_wait_01();
	}
	
	@Test()
	public void use_of_explicitly_wait_02_test() {
		homePage.use_of_explicitly_wait_02();
	}
	
	@Test()
	public void use_of_explicitly_wait_03_test(){
		homePage.use_of_explicitly_wait_03();
	}
	
	@Test()
	public void use_of_explicitly_wait_04_test(){
		homePage.use_of_explicitly_wait_04();
	}
	
	@Test()
	public void use_of_explicitly_wait_05_test(){
		homePage.use_of_explicitly_wait_05();
	}
	
	@Test
	public void use_of_explicitly_wait_from_common_waits_test(){
		homePage.use_of_explicitly_wait_from_common_waits();
	}
	
	@Test
	public void use_of_getAttribute_method_Test () {
		homePage.use_of_getAttribute_method();
	}
	
	@Test
	public void use_of_getAttribute_by_common_method_test () {
		homePage.use_of_getAttribute_by_common_method();
	}
	
	@Test
	public void use_of_scroll_down_and_up_by_actions_class_Test () {
		homePage.use_of_scroll_down_and_up_by_actions_class();
	}
	
	@Test
	public void use_of_scroll_down_and_scroll_up_by_robot_class () throws InterruptedException, AWTException {
		homePage.use_of_scroll_down_and_scroll_up_by_robot_class ();
	}
	
	@Test
	public void use_of_scroll_down_and_up_by_javascriptExecutor_test () {
		homePage.use_of_scroll_down_and_up_In_A_Certain_Pixel_by_javascriptExecutor ();
	}
	
	@Test
	public void scroll_into_view_the_element_test() {
		homePage.scroll_into_view_the_element();
	}
	
	@Test
	public void scroll_into_view_the_element_by_commonActions_test() {
		homePage.scroll_into_view_the_element_by_commonActions();
	}
	
	@Test
	public void web_based_alert_accept_test () {
		homePage.web_based_alert_accept();		
	}
	
	@Test
	public void web_based_alert_dismiss_test () {
		homePage.web_based_alert_dismiss();		
	}
	
	@Test
	public void  authentication_pop_up_test () throws InterruptedException {
		homePage. authentication_pop_up ();
	}
	
	@Test()
	public void use_of_right_click_action_test () {
		homePage.use_of_right_click_action ();
	}

	@Test()
	public void use_of_double_click_action_test () throws InterruptedException {
		homePage.use_of_double_click_action ();
	}
	
	
	
	/*
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	

	
		
	@Test(enabled = false)
	public void use_of_drag_and_drop_action_test () throws InterruptedException {
		homePage.use_of_drag_and_drop_action ();
	}
	
	@Test(enabled = false)
	public void use_of_slider_action_test () {
		homePage.use_of_slider_action ();
	}
	
	@Test(enabled = false)
	public void use_of_slider_action_alternate_test () {
		homePage.use_of_slider_action_alternate ();
	}
	
	@Test(enabled = false)
	public void read_table_test () {
		homePage.read_table ();
	}
	
	@Test(enabled = false)
	public void read_any_row_of_the_table_test ()  {
		homePage.read_any_row_of_the_table ();
	}
	
	@Test(enabled = false)
	public void read_any_cell_of_a_row_of_the_table () {
		homePage.read_any_cell_of_a_row_of_the_table ();
	}
	
	
	
	
	
	
	
	 */
	

	

}

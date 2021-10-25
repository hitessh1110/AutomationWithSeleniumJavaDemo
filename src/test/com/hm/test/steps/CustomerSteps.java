package com.hm.test.steps;

import com.hm.framework.base.Base;
import com.hm.framework.utilities.CucumberUtil;
import com.hm.test.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CustomerSteps extends Base {

    @And("I Ensure application is opened successfully")
    public void i_ensure_application_is_opened_successfully() throws Throwable {

        CurrentPage = GetInstance(HomePage.class);
        Assert.assertTrue("The HomePage is not Loaded", CurrentPage.As(HomePage.class).IsHomeButtonPresent());

    }

    @When("I click on Bank Manager Login Button")
    public void i_click_on_bank_manager_login_button() throws Throwable {
        CurrentPage.As(HomePage.class).clickBankManagerLoginButton();
        Thread.sleep(2000);
    }


    @Then("I click on Add Customer Button")
    public void i_click_on_add_customer_button() throws Throwable  {
        CurrentPage.As(HomePage.class).clickAddCustomerButton();
        Thread.sleep(2000);
    }


    @When("I enter First_Name Last_Name And Post Code")
    public void i_enter_first_name_last_name_and_post_code(DataTable table) throws Throwable {

        CucumberUtil.createDataTableToDict(table);
        CurrentPage.As(HomePage.class).enterFistNameAndLastName(CucumberUtil.getCellValue("First_Name"),CucumberUtil.getCellValue("Last_Name"),CucumberUtil.getCellValue("Post_Code"));

        Thread.sleep(2000);
    }

    @And("I click on Add Customer Button Below")
    public void i_click_on_add_customer_button_below() throws Throwable {
        CurrentPage.As(HomePage.class).clickAddCustButtonBelow();
        Thread.sleep(3000);

    }
}

package com.hm.test.pages;

import com.hm.framework.base.BasePage;
import com.paulhammant.ngwebdriver.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {


    public HomePage() {

    }

//    @FindBy(how = How.XPATH , using = "//strong[text()='XYZ Bank']")
//    public WebElement txtXYZBank;
//
////    @FindBy(how = How.XPATH , using = "//button[text()='Bank Manager Login']")
////    public WebElement linkBankManagerLogin;

    @ByAngularButtonText.FindBy(buttonText = "Bank Manager Login")
    private WebElement bankManagerLoginButton;

    @ByAngularPartialButtonText.FindBy(partialButtonText = "Customer")
    private WebElement addCustomerButton;

    @ByAngularButtonText.FindBy(buttonText = "Home")
    private WebElement homeButton;

    @ByAngularModel.FindBy(model = "fName")
    private WebElement txtFirstName;

    @ByAngularModel.FindBy(model = "lName")
    private WebElement txtLastName;

    @ByAngularModel.FindBy(model = "postCd")
    private WebElement txtPostCode;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Customer']")
    private WebElement addCustomerButtonBelow;

    @ByAngularButtonText.FindBy(buttonText = "Customers")
    private WebElement customersButton;

    @ByAngularModel.FindBy(model = "searchCustomer")
    private WebElement txtSearchCust;

    @ByAngularButtonText.FindBy(buttonText = "Delete")
    private WebElement deleteButton;

    @FindBy(how = How.XPATH , using = "//tr[@ng-repeat='cust in Customers | orderBy:sortType:sortReverse | filter:searchCustomer']//td[1]")
    public WebElement customerName;


//    @ByAngularBinding.FindBy(binding = "")

    // @ByAngularBinding.FindBy()

    // @ByAngularModel.FindBy( , )

    //  @ByAngularBinding.FindBy()


    public HomePage clickBankManagerLoginButton() {

        bankManagerLoginButton.click();
        return GetInstance(HomePage.class);
    }


    public HomePage clickAddCustomerButton() {

        addCustomerButton.click();
        return GetInstance(HomePage.class);
    }

    public boolean IsHomeButtonPresent() {

        return homeButton.isDisplayed();

    }

    public HomePage enterFistNameAndLastName(String fName, String LName, String postCode) {

        txtFirstName.sendKeys(fName);
        txtLastName.sendKeys(LName);
        txtPostCode.sendKeys(postCode);

        return GetInstance(HomePage.class);
    }

    public HomePage clickAddCustButtonBelow() {

        addCustomerButtonBelow.click();
        return GetInstance(HomePage.class);
    }

    public HomePage clickDeleteButton() {

        deleteButton.click();
        return GetInstance(HomePage.class);
    }


    public HomePage searchCustomer(String name) {

        txtSearchCust.sendKeys(name);
        return GetInstance(HomePage.class);
    }

   public boolean IsCustomersButton(){
        return customersButton.isDisplayed();
   }

    public HomePage clickCustomersButton() {

        customersButton.click();
        return GetInstance(HomePage.class);
    }
    public boolean IsSearchCustomer(){

        return customersButton.isEnabled();
    }

    public boolean IsCustomerPresent(String custName){
        boolean flag = true;
        String name =  customerName.getText();
        System.out.println("the data txt is " +name);
        if (customerName.isDisplayed())
            return true;
            if (name.equals(custName))
            return true;


      return false;
    }




//    String txt = driver.findElement(ByAngular.repeater("company in companies").row(4).column("name")).getText();
//  System.out.println(txt + " Added.");
//
//  if(txt.equalsIgnoreCase("Test Company")){
//        System.out.println("New Company Added. Now remove it");
//        driver.findElement(ByAngular.repeater("company in companies").row(4)).findElement(ByAngular.buttonText("Remove")).click();
    }



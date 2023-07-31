package org.example;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.example.mobile.gui.pages.CalculatorInterfaceBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTests implements IAbstractTest, IMobileUtils {

    @Test()
    public void testSuccessfulLaunch() {
        CalculatorInterfaceBase calculatorInterface = initPage(getDriver(), CalculatorInterfaceBase.class);
        Assert.assertTrue(calculatorInterface.isPageOpened(), "App has not launched successfully.");
    }

    @Test
    public void testAddition() {
        CalculatorInterfaceBase calculatorInterface = initPage(getDriver(), CalculatorInterfaceBase.class);
        Assert.assertTrue(calculatorInterface.isPageOpened(), "App has not launched successfully.");

        // Perform addition 2 + 4
        calculatorInterface.getTwoBtn().click();
        calculatorInterface.getAddBtn().click();
        calculatorInterface.getFourBtn().click();
        calculatorInterface.getEqBtn().click();

        // Get the result element and verify the result
        ExtendedWebElement resultElement = calculatorInterface.getResultElement();
        Assert.assertEquals(resultElement.getText(), "6", "Addition result is incorrect");
    }

    @Test
    public void testSubtraction() {
        CalculatorInterfaceBase calculatorInterface = initPage(getDriver(), CalculatorInterfaceBase.class);
        Assert.assertTrue(calculatorInterface.isPageOpened(), "App has not launched successfully.");

        // Perform subtraction 5 - 3
        calculatorInterface.getFiveBtn().click();
        calculatorInterface.getSubBtn().click();
        calculatorInterface.getThreeBtn().click();
        calculatorInterface.getEqBtn().click();

        // Get the result element and verify the result
        ExtendedWebElement resultElement = calculatorInterface.getResultElement();
        Assert.assertEquals(resultElement.getText(), "2", "Subtraction result is incorrect");
    }

    @Test
    public void testDivision() {
        CalculatorInterfaceBase calculatorInterface = initPage(getDriver(), CalculatorInterfaceBase.class);
        Assert.assertTrue(calculatorInterface.isPageOpened(), "App has not launched successfully.");

        // Perform division 16 / 8
        calculatorInterface.getOneBtn().click();
        calculatorInterface.getSixBtn().click();
        calculatorInterface.getDivBtn().click();
        calculatorInterface.getEightBtn().click();
        calculatorInterface.getEqBtn().click();

        // Get the result element and verify the result
        ExtendedWebElement resultElement = calculatorInterface.getResultElement();
        Assert.assertEquals(resultElement.getText(), "2", "Division result is incorrect");
    }

    @Test
    public void testMultiplication() {
        CalculatorInterfaceBase calculatorInterface = initPage(getDriver(), CalculatorInterfaceBase.class);
        Assert.assertTrue(calculatorInterface.isPageOpened(), "App has not launched successfully.");

        // Perform multiplication 7 * 9
        calculatorInterface.getSevenBtn().click();
        calculatorInterface.getMulBtn().click();
        calculatorInterface.getNineBtn().click();
        calculatorInterface.getEqBtn().click();

        // Get the result element and verify the result
        ExtendedWebElement resultElement = calculatorInterface.getResultElement();
        Assert.assertEquals(resultElement.getText(), "63", "Multiplication result is incorrect");
    }

    @Test
    public void testParentheses() {
        CalculatorInterfaceBase calculatorInterface = initPage(getDriver(), CalculatorInterfaceBase.class);
        Assert.assertTrue(calculatorInterface.isPageOpened(), "App has not launched successfully.");

        // Perform calculation using parenthesis (4-3)*5
        calculatorInterface.getParensBtn().click();
        calculatorInterface.getFourBtn().click();
        calculatorInterface.getSubBtn().click();
        calculatorInterface.getThreeBtn().click();
        calculatorInterface.getParensBtn().click();
        calculatorInterface.getMulBtn().click();
        calculatorInterface.getFiveBtn().click();
        calculatorInterface.getEqBtn().click();

        // Get the result element and verify the result
        ExtendedWebElement resultElement = calculatorInterface.getResultElement();
        Assert.assertEquals(resultElement.getText(),"5", "Parenthesis operation result is incorrect");
    }
}

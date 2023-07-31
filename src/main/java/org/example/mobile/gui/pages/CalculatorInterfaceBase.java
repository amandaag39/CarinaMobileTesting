package org.example.mobile.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CalculatorInterfaceBase extends AbstractPage {

    public CalculatorInterfaceBase(WebDriver driver) {
        super (driver);
    }

    public abstract ExtendedWebElement getTwoBtn();

    public abstract ExtendedWebElement getAddBtn();

    public abstract ExtendedWebElement getFourBtn();

    public abstract ExtendedWebElement getEqBtn();

    public abstract ExtendedWebElement getResultElement();

    public abstract ExtendedWebElement getFiveBtn();

    public abstract ExtendedWebElement getThreeBtn();

    public abstract ExtendedWebElement getSubBtn();

    public abstract ExtendedWebElement getOneBtn();

    public abstract ExtendedWebElement getSixBtn();

    public abstract ExtendedWebElement getDivBtn();

    public abstract ExtendedWebElement getEightBtn();

    public abstract  ExtendedWebElement getSevenBtn();

    public abstract ExtendedWebElement getMulBtn();

    public abstract ExtendedWebElement getNineBtn();

    public abstract ExtendedWebElement getParensBtn();
}

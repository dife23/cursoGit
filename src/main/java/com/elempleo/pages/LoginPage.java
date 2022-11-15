package com.elempleo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {


    //@FindBy(xpath = "//*[@id=\"text-42810729\"]")
    @FindBy (id = "text-42810729")
    WebElement txtUsuario;

    @FindBy (xpath = "//*[@id=\"demo-form\"]/div[3]/button")
    WebElement btnIniciarSesion;

    public void ingresarElUsuario() {
        txtUsuario.sendKeys("diego@mail.com");
        //btnIniciarSesion.click();

    }
}

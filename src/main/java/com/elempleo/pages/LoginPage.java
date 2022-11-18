package com.elempleo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {


    @FindBy (id = "text-37186966")
    WebElement txtUsuario;

    @FindBy (id = "password-24361776")
    WebElement txtClave;

    @FindBy (xpath = "//*[@id=\"demo-form\"]/div[3]/button")
    WebElement btnIniciarSesion;

    public void ingresarElUsuario(String usuario) {
        txtUsuario.sendKeys(usuario);
        //btnIniciarSesion.click();
    }

    public void ingresarLaClave(String clave) {
        txtClave.sendKeys(clave);
    }

    public void clickEnIniciarSesion(){
        btnIniciarSesion.click();
    }


}

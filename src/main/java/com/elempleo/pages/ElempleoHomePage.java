package com.elempleo.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ElempleoHomePage extends PageObject {


    @FindBy (xpath = "/html/body/header/div/div/div[3]/div/div[1]/div/div[2]/a/strong")
    WebElement btnIniciarSesion;

    public void iniciarLaSesion() {
        btnIniciarSesion.click();
    }

}



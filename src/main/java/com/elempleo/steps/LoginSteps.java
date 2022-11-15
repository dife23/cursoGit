package com.elempleo.steps;

import com.elempleo.pages.ElempleoHomePage;
import com.elempleo.pages.LoginPage;
import net.thucydides.core.annotations.Step;


public class LoginSteps {

    ElempleoHomePage elempleoHomePage;
    LoginPage loginPage;


    @Step
    public void iniciarSesion()    {
        elempleoHomePage.iniciarLaSesion();
    }


    @Step
    public void ingresarUsuario()    {
        loginPage.ingresarElUsuario();
    }

    @Step
    public void ingresarClave()    {
        loginPage.ingresarElUsuario();
    }




}

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
    public void ingresarUsuario(String usuario)    {
        loginPage.ingresarElUsuario(usuario);
    }

    @Step
    public void ingresarClave(String clave) { loginPage.ingresarLaClave(clave); }

    @Step
    public void autenticarse() {loginPage.clickEnIniciarSesion();}

}

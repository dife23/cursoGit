package com.elempleo.stepsdefinition;

import com.elempleo.pages.ElempleoHomePage;
import com.elempleo.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class loginStepDefinition {

    @Steps
    ElempleoHomePage elempleoHomePage;

    @Steps
    LoginSteps loginSteps;

    @Given("que ingreso a la pagina elempleo.com")
    public void queIngresoALaPaginaElempleo() {
        elempleoHomePage.open();
        loginSteps.iniciarSesion();
    }
    @When("ingreso los datos de usuario {string} y contrasena {string}")
    public void ingresoLosDatosDeUsuarioYContrasena(String usuario, String clave) {
        loginSteps.ingresarUsuario(usuario);
        loginSteps.ingresarClave(clave);
        loginSteps.autenticarse();

    }
    @Then("valido el ingreso exitoso")
    public void validoElIngresoExitoso() {
       // assertTrue ("Ingreso no exitoso",loginSteps.ingresoExitosoElempleo);
    }
}

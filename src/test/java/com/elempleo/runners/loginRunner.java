package com.elempleo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/login.feature",
        glue = "com.elempleo.stepsdefinition",
        snippets = CAMELCASE
        )

public class loginRunner {
}

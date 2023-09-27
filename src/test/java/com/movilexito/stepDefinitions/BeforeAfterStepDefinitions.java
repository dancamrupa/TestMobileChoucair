package com.movilexito.stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class BeforeAfterStepDefinitions {
    /*
     * Clase para manejar los metodos
     * Before y After de Cucumber aislados
     * de los stepDefinitions, metodos necesarios
     * para el correcto funcionamiento de
     * Serenity Screenplay
     */

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    //cierra todos los drivers en segundo plano al finalizar la ejecucion de escenarios
    @After
    public void endingAutomationConfig() {
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }
}

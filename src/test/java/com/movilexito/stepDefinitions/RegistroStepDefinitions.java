package com.movilexito.stepDefinitions;


import com.movilexito.drivers.AppiumAndroidDriver;
import com.movilexito.tasks.AgregarCarrito;
import com.movilexito.tasks.Registo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistroStepDefinitions {
    @Dado("que quiero crear una cuenta en movil exito")
    public void queQuieroCrearUnaCuentaEnMovilExito() {
        OnStage.theActorCalled("actor").can(BrowseTheWeb.with(AppiumAndroidDriver.suNavegador().onDriver()));
    }
    @Cuando("lleno los campos")
    public void llenoLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarCarrito.onMovilExito()
                //Registo.onMovilExito()
        );
    }
    @Cuando("acepto los terminos y condiciones")
    public void aceptoLosTerminosYCondiciones() {

    }
    @Entonces("verifico que la cuneta haya sido creada")
    public void verificoQueLaCunetaHayaSidoCreada() {

    }
}

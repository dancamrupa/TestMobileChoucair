package com.movilexito.tasks;

import com.movilexito.interactions.ExplicitWait;
import com.movilexito.interactions.ScrollingBajar;
import com.movilexito.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.movilexito.userInterfaces.HomeUI.BTN_CONTINUAR;
import static com.movilexito.userInterfaces.HomeUI.BTN_PLAN;
import static com.movilexito.userInterfaces.PlanUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarCarrito implements Task {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ExplicitWait.here(2),
                ScrollingBajar.on(),
                Click.on(BTN_PLAN),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(TXT_CAMPOSPLAN, isClickable()).
                        forNoMoreThan(10).seconds());
        try {
            leerExcel = Excel.readExcel("Info.xlsx", "Planform");
        } catch (IOException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.keyValues(leerExcel.get(0).get("Datos")).
                        into(TXT_CAMPOSPLAN + "[" + 1 + "]"),
                Enter.keyValues(leerExcel.get(1).get("Datos")).
                        into(TXT_CAMPOSPLAN + "[" + 2 + "]"),
                Enter.keyValues(leerExcel.get(2).get("Datos")).
                        into(TXT_CORREO),
                Click.on(DDL_TIPODOC),
                Click.on(Select_TIPODOC),
                Click.on(RADIO_BTN_TYC),
                ScrollingBajar.on(),
                Click.on(RADIO_BTN_PAGO)
        );
            }
    public static AgregarCarrito onMovilExito(){
        return Instrumented.instanceOf(AgregarCarrito.class).withProperties();
    }
}

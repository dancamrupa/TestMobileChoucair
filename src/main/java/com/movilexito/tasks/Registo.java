package com.movilexito.tasks;

import com.movilexito.interactions.ExplicitWait;
import com.movilexito.utils.Excel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.movilexito.userInterfaces.HomeUI.BTN_PERSONA;
import static com.movilexito.userInterfaces.RegisterUI.*;


public class Registo implements Task {
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            leerExcel = Excel.readExcel("Info.xlsx","Registro");
        }catch (IOException e){
            e.printStackTrace();
        }
        actor.attemptsTo(
                ExplicitWait.here(5),
                Click.on(BTN_PERSONA),
                Click.on(BTN_REGISTRO_FORM)
                );

        for (int i = 0; i < 5; i++){
            actor.attemptsTo(
                    Enter.keyValues(leerExcel.get(i).get("Datos")).into("(//android.widget.EditText)["+i+"]")
            );
        }

    }

    public static Registo onMovilExito(){
        return Instrumented.instanceOf(Registo.class).withProperties();
    }

}

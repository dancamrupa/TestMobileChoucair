package com.movilexito.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target BTN_PERSONA = Target.the("Boston que abre la seccion de login y registro").locatedBy("//android.view.View[@content-desc=\"Login\"]/android.widget.TextView");
    public static final Target BTN_PLAN = Target.the("Boton que abre la seccion de login y registro").locatedBy("//android.view.View[@content-desc='Recargar']");
    public static final Target BTN_CONTINUAR = Target.the("Boton que abre la seccion de login y registro").locatedBy("//android.app.Dialog/android.widget.Button[2]");




}

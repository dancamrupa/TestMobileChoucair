package com.movilexito.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUI {
    public static final Target BTN_REGISTRO_FORM = Target.the("boton para ir al formulario de registro").
            locatedBy("//android.view.View[@content-desc=\"Regístrate aquí\"]");
    public static final Target SCROLLING = Target.the("selector unicamente para scrollear").
            locatedBy("(//android.widget.EditText)[1]");



}

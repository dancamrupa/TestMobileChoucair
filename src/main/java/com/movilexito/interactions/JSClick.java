package com.movilexito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSClick implements Interaction {

    Target elemento;

    public JSClick(Target elemento) {
        this.elemento = elemento;
    }

    WebDriver driver;
    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elemento);
    }

    public static JSClick on(Target elemento) {
        return Instrumented.instanceOf(JSClick.class).withProperties(elemento);
    }
}

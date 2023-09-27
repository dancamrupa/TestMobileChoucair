package com.movilexito.interactions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;


import java.time.Duration;

import static com.movilexito.drivers.AppiumAndroidDriver.driver;

public class ScrollingSubir implements Interaction {
    /*Target target;

    public ScrollingBajar(Target target) {
        this.target = target;
    }*/

    @Override
    public <T extends Actor> void performAs(T actor) {
        int screenHeight = driver.manage().window().getSize().getHeight();
        int startX = driver.manage().window().getSize().getWidth() / 2;
        int endY = (int) (screenHeight * 0.8); // You can adjust this value to control the swipe length

        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withPosition(PointOption.point(startX, screenHeight / 2))
                        .withDuration(Duration.ofMillis(1000))) // You can adjust the duration
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }
    public static Performable on(){
        return Instrumented.instanceOf(ScrollingSubir.class).withProperties();
    }
}

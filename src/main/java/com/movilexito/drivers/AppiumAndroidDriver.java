package com.movilexito.drivers;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver suNavegador(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","sdk_gphone64_x86_64");
            capabilities.setCapability("udid","emulator-5554");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage","com.movilexito.www.twa");
            capabilities.setCapability("appActivity","com.grupoexito.movilexito.MainActivity");
            capabilities.setCapability("noReset","true");
            capabilities.setCapability("platformVersion","12");

            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }

    public AppiumDriver<MobileElement> onDriver(){
        return driver;
    }

}

package GMB_Data_Match_AND_Validation_System.Driver;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonClassChromeNew {

    private static ThreadLocal<SingletonClassChromeNew> instanceOfSingletonBrowserClass = ThreadLocal.withInitial(SingletonClassChromeNew::new);
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private SingletonClassChromeNew() {
        // No need to initialize here, we will do it in getDriver()
    }

    public static SingletonClassChromeNew getInstanceOfSingletonBrowserClass() {
        return instanceOfSingletonBrowserClass.get();
    }

    public WebDriver getDriver() {
        if (driver.get() == null) {
            System.setProperty("webdriver.chrome.driver",
                "/home/Deepu/eclipse-workspace/google maps business Data Match & Validation System/src/main/java/GMB_Data_Match_AND_Validation_System/Driver/chromedriver-linux/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("enable-automation");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--disable-gpu");
            options.addArguments("enable-features=NetworkServiceInProcess");
            options.addArguments("disable-features=NetworkService");
            options.addArguments("--force-device-scale-factor=1");

            WebDriver webDriver = new ChromeDriver(options);
            driver.set(webDriver);

            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            executorService.scheduleAtFixedRate(() -> {
                System.out.println("Refreshing the page...");
                webDriver.navigate().refresh();
            }, 0, 30, TimeUnit.MINUTES);
        }
        return driver.get();
    }

    public void removeDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}

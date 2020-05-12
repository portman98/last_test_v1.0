package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Before
    public void before() {

    }

    @After
    public void After() {
        System.out.println("Тест завершен");
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        open("https://dev.n7lanit.ru/");
        Thread.sleep(10000);
    }
}

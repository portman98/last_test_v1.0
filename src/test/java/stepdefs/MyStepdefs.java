package stepdefs;

import com.codeborne.selenide.Condition;
import cucumber.api.java.ru.И;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class MyStepdefs {

    @И("^Начинаем тест$")
    public void начинаемТест() {

    }

    @И("^открываем сайт$")
    public void открываемСайт() {
        open("https://dev.n7lanit.ru");
        $(By.xpath("//li[@class='list-group-item thread-read']//a[@class='item-title thread-title']"));

    }

    @И("заходим в акк")
    public void заходимВАкк() throws InterruptedException {
        $(By.xpath("//div[@class='nav nav-guest']/button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        $(By.xpath("//div[@class='control-input']/input[@id='id_username']")).val("portman");
        Thread.sleep(1000);
        $(By.xpath("//div[@class='control-input']/input[@id='id_password']")).val("aznikol98").pressEnter();
        Thread.sleep(1000);
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
    }

    @И("подписываемся на тему")
    public void подписываемсяНаТему() throws InterruptedException {
        Thread.sleep(1000);
        $$(By.xpath("//li/div[@class='row thread-row']/div/div/div/div/div/button[@class='btn btn-default btn-icon btn-block btn-subscribe dropdown-toggle']")).get(3).click();
        $(By.xpath("//div[@class='btn-group open']/ul[@class='dropdown-menu dropdown-menu-right' and 1]/li[2]/button[@class='btn-link' and 1]")).click();
    }

    @И("подписываемся на еще одну тему")
    public void подписываемсяНаЕщеОднуТему() throws InterruptedException {
        Thread.sleep(1000);
        $$(By.xpath("//li/div[@class='row thread-row']/div/div/div/div/div/button[@class='btn btn-default btn-icon btn-block btn-subscribe dropdown-toggle']")).get(1).click();
        $(By.xpath("//div[@class='btn-group open']/ul[@class='dropdown-menu dropdown-menu-right' and 1]/li[2]/button[@class='btn-link' and 1]")).click();
    }

    @И("заходим в подписки")
    public void заходимВПодписки() {
        $(By.xpath("//li/a[@href='/subscribed/']")).doubleClick();
    }

    @И("проверяем первую подписку")
    public void проверяемПервуюПодписку() {
        $$(By.xpath("//ul[@class='list-group']/li[@class='list-group-item thread-new']")).get(1).isDisplayed();
    }

    @И("проверяем вторую подписку")
    public void проверяемВторуюПодписку() {
        $$(By.xpath("//ul[@class='list-group']/li[@class='list-group-item thread-new']")).get(2).isDisplayed();
    }

    @И("отписываюсь от первой темы")
    public void отписываюсьОтПервойТемы() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath("//li[1]/div/div/div/div/div/div/button[@class='btn btn-default btn-icon btn-block btn-subscribe btn-subscribe-half dropdown-toggle']")).click();
        $(By.xpath("//div[@class='btn-group open']/ul[@class='dropdown-menu dropdown-menu-right']/li/button[@class='btn-link']")).click();
    }

    @И("отписываюсь от второй темы")
    public void отписываюсьОтВторойТемы() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath("//li[2]/div/div/div/div/div/div/button[@class='btn btn-default btn-icon btn-block btn-subscribe btn-subscribe-half dropdown-toggle']")).click();
        $(By.xpath("//div[@class='btn-group open']/ul[@class='dropdown-menu dropdown-menu-right']/li/button[@class='btn-link']")).click();
    }
}

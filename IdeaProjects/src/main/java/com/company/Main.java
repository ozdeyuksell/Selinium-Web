package com.company;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;




public class Main {


    public static void main(String[] args) throws InterruptedException {

        String s= System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chrome driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.gittigidiyor.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        /*login yapma*/

        WebElement girisyap= driver.findElement(By.xpath("//div[@class='gekhq4-6 hnYHyk']"));
        girisyap.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement grsyp= driver.findElement(By.xpath("//span[text()='Giriş Yap']"));
        grsyp.click();

        WebElement isim= driver.findElement(By.name("kullanici"));
        isim.sendKeys("ozdeyuk007@gmail.com");

        WebElement parola= driver.findElement(By.name("sifre"));
        parola.sendKeys("ozde-6933");

        WebElement giris=driver.findElement(By.xpath("//input[@class='gg-m-24 gg-t-24 gg-d-24 gg-w-24 gg-ui-btn-primary gg-ui-btn-fluid  gg-ui-btn-lg']"));
        giris.click();

        /*bilgisayar yazısı yazıp aratma kodu*/
        driver.findElement(By.name("k")).sendKeys("bilgisayar");

        driver.findElement(By.xpath("//span[text()='BUL']")).click();

        /*sayfayı aşagı indirme komutu*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,7000)");

        /*ikinci sayfaya geçildi*/
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[5]/ul/li[2]/a")).click();

        /* Açılan ürün sayfasında ürünün sepete eklenmesi*/
        WebElement temp = driver.findElement(By.xpath("//*[@id=\"item-info-block-690424111\"]/p/img"));
        temp.click();
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scrollBy(0,650)");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button[class='control-button gg-ui-button plr10 gg-ui-btn-default']")).click();


        WebElement quantityBox = driver.findElement(By.className("dIB"));
        quantityBox.click();
        quantityBox.clear();
        quantityBox.sendKeys("1");

        WebElement basketBtn = driver.findElement(By.className("dIB"));
        basketBtn.click();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.className("basket-icon-container")).click();

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.className("removeProd")).click();









    }




}

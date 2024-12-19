package com.nttdata.steps;

import com.nttdata.page.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.screenShot;


public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    public void esperarElemento(By elemento){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        wait.until( ExpectedConditions.elementToBeClickable(elemento));
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){
        this.driver.findElement(LoginPage.loginButton).click();
    }



    public void clicClothes(){
        this.driver.findElement(LoginPage.clothesButton).click();
    }
    public void clicMen(){
        this.driver.findElement(LoginPage.menButton).click();
    }



    public void clicPrimerProducto(){
        this.driver.findElement(LoginPage.primerproductoButton).click();
    }
    public void clicCantidad(){
        this.driver.findElement(LoginPage.aumentarproductoButton).click();
    }
    public void clicAgregarCarrito(){
        this.driver.findElement(LoginPage.agregarcarritoButton).click();
    }


    public void validarConfirmacionProducto(String mensajeEsperado){
        //String mensajeRecuperado=this.driver.findElement(LoginPage.confirmacionproductoLabel).getText();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Espera explícita hasta que el elemento <h4> sea visible
        WebElement mensajeElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.confirmacionproductoLabel));
        String mensajeRecuperado = mensajeElemento.getText();
        mensajeRecuperado = mensajeRecuperado.replaceAll("[^\\p{L}\\p{Z}]", "").trim();
        Assertions.assertEquals(mensajeEsperado, mensajeRecuperado);
    }



}


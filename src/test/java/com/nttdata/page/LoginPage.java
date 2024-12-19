package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginPage {

    //Localizadores de elementos
    public static By btnIniciar = By.id("_desktop_user_info");
    public static By userInput = By.xpath("//*[@id=\"field-email\"]");
    public static By passInput = By.xpath("//*[@id=\"field-password\"]");
    public static By loginButton = By.xpath("//*[@id=\"submit-login\"]");

    public static By clothesButton = By.xpath("//*[@id=\"category-3\"]/a");
    public static By menButton = By.xpath("//*[@id=\"category-4\"]/a");

    public static By primerproductoButton = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By cantidadInput = By.xpath("//*[@id=\"quantity_wanted\"]");
    public static By agregarcarritoButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    public static By aumentarproductoButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i");


    public static By confirmacionproductoLabel = By.xpath("//*[@id='myModalLabel']");




}

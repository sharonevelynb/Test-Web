package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;



public class LoginStepsDef {

    private WebDriver driver;
    private LoginSteps loginSteps;


    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
        screenShot();
    }
    //@And("hago click en Iniciar Sesion")
    //public void hagoClicEnIniciarSesion(){ loginSteps.clicEnIniciarSesion();}

    @Y("me logueo con mi usuario: {string} y clave: {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String categorio, String arg1) {
        loginSteps = new LoginSteps(driver);
        loginSteps.clicClothes();
        loginSteps.clicMen();
        screenShot();
    }

    @Y("agrego 2 unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito() {
        loginSteps = new LoginSteps(driver);
        loginSteps.clicPrimerProducto();
        loginSteps.clicCantidad();
        loginSteps.clicAgregarCarrito();
    }

    @Entonces("valido en el popup la confirmación del producto agregado {string}")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado(String mensajeEsperado) {
        loginSteps.validarConfirmacionProducto(mensajeEsperado);

    }
    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente()  throws InterruptedException {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){}
    }



}

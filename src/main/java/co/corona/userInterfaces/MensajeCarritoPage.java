package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCarritoPage {

    public static final Target MSJ_CARRITO_VACIO = Target.the("Msj carrito vacio").located(By.xpath("//h2[text()='Tu carrito está vacío']"));
}

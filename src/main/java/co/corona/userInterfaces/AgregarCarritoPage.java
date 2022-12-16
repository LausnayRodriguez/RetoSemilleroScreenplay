package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarCarritoPage {

    public static final Target BTN_CANTIDAD = Target.the("Click sumar cantidad producto").located(By.className("icon-plus"));
    public static final Target BTN_AGREGAR_CARRITO = Target.the("Click agregar al carrito").located(By.id("addToCartButton"));
    public static final Target BTN_CLOSE = Target.the("Click en cerrar").located(By.xpath("(//button[@class='close'])[3]"));
    public static final Target BTN_IR_CARRITO = Target.the("Click en ir al carrito").located(By.className("coc-item-go-to-car"));



}

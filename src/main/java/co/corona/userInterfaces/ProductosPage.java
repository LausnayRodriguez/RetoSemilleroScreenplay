package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosPage {

    public static final Target BTN_PRODUCTOS = Target.the("Click productos").located(By.xpath("//a[@title='Productos']"));

}

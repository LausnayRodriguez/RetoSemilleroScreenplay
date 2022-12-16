package co.corona.userInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://corona.co/")
public class PaginaInicioPage extends PageObject {

    public static final Target BTN_REGISTRATE = Target.the("click en registrate").located(By.className("account-pre-text"));

}

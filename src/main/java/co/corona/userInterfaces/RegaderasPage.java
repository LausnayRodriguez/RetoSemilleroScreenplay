package co.corona.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegaderasPage {

    public static final Target IMG_REGADERAS = Target.the("Click regaderas").located(By.xpath("//h2[text()='REGADERAS']"));
    public static final Target IMG_TELEDUCHAS = Target.the("Click teleduchas").located(By.xpath("//h2[text()='TELEDUCHAS']"));

    public static final Target BTN_REFERENCIA = Target.the("Click referencia").located(By.xpath("(//a[@class='reference'])[1]"));

}

package co.corona.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class RegistroPage {

    public static final Target TXT_NOMBRE = Target.the("Ingresar nombre").located(By.id("register.firstName"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar apellido").located(By.id("register.lastName"));
    public static final Target TXT_CORREO = Target.the("Ingresar correo").located(By.id("register.email"));
    public static final Target TXT_CLAVE = Target.the("Ingresar clave").located(By.id("password"));
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Ingresar confirmar clave").located(By.id("register.checkPwd"));
    public static final Target CHK_TRATAMIENTO = Target.the("Click en aceptar tratamiento de datos").located(By.xpath("(//div[@class='control__indicator'])[1]"));
    public static final Target CHK_TERMINOS = Target.the("Click en en aceptar terminos").located(By.xpath("(//div[@class='control__indicator'])[2]"));
    public static final Target BTN_REGISTRAR = Target.the("Click en registrar").located(By.xpath("//button[contains(text(),'Registrar')]"));

}

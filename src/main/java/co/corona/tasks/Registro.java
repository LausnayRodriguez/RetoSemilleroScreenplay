package co.corona.tasks;

import co.corona.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.corona.userInterfaces.PaginaInicioPage.*;
import static co.corona.userInterfaces.RegistroPage.*;
import static co.corona.userInterfaces.RegaderasPage.BTN_REFERENCIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.IOException;


public class Registro implements Task {
    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(BTN_REGISTRATE),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx", "Registro", 1,0)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx", "Registro", 1,1)).into(TXT_APELLIDO),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx", "Registro", 1,2)).into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx", "Registro", 1,3)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("Data.xlsx", "Registro", 1,3)).into(TXT_CONFIRMAR_CLAVE),
                    Click.on(CHK_TRATAMIENTO),
                    Click.on(CHK_TERMINOS),
                    WaitUntil.the(BTN_REFERENCIA, WebElementStateMatchers.isNotPresent()).forNoMoreThan(10).seconds(),
                    Click.on(BTN_REGISTRAR)

            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Registro informacion(){
        return instrumented(Registro.class);
    }
}

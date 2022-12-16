package co.corona.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.corona.userInterfaces.ProductosPage.*;
import static co.corona.userInterfaces.DuchasPage.*;
import static co.corona.userInterfaces.RegaderasPage.*;
import static co.corona.userInterfaces.AgregarCarritoPage.*;
import static co.corona.userInterfaces.carritoComprasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarProductosCarrito implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PRODUCTOS),
                Click.on(IMG_DUCHAS),
                Click.on(IMG_REGADERAS),
                WaitUntil.the(BTN_REFERENCIA, WebElementStateMatchers.isClickable()),
                Click.on(BTN_REFERENCIA),
                WaitUntil.the(BTN_CANTIDAD, WebElementStateMatchers.isClickable()),
                Click.on(BTN_CANTIDAD),
                Click.on(BTN_CANTIDAD),
                Click.on(BTN_AGREGAR_CARRITO),
                Click.on(BTN_CLOSE),
                Click.on(BTN_PRODUCTOS),
                Click.on(IMG_DUCHAS),
                Click.on(IMG_TELEDUCHAS),
                WaitUntil.the(BTN_REFERENCIA, WebElementStateMatchers.isClickable()),
                Click.on(BTN_REFERENCIA),
                Click.on(BTN_AGREGAR_CARRITO),
                Click.on(BTN_IR_CARRITO),
                Click.on(BTN_ELIMINAR),
                Click.on(BTN_ELIMINAR)


        );
    }

    public static EliminarProductosCarrito dataEliminarProductos(){

        return instrumented(EliminarProductosCarrito.class);
    }
}

package co.corona.questions;

import co.corona.userInterfaces.MensajeCarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionEliminarProductos implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return MensajeCarritoPage.MSJ_CARRITO_VACIO.resolveFor(actor).isVisible();
    }

    public static Question validarCarritoVacio(){
        return new ValidacionRegistro();
    }
}

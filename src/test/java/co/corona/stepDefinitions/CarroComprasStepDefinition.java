package co.corona.stepDefinitions;

import co.corona.exceptions.ResultadoNoEsperado;
import co.corona.questions.ValidacionEliminarProductos;
import co.corona.tasks.EliminarProductosCarrito;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CarroComprasStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor lau = Actor.named("lau");


    @Before
    public void configuracion(){
        lau.can(BrowseTheWeb.with(navegador));
    }

    @Cuando("^el elimine los productos del carro de compras despues de haberlos agregado$")
    public void elElimineLosProductosDelCarroDeComprasDespuesDeHaberlosAgregado() {
        lau.attemptsTo(
                EliminarProductosCarrito.dataEliminarProductos()
        );
    }


    @Entonces("^el visualizara un mensaje confirmando el carro de compras vacio$")
    public void elVisualizaraUnMensajeConfirmandoElCarroDeComprasVacio() {

        lau.should(seeThat(ValidacionEliminarProductos.validarCarritoVacio(),
                Matchers.equalTo(true)).orComplainWith(
                        ResultadoNoEsperado.class, ResultadoNoEsperado.AGOTADO));
    }

}

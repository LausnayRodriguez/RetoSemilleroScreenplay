package co.corona.stepDefinitions;

import co.corona.exceptions.ResultadoNoEsperado;
import co.corona.questions.ValidacionRegistro;
import co.corona.tasks.Registro;
import co.corona.userInterfaces.PaginaInicioPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor lau = Actor.named("lau");

    private PaginaInicioPage paginaInicioPage = new PaginaInicioPage();

    @Before
    public void configuracion(){
        lau.can(BrowseTheWeb.with(navegador));
    }


    @Dado("^que el usuario se encuentre en la pagina web de corona$")
    public void queElUsuarioSeEncuentreEnLaPaginaWebDeCorona() {
        lau.wasAbleTo(
                Open.browserOn(paginaInicioPage)
        );
    }


    @Cuando("^el ingrese los datos de registro$")
    public void elIngreseLosDatosDeRegistro() {
        lau.attemptsTo(
                Registro.informacion()
        );
    }

    @Entonces("^el visualizara un mensaje por su registro$")
    public void elVisualizaraUnMensajePorSuRegistro() {

        lau.should(seeThat(ValidacionRegistro.validarRegistro(),
                Matchers.equalTo(true)).orComplainWith(
                ResultadoNoEsperado.class, ResultadoNoEsperado.FALLO_REGISTRO));

    }

}

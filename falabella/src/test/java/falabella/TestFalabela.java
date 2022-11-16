package falabella;
import org.junit.jupiter.api.Test;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Steps;
import steps.StepsFalabella;


@RunWith(SerenityRunner.class)
public class TestFalabela {

    @Steps
    StepsFalabella stepsFalabella;

    @Managed
    WebDriver driver;

    //
    @Test
    public void testBuscarProducto(){
        //STEP 1: ABRIR NAVEGADOR
        stepsFalabella.openBrowser();
        //STEP 2: BUSCAR PRODUCTO
        //stepsFalabella.buscarProducto(producto, "apple");
        //STEP 3: VERIFICAR RESULTADO
        //stepsFalabella.showProducto(producto, "laptop apple");

    }
}

package steps;
import page.PageFalabella;
import net.thucydides.core.annotations.Step;

public class StepsFalabella {

    PageFalabella falabellaPage;

    @Step
    public void openBrowser() {falabellaPage.open();}

    @Step
    public void clickGo() { falabellaPage.clickGo();}

    @Step
    public void buscarProducto(String producto)
    {
        buscarProducto(producto);
        clickGo();
    }

    /*@Step
    public void shouldSeeProducto(String producto)
    {
        assertThat(falabellaPage.getProducto(),hasItem(containsString(producto)));
    }*/

}
 
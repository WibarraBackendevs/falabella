package page;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://falabella.cl")
public class PageFalabella extends PageObject {

    @FindBy(name="search")
    WebElementFacade search;

    @FindBy(name="go")
    WebElementFacade go;

    public void buscarProducto(String producto)
    {
        search.type(producto);
    }

    public void clickGo()
    {
        go.click();
    }

    /*public List<String> getProducto()
    {
        WebElementFacade producto = find(By.tagName = "ol");
        System.out.println(producto.findElements(BytagName("li")).stream.map(WebElement::getText).collect());
        return producto.findElements(BytagName("li")).stream.map(WebElement::getText).collect(Collectors.toList());
    }*/

}

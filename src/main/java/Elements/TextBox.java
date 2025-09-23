package Elements;

import org.openqa.selenium.WebElement;

public class TextBox {

    public void clickAndEnter(WebElement element, String string){
        element.click();
        element.sendKeys(string);
    }
}

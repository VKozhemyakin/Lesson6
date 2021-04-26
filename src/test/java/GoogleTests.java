import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {
    @Test
    public void searchGoogleTest(){
        open("https://www.google.com/");
        $x("//input[@name='q']").setValue("Selenide").pressEnter();
        $x("//div[@id='search']").shouldHave(text("Selenide.org"));
    }
//hello
}

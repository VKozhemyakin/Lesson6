import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;


public class YandexTest extends TestBase {
    String weather = "Weather in Gomel";

    @Test
    public void searchWeather (){

        $x("//input[@id='text']").val("Weather in Gomel").pressEnter();
        $x("//div[@class='OrganicTitle-LinkText organic__url-text']").click();


        sleep(5000);


    }

}

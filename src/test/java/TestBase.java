import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

        @BeforeAll

    static void setup(){
            Configuration.startMaximized = true;
            open("https://yandex.by/");
        }
}

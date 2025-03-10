import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.SetValueOptions.withText;
import static com.codeborne.selenide.files.DownloadActions.click;


public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Alex Egorov");
        $("#lastName").setValue("Lovashkin");
        $("#userEmail").setValue("alex@egorov.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("8800355353");
        $("#dateOfBirthInput").click();
   $(byText("29")).click();
    $("#subjectsInput").sendKeys("C");

     sleep(5000);

     //   $("#permanentAddress").setValue("Another address 1");
       // $("#submit").click();

        //$("#output").shouldHave(text("Alex Egorov"), text("alex@egorov.com"),
          //      text("Some address 1"), text("Another address 1"));

    }


    }


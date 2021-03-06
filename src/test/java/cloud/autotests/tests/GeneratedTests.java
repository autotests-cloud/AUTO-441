package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("тест")
    void generatedTest() {
        step("открыть https://www.vprok.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("ввести в поискую строку Петрушка", () -> {
            step("// todo: just add selenium action");
        });

        step("проверить что появлась страница с результатами", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.vprok.ru/'", () ->
            open("https://www.vprok.ru/"));

        step("Page title should have text 'Vprok.ru Перекрёсток – доставка продуктов на дом и на дачу Впрок'", () -> {
            String expectedTitle = "Vprok.ru Перекрёсток – доставка продуктов на дом и на дачу Впрок";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.vprok.ru/'", () ->
            open("https://www.vprok.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
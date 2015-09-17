package project.search.google;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Condition.text;

public class GooglePage {

    public ElementsCollection searchResults = $$("#ires .g");

    public void findText(String text) {
        $(By.name("q")).setValue(text).pressEnter();
    }

    public void checkTextInResult(String text, int resultNumber) {
        searchResults.get(resultNumber - 1).shouldHave(text(text));
    }

    public void checkSize(int size) {

        searchResults.shouldHaveSize(size);

    }
}

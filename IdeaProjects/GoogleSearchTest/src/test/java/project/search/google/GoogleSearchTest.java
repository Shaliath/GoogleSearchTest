package project.search.google;

import org.junit.Test;

public class GoogleSearchTest extends BeforeStartSearch{

    GooglePage page = new GooglePage();
    @Test
    public void SearchSelenide() {

        page.findText("selenide");

        page.checkTextInResult("selenide", 10);

        page.checkSize(10);

    }

}

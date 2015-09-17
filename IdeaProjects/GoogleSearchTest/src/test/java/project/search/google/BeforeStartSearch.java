package project.search.google;

import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class BeforeStartSearch {

    @Before
    public void openGoogle() {
        open("http://google.com/ncr");
    }

}

package by.iba.nikolaichik.steps;

import com.codeborne.selenide.Configuration;
import org.jbehave.core.annotations.BeforeStories;

public class LifeCycleSteps {

    @BeforeStories
    public void setUpDriver() {
        Configuration.browser = "chrome";
    }


}

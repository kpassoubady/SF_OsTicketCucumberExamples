package com.kavinschool.osticket.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuizStepDefs {

    @Given("I visit the kavin school quiz url {string}")
    public void i_visit_the_kavin_school_quiz_url(String url) {
        System.out.println("QuizStepDefs.i_visit_the_kavin_school_quiz_url");
        System.out.println("url = " + url);
    }

    @When("I Select {string} from the dropdown")
    public void i_Select_from_the_dropdown(String quizName) {
        System.out.println("QuizStepDefs.i_Select_from_the_dropdown");
        System.out.println("quizName = " + quizName);
    }

    @Then("I should see {string}")
    public void i_should_see(String headerName) {
        System.out.println("QuizStepDefs.i_should_see");
        System.out.println("headerName = " + headerName);
    }
}

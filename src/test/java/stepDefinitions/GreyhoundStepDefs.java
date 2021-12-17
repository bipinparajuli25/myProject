package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementations.GreyhoundImpl;

public class GreyhoundStepDefs {
    GreyhoundImpl greyhoundImpl = new GreyhoundImpl();


    @Given("^I launch the grehound website$")
    public void I_launch_the_grehound_website() throws Throwable {
        greyhoundImpl.lauchTheGreyhound();

    }



    @Given("^I fill the reservation details \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_fill_the_reservation_details_and(String from, String to, String startDate, String returnDate, String passengerCount) throws Throwable {
        greyhoundImpl.fillTheReservation(from,  to,  startDate,  returnDate,  passengerCount);

    }

    @When("^I click on search button$")
    public void I_click_on_search_button() throws Throwable {

    }

    @Then("^verify the list of busses available$")
    public void verify_the_list_of_busses_available() throws Throwable {

    }

    @Given("^I click on expore places$")
    public void I_click_on_expore_places() throws Throwable {
        greyhoundImpl.clickExplorePlaces();

    }

    @When("^I click on travel stories link$")
    public void I_click_on_travel_stories_link() throws Throwable {
        greyhoundImpl.clickOnTravelStories();

    }

    @Then("^verify the verify the content$")
    public void verify_the_verify_the_content() throws Throwable {
        greyhoundImpl.verifyTheContent();

    }


}

package bowling.steps;

import java.util.List;

import bowling.Game;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BowlingTestDefs {

	private Game game;
	
	@Before
	public void beforeScenario() {
		game = new Game();
	}
	
	@Given("^a player start a new bowling game$")
	public void a_player_start_a_new_bowling_game() throws Throwable {

	}

	@When("^he throws the following pins$")
	public void he_throws_the_following(List<playerThrow> playerThrows) throws Throwable {
	    // For automatic conversion, change DataTable to List<YourType>
		for(playerThrow aThrow : playerThrows)
		{
			System.out.println(aThrow.pins);
		}


	}

	@Then("^his score should be (\\d+)$")
	public void his_score_should_be(int arg1) throws Throwable {

	}
	
	public class playerThrow {
		Integer pins;
	}
	
}
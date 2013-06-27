package bowling.steps;

import java.util.List;

import bowling.Game;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class BowlingTestDefs {

	private Game game;
	
	@Given("^a player starts a new bowling game$")
	public void a_player_starts_a_new_bowling_game() throws Throwable {
		game = new Game();
	}

	@When("^he throws the following pins$")
	public void he_throws_the_following_pins(List<playerThrow> playerThrows) throws Throwable {

		for(playerThrow aThrow : playerThrows)
		{
			game.throwPins(aThrow.pins);
		}
	}

	@Then("^his total score should be (\\d+)$")
	public void his_score_should_be(int expectedScore) throws Throwable {
		assertEquals(expectedScore, game.score());
	}
	
	
	@Then("^the score for frame (\\d+) should be (\\d+)$")
	public void the_score_for_frame_should_be(int theFrame, int expectedScore) throws Throwable {
		assertEquals(expectedScore, game.scoreForFrame(theFrame));
	}	
	
	@When("^he throws (\\d+) pins (\\d+) times$")
	public void he_throws_pins_times(int pins, int times) throws Throwable {
		for (int i=0; i< times; i++)
		{
			game.throwPins(pins);
		}
	}	
	
	public class playerThrow {
		Integer pins;
	}
	
}
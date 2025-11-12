package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		//throw new NotYetImplementedException();
		super(prompt,answer,points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		//throw new NotYetImplementedException();
		super.displayPrompt();
		for(int i = 0; i < choices.length; i++) {
			System.out.println((1+i) + ". " + choices[i]);
		}

	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		//throw new NotYetImplementedException();
		return this.choices;
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		String[] colors = {"blue", "red", "yellow"}; 
		MultipleChoiceQuestion mq1 = new MultipleChoiceQuestion("What color is the sky?", "blue", 3, colors);

		mq1.displayPrompt();
	}

}

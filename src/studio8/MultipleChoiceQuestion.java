package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	
	

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		super(prompt,answer,points);
		this.choices = choices;
		
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		System.out.println(this.getPrompt() + "(" + this.getPoints() + " points)");
		for (int i = 0 ; i < choices.length; i++) {
		System.out.println((i+1)+". "+this.choices[i]); 
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return this.choices;
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		String[] choices = {"2","4","5","6"};
		Question one = new MultipleChoiceQuestion ("What does 3+3 equal ?","6",5, choices);
		one.displayPrompt();
		
	}

}

import java.util.List;
import java.util.ArrayList;

public class History {
	private String question;
	private String answer;
	private List<String> questions;
	private List<String> answers;
	
	public History() {
		question = "";
		answer = "";
		questions = new ArrayList<String>();
		answers = new ArrayList<String>();
	}
	
	public void addQuestion (String q) {
		question = q;
		questions.add(q);
	}

	public void addAnswer (String a) {
		answer = a;
		answers.add(a);
	}

	public void getHistory() {
		for (int i = 0; i < questions.size(); i++) {
			System.out.print("YOU SAID: ");
			System.out.println(questions.get(i));
			System.out.print("MAGIC 8-BALL SAID: ");
			System.out.println(answers.get(i));
		}
	}
}

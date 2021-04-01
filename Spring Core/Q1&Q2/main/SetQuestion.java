import java.util.Set;

public class SetQuestion {
	private int questionId;
	private String question;
	private Set<String> answers;
	public SetQuestion() {	
	}
	public SetQuestion(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "SetQuestion [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
}

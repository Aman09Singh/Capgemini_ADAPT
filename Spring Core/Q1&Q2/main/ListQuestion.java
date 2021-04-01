
public class ListQuestion {
	private String questionId;
	private String question;
	private List<String> answers;
	public ListQuestion() {
		
	}
	public ListQuestion(String questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "ListQuestion [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
}

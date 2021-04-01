
public class MapQuestion {
	private int questionId;
	private String question;
	private Map<Integer, String> answers;
	public MapQuestion() {
		
	}
	public MapQuestion(int questionId, String question, Map<Integer, String> answers) {
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
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "MapQuestion [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}
	
}

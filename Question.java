public class Question {
	private int questionID;
	public String questionText;
	public String answerText;
	public QuestionResult result = QuestionResult.NotAnswered;
	public int triedCount =0 ;
	
	public Question (String question, String answer){
		this.questionText = question;
		this.answerText = answer;
	}
	public ArrayList<char> getAnswerCharList(){
		
	}
	public int getAnswerCharCount(){
		
	}
	public ArrayList<char> getChoice(){
		
	}
	public QuestionResult submitAndswer(char c){
		
	}
 }

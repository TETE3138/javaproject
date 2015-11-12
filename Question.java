public class Question {
	private int questionID;
	public String questionText; //คำถาม
	public String answerText; //คำตอบ
	public QuestionResult result = QuestionResult.NotAnswered;
	public int triedCount =0 ;
	
	public Question (String question, String answer){
		this.questionText = question;
		this.answerText = answer;
	}
	public ArrayList<char> getAnswerCharList(){
		// return ArrayList<char>ของคำตอบ
	}
	public int getAnswerCharCount(){
		// return จำนวนตัวอักษรของคำตอบ
	}
	public ArrayList<char> getChoice(){
		// return ArrayList<char>ของคำตอบปนกับตัวเลือกอื่นๆ
	}
	public QuestionResult submitAndswer(char c){
		
	}
 }

public class Question {
  private String question;
  private String[] options;
  private int correctAnswer;

  public Question(String q, String[] opts, int ans) {
    question = q;
    options = opts;
    correctAnswer = ans;
  }

  public String getQuestion() { return question; }
  public String[] getOptions() { return options; }
  public int getCorrectAnswer() { return correctAnswer; }
}
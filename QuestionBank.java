import java.util.*;

public class QuestionBank {
  public static List<Question> getQuestions() {
    List<Question> list = new ArrayList<>();
    list.add(new Question("What is 2 + 2?", new String[]{"3", "4", "5"}, 1));
    list.add(new Question("Capital of France?", new String[]{"Paris", "London", "Rome"}, 0));
    return list;
  }
}
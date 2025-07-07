import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    int score = 0;
    int[] answers = {1, 0};
    for (int i = 0; i < answers.length; i++) {
      String ans = req.getParameter("q" + i);
      if (ans != null && Integer.parseInt(ans) == answers[i]) {
        score++;
      }
    }
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<html><body><h1>Your Score: " + score + "/" + answers.length + "</h1></body></html>");
  }
}
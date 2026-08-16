public class App {
    public static void main(String[] args) throws Exception {
        QuestionService qService = new QuestionService();
        qService.playQuiz();
        qService.printScore();
    }
}

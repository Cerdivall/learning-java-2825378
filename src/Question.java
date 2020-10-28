import java.util.Scanner;

public class Question {
    String question = "W którym mieście żyję?\na: Warszawa\nb: Wrocław\nc: Kraków";

    public void askQuestion() {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        repeatQuestion(scanner, answer);
    }

    public void repeatQuestion(Scanner scanner, String answer) {
        while (!isCorrect(answer)) {
            System.out.println(question);
            answer = scanner.next();
            isCorrectAnswer(answer);
        }
    }

    public void isCorrectAnswer(String answer) {
        if (isCorrect(answer))
            System.out.println("Gratuluję, poprawna odpowiedź!");
    }

    public boolean isCorrect(String answer) {
        return answer.contains("b");
    }
}

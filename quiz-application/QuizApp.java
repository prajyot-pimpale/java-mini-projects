import java.util.*;
import java.util.stream.*;

public class QuizApp {
    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question("Which keyword is used to inherit a class in Java?", new String[]{"implements", "extends", "inherits", "super"}, 2),
            new Question("What is the default value of an int in Java?", new String[]{"null", "1", "0", "-1"}, 3),
            new Question("Which collection does NOT allow duplicates?", new String[]{"ArrayList", "LinkedList", "HashSet", "Vector"}, 3),
            new Question("What does JVM stand for?", new String[]{"Java Variable Machine", "Java Virtual Machine", "Java Volatile Memory", "Java Visual Monitor"}, 2),
            new Question("Which method is the entry point of a Java program?", new String[]{"start()", "init()", "main()", "run()"}, 3)
        ));

        Collections.shuffle(questions);  // randomize order

        Scanner sc     = new Scanner(System.in);
        int     score  = 0;
        int     total  = questions.size();
        List<String> wrong = new ArrayList<>();

        System.out.println("╔══════════════════════════╗");
        System.out.println("║     Java Quiz App        ║");
        System.out.println("╚══════════════════════════╝");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("\nWelcome, " + name + "! " + total + " questions. Good luck!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            q.display(i + 1);
            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();

            if (ans < 1 || ans > 4) {
                System.out.println("Invalid! Skipped.");
                wrong.add("Q" + (i+1) + ": " + q.getCorrectAnswer());
            } else if (q.isCorrect(ans)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Answer: " + q.getCorrectAnswer());
                wrong.add("Q" + (i+1) + ": " + q.getCorrectAnswer());
            }
        }

        double percent = (score * 100.0) / total;
        String grade   = percent >= 80 ? "A" : percent >= 60 ? "B" :
                         percent >= 40 ? "C" : "F";

        System.out.println("\n╔══════════════════════════╗");
        System.out.println("║        YOUR RESULT       ║");
        System.out.println("╚══════════════════════════╝");
        System.out.println("Name   : " + name);
        System.out.printf("Score  : %d/%d (%.1f%%)%n", score, total, percent);
        System.out.println("Grade  : " + grade);
        System.out.println("Status : " + (percent >= 40 ? "PASS ✅" : "FAIL ❌"));

        if (!wrong.isEmpty()) {
            System.out.println("\n=== Review Wrong Answers ===");
            wrong.forEach(System.out::println);
        }

        sc.close();
    }
}
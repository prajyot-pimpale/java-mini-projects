import java.util.*;

class Question {
    private String question;
    private String[] options;
    private int correct;  // 1-4

    Question(String question, String[] options, int correct) {
        this.question = question;
        this.options = options;
        this.correct = correct;
    }

    void display(int no){
        System.out.println("\nQ" + no + ". " + question);
        for (int i = 0; i < options.length; i++)
            System.out.println("  " + (i + 1) + ". " + options[i]);
    }

    boolean isCorrect(int ans){
        return ans == correct; 
    }
    
    String  getCorrectAnswer(){ 
        return options[correct - 1]; 
    }
}
package java_basics;

import java.util.Scanner;

public class MultipleChoice_Quiz {



    /** Enum type to represent the result of answering a question. */
    enum Result { CORRECT, WRONG, UNANSWERED }

    private static final int PASS_MARK = 5;
    private static String[] correctAnswers = { "C", "A", "B", "D",
            "B", "C", "C", "A" };


    private static String[] userAnswers = new String[8];
    public static void main(String[] args){

        // Counters for miscellaneous statistics:
        int numOfCorrectAnswers = 0;
        int numOfWrongAnswers = 0;
        int numOfUnanswered = 0;

        Scanner in = new Scanner(System.in);
        for(int i=0 ; i<=7; i++) {
            int j=i+1;
            System.out.println("Enter answer for " + j + " question : ");
            String answer = in.next();
            userAnswers[i] = answer.toUpperCase();
        }
        for(int k=0;k<8;k++) {
            String a = correctAnswers[k];
            String b = userAnswers[k];
            Result result = answerCheck(a, b);
            System.out.println(a + " , " + b + " , " + result);
            switch (result) {
                case CORRECT:
                    numOfCorrectAnswers++;
                    break;
                case WRONG:
                    numOfWrongAnswers++;
                    break;
                case UNANSWERED:
                    numOfUnanswered++;
                    break;
            }
        }

            // Print summary of statistics:
            System.out.println("No. of correct answers:      " + numOfCorrectAnswers);
            System.out.println("No. of wrong answers:        " + numOfWrongAnswers);
            System.out.println("No. of questions unanswered: " + numOfUnanswered);
            System.out.println("The candidate " +
                    (numOfCorrectAnswers >= PASS_MARK ? "PASSED." : "FAILED."));


    }

    public static Result answerCheck(String correctAnswers, String userAnswers){
    Result result = null;


            if(userAnswers.equals(correctAnswers))
                result = Result.CORRECT;
            else if(userAnswers.equals("X"))
                result = Result.UNANSWERED;
            else
                result = Result.WRONG;

        return result;
    }
}



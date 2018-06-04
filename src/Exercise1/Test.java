package Exercise1;

import javax.swing.*;
import java.util.Random;

public class Test {

    public static int simulateQuestion(int x)
    {
        String[] questions = new String[5];
        int useranswer;

        questions[0]= "Q1: Properties are also known as?\n"
                + "(1) Integer\n"
                + "(2) Data Fields\n"
                + "(3) Character\n"
                + "(4) Objects";
        questions[1]= "Q2: When an instance variable is created, Every instance variable has?\n"
                + "(1) No value.\n"
                + "(2) Unused value.\n"
                + "(3) Default null value.\n"
                + "(4) None of the mentioned.";
        questions[2]= "Q3: How is a static method called?\n"
                + "(1) className.method(arguments)\n"
                + "(2) methodName.className(arguments)\n"
                + "(3) methodName(arguments)\n"
                + "(4) objectName.methodName(arguments)\n";
        questions[3]= "Q4: What are the ways to call the method?\n"
                + "(1) Using a method name by itself to call another method of that class\n"
                + "(2)Using an object’s variable name followed by a dot separator (.) to call a non-static method \n"
                + "(3) Using the class name followed by a dot separator (.) to call a static method of a clas\n"
                + "(4) All of the above\n";
        questions[4]= "Q5: Which of the following pertaining to Stack is true?\n"
                + "(1) The first object pushed onto the stack  is the first object popped out of stack \n"
                + "(2) The last object pushed onto the stack  is the first object popped out of stack\n"
                + "(3) The last object pushed onto the stack  is the last object popped out of stack\n"
                + "(4) The  object not pushed onto the stack  is the  object popped out of stack\n";

        useranswer=Integer.parseInt(JOptionPane.showInputDialog(questions[x])); // string into integer & assigning to variable
        return useranswer;

    }

    public static int[] checkAnswer(int answer, int correctAnswerNo, int [] score)
    {
        int correctAnswers[] = {2,3,1,4,2};
        String message;
        if (correctAnswers[correctAnswerNo]==answer)
        {
            message = generateMessage(1);
            JOptionPane.showMessageDialog(null,message);
            score[1]= score[1]+1;
        }
        else
        { score[0]= score[0]+1;
            message = generateMessage(0);
            JOptionPane.showMessageDialog(null, "The correct answer is "+ correctAnswers[correctAnswerNo]+ "  " +message);
        }

        return score;
    }

    private static String generateMessage(int type)
    {  Random rnd = new Random(); // generate random messages

        if (type == 1)
        {switch (rnd.nextInt(4))
        {
            case 0: return("***Keep up the good work***");
            case 1: return("***Good!***");
            case 2: return("***Excellent!***");
            case 3: return("***Nice Work***");
        }
        }else{
            switch (rnd.nextInt(4)){
                case 0: return("***No. Please try again***");
                case 1: return("***Wrong. Try once more***");
                case 2: return("***Don't give up***");
                case 3: return("***No. Keep trying***");

            }
        }
        return null;
    }
    public void inputAnswer()
    {
        // Declaring  & initializing variables
        int [] score= new int [2]; // array creating to check user correct and incorrect answers
        score[0]=0;
        score[1]=0;
        int answer;
        String finalMessage;
        int percentage;

        // loop to prompt questions
        for(int i=0;i<5;i++){
            answer=simulateQuestion(i);
            score= checkAnswer(answer,i,score);
        }
        percentage = score[1]*20;
        finalMessage = "Your total correct answers are = " + score[1]+
                "\n Your total wrong answers are = "+ score[0]+
                "\n Your Percentage Score is = "+ percentage+"%";

        JOptionPane.showMessageDialog(null,finalMessage); // printing user's correct and incorrect answers score & percentage
    }


}

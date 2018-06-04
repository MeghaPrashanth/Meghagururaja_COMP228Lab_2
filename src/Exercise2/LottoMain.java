package Exercise2;

import javax.swing.*;

public class LottoMain {
    public static void main(String[] args) {
        //declare variables
        int lootoArray[] = new int[3];
        int sum = lootoArray[0] + lootoArray[1] + lootoArray[2];
        int usernum = 0;
        String winMessage = "******Hurray, you win!*****";
        String lostMessage = "****Sorry! You have lost****";

        Lotto game = new Lotto(); // create an object for class Lotto
        lootoArray = game.getArrayLotto();// initialize arr1 with the return value

        // loop for to check user input and check for winning conditions
        for (int x = 1; x<=5; x++) {
            usernum = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27 :"));

            if(usernum == sum) {
                JOptionPane.showMessageDialog(null,winMessage);
                break;
            }
        }
        if(usernum != sum)
            JOptionPane.showMessageDialog(null,lostMessage);

    }


}
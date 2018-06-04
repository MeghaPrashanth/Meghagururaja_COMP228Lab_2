package Exercise2;

import java.util.Random;

public class Lotto {

    int arrayLotto[] = new int[3]; // declare an array of 3

    // create a constructor to generate random values and assign them to the array
    Lotto () {
        Random rnd = new Random();

        for (int i = 0; i<3; i++)
            arrayLotto[i] = rnd.nextInt(7) + 1;

    }

    //create a method to return array
    public int[] getArrayLotto() {
        return arrayLotto;
    }
}

/*
*  Alvaro Ursua
* 'O Brien
* CS 236  
* 2/3/2019
* 
* This is the hasing alogortih. It extends the PassGame Class
* take the user input as a seed, runs the hash algorith
* and return the hash to the GUI when "Get Stronger password" is clicked

* Complied using NetBeans v9
*/
package passgame;

import java.util.*;

public class hasher extends PassGame {

    private String hashed;
    private String seed;
    Random charGen = new Random();
    private int value;
    private char add;

    //sets the user input as seed, adds a special charachter to the beginning
    public void setSeed(String s) {
        seed = s;
        hashed="$";
    }

    //runs the hashing alorithm
    void runHash() {

        //gets the value for the seed
        int length = seed.length();

        //checks to see if the password is long enough
        if (length != 15) {
            int r = 15 - length;

            //if it's not, then it adds random ascii values to the seed
            //untill the seed is 15 char in length
            for (int j = 0; j < r; j++) {
                value = charGen.nextInt((126 - 33) + 1) + 33;
                add = (char) value;
                seed = seed + add;
            }
        }

       //ensures 3 non charachter values are added to seed to increase complexity
       for (int j = 0; j < 3; j++) {
           value = charGen.nextInt((64 - 33) + 1) + 33;
           add = (char) value;
           seed = seed + add;
        }

        //sets up the array to store all the values into the the array
        char[] alpha = new char[seed.length()];

        //assigns every value in the string to and element in the array
        for (int k = 0; k <= seed.length() - 1; k++) {

            alpha[k] = seed.charAt(k);
        }

        //reverses the string to nonsense with added char
        for (int l = 0; l <= seed.length()-1; l++) {

            hashed = hashed + alpha[(seed.length()-l) -1];
        }
    }
    
    //returns the hash value whe called

    public String getHash() {
        return hashed;
    }
}

/*
*  Alvaro Ursua
* 'O Brien
* CS 236  
* 2/3/2019
* 
* This is class creates the objet passGame. It can be setup without a UI 
* It is relied up by the Hasher class
* validates the password strength and creates and hacker and user to compete
* overirdes the to String method to print out reliable results

* Complied using NetBeans v9
 */
package passgame;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PassGame {

    //decalres varaibles and objects
    player user = new player();
    hacker comp = new hacker();
    String[] passPhrases = new String[15];
    String passPhrase;
    int counter = -1;
    private boolean point;
    private String total;
    private int length;
    private String strength;

    //runs the password from the user and checks length
    //if longer than 15, its strong, if not it's weak
    public void validate(String p) {

        if (p.length() > 15) {
            user.setPoint(true);
            strength = "Strong";
        } else {
            comp.setPoint(true);
            strength = "weak";
        }

        passPhrase = p;
          addString();
    }

    //gets the stregnth value, as check in validate()
    public String getStrength() {

        return strength;
    }

    //sets the length of the string
    public void setLength(int l) {
        length = l;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        String total;
        total = ("User Score: " + user.getScore() + "\nHacker Score: " + comp.getScore());
        return total;
    }

        public int addString(){
        counter++;
        passPhrases[counter] = passPhrase;
        System.out.println("Phrase " + counter +" Added as " + passPhrases[counter]);
        
        return counter;
    }
        
        //Prints out all the phrases to a file
        
        public void printPhrases() throws IOException {
        String file = "phrases.dat";
        
        //sets up output objects
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
 
        //prints every object in array to dat file
        for (int i = 0; i <= passPhrases.length - 1; i++) {
            objectOut.writeObject(passPhrases[i]);
        }
        objectOut.close();
        
        System.out.println("print successful");
        
    }
        
}

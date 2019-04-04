/*
*  Alvaro Ursua
* 'O Brien
* CS 236  
* 2/15/2019
* 
* Runs basic print and read functions from files and to files. 
*
* Complied using NetBeans v9
 */
package passgame;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class passwordStorage {

    String[] fromFile = new String[15];
    String[] hashedPhrase = new String[15];

    public void readInwards() throws IOException {

        FileInputStream fileIn = new FileInputStream("phrases.dat");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        //Saves every object in file to a new array anems "fromFile" from "double" object type
        for (int i = 0; i <= fromFile.length - 1; i++) {

            try {
                fromFile[i] = (String) objectIn.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(passwordStorage.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(fromFile[i]);
        }

    }
    
     public void readHashes() throws IOException {

        FileInputStream fileIn = new FileInputStream("hashed.dat");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        //Saves every object in file to a new array anems "fromFile" from "double" object type
        for (int i = 0; i <= hashedPhrase.length - 1; i++) {

            try {
                hashedPhrase[i] = (String) objectIn.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(passwordStorage.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(hashedPhrase[i]);
        }

    }
    
    }
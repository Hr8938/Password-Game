/*
*  Alvaro Ursua
* 'O Brien
* CS 236  
* 2/3/2019
* 
* This is what builds a user player

* Complied using NetBeans v9
*/
package passgame;


public class player implements scoreKeep{
    private int points = 0;
    
    //if the value is less than 15, the hacker gets a point
     public void setPoint(boolean win){
        if(win = true){
            points++;
        }
    }
    
     //retirives the hacker's total score
    public int getScore(){
        return points;
    }
}

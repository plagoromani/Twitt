/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 *
 * @author Pablite5
 */
public class Twitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Twitter mitwitter = new TwitterFactory().getInstance();
    }
    
}

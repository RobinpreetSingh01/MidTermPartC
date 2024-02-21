/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author robin
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the OnlineVids system! Let's create your user profile.");
        
        System.out.print("Enter your userID: ");
        String userID = scanner.nextLine();
        
     
        System.out.println("Available Genres: Comedy, Drama, Action, Mystery");
        
        System.out.print("Enter your favorite genre from the list above: ");
        String genre = scanner.nextLine();
        
      
        UserProfile userProfile = new UserProfile(userID, genre);
        
        System.out.println("Your user profile has been created!");
        System.out.println("UserID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
        
        scanner.close();
    }
}

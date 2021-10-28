/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the 
*/package Midtermexam_Versiona_extensioncode;
import java.util.Scanner;
import static java.lang.System.in;

/**
 *
 * @author umama
 */
public class TestUserprofile {

    public static void main(String[] args) {

     
       System.out.println("Welcome! Customize your Movie Preferneces");
       System.out.println("Write your Username");
 Scanner sc=new Scanner(System.in);
String userID=sc.next();

System.out.println("Please choose the Genere"
 + "/nComedy Drama Action Mystery");
       
 String genre=sc.nextLine();
       


UserProfile user1 = new UserProfile(userID,genre);
        System.out.println(user1.toString());

System.out.println("User is Registered");
}
}


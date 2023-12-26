package Class;

import java.util.Scanner;

import static java.lang.System.exit;

public class GuestMenu implements Menu{


    @Override
    public int displayMenu() {
        System.out.println("Guest Menu");
        System.out.println("1.Sign Up");
        System.out.println("2.Sign In");
        System.out.println("3.Exits");
        
        return Choice.nextInt();
    }

    @Override
    public String getType() {
        return "Guest";
    }



}

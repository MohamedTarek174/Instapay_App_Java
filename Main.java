import Class.*;

public class Main {
    public static void main(String[] args) {

        RunApp runApp = new RunApp();
        int choice = runApp.startMenu();        // Display the munu and get the action
        
        runApp.enteration(choice);
        

    }
}


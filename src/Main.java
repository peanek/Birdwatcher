
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner read = new Scanner(System.in);

        BirdLibrary birdWatcher = new BirdLibrary();
//        System.out.print("? ");
//        String instr = read.nextLine();
        birdWatcher.instructions();
//        System.out.print("? ");
//        instr = read.nextLine();
    

    
   
}

}

//    public static void doSomething(Scanner read) {
//        String riw = read.nextLine();
//    }



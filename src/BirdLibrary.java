/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author przemek
 */
import java.util.Scanner;
import java.util.ArrayList;

public class BirdLibrary {

    private ArrayList<Bird> birdsLibrary;
    private Scanner reader;

    public BirdLibrary() {
        this.birdsLibrary = new ArrayList<Bird>();
        this.reader = new Scanner(System.in);
    }

    public void instructions() {
        System.out.print("? ");
        String instr = reader.nextLine();
        
        while (true) {
            if (instr.equals("Quit")) {
                break;
            }
            
            if (instr.equals("Add")) {
                System.out.print("Name: ");
                String name = this.reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = this.reader.nextLine();
                this.addBird(new Bird(name, latinName));
            }
            if (instr.equals("Observation")) {
                System.out.println("What was observed:? ");
                String obs = reader.nextLine();
                for (Bird bir : this.birdsLibrary) {
                    if (bir.printName().equals(obs)) {
                        bir.addObservation();

                    } else {
                        System.out.println("Is not a bird!");
                    }
                }

            }

            if (instr.equals("Statistics")) {
                for (Bird bir : this.birdsLibrary) {
                    System.out.println(bir.toString());
                }

            }

            if (instr.equals("Show")) {
                System.out.print("What? ");
                String what = this.reader.nextLine();
                for (Bird lib : this.birdsLibrary) {
                    if (lib.printName().equals(what)) {
                        System.out.println(lib.toString());

                    }
                }

            }
        System.out.print("? ");
        instr = reader.nextLine();
        }

    }

    public void addBird(Bird newBird) {
        this.birdsLibrary.add(newBird);
    }
//
//    public void observation(String osb) {
//        for (Bird bir : this.birdsLibrary) {
//            if (bir.printName().equals(obs)) {
//                bir.addObservation();
//
//            }
//
//        }
//
//    }

//    public Bird searchBird(Bird bird, String searched) {
//
//        for (Bird bir : this.birdsLibrary) {
//
//            if (bir.printName().equals(searched)) {
//                return bir;
//            }
//        }
//        else return ""
//    
//    }
}

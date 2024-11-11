//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, 
//you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
// 9
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File inputfile = new File("practice.txt");
        List<String> listGPA = new ArrayList<>();
        int namesTotal = 0;

        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()){
                //what do we do at every line of the file?

                String name = input.nextLine();
                listGPA.add(input.nextLine());

                double gpa = Double.parseDouble(input.nextLine());

                namesTotal ++;

                if(gpa > 3.5) {
                    listGPA.add((name));
                }
            }
            input.close();
            System.out.println("Names total: " + namesTotal);
            System.out.println("Had GPA over 3.5: " + listGPA);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        
      //optional if you want to keep this, just to show what the indices are of the list you created
        //System.out.println(list);
    }
}

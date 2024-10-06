
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

public class Array {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(

        //duplicate numbers
        boolean[] numCheck = new boolean[myArray.length];
        System.out.println("duplicate numbers: ");
        for (int i = 0; i < myArray.length; i++){
            if (numCheck[i]){
                continue;
            }
            // amount of times duplicates appear
            int count = 1;
            for(int j = i + 1; j < myArray.length; j++){
                if (myArray[i] == myArray[j]){
                    count++;
                    numCheck[j] = true;
                }
            }
            //print duplicate numbers
            if (count > 1) {
                System.out.println(myArray[i] + " repeats " + count + " times " );
            }
        }

    }
}
//Created my Naomi Johnson
//for CTE Software Development Class 2024
//Instructor: Kim Gross

public class Marbles {
    //Create some objects using the marble class in the Marble.java file.
    public static void main(String[] args) {
        //The first marble set is blue with 12 marbles.
        Marble Blue = new Marble(12, "Blue Marble");
        //The second marble set is red with 12 marbles.
        Marble Red = new Marble(12, "Red Marble");
        //The third marble set is purple with 14 marbles.
        Marble Purple = new Marble(14, "Purple Marble");
        //Uses the print method to show the attributes of the set.
        bluemarble.print(); 
        //The takeaway method will reduce the marble set by the parameter 4. It also prints how many marbles were removed.
        bluemarble.takeaway(6); 
        bluemarble.print();
        //Takes 8 more marbles from the set. Since the set is now empty, the method will print that it is empty.
        bluemarble.takeaway(4); 
        redmarble.print();
        redmarble.takeaway(8);
         //Uses the getNumber method to find the amount of marbles in the set.
        System.out.println("It now has " + redmarble.getNumber() + " marbles.");
        purplemarble.print();
        purplemarble.takeaway(7);
        purplemarble.takeaway(8);
        purplemarble.print();
    }
}

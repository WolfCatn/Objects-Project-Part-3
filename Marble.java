//Created my Naomi Johnson
//for CTE Software Development Class 2024
//Instructor: Kim Gross

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Marble {
    private String color;
    private int count; // Number of marbles in the set

    public Marble(String color, int initialCount) {
        this.color = color;
        this.count = initialCount;
    }

    public void print() {
        System.out.println("Marble set (" + color + ") contains " + count + " marbles.");
    }

    public void takeaway(int amount) {
        // Using an if-else statement to print out how many marbles are being taken from the marble set.
        if (amount <= count) {
            count -= amount;
            System.out.println(amount + " marbles removed from the " + color + " set.");
        } else {
            System.out.println("Not enough marbles in the " + color + " set.");
        }
    }

    public int getNumber() {
        return count;
    }

    public static void main(String[] args) {
        // Setting up the blueMarble set.
        Marble blueMarble = new Marble("Blue", 12);
        blueMarble.print();
        // Have 6 marbles taken out of the set
        blueMarble.takeaway(6);
        System.out.println("Remaining blue marbles: " + blueMarble.getNumber());

        // Setting up the redMarble set.
        Marble redMarble = new Marble("Red", 15);
        redMarble.print();
        // Have 9 marbles taken from the set
        redMarble.takeaway(9);
        System.out.println("Remaining red marbles: " + redMarble.getNumber());

        // Setting up the greenMarble set.
        Marble greenMarble = new Marble("Green", 10);
        greenMarble.print();
        // Trying to remove more than available
        greenMarble.takeaway(12);
        greenMarble.print();
    }
}

public class SparklyMarble extends Marble {
    private Random random = new Random();

    public SparklyMarble(String color, int initialCount) {
        super(color, initialCount);
    }

    public void printSpecial() {
        super.print();
        System.out.println("This marble is sparkly!");
    }

    public void drawSparkles(Graphics2D g2d, int x, int y) {
        g2d.setColor(Color.YELLOW);
        for (int i = 0; i < 10; i++) {
            int sparkleX = x + random.nextInt(20) - 10;
            int sparkleY = y + random.nextInt(20) - 10;
            int sparkleSize = random.nextInt(5) + 2;
            g2d.fill(new Ellipse2D.Double(sparkleX, sparkleY, sparkleSize, sparkleSize));
        }
    }
    public class GlowInTheDarkMarble extends Marble {
        private boolean glowsInTheDark;
    
        public GlowInTheDarkMarble(String color, int initialCount, boolean glowsInTheDark) {
            super(color, initialCount);
            this.glowsInTheDark = glowsInTheDark;
        }
    
        public void printSpecial() {
            super.print();
            if (glowsInTheDark) {
                System.out.println("This marble glows in the dark!");
            } else {
                System.out.println("This marble does not glow in the dark.");
            }
        }
    }    
}

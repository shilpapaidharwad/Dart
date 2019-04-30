    import java.util.Arrays;
	import java.util.HashMap;
	import java.util.TreeMap;

    public class NextdartTest {

        private double x;// Two variables to map the co-ordinates
        private double y;
        private int[] rulesRange = {10, 5, 1};// Array for the no.of circles on the dart

        //to map circle and its point
        private TreeMap<Integer, Integer> rules = new TreeMap<Integer, Integer>(); //

       //Method to allocate points based on  in which circle the dart is placed.
       public void nextdart(double x, double y) {
            this.x = x;
            this.y = y;
            rules.put(10, 1);
            rules.put(5, 5);
            rules.put(1, 10);
        }
        //Method to check x and y position on the dart and then return the points based on the position of the dart on the circles of dart board
        private int scoreForOne(double z) {
           //For loop for reading the array of circles on the dart
            for (int i=rulesRange.length/2; i>0 && i<rulesRange.length; ){

                if (z>rulesRange[i]) {
                    if (z<=rulesRange[i-1]) {
                        return rules.get(rulesRange[i-1]);
                    }
                    else i--;
                }
                else {
                    if (i==rulesRange.length-1) {
                        if (z<rulesRange[i]) {
                            return rules.get(rulesRange[i]);
                        }
                    }
                    if (z>rulesRange[i+1]) {
                        return rules.get(rulesRange[i]);
                    }
                    else i++;
                }
            }
            return 0;
        }
        //method to check the points based on dart position(x,y co-ordinates)
        int score() {
            int scoreX = scoreForOne(this.x);
            int scoreY = scoreForOne(this.y);
            return scoreX>=scoreY ? scoreY : scoreX;
        }

    }


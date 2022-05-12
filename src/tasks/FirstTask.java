package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstTask {

    public static void main(String[] args) {

        String[] colorArray = {"Red", "Blue", "Green", "White", "Black", "Yellow"};

        ArrayList<String> colors = new ArrayList<>(Arrays.asList(colorArray));

        System.out.println("*Copied array to an ArrayList*");
        System.out.println(colors);
        System.out.println("*Remove 3rd element*");
        colors.remove(2);
        System.out.println(colors);
        System.out.println("*Add new color at the end of list*");
        colors.add("Orange");
        System.out.println(colors);
        System.out.println("*Add new color at the beginning of list*");
        colors.add(0, "Brown");
        System.out.println(colors);

        System.out.println("*For each print out*");
        for (String tempString : colors)
        {
            System.out.println(tempString);
        }

        System.out.println("*Sublist of color list*");
        ArrayList<String> subListOfColors = new ArrayList<>(colors.subList(2, 5));
        for (String tempString : subListOfColors)
        {
            System.out.println(tempString);
        }

    }
}
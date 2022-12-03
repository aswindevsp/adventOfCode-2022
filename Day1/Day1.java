package Day1;

import java.util.*;
import java.io.*;

public class Day1 { 
    public static void main(String[] args) {
        Integer max = 0; //Final output;
        try {

            FileInputStream f = new FileInputStream("input.txt");
            Scanner line = new Scanner(f);

            int tempMax = 0;

            String temp; //Reading values
            while(line.hasNextLine()) {
                temp = line.nextLine();
                if(temp == "") {
                    max = Integer.max(tempMax, max);
                    tempMax = 0;
                } else {
                    tempMax += Integer.parseInt(temp);
                }
            }
            max = Integer.max(tempMax, max);
            line.close();
            f.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(max);
    }
}
import java.util.*;
import java.io.*;

public class Day2 { 

   
    public static void main(String[] args) {
        int top1 = 0, top2 =0, top3 = 0;
        try {

            FileInputStream f = new FileInputStream("input.txt");
            Scanner line = new Scanner(f);

            int tempMax = 0;

            String temp; //Reading values
            while(line.hasNextLine()) {
                temp = line.nextLine();
                if(temp == "") {
                    if(tempMax > top3) {
                        top3 = tempMax;

                        if(top3 > top2) {
                            int temp2 = top3;
                            top3 = top2;
                            top2 =temp2;
                        }

                        if(top2 > top1) {
                            int temp2 = top2;
                            top2 = top1;
                            top1 =temp2;
                        }

                    }
                    tempMax = 0;
                } else {
                    tempMax += Integer.parseInt(temp);
                }
            }
            line.close();
            f.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(top1 + top2 + top3);
    }
}
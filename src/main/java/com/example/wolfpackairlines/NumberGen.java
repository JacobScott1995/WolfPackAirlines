package com.example.wolfpackairlines;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NumberGen {

    private static int UUID = 0;

    public static void GenerateUnique() {
        Random random = new Random();
        int max = 99999;
        UUID = random.nextInt(max);
    }
    public static boolean UniqueCheck(int CustomerID)
    {
        Path path = Paths.get("src/main/resources/com/example/wolfpackairlines/Unique-Customer-ID's.txt");


        try {
            List<String> CurrentIDs = Files.readAllLines(path);
            List<Integer> PostParse = new ArrayList<>(CurrentIDs.size());

            for(String nums : CurrentIDs)
            {
                PostParse.add(Integer.valueOf(nums));
            }
            for (Integer integer : PostParse) {
                if (integer == CustomerID) {
                    return false;
                }
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return true;
    }

    public static void FileInput(int UCID)
    {
        String Unique = Integer.toString(UCID);

        if(UniqueCheck(UUID))
        {
            try
            {
                FileWriter write = new FileWriter("src/main/resources/com/example/wolfpackairlines/Unique-Customer-ID's.txt", true);
                write.write(Unique +  "\n");
                write.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        else throw new RuntimeException("Something went wrong here....");
    }


    public static void main(String[] args) {

      GenerateUnique();
      
       while(!UniqueCheck(UUID))
       {
           GenerateUnique();
       }
        FileInput(UUID);
    }
}

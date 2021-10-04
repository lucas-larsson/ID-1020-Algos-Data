package KTH.ID1020;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Results res;

        File outFile = new File("src/KTH/ID1020/OutPutFiles/Data.csv");
        FileWriter fw = new FileWriter(outFile);

        try{
            for (int i = 1; i < 15; i++) {
            Long startTime =  System.currentTimeMillis();
            res = FrequencyCounter.frequencyCounter(i);
            Long endTime = System.currentTimeMillis();
            res.setTime(((int) (endTime-startTime)));
            //System.out.println(res);
            //System.out.println("Time:["+(endTime-startTime)+"] ms")
            fw.write(res.getLength()+","+res.getWord()+","+res.getRepetition()+","+res.getTime()+"\n");
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

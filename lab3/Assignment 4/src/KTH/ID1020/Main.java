package KTH.ID1020;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author:      LUCAS LARSSON
 * Date:        2021-10-02
 * Description: a main class that runa Frequency counter in a loop to get
 * more accurate data of the 2 search Algorithms used in it
 **/
class Main {
    public static void main(String[] args) throws IOException {

        Results res;

        for (int j = 1; j < 15; j++) {
            File outFileST = new File("src/KTH/ID1020/OutPutFiles/DataST"+j+".csv");
            File outFileBST = new File("src/KTH/ID1020/OutPutFiles/DataBST"+j+".csv");
            int numberOfWords = j * 10000;
        try(FileWriter fwST = new FileWriter(outFileST)){
            for (int i = 1; i < 15; i++) {
                Long startTime =  System.currentTimeMillis();
                res =FrequencyCounter.frequencyCounterST(i,numberOfWords);           // returns object res
                Long endTime = System.currentTimeMillis();
                res.setTime((int) (endTime-startTime));
                //System.out.println("Time:["+(endTime-startTime)+"] ms");
                fwST.write(res.getLength()+","+res.getWord()+","+res.getRepetition()+","+res.getTime()+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try(FileWriter fwBST = new FileWriter(outFileBST)){
            for (int i = 1; i < 15; i++) {
                Long startTime =  System.currentTimeMillis();
                res =FrequencyCounter.frequencyCounterBST(i,numberOfWords);           // returns object res
                Long endTime = System.currentTimeMillis();
                res.setTime((int) (endTime-startTime));
                //System.out.println("Time:["+(endTime-startTime)+"] ms");
                fwBST.write(res.getLength()+","+res.getWord()+","+res.getRepetition()+","+res.getTime()+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
}
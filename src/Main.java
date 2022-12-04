import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        int count = 0;
        File f = new File("src/AOC4Data");
        FileReader fd = new FileReader(f);
        BufferedReader br = new BufferedReader(fd);
        String line;
        //Puzzle1
//        while ((line = br.readLine()) != null) {
//            String[] secs = line.split("[,-]");
//            if(Integer.parseInt(secs[0])<=Integer.parseInt(secs[1])&&Integer.parseInt(secs[1])>=Integer.parseInt(secs[3])){
//                count++;
//            }
//            else if(Integer.parseInt(secs[0])>=Integer.parseInt(secs[2])&&Integer.parseInt(secs[1])<=Integer.parseInt(secs[3])){
//                count++;
//            }
//        }
        //Puzzle2
        while ((line = br.readLine()) != null) {
            String[] secs = line.split("[,-]");
            if(Integer.parseInt(secs[1])>=Integer.parseInt(secs[2])&&Integer.parseInt(secs[0])<=Integer.parseInt(secs[3])){
                count++;
            }
        }
        System.out.println(count);
    }

}
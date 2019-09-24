import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateSubset {
    
    public static void main(String[] args) throws Exception {
        String thisLine = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader("twitter-2010.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("subset.txt", true));
            long counter = 0;
            List<String> lines = new ArrayList<String>();

            while((thisLine = br.readLine()) != null && counter < 10000/*Files.lines(Paths.get("twitter-2010.txt")).count()*/) {
                //bw.append(br.readLine());
                //bw.append("\n");
                if(Character.isDigit(thisLine.charAt(0))){
                    lines.add(br.readLine());
                    counter++;
                }
            }
            System.out.println("Done");
            //System.out.println("Lines before: " + lines.size());
            /*boolean sorted = false;

            for(int i = 0; i < lines.size() - 1; i++){
            //for(int i = 0; i < Files.lines(Paths.get("twitter-2010.txt")).count() - 1; i++){ 
                int minInd = i;
                for(int j = i+1; j < lines.size(); j++){
                //for(int j = i+1; j < Files.lines(Paths.get("twitter-2010.txt")).count(); j++){
                    String[] current = lines.get(j).split(" ");
                    long curr = Long.parseLong(current[0]);
                    String[] minimum = lines.get(minInd).split(" ");
                    long min = Long.parseLong(minimum[0]);
                    if(curr < min) { minInd = j; }
                }
                String temp = lines.get(minInd);
                lines.set(minInd, lines.get(i));
                lines.set(i, temp);
                if(i % 1000 == 0) {System.out.println(i);}
            }*/
            quickSort(lines, 0, lines.size() - 1);
            for(int i = 0; i < lines.size(); i++){
                //System.out.println(lines.get(i));
                bw.write(lines.get(i) + System.lineSeparator());
                //bw.append("\n");
            }
            System.out.println("Lines after: " + lines.size());
            //System.out.println(lines);
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void quickSort(List<String> list, int start, int end){
        if(start < end){
            int partitionIndex = partition(list, start, end);
            quickSort(list, start, end - 1);
            quickSort(list, partitionIndex + 1, end);
        }

    }

    public static int partition(List<String> list, int start, int end){
        String pivot = list.get(end);
        int i = (start-1);

        for(int j = start; j < end; j++){
            //System.out.println(Long.parseLong(list.get(j).split(" ")[0]));
            if(Long.parseLong(list.get(j).split(" ")[0]) <= Long.parseLong(pivot.split(" ")[0])){
                i++;
                String swapTemp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, swapTemp);
            }
        }

        String swapTemp = list.get(i+1);
        list.set(i+1, list.get(end));
        list.set(end, swapTemp);

        return i+1;
    }

}


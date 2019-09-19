import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

public class CreateSubset {
    
    public static void main(String[] args) throws Exception {
        String thisLine = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader("twitter-2010.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("twitter-subset.txt", true));
            int counter = 0;
            List<String> lines = new ArrayList<String>();

            while((thisLine = br.readLine()) != null && counter < 10000) {
                //bw.append(br.readLine());
                //bw.append("\n");
                if(Character.isDigit(thisLine.charAt(0))){
                    lines.add(br.readLine());
                    counter++;
                }
            }
            System.out.println("Done");
            boolean sorted = false;
            //while(!sorted){
                //sorted = true;
            for(int i = 0; i < lines.size() - 1; i++){
                int minInd = i;
                for(int j = i+1; j < lines.size(); j++){
                    String[] current = lines.get(j).split(" ");
                    long curr = Long.parseLong(current[0]);
                    String[] minimum = lines.get(minInd).split(" ");
                    long min = Long.parseLong(minimum[0]);
                    if(curr < min) { minInd = j; }
                }
                String temp = lines.get(minInd);
                lines.set(minInd, lines.get(i));
                lines.set(i, temp);
                if(i % 100 == 0) {System.out.println(i);}
            }
            for(int i = lines.size() - 1; i >= 0; i--){
                bw.append(lines.get(i));
                bw.append("\n");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class WeightingsManager {
	static final File weightings = new File("C:/Users/James/Documents/GitHub/fuzzy-avenger/fuzzy-avenger/Ethics/src/main/java/weightings.csv");

	@SuppressWarnings("resource")
	public HashMap<String, String> getWeightings() throws IOException{
        BufferedReader fileReader = null;
        final String DELIMITER = ",";
        String line = "";
        fileReader = new BufferedReader(new FileReader(weightings));
        HashMap<String, String> weightingsMap = new HashMap<>();
        while ((line = fileReader.readLine()) != null) {
            //Get all tokens available in line
            String[] tokens = line.split(DELIMITER);
            for(int i=0;i<tokens.length-1;i++) {
                String curr = tokens[i];
                String next = tokens[i+1];
                weightingsMap.put(curr, next);
                i++;
            }
        }
        return weightingsMap;
	}
	
	public void setWeightings(HashMap<String, String> weightings){
		
	}
}


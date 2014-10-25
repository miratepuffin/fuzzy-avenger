import java.io.IOException;
import java.util.HashMap;


public class EthicalAnalyser {
	public static void main(String[] args) throws IOException{
		EthicalAnalyser ea = new EthicalAnalyser();
		ea.run();
	}
	
	public void run() throws IOException{
		WeightingsManager weightingsManager = new WeightingsManager();
		HashMap<String, String> weightings = weightingsManager.getWeightings();
	}
}

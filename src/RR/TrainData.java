package RR;

import java.util.List;

public class TrainData {
	private TrainListData trainsNames;
	private List<String> stoppingStations;
	
	public TrainData(TrainListData trainsNames, List<String> stoppingStations) {
		super();
		this.trainsNames = trainsNames;
		this.stoppingStations = stoppingStations;
	}
	
	public TrainListData getTrainsNames() {
		return this.trainsNames;
	}
	public List<String> getStoppingStations() {
		return this.stoppingStations;
	}
	public void setTrainsNames(TrainListData trainsNames) {
		this.trainsNames = trainsNames;
	}
	public void setStoppingStations(List<String> stoppingStations) {
		this.stoppingStations = stoppingStations;
	}
	
	@Override
	public String toString() {
		return "TrainData [trainsNames=" + this.trainsNames + ", stoppingStations=" + this.stoppingStations + "]";
	}
}

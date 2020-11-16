package RR;

import java.util.Arrays;
import java.util.List;

public class DataService implements DataInterface{

	@Override
	public List<TrainData> getTrainData() {
		List<String> stationList = Arrays.asList("chennai" , "trichy", "madurai");
		return Arrays.asList(new TrainData(TrainListData.NellaiExpress, stationList));
	}

}

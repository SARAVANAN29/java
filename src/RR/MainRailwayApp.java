package RR;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import sun.launcher.resources.launcher;

public class MainRailwayApp {

	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome !");
		System.out.println("1. Search Trains");
		System.out.println("2. Book Trains");
		getOption();
	}

	static {
		List<String> stationList = Arrays.asList("chennai" , "trichy", "madurai");
		new TrainData(TrainListData.NellaiExpress, stationList);
	}
	private static void getOption() {
		// TODO Auto-generated method stub
		int option = 1;
		String depStn =new String("trichy");
		String strStn = new String("maduri");
		DataService dataService = new DataService();
		List<TrainData> tDatas = dataService.getTrainData();

		if(dataService.getTrainData() != null) {
//			System.out.println(tDatas.toString());
			tDatas
			.stream()
			.filter(l -> l.getStoppingStations().contains(depStn) && l.getStoppingStations().contains(strStn))
			.forEach(output -> {
					System.out.println(output.toString());
			});
			
			tDatas
			.stream()
			.noneMatch(l -> l.getStoppingStations().contains(depStn) && l.getStoppingStations().contains(strStn));
			
		}
		else {
			System.out.println("sorry");
		}
		//		System.out.println(dataService.getTrainData());
	}



}

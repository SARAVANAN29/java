package DataStructure;

import java.util.*;

//Write your Checker class here

class Player{
 String name;
 int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 }
}

public class ComparatorExp {

 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker();
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt());
     }
     scan.close();
  
     Arrays.sort(player, checker);
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     }
 }
}

class Checker implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		Integer i1 = o1.score;
		Integer i2 = o2.score;
		int compare = i2.compareTo(i1);
		int output = (compare == 0) ? c.compare(o1, o2) : compare;
		return output;
	}
	
	Comparator<Player> c = new Comparator<Player>() {
		@Override
		public int compare(Player o1, Player o2) {
			// TODO Auto-generated method stub
			String s1 = o1.name;
			String s2 = o2.name;
			return s1.compareTo(s2);
		}
	};
}
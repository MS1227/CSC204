
public class DiceTest {

	public static void main(String[] args) {

		DiceSim dice1 = new DiceSim(2,100000);
		
		dice1.runSimulation();
		dice1.displayCount();
		dice1.graphCount();
		

		
	}

}

package stacksQueues;

public class TowersOfHanoi {
	public static void main(String[] args) {
		int n = 5;
		Tower[] towers = new Tower[n];
		for(int i = 0; i < 3; i++)
			towers[i] = new Tower(i);
		for(int i = n; i >= 1; i--)
			towers[0].add(i);
		towers[0].moveDisks(n, towers[2], towers[1]);
		towers[2].printTower(n);
	}
}
package juegos.factories;

import java.util.Date;
import java.util.Random;

public abstract class RandomFactory {

	public static final int getRandomInt(int num) {
		
		Random r = new Random(new Date().getTime());
		return r.nextInt(num);
	}
	
	public static final int getEvenRandom(int num) {
		
		return getRandomInt(num) *2;
	}
	
	public static final int getOddRandom(int num) {
		
		return (getEvenRandom(num) +1) % 10;
	}
}

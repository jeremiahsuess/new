package www.jeremiahsuess.com.guitar_practice;

public class Key {

	public static void keyOfC() throws InterruptedException {
		Chord.cChord();
		pauseThree();
		Chord.gChord();
		pauseThree();
		Chord.fChord();
		pauseThree();
		Chord.aMinorChord();
		pauseThree();
		Chord.eMinorChord();
		pauseThree();
		Chord.dMinorChord();
		pauseThree();
	}

	public static void keyOfG() throws InterruptedException {
		Chord.cChord();
		pauseThree();
		Chord.gChord();
		pauseThree();
		Chord.dChord();
		pauseThree();
		Chord.aMinorChord();
		pauseThree();
		Chord.eMinorChord();
		pauseThree();
		Chord.bMinorChord();
		pauseThree();
	}

	public static void keyOfD() throws InterruptedException {
		Chord.gChord();
		pauseThree();
		Chord.dChord();
		pauseThree();
		Chord.aChord();
		pauseThree();
		Chord.eMinorChord();
		pauseThree();
		Chord.bMinorChord();
		pauseThree();
		Chord.gFlatMinorChord();
		pauseThree();
	}

	public static void keyOfA() throws InterruptedException {
		Chord.dChord();
		pauseThree();
		Chord.aChord();
		pauseThree();
		Chord.eChord();
		pauseThree();
		Chord.bMinorChord();
		pauseThree();
		Chord.gFlatMinorChord();
		pauseThree();
		Chord.dFlatMinorChord();
		pauseThree();
	}

	public static void keyOfE() throws InterruptedException {
		Chord.aChord();
		pauseThree();
		Chord.eChord();
		pauseThree();
		Chord.bChord();
		pauseThree();
		Chord.gFlatMinorChord();
		pauseThree();
		Chord.dFlatMinorChord();
		pauseThree();
		Chord.aFlatMinorChord();
		pauseThree();
	}

	public static void keyOfB() throws InterruptedException {
		Chord.gFlatChord();
		pauseThree();
		Chord.eChord();
		pauseThree();
		Chord.bChord();
		pauseThree();
		Chord.aFlatMinorChord();
		pauseThree();
		Chord.dFlatMinorChord();
		pauseThree();
		Chord.eFlatMinorChord();
		pauseThree();
	}

	public static void keyOfGFlat() throws InterruptedException {
		Chord.gFlatChord();
		pauseThree();
		Chord.dFlatChord();
		pauseThree();
		Chord.bChord();
		pauseThree();
		Chord.aFlatMinorChord();
		pauseThree();
		Chord.bFlatMinorChord();
		pauseThree();
		Chord.eFlatMinorChord();
		pauseThree();
	}

	public static void keyOfDFlat() throws InterruptedException {
		Chord.gFlatChord();
		pauseThree();
		Chord.dFlatChord();
		pauseThree();
		Chord.aFlatChord();
		pauseThree();
		Chord.fMinorChord();
		pauseThree();
		Chord.bFlatMinorChord();
		pauseThree();
		Chord.eFlatMinorChord();
		pauseThree();
	}

	public static void keyOfAFlat() throws InterruptedException {
		Chord.eFlatChord();
		pauseThree();
		Chord.dFlatChord();
		pauseThree();
		Chord.aFlatChord();
		pauseThree();
		Chord.fMinorChord();
		pauseThree();
		Chord.bFlatMinorChord();
		pauseThree();
		Chord.cMinorChord();
		pauseThree();
	}

	public static void keyOfEFlat() throws InterruptedException {
		Chord.eFlatChord();
		pauseThree();
		Chord.bFlatChord();
		pauseThree();
		Chord.aFlatChord();
		pauseThree();
		Chord.fMinorChord();
		pauseThree();
		Chord.gMinorChord();
		pauseThree();
		Chord.cMinorChord();
		pauseThree();
	}

	public static void keyOfBFlat() throws InterruptedException {
		Chord.eFlatChord();
		pauseThree();
		Chord.bFlatChord();
		pauseThree();
		Chord.fChord();
		pauseThree();
		Chord.dMinorChord();
		pauseThree();
		Chord.gMinorChord();
		pauseThree();
		Chord.cMinorChord();
		pauseThree();
	}

	public static void keyOfF() throws InterruptedException {
		Chord.cChord();
		pauseThree();
		Chord.bFlatChord();
		pauseThree();
		Chord.fChord();
		pauseThree();
		Chord.dMinorChord();
		pauseThree();
		Chord.gMinorChord();
		pauseThree();
		Chord.aMinorChord();
		pauseThree();
	}

	public static void circleOf5thsChords() throws InterruptedException {
		Chord.aChord();
		pauseFive();

		Chord.bChord();
		pauseFive();

		Chord.cChord();
		pauseFive();

		Chord.dChord();
		pauseFive();

		Chord.eChord();
		pauseFive();

		Chord.fChord();
		pauseFive();

		Chord.gChord();
		pauseFive();

		Chord.aMinorChord();
		pauseFive();

		Chord.bMinorChord();
		pauseFive();

		Chord.dMinorChord();
		pauseFive();

		Chord.eMinorChord();
		pauseFive();

		Chord.fMinorChord();
		pauseFive();

		Chord.gMinorChord();
		pauseFive();

		Chord.aFlatMinorChord();
		pauseFive();

		Chord.aFlatChord();
		pauseFive();

		Chord.bFlatChord();
		pauseFive();

		Chord.dFlatChord();
		pauseFive();

		Chord.eFlatChord();
		pauseFive();

		Chord.gFlatChord();
		pauseFive();

		Chord.aFlatMinorChord();
		pauseFive();

		Chord.bFlatMinorChord();
		pauseFive();

		Chord.dFlatMinorChord();
		pauseFive();

		Chord.eFlatMinorChord();
		pauseFive();

		Chord.gFlatMinorChord();
		pauseFive();

	}

	// pausing for five seconds in between chords
	private static void pauseThree() throws InterruptedException {
		Thread.sleep(3000);
	}

	// pausing for fifteen seconds in between chords
	private static void pauseFive() throws InterruptedException {
		Thread.sleep(5000);
	}
}

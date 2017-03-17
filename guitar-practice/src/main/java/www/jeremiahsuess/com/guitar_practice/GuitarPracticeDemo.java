package www.jeremiahsuess.com.guitar_practice;

//Guitar Practice by Jeremiah Suess

import java.util.Scanner;

public class GuitarPracticeDemo {

	public static void main(String[] args) throws InterruptedException {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		displayBanner();

		// users name
		System.out.println();
		System.out.println("Welcome.  Please remember you can return to the main menu anytime by pushing (x) ");
		System.out.println("Please enter your name>> ");
		String userName = scan.nextLine().toLowerCase();
		System.out.println(
				"Hello, " + userName.toUpperCase() + ", I hope all is well.  Are you ready to play guitar? (y) or (n)");
		String yesOrYes = scan.next();

		while (!yesOrYes.equalsIgnoreCase("y")) {
			System.out.println(userName.toUpperCase() + ", we can't move forward until you push the (y) button>> ");
			yesOrYes = scan.next();
		}

		while (true) {

			// scales or chords
			System.out.println("Would you like to play (s)cales or (c)hords?? ");
			String scalesOrChords = scan.next();

			while (!scalesOrChords.equalsIgnoreCase("c") && !scalesOrChords.equalsIgnoreCase("s")) {
				System.out.println("Would you like to play (s)cales or (c)hords?? ");
				scalesOrChords = scan.next();
			}

			// if choice is scales
			if (scalesOrChords.equalsIgnoreCase("s")) {
				displayScaleMenu();
				String scaleChoice = scan.next();

				while ((!scaleChoice.equalsIgnoreCase("a") && !scaleChoice.equalsIgnoreCase("b"))
						&& !scaleChoice.equalsIgnoreCase("c") && !scaleChoice.equalsIgnoreCase("d")
						&& !scaleChoice.equalsIgnoreCase("e") && !scaleChoice.equalsIgnoreCase("f")
						&& !scaleChoice.equalsIgnoreCase("g")) {
					displayScaleMenu();
					scaleChoice = scan.next();
				}

				if (scaleChoice.equals("a")) {
					Scale.majorScale();
					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						displayOptionToReturnToMainMenu();
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				} else if (scaleChoice.equals("b")) {
					Scale.bluesScale();
					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						displayOptionToReturnToMainMenu();
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				} else if (scaleChoice.equals("c")) {
					Scale.majorPentatonicScale();
					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						displayOptionToReturnToMainMenu();
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				} else if (scaleChoice.equals("d")) {
					Scale.minorPentatonicScale();
					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						displayOptionToReturnToMainMenu();
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				} else if (scaleChoice.equals("e")) {
					Scale.naturalMinorScale();
					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						System.out.println("Push (x) to go back to the main menu?? ");
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				} else if (scaleChoice.equals("f")) {
					Scale.harmonicMinorScale();
					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						displayOptionToReturnToMainMenu();
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				} else if (scaleChoice.equals("g")) {
					Scale.melodicMinorScale();

					displayOptionToReturnToMainMenu();
					String mainMenu = scan.next();
					while (!mainMenu.equalsIgnoreCase("x")) {
						displayOptionToReturnToMainMenu();
						mainMenu = scan.next();
					}
					if (mainMenu.equals("x")) {
						continue;
					}
				}

			}

			// if choice is chords
			else if (scalesOrChords.equalsIgnoreCase("c")) {
				displayChoiceForCircleOfFifthsOrSpecificKey();
				String generalPracticeOrPracticeInSpecificKey = scan.next();

				while (!generalPracticeOrPracticeInSpecificKey.equalsIgnoreCase("a")
						&& !generalPracticeOrPracticeInSpecificKey.equalsIgnoreCase("b")) {
					displayChoiceForCircleOfFifthsOrSpecificKey();
					generalPracticeOrPracticeInSpecificKey = scan.next();

				}

				lengthOfTimeMenu();
				String practiceTime = scan.next();

				while (!practiceTime.equalsIgnoreCase("a") && !practiceTime.equalsIgnoreCase("b")
						&& !practiceTime.equalsIgnoreCase("c") && !practiceTime.equalsIgnoreCase("d")) {
					lengthOfTimeMenu();
					practiceTime = scan.next();
				}

				int practiceTimeInt = 0;
				if (practiceTime.equalsIgnoreCase("a")) {
					practiceTimeInt = 1;
				} else if (practiceTime.equalsIgnoreCase("b")) {
					practiceTimeInt = 3;
				} else if (practiceTime.equalsIgnoreCase("c")) {
					practiceTimeInt = 5;
				} else if (practiceTime.equalsIgnoreCase("d")) {
					practiceTimeInt = 10;
				}

				long startTime = System.currentTimeMillis();
				long endTime = startTime + (practiceTimeInt * 60000);

				if (generalPracticeOrPracticeInSpecificKey.equalsIgnoreCase("a")) {

					while (endTime > startTime) {
						Key.circleOf5thsChords();

					}

				} else if (generalPracticeOrPracticeInSpecificKey.equalsIgnoreCase("b")) {
					displayChordKeyChoiceMenu();
					String scaleChoice = scan.next();

					while ((!scaleChoice.equalsIgnoreCase("a") && !scaleChoice.equalsIgnoreCase("b"))
							&& !scaleChoice.equalsIgnoreCase("c") && !scaleChoice.equalsIgnoreCase("d")
							&& !scaleChoice.equalsIgnoreCase("e") && !scaleChoice.equalsIgnoreCase("f")
							&& !scaleChoice.equalsIgnoreCase("g") && !scaleChoice.equalsIgnoreCase("h")
							&& !scaleChoice.equalsIgnoreCase("i") && !scaleChoice.equalsIgnoreCase("j")
							&& !scaleChoice.equalsIgnoreCase("k") && !scaleChoice.equalsIgnoreCase("l")) {

						displayChordKeyChoiceMenu();

						scaleChoice = scan.next();
					}

					if (scaleChoice.equalsIgnoreCase("a")) {
						while (endTime > startTime) {
							Key.keyOfAFlat();
						}
					} else if (scaleChoice.equalsIgnoreCase("b")) {
						while (endTime > startTime) {
							Key.keyOfB();
						}
					} else if (scaleChoice.equalsIgnoreCase("c")) {
						while (endTime > startTime) {
							Key.keyOfC();
						}
					} else if (scaleChoice.equalsIgnoreCase("d")) {
						while (endTime > startTime) {
							Key.keyOfD();
						}
					} else if (scaleChoice.equalsIgnoreCase("e")) {
						while (endTime > startTime) {
							Key.keyOfE();
						}
					} else if (scaleChoice.equalsIgnoreCase("f")) {
						while (endTime > startTime) {
							Key.keyOfF();
						}
					} else if (scaleChoice.equalsIgnoreCase("g")) {
						while (endTime > startTime) {
							Key.keyOfG();
						}
					} else if (scaleChoice.equalsIgnoreCase("h")) {
						while (endTime > startTime) {
							Key.keyOfAFlat();
						}
					} else if (scaleChoice.equalsIgnoreCase("i")) {
						while (endTime > startTime) {
							Key.keyOfBFlat();
						}
					} else if (scaleChoice.equalsIgnoreCase("j")) {
						while (endTime > startTime) {
							Key.keyOfDFlat();
						}
					} else if (scaleChoice.equalsIgnoreCase("k")) {
						while (endTime > startTime) {
							Key.keyOfEFlat();
						}
					} else if (scaleChoice.equalsIgnoreCase("l")) {
						while (endTime > startTime) {
							Key.keyOfGFlat();
						}
					}

				}
			}
		}
	}

	private static void lengthOfTimeMenu() {
		System.out.println("How many minutes would you like to practice for?");
		System.out.println("(a)\t1 Minute");
		System.out.println("(b)\t3 Minute");
		System.out.println("(c)\t5 Minute");
		System.out.println("(d)\t10 Minute");
	}

	private static void displayBanner() {
		System.out.println();
		System.out.println(
				"..######...##.....##.####.########....###....########.....########..########.....###.....######..########.####..######..########");
		System.out.println(
				".##....##..##.....##..##.....##......##.##...##.....##....##.....##.##.....##...##.##...##....##....##.....##..##....##.##......");
		System.out.println(
				".##........##.....##..##.....##.....##...##..##.....##....##.....##.##.....##..##...##..##..........##.....##..##.......##......");
		System.out.println(
				".##...####.##.....##..##.....##....##.....##.########.....########..########..##.....##.##..........##.....##..##.......######..");
		System.out.println(
				".##....##..##.....##..##.....##....#########.##...##......##........##...##...#########.##..........##.....##..##.......##......");
		System.out.println(
				".##....##..##.....##..##.....##....##.....##.##....##.....##........##....##..##.....##.##....##....##.....##..##....##.##......");
		System.out.println(
				"..######....#######..####....##....##.....##.##.....##....##........##.....##.##.....##..######.....##....####..######..########");
		System.out.println();
		System.out.println("by Jeremiah Suess");
	}

	private static void displayChordKeyChoiceMenu() {
		System.out.println("Please indicate which key you would like to play in>> ");
		System.out.println("(a)\tKey of A");
		System.out.println("(b)\tKey of B");
		System.out.println("(c)\tKey of C");
		System.out.println("(d)\tKey of D");
		System.out.println("(e)\tKey of E");
		System.out.println("(f)\tKey of F");
		System.out.println("(g)\tKey of G");
		System.out.println("(h)\tKey of A Flat");
		System.out.println("(i)\tKey of B Flat");
		System.out.println("(j)\tKey of D Flat");
		System.out.println("(k)\tKey of E Flat");
		System.out.println("(l)\tKey of G Flat");
	}

	private static void displayChoiceForCircleOfFifthsOrSpecificKey() {
		System.out.println(
				"Would you like to practice the chords in the circle of Fifths or practice chords in a specific key?? ");
		System.out.println("(a) Chords from the circle of fifths>>");
		System.out.println("(b) Chords from the a specific key>>");
	}

	private static void displayOptionToReturnToMainMenu() {
		System.out.println("Push (x) to go back to the main menu ");
	}

	private static void displayScaleMenu() {
		System.out.println("Please indicate which scale you would like to play in>> ");
		System.out.println("Note: Scales can be moved up and down the fretboard ");
		System.out.println("(a)\tMajor");
		System.out.println("(b)\tBlues");
		System.out.println("(c)\tMajor Pentatonic");
		System.out.println("(d)\tMinor Pentatonic");
		System.out.println("(e)\tNatural Minor");
		System.out.println("(f)\tHarmonic Pentatonic");
		System.out.println("(g)\tMelodic Minor");
	}
}

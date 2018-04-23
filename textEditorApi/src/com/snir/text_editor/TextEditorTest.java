package com.snir.text_editor;


/**
 * TESTING CLASS
 *
 */
public class TextEditorTest {
	
	private java.util.Random rand;
	private TextEditorManager manager;
	
	public TextEditorTest()
	{
		
		rand   = new java.util.Random();
		manager = new TextEditorManager();

	}


	/**
	 * Random function tests all functions by choosing random values
	 */

	public void randomTest() {
		int randomNum;

		String letters = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < 102; i++) {
			randomNum = rand.nextInt((8 - 0) + 0) + 0;
			String output = "Random num chosen: " + randomNum;

			switch (randomNum) {
			case 0: {
				System.out.println(output + ", Add by position action");
				manager.add(letters.substring((rand.nextInt(26 - 1) + 1) +1), randomNum);
				break;
			}
			case 1: {
				System.out.println(output + ", Add action");

				manager.add(letters.substring((rand.nextInt(26 - 1) + 1) + 1));
				break;

			}
			case 2: {
				System.out.println(output + " Remove action");

				manager.remove(rand.nextInt((10 - 1) + 1) + 1, rand.nextInt((10 - 1) + 1) + 1);
				break;

			}
			case 3: {
				System.out.println(output + " Bold action");

				manager.bold(rand.nextInt((10 - 1) + 1) + 1, rand.nextInt((10 - 1) + 1) + 1);
				break;

			}
			case 4: {
				System.out.println(output + " Italic action");

				manager.italic(rand.nextInt((10 - 1) + 1) + 1, rand.nextInt((10 - 1) + 1) + 1);
				break;

			}
			case 5: {
				System.out.println(output + " Underline action");

				manager.underline(rand.nextInt((10 - 1) + 1) + 1, rand.nextInt((10 - 1) + 1) + 1);
				break;

			}
			case 6: {
				System.out.println(output + " Undo action");

				manager.undo();
				break;

			}
			case 7: {
				System.out.println(output + " Redo action");

				manager.redo();
				break;

			}
			default: {
				System.out.println(output + " Print action");

			}
			}
			manager.print();
		}

	}

}

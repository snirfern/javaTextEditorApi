package com.snir.text_editor;

import java.util.LinkedList;
import java.util.Set;

public class Text {
	private LinkedList<SpecialChar> textAsList;

	/**
	 * Constructor
	 */
	public Text() {
		textAsList = new LinkedList<SpecialChar>();
	}

	/**
	 * Add tags function
	 * 
	 * @param fromPos
	 * @param toPos
	 * @param decoration
	 * @return
	 */
	public boolean addDecoration(int fromPos, int toPos, Decoration decoration) {

		if (fromPos < 0 || fromPos > toPos) {
			System.out.println("Error : Please change to a valid from position!!");
			return false;
		}
		if (textAsList.size() <= toPos) {
			System.out.println("Error : Please change to a valid to position!!");
			return false;
		}

		for (int i = fromPos; i <= toPos; i++) {
			SpecialChar curr = textAsList.get(i);
			if (curr.getDecorationSet().contains(decoration)) {
				System.out.println("Please add decoration to a non decorated index. " + i
						+ " index is already decorated with " + decoration);
				return false;
			}
			curr.setSign(decoration);
			System.out.println("The decoration " + decoration + " was added to " + curr.getContent());
		}

		return true;
	}

	/**
	 * Remove specific link function
	 * 
	 * @param position
	 */
	public void removeNode(int position) {

		if (textAsList.size() < 0 || position >= textAsList.size()) {
			System.out.println("Wrong remove input");
			return;
		}
		textAsList.remove(position);
	}

	/**
	 * Add link function
	 * 
	 * @param charIn
	 */
	public void addNode(char charIn) {
		textAsList.add(new SpecialChar(charIn));
	}

	/**
	 * Add link by position function
	 * 
	 * @param position
	 * @param ch
	 */
	public void addNodeByPosition(int position, char ch) {

		if (position >= this.textAsList.size() || position < 0) {
			System.out.println("Wrongg position given");
			return;
		}
		textAsList.add(position, new SpecialChar(ch));
	}

	/**
	 * toStirng function override
	 */
	public String toString() {
		String toPrint = "";

		// Loop

		for (int i = 0; i < textAsList.size(); i++) {
			SpecialChar current = textAsList.get(i);
			Set<Decoration> decorationsSet = current.getDecorationSet();

			// condition : check condition for i = 0 and check if textAsList size is just one char long
			

			if (i == 0) {
				for (Decoration dec : decorationsSet) {
					toPrint += dec.beginDecoration;

				}
				if (i == textAsList.size() - 1) {
					toPrint += current.getContent();

					for (Decoration dec : decorationsSet) {
						toPrint += dec.endDecoration;
					}
					continue;
				}
			}

			// End of loop

			// condition : check if former char contains tag

			if (i - 1 >= 0) {
				SpecialChar prevChar = textAsList.get(i - 1);
				for (Decoration dec : decorationsSet) {

					if (!prevChar.getDecorationSet().contains(dec)) {
						toPrint += dec.beginDecoration;
					}
				}
			}
			toPrint += current.getContent();
			
			// condition : check if next char contains tag

			if (i + 1 < textAsList.size()) {
				SpecialChar nextChar = textAsList.get(i + 1);
				for (Decoration dec : decorationsSet) {

					if (!nextChar.getDecorationSet().contains(dec)) {
						toPrint += dec.endDecoration;

					}
				}
			}
			// condition : check if last char is end of text

						if (i == textAsList.size() - 1) {

							for (Decoration dec : decorationsSet) {
								toPrint += dec.endDecoration;
							}
							continue;
						}

		}
		return toPrint;
	}

	public LinkedList<SpecialChar> getTextAsList() {
		return textAsList;
	}
}

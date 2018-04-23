package com.snir.text_editor;

import java.util.Stack;

public class TextEditorManager {

	private Text text;
	private Stack<String> doStack;
	private Stack<String> undoStack;

	public TextEditorManager() {
		text = new Text();
		doStack = new Stack<String>();
		undoStack = new Stack<String>();

	}

	/**
	 * Add function to add string
	 * Only for the first adding 
	 * @param stringToAdd
	 */
	public void add(String stringToAdd) {

		if (stringToAdd.length() > 0) {

			char[] chars = stringToAdd.toCharArray();

			for (char ch : chars) {
				text.addNode(ch);
			}

		}

		doStack.push(text.toString());

	}

	/**
	 * Add by position function
	 * 
	 * @param stringToAdd
	 * @param position
	 */
	public void add(String stringToAdd, int position) {
		System.out.println("ass posiiton : "  +  position  + "    stringtoadd : " + stringToAdd);
		if ( position >= text.getTextAsList().size()) {
			System.out.println("Wrong position input,position dosent exist.");
			return;
		}
		int j = 0;
		for (int i = position; i < position + stringToAdd.length(); i++) {
			text.addNodeByPosition(i, stringToAdd.charAt(j));
			j++;
		}

		doStack.push(text.toString());

	}

	/**
	 * Remove function to remove string
	 * 
	 * @param fromPos
	 * @param toPos
	 */
	public void remove(int fromPos, int toPos) {
		System.out.println("from pos: " + fromPos + "toPos: " + toPos);
		if ( fromPos > toPos || text.getTextAsList().isEmpty())
		{
			System.out.println("Wrong input given.");
			return;
		}
		
		for (int i = fromPos; i <= toPos; i++) {
			text.removeNode(fromPos);
		}
		doStack.push(text.toString());

	}

	/**
	 * Bold function
	 * 
	 * @param fromPos
	 * @param toPos
	 */
	public void bold(int fromPos, int toPos) {

		text.addDecoration(fromPos, toPos, Decoration.B);
		doStack.push(text.toString());

	}

	/**
	 * Italic function
	 * 
	 * @param fromPos
	 * @param toPos
	 */
	public void italic(int fromPos, int toPos) {

		text.addDecoration(fromPos, toPos, Decoration.I);
		doStack.push(text.toString());

	}

	/**
	 * Underline function
	 * 
	 * @param fromPos
	 * @param toPos
	 */
	public void underline(int fromPos, int toPos) {

		text.addDecoration(fromPos, toPos, Decoration.U);
		doStack.push(text.toString());
	}

	/**
	 * Undo function
	 */
	public void undo() {
		if (!doStack.isEmpty()) {
			undoStack.push(doStack.pop());

		} else {
			System.out.println("The stack is empty,no actions to undo.");
		}

	}

	public void redo() {
		if (!undoStack.isEmpty()) {
			doStack.push(undoStack.pop());
		} else {
			System.out.println("The stack is empty,no actions to redo.");
		}

	}

	/**
	 * Print function
	 */
	public void print() {

		if (!doStack.isEmpty())
			System.out.println("Text editor output:\n"+doStack.peek() + "\n");
		else
			System.out.println("empty stack");
	}

	

}

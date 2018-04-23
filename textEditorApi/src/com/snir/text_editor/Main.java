package com.snir.text_editor;

public class Main {

	public static void main(String[] args) {

		// Manual test
		TextEditorManager editorManager = new TextEditorManager();
		editorManager.add("manual test");
		editorManager.bold(1, 1);
		editorManager.print();

		
		//Randomized test
		TextEditorTest test = new TextEditorTest();
		test.randomTest();

	}

}

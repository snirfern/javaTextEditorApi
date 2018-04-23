package com.snir.text_editor;

/**
 * Enum for tags
 * 
 *
 */
public enum Decoration {

	B("<b>", "</b>"), 
	I("<i>", "</i>"),
	U("<u>", "</u>");

	public String beginDecoration;
	public String endDecoration;

	private Decoration(String beginDecoration, String endDecoration) {
		this.beginDecoration = beginDecoration;
		this.endDecoration = endDecoration;

	}
}

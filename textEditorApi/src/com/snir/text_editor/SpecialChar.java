package com.snir.text_editor;

import java.util.HashSet;
import java.util.Set;

public class SpecialChar {

	private Set<Decoration> decorationsSet;
	private char content;

	public SpecialChar(char letter) {
		decorationsSet = new HashSet<>();
		this.setContent(letter);

	}

	/**
	 * Sign setter
	 * @param decoration
	 */
	public void setSign(Decoration decoration) {

		this.decorationsSet.add(decoration);

	}

	/**
	 * Set getter
	 * @return
	 */
	public Set<Decoration> getDecorationSet() {

		return decorationsSet;

	}

	/**
	 * Content getter
	 * @return
	 */
	public char getContent() {
		return content;
	}

	/**
	 * Content setter
	 * @param content
	 */
	public void setContent(char content) {
		this.content = content;
	}

}

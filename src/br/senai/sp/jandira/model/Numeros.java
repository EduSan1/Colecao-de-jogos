package br.senai.sp.jandira.model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Numeros extends PlainDocument {
	
	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		// TODO Auto-generated method stub
		super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
	}
	
}

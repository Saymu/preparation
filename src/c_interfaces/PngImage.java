package c_interfaces;

import java.awt.Color;

public class PngImage implements Image {

	private String filename;

	public PngImage(String filename) {
		this.filename = filename;
		load();
	}

	@Override
	public Color[][] getBitmap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void load() {
		System.out.println( "Imagine: PNG image loaded" );
	}

	@Override
	public void save() {
		System.out.println( "Imagine: PNG image saved" );
	}

}

package Curs10;
import java.util.ArrayList;
import Curs10.Pixel;
import Curs10.Dimensions;

public class Screen {
	private ArrayList<Pixel> pixels;
	private Dimensions dimensions;
	
	public Screen(int pixelsNo, int width, int length, int depth) {
		this.dimensions = new Dimensions(width, length, depth);
		this.pixels = new ArrayList<Pixel>(pixelsNo);
		for (int i=0; i<pixelsNo; i++) {
			this.pixels.add(new Pixel());
			}
	}
	
	public void setPixel(int index, String color) {
		this.pixels.get(index).setPixel(color);
	}
	
	public void colorScreen(String color) {
		for (int i=0; i<pixels.size(); i++) {
			this.pixels.get(i).setPixel(color);
		}
	}

}

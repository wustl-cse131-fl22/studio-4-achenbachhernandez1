package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		if (shape.equals("ellipse")) {
			Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt()); 
			boolean isFilled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			StdDraw.setPenColor(color);
			if (isFilled) {
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
				}
			else {
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			}
		
		if(shape.equals("rectangle") || shape.equals("square")) {
			Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt()); 
			boolean isFilled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble(); 
			StdDraw.setPenColor(color);
			
			if(isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight); 
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight); 
			}
			
		}
		
		if(shape.equals("triangle")) {
			Color color = new Color(in.nextInt(), in.nextInt(), in.nextInt()); 
			boolean isFilled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble(); 
			double y2 = in.nextDouble(); 
			double posx[] = {x,x1,x2}; 
			double posy[] = {y,y1,y2}; 
			
			for (int i = 0; i < posx.length; i ++) {
				System.out.println(posx[i]);
			}
			StdDraw.setPenColor(color);
			
			if(isFilled) {
				StdDraw.filledPolygon(posx, posy); 
			}
			else {
				StdDraw.polygon(posx, posy); 
			}
			
		}
		
	}
}

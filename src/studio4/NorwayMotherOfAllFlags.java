package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		
		// TODO
		StdDraw.clear(); 
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(3.667, 8, 3.667, 8);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(18.333, 8, 3.667, 8);
	}

	public static void indonesia() {
		
		// TODO
		StdDraw.clear(); 
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11, 12, 11, 4);
		
	}

	public static void netherlands() {
		
		// TODO
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11, 13.333, 11, 2.667);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 2.667, 11, 2.667);
	}

	public static void poland() {
		
		// TODO
		StdDraw.clear(); 
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11, 4, 11, 4);
	}

	public static void thailand() {
		
		// TODO
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		
		StdDraw.filledRectangle(11, 14.167, 11, 1.833);
		StdDraw.filledRectangle(11, 1.833, 11, 1.833);
		
		StdDraw.setPenColor(0, 0, 127); 
		StdDraw.filledRectangle(11, 8, 0, 0);

	}

	public static void finland() {
		
		// TODO
		StdDraw.clear();
		StdDraw.setPenColor(0, 0, 127); 
		StdDraw.filledRectangle(8.25, 8, 1.357, 8);
//		x rectangle
//		StdDraw.filledRectangle(11, 8, 11, 8);
//		y rectangle
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}

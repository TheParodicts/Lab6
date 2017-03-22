import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
		for (BouncingFigure f : figures) {
			if(f.leftBorderCollision()|| f.rightBorderCollision(600))
				f.setTrajectory(-f.getTrajectory() +180);
			
			if( f.upperBorderCollision()||f.lowerBorderCollision(620))
				f.setTrajectory(-f.getTrajectory());
			
			f.draw(g); f.move();
			// Add code here for Lab Q5
			//
		}
	}
}

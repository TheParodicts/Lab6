import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BouncingCircle extends BouncingFigure {

	private int radius;
	

	BouncingCircle(int xLeft, int yTop, int radius, double trajectory, int speed) {
		setXLeft(xLeft);
		setYTop(yTop);
		setTrajectory(trajectory);
		setSpeed(speed);
		this.radius=radius;
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D ellipse = new Ellipse2D.Double(getXLeft(),getYTop(), (double) radius, (double) radius);
		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
		g2.draw(ellipse);
	}

	@Override
	public boolean rightBorderCollision(int screenLimit) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean leftBorderCollision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean upperBorderCollision() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lowerBorderCollision(int screenLimit) {
		// TODO Auto-generated method stub
		return false;
	}

}

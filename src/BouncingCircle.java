import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BouncingCircle extends BouncingFigure {

	private int diameter;
	

	BouncingCircle(int xLeft, int yTop, int radius, double trajectory, int speed) {
		setXLeft(xLeft);
		setYTop(yTop);
		setTrajectory(trajectory);
		setSpeed(speed);
		this.diameter=radius;
	}
	
	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D ellipse = new Ellipse2D.Double(getXLeft(),getYTop(), (double) diameter, (double) diameter);
		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
		g2.draw(ellipse);
	}

	@Override
	public boolean rightBorderCollision(int screenLimit) {
		// TODO Auto-generated method stub
		if(getXLeft()+this.diameter > screenLimit)
			return true;
		return false;
	}

	@Override
	public boolean leftBorderCollision() {
		// TODO Auto-generated method stub
		if(getXLeft() < 0)
			return true;
		return false;
			}

	@Override
	public boolean upperBorderCollision() {
		// TODO Auto-generated method stub
		if(getYTop() <0)
			return true;
		return false;
	}

	@Override
	public boolean lowerBorderCollision(int screenLimit) {
		// TODO Auto-generated method stub
		if(getYTop()+this.diameter > screenLimit)
			return true;
		return false;
	}

}

interface EventListener
{
	abstract void performEvent();
}
interface MouseListener extends EventListener
{
	abstract void mouseClicked();
	abstract void mousePressed();
	abstract void mouseReleased();
	abstract void mouseMoved();
	abstract void mouseDragged();
}
interface KeyListener
{
	abstract void keyPressed();
	abstract void keyReleased();	
}
class EventDemo implements MouseListener,KeyListener
{
	public void performEvent()
	{
		System.out.println("performEvent");
	}
	public void mouseClicked()
	{
		System.out.println("mouseClicked");
	}
	public void mousePressed()
	{
		System.out.println("mousePressed");
	}
	public void mouseReleased()
	{
		System.out.println("mouseReleased");
	}
	public void mouseMoved()
	{
		System.out.println("mouseMoved");
	}
	public void mouseDragged()
	{
		System.out.println("mouseDragged");
	}
	public void keyPressed()
	{
		System.out.println("keyPressed");
	}
	public void keyReleased()
	{
		System.out.println("keyReleased");
	}
}
public class lab9_1 
{
	public static void main(String[] args) 
	{
		EventDemo ed=new EventDemo();
		ed.performEvent();
		ed.mouseClicked();
		ed.mousePressed();
		ed.mouseMoved();
		ed.mouseDragged();
		ed.keyPressed();
		ed.keyReleased();	
	}	
}
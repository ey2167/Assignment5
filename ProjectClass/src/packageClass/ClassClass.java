package packageClass;
import java.util.Scanner;
public class ClassClass {
	
	/**
	 * Elohe Yonas
	 * csc200
	 * 10-21-14
	 * 
	 * 
	 */
	// the class will hold information on the walls, floor, and windows
	String walls;
	String floor;
	String windows;
	
	// now to define the String variables into ClassClass()
	public ClassClass () 
	{
		this.walls = "yellow";
		this.floor = "wooden";
		this.windows = "one window";
}
	
	public ClassClass(String walls, String floor, String windows)
	{
		this.walls = walls;
		this.floor = floor;
		this.windows = windows;
	}
	//obtaining the wallcolor
	public String getwallcolor()
	{
		return walls;
	}
	//setting the wallcolor
	public void setwallcolor(String walls)
	{
		this.walls=walls;
	} //obtaining floortype
	public String getfloortype()
	{
		return floor;
	}//setting the floortype
	public void setfloortype(String floor)
	{
		this.floor=floor;
	}//obtaining window#
	public String getnumberofwindows()
	{
		return windows;
	}//setting the window#
	public void setnumberofwindows(String windows)
	{
		this.windows=windows;
	}
	@Override
	public String toString() 
	{
		return "ClassClass[wallcolor is" + walls + ",floortype is" + floor + ",# of windows=" + windows + "]";
	}
	
}

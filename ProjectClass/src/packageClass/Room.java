package packageClass;

/*Elohe Yonas
 * csc200
 * 10-22-14
 */
public class Room {
	public static void main(String[]args)
	{
		ClassClass a = new ClassClass();
		ClassClass c = new ClassClass();
		ClassClass b = new ClassClass("blue", "tile", "two");
		
		//using the set command for the String in ClassClass and inputting room properties
		c.setfloortype("wooden");
		c.setnumberofwindows("three");
		c.setwallcolor("purple");
		
		//printing out according to Class Variables
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}

}

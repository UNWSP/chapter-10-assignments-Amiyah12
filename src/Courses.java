


	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader:
	public class Courses
	{
	public static void main (String[] args) throws
	IOException{
		
	}
	
	BufferedReader br = new BufferedReader
	(new InputStreamReader (System.in));
	System.out.@println ("Name of department:");
	 String department = br. readLine () • toUpperCase () ;
	System.out.@println ("course number:");
	
	int number = Integer.parseInt (br.readLine () ) ;
	System.out.println ("credits");
	
	int credits = Integer.parseInt (br.readLine ()) ;
	if (department.equals ("BIB") department.equals ("COS") department.equals ("ENG") || department.equals ("PHY"))
	{
	
	BioCourse lb = new BioCourse (department,
	number, credits);

	1b.display ();
	}
	else

	CollegeCourse cg = new CollegeCourse
	(department, course number, credit);
	cg.display();
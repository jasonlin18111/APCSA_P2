//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab21i.dat"));
		while(file.hasNext()){
			int size = file.nextInt();
			file.nextLine();
			Maze myMaze = new Maze(size, file.nextLine());
			myMaze.hasExitPath(0,0);
			out.println(myMaze);
		}
	}
}
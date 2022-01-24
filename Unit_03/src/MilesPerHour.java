//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Rajdeep
//Date - 1/24/2022
//Class - AP CSA
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		calcMPH();
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = Math.round(distance/(hours + minutes/60));
	}

	public void print()
	{
		System.out.println(mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "The MPH Speed is: " + mph;
	}
}
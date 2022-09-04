// The "Advtr" class.
/*
Noah Cardoso
//find keys
//unlock gates
//some walls are false
//find magic blue cup to get out of the maze

*/

import java.awt.*;
import hsa.Console;

public class Advtr
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console (22, 92);
	//spare room

	int[] [] grid_C1_R1 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if (!(x >= 9 && x <= 13))
		    {
			grid_C1_R1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 11)
		{

		    grid_C1_R1 [x - 1] [y] = 2;

		}

		else if ((y >= 1 && y <= 10))
		{
		    if (x == 1 || x == 21)
		    {
			grid_C1_R1 [x - 1] [y] = 2;
		    }
		}


		else
		    grid_C1_R1 [x - 1] [y] = 0;
	    }
	}
	///
	///
	int[] [] grid_C2_Y1 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{

		    grid_C2_Y1 [x - 1] [y] = 2;

		}


		else if (y == 11)
		{
		    if (!(x >= 9 && x <= 13))

			grid_C2_Y1 [x - 1] [y] = 2;

		}

		else if ((y >= 1 && y <= 10))
		{
		    if (x == 21)
		    {
			grid_C2_Y1 [x - 1] [y] = 2;
		    }
		}


		else
		    grid_C2_Y1 [x - 1] [y] = 0;
	    }
	}
	///
	////
	int[] [] grid_C3 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if (!(x >= 9 && x <= 13))
			grid_C3 [x - 1] [y] = 2;

		}


		else if (y == 11)
		{
		    if (!(x >= 9 && x <= 13))

			grid_C3 [x - 1] [y] = 2;

		}

		else if ((y >= 1 && y <= 10))
		{
		    if (x == 1)
		    {
			grid_C3 [x - 1] [y] = 2;
		    }
		}


		else
		    grid_C3 [x - 1] [y] = 0;
	    }
	}
	///
	//
	int[] [] grid_G1 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 11)
		{

		    grid_G1 [x - 1] [y] = 2;

		}


		else if (y == 0)
		{
		    if (!(x >= 9 && x <= 13))

			grid_G1 [x - 1] [y] = 2;

		}




		else
		    grid_G1 [x - 1] [y] = 0;
	    }
	}
	//
	//
	int[] [] grid_G2 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 11)
		{

		    grid_G2 [x - 1] [y] = 2;

		}


		else if (y == 0)
		{
		    if (!(x >= 9 && x <= 13))

			grid_G2 [x - 1] [y] = 2;

		}
		else if ((y >= 1 && y <= 10))
		{
		    if (x == 1)
		    {
			grid_G2 [x - 1] [y] = 2;
		    }
		}



		else
		    grid_G2 [x - 1] [y] = 0;
	    }
	}
	//
	//
	int[] [] grid_Y2 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 11)
		{
		    if (!(x >= 9 && x <= 13))
		    {
			grid_Y2 [x - 1] [y] = 2;
		    }
		}


		else if (y == 0)
		{

		    grid_Y2 [x - 1] [y] = 2;

		}

		else if ((y >= 1 && y <= 10))
		{
		    if (x == 1 || x == 21)
		    {
			grid_Y2 [x - 1] [y] = 2;
		    }
		}


		else
		    grid_Y2 [x - 1] [y] = 0;
	    }
	}
	//
	//
	int[] [] grid_R6 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0 || y == 11)
		{
		    if (!(x >= 9 && x <= 13))
		    {
			grid_R6 [x - 1] [y] = 2;
		    }
		}



		else if ((y >= 1 && y <= 10))
		{
		    if (x == 1 || x == 21)
		    {
			grid_R6 [x - 1] [y] = 2;
		    }
		}


		else
		    grid_R6 [x - 1] [y] = 0;
	    }
	}
	//
	////Orange

	int[] [] grid_O1 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0 || y == 1)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 6 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 16 || x == 18 || x == 20 || x == 21)
		    {
			grid_O1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 2 || y == 3)
		{
		    if (x == 4 || x == 8 || x == 14 || x == 18 || (x >= 10 && x <= 12))
		    {
			grid_O1 [x - 1] [y] = 2;
		    }
		}

		else if (y == 4 || y == 5)
		{
		    if ((x >= 4 && x <= 8) || (x >= 14 && x <= 18) || (x >= 10 && x <= 12))
		    {
			grid_O1 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 6 && y <= 7)
		{
		    if ((x >= 10 && x <= 12))
		    {
			grid_O1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 8 || y == 9)
		{
		    if ((x >= 4 && x <= 7) || (x >= 15 && x <= 18) || (x >= 10 && x <= 12))
		    {
			grid_O1 [x - 1] [y] = 2;
		    }
		}
		else if (y == 10)
		{
		    if (x == 4 || x == 18 || (x >= 10 && x <= 12))
		    {
			grid_O1 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		    grid_O1 [x - 1] [y] = 2;

		else
		    grid_O1 [x - 1] [y] = 0;
	    }
	}

	////

	////

	int[] [] grid_O2 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 6) || x == 8 || (x >= 10 && x <= 12) || x == 14 || (x >= 16 && x <= 21))
		    {
			grid_O2 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 8 || (x >= 10 && x <= 12) || x == 14)
		    {
			grid_O2 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 2) || (x >= 6 && x <= 8) || (x >= 14 && x <= 16) || (x >= 20 && x <= 21) || (x >= 10 && x <= 12))
		    {
			grid_O2 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if ((x == 6 || x == 16))
		    {
			grid_O2 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || (x >= 8 && x <= 14) || x == 16 || (x >= 18 && x <= 21))
		    {
			grid_O2 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 4 || x == 6 || x == 8 || x == 14 || x == 16 || x == 18)
		    {
			grid_O2 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if (x == 1 || x == 2 || x == 4 || x == 6 || x == 8 || x == 10 || x == 11 || x == 12 || x == 14 || x == 16 || x == 18 || x == 20 || x == 21)
		    {
			grid_O2 [x - 1]
			    [y] = 2;
		    }
		}
		else
		    grid_O2 [x - 1] [y] = 0;
	    }
	}





	/////

	////

	int[] [] grid_O3 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_O3 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 4 || x == 18)
		    {
			grid_O3 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || (x >= 7 && x <= 15) || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_O3 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if ((x == 4 || x == 18 || (x >= 10 && x <= 12) || x == 18))
		    {
			grid_O3 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || (x >= 10 && x <= 12) || x == 16 || (x >= 18 && x <= 21))
		    {
			grid_O3 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 6 || x == 16 || (x >= 10 && x <= 12))
		    {
			grid_O3 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 1 && x <= 6) || x == 8 || (x >= 10 && x <= 12) || x == 14 || (x >= 16 && x <= 21))
		    {
			grid_O3 [x - 1] [y] = 2;
		    }
		}
		else
		    grid_O3 [x - 1] [y] = 0;
	    }
	}
	////


	//upper orange
	int[] [] grid_O4 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if (x == 1 || x == 3 || x == 5 || x == 6 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 16 || x == 17 || x == 19 | x == 21)
		    {
			grid_O4 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 3 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 19)
		    {
			grid_O4 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4 || y == 7 || y == 8 || y == 11)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_O4 [x - 1] [y] = 2;
		    }
		}

		else
		    grid_O4 [x - 1] [y] = 0;
	    }
	}


	///

	///

	int[] [] grid_O5 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 4) || (x >= 7 && x <= 15) || (x >= 18 && x <= 21))
		    {
			grid_O5 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 1 || x == 12)
		    {
			grid_O5 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 4 && x <= 12) || x == 1 || (x >= 15 && x <= 21))
		    {
			grid_O5 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if (x == 4 || x == 15)
		    {
			grid_O5 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8 || y == 11)
		{
		    if ((x >= 1 && x <= 4) || (x >= 7 && x <= 15) || (x >= 18 && x <= 21))
		    {
			grid_O5 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 1 || x == 7 || x == 11 || x == 18)
		    {
			grid_O5 [x - 1] [y] = 2;
		    }

		}

		else
		    grid_O5 [x - 1] [y] = 0;
	    }
	}

	///

	///

	int[] [] grid_O6 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{

		    grid_O6 [x - 1] [y] = 2;

		}


		else if (y == 1 || y == 2)
		{
		    if (x == 10 || x == 21)
		    {
			grid_O6 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 8) || x == 21 || (x >= 10 && x <= 19))
		    {
			grid_O6 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if (x == 8 || x == 19)
		    {
			grid_O6 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 2) || (x >= 5 && x <= 12) || (x >= 16 && x <= 21))
		    {
			grid_O6 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 10 || x == 21 || (x >= 5 && x <= 6) || (x >= 16 && x <= 17))
		    {
			grid_O6 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 5 && x <= 6) || x == 1 || x == 3 || (x >= 10 && x <= 12) || x == 8 || x == 14 || (x >= 16 && x <= 17) || x == 19 || x == 21)
		    {
			grid_O6 [x - 1] [y] = 2;
		    }
		}
		else
		    grid_O6 [x - 1] [y] = 0;
	    }
	}

	//

	//

	int[] [] grid_O7 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0 || y == 11)
		{
		    if ((x >= 1 && x <= 4) || (x >= 7 && x <= 15) || (x >= 18 && x <= 21))
		    {
			grid_O7 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 7 || x == 15)
		    {
			grid_O7 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 7) || (x >= 15 && x <= 21))
		    {
			grid_O7 [x - 1] [y] = 2;
		    }
		}




		else if (y == 7 || y == 8)
		{
		    if ((x >= 4 && x <= 18) || x == 1 || x == 21)
		    {
			grid_O7 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 4 || x == 18)
		    {
			grid_O7 [x - 1] [y] = 2;
		    }

		}

		else
		    grid_O7 [x - 1] [y] = 0;
	    }
	}
	///

	//red levels
	int[] [] grid_R2 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if (x == 1 || x == 2 || x == 8 || x == 14 || x == 20 || x == 21 || (x >= 4 && x <= 6) || (x >= 16 && x <= 18))
		    {
			grid_R2 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 1 || x == 2 || x == 8 || x == 14 || x == 20 || x == 21)
		    {
			grid_R2 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4 || y == 11)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_R2 [x - 1] [y] = 2;
		    }
		}

		else if ((y >= 5 && y <= 6) || y == 10 || y == 9)
		{
		    if (x == 4 || x == 18)
		    {
			grid_R2 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_R2 [x - 1] [y] = 2;
		    }
		}


		else
		    grid_R2 [x - 1] [y] = 0;
	    }
	}
	//
	//
	int[] [] grid_R3 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || (x >= 6 && x <= 8) || (x >= 10 && x <= 12) || (x >= 14 && x <= 16) || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_R3 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_R3 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 18 || (x >= 20 && x <= 21) || (x >= 6 && x <= 16))
		    {
			grid_R3 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if (x == 4 || x == 6 || x == 16 || x == 18)
		    {
			grid_R3 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 6) || (x >= 16 && x <= 21))
		    {
			grid_R3 [x - 1] [y] = 2;
		    }
		}

		else if (y == 11)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_R3 [x - 1] [y] = 2;
		    }
		}
		else
		    grid_R3 [x - 1] [y] = 0;
	    }
	}
	///

	///
	int[] [] grid_R4 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{

		    grid_R4 [x - 1] [y] = 2;

		}


		else if (y == 1 || y == 2)
		{
		    if ((x >= 10 && x <= 12))
		    {
			grid_R4 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 8) || (x >= 10 && x <= 12) || (x >= 14 && x <= 21))
		    {
			grid_R4 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if (x == 8 || x == 14 || (x >= 10 && x <= 12))
		    {
			grid_R4 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || (x >= 6 && x <= 16) || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_R4 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 6 || x == 16 || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_R4 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 1 && x <= 2) || x == 8 || (x >= 4 && x <= 6) || x == 14 || (x >= 16 && x <= 18) || (x >= 20 && x <= 21))
		    {
			grid_R4 [x - 1] [y] = 2;
		    }
		}
		else
		    grid_R4 [x - 1] [y] = 0;
	    }
	}
	//
	//

	int[] [] grid_R5 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{

		    grid_R5 [x - 1] [y] = 2;

		}




		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_R5 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if (x == 8 || x == 14)
		    {
			grid_R5 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 6) || x == 8 || x == 14 || (x >= 16 && x <= 21))
		    {
			grid_R5 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if ((x >= 1 && x <= 2) || x == 6 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 16 || (x >= 20 && x <= 21))
		    {
			grid_R5 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 1 && x <= 2) || x == 6 || x == 7 || x == 15 || x == 4 || x == 18 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 16 || (x >= 20 && x <= 21))
		    {
			grid_R5 [x - 1] [y] = 2;
		    }
		}
		else
		    grid_R5 [x - 1] [y] = 0;
	    }
	}

	//
	//Castle
	int[] [] grid_BL1 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || x == 8 || x == 14 || x == 16 || (x >= 18 && x <= 21))
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 1 || (x >= 4 && x <= 8) || (x >= 14 && x <= 18) || x == 21)
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 4 && x <= 18) || x == 1 || x == 21)
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if ((x >= 5 && x <= 17) || x == 1 || x == 21)
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 5 && x <= 9) || x == 1 || (x >= 13 && x <= 17) || x == 21)
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 1 || x == 21)
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_BL1 [x - 1] [y] = 2;
		    }
		}
		else
		    grid_BL1 [x - 1] [y] = 0;


	    }
	}

	//



	/////Blue
	int[] [] grid_B1 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || x == 8 || x == 14 || x == 16 || x >= 18 && x <= 21)
		    {
			grid_B1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 1 || y == 2)
		{
		    if (x == 4 || x == 8 || x == 14 || x == 18)
		    {
			grid_B1 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 3 && y <= 4)
		{
		    if (x == 1 || x == 2 || (x >= 4 && x <= 8) || (x >= 14 && x <= 18) || x == 20 || x == 21)
		    {
			grid_B1 [x - 1] [y] = 2;
		    }
		}

		else if (y >= 5 && y <= 6)
		{
		    if (x == 1 || x == 2 || x == 20 || x == 21)
		    {
			grid_B1 [x - 1] [y] = 2;
		    }
		}


		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 4) || (x >= 18 && x <= 21))
		    {
			grid_B1 [x - 1] [y] = 2;
		    }
		}
		else if (y == 9 || y == 10)
		{
		    if (x == 4 || x == 18)
		    {
			grid_B1 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		    grid_B1 [x - 1] [y] = 2;

		else
		    grid_B1 [x - 1] [y] = 0;
	    }
	}


	////


	///
	int[] [] grid_B2 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{

		    grid_B2 [x - 1] [y] = 2;

		}

		else if (y >= 3 && y <= 4)
		{
		    if ((x >= 1 && x <= 5) || (x >= 7 && x <= 15) || (x >= 17 && x <= 21))
		    {
			grid_B2 [x - 1] [y] = 2;
		    }
		}

		else if (y == 5 || y == 6)
		{
		    if ((x >= 1 && x <= 2) || (x >= 10 && x <= 12) || (x >= 20 && x <= 21))
		    {
			grid_B2 [x - 1] [y] = 2;
		    }
		}
		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 2) || (x >= 4 && x <= 8) || (x >= 10 && x <= 12) || (x >= 14 && x <= 18) || (x >= 20 && x <= 21))
		    {
			grid_B2 [x - 1] [y] = 2;
		    }

		}
		else if (y == 9 || y == 10)
		{
		    if (x == 4 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 18)
		    {
			grid_B2 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 16 || (x >= 18 && x <= 21))
		    {
			grid_B2 [x - 1] [y] = 2;
		    }

		}

		else
		    grid_B2 [x - 1] [y] = 0;

	    }
	}


	////

	/////
	int[] [] grid_B3 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || x == 8 || (x >= 10 && x <= 12) || x == 14 || x == 16 || (x >= 18 && x <= 21))
		    {
			grid_B3 [x - 1] [y] = 2;
		    }

		}

		else if (y >= 1 && y <= 2)
		{
		    if (x == 4 || x == 6 || x == 8 || x == 14 || x == 16 || x == 18)
		    {
			grid_B3 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 6 || (x >= 8 && x <= 14) || x == 16 || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_B3 [x - 1] [y] = 2;
		    }
		}
		else if (y == 5 || y == 6)
		{
		    if (x == 4 || x == 6 || x == 16 || x == 18)
		    {
			grid_B3 [x - 1] [y] = 2;
		    }

		}
		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 4) || (x >= 6 && x <= 16) || (x >= 18 && x <= 21))
		    {
			grid_B3 [x - 1] [y] = 2;
		    }

		}
		else if (y == 11)
		{
		    if ((x >= 1 && x <= 9) || x == 11 || (x >= 13 && x <= 21))
		    {
			grid_B3 [x - 1] [y] = 2;
		    }

		}

		else
		    grid_B3 [x - 1] [y] = 0;
	    }
	}


	////


	////
	int[] [] grid_B4 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || (x >= 6 && x <= 9) || (x >= 13 && x <= 16) || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_B4 [x - 1] [y] = 2;
		    }

		}

		else if (y >= 1 && y <= 2)
		{
		    if (x == 4 || x == 8 || x == 9 || x == 13 || x == 14 || x == 18)
		    {
			grid_B4 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 6) || x == 8 || x == 9 || x == 13 || x == 14 || (x >= 16 && x <= 21))
		    {
			grid_B4 [x - 1] [y] = 2;
		    }
		}
		else if (y == 5 || y == 6)
		{
		    if (x == 6 || x == 8 || x == 9 || x == 13 || x == 14 || x == 16)
		    {
			grid_B4 [x - 1] [y] = 2;
		    }

		}
		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || x == 6 || x == 8 || x == 9 || x == 13 || x == 14 || x == 16 || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_B4 [x - 1] [y] = 2;
		    }

		}

		else if (y == 9 || y == 10)
		{
		    if (x == 4 || x == 6 || x == 8 || x == 14 || x == 16 || x == 18)
		    {
			grid_B4 [x - 1] [y] = 2;
		    }

		}


		else if (y == 11)
		{
		    if ((x >= 1 && x <= 4) || x == 6 || x == 8 || x == 14 || x == 16 || (x >= 18 && x <= 21))
		    {
			grid_B4 [x - 1] [y] = 2;
		    }

		}

		else
		    grid_B4 [x - 1] [y] = 0;
	    }
	}


	/////

	/////
	int[] [] grid_B5 = new int [21] [12];
	for (int y = 0 ; y < 12 ; y++)
	{

	    for (int x = 1 ; x < 22 ; x++)
	    {
		if (y == 0)
		{
		    if ((x >= 1 && x <= 8) || (x >= 14 && x <= 21))
		    {
			grid_B5 [x - 1] [y] = 2;
		    }

		}

		else if (y >= 1 && y <= 2)
		{
		    if (x == 5 || x == 8 || x == 14 || x == 17)
		    {
			grid_B5 [x - 1] [y] = 2;
		    }
		}

		else if (y == 3 || y == 4)
		{
		    if ((x >= 1 && x <= 2) || x == 5 || x == 8 || x == 9 || x == 13 || x == 14 || x == 17 || (x >= 20 && x <= 21))
		    {
			grid_B5 [x - 1] [y] = 2;
		    }
		}
		else if (y == 5 || y == 6)
		{
		    if ((x >= 1 && x <= 2) || x == 5 || x == 17 || (x >= 20 && x <= 21))
		    {
			grid_B5 [x - 1] [y] = 2;
		    }

		}
		else if (y == 7 || y == 8)
		{
		    if ((x >= 1 && x <= 9) || (x >= 13 && x <= 21))
		    {
			grid_B5 [x - 1] [y] = 2;
		    }

		}

		else if (y == 9 || y == 10)
		{
		    if (x == 4 || x == 9 || x == 13 || x == 18)
		    {
			grid_B5 [x - 1] [y] = 2;
		    }

		}


		else if (y == 11)
		{
		    if ((x >= 1 && x <= 2) || x == 4 || (x >= 6 && x <= 9) || (x >= 13 && x <= 16) || x == 18 || (x >= 20 && x <= 21))
		    {
			grid_B5 [x - 1] [y] = 2;
		    }

		}

		else
		    grid_B5 [x - 1] [y] = 0;
	    }
	}
	//sprite(s)
	int[] [] keyW = new int [8] [3], keyY = new int [8] [3], keyB = new int [8] [3];
	for (int y = 0 ; y < 3 ; y++)
	{
	    for (int x = 0 ; x < 8 ; x++)
	    {
		if (y == 0)
		{
		    if (x >= 5 && x <= 7)
		    {
			keyW [x] [y] = 1;
			keyY [x] [y] = 1;
			keyB [x] [y] = 1;
		    }
		}
		else if (y == 1)
		{
		    if (x != 6)
		    {
			keyW [x] [y] = 1;
			keyY [x] [y] = 1;
			keyB [x] [y] = 1;
		    }
		}
		else if (y == 2)
		{
		    if (x == 2 || x == 0 || (x >= 5 && x <= 7))
		    {
			keyW [x] [y] = 1;
			keyY [x] [y] = 1;
			keyB [x] [y] = 1;
		    }
		}
		else
		{
		    keyW [x] [y] = 0;
		    keyY [x] [y] = 0;
		    keyB [x] [y] = 0;
		}
	    }
	}
	int[] [] cup = new int [8] [8];

	for (int x = 0 ; x < 8 ; x++)
	{
	    for (int y = 0 ; y < 8 ; y++)
	    {

		if (y == 0 || y == 1)
		{
		    if (x == 0 || x == 7)
			cup [x] [y] = 1;
		}
		else if (y == 2)
		{
		    if (x == 0 || x == 7 || x == 1 || x == 6)
			cup [x] [y] = 1;
		}
		else if (y == 3 || y == 7)
		{
		    if (!(x == 0 || x == 7))
			cup [x] [y] = 1;
		}
		else if (y == 4)
		{
		    if (!(x == 0 || x == 7 || x == 1 || x == 6))
			cup [x] [y] = 1;
		}
		else if (y == 5 || y == 6)
		{
		    if (x == 3 || x == 4)
			cup [x] [y] = 1;
		}
		else
		    cup [x] [y] = 0;

	    }
	}

	int[] [] gateW = new int [7] [14];
	int[] [] gateY = new int [7] [14];
	int[] [] gateB = new int [7] [14];
	for (int y = 0 ; y < 14 ; y++)
	{
	    for (int x = 0 ; x < 7 ; x++)
	    {
		if (y % 2 == 0)
		{
		    gateW [x] [y] = 1;
		    gateY [x] [y] = 1;
		    gateB [x] [y] = 1;
		}
		else if ((y + 1) % 2 == 0)
		{
		    if (x % 2 == 0)
		    {
			gateW [x] [y] = 1;
			gateY [x] [y] = 1;
			gateB [x] [y] = 1;
		    }
		}

		else
		{
		    gateW [x] [y] = 0;
		    gateY [x] [y] = 0;
		    gateB [x] [y] = 0;
		}
	    }
	}
	int[] [] snek_normal = new int [10] [25];
	for (int x = 0 ; x < 10 ; x++)
	{
	    for (int y = 0 ; y < 25 ; y++)
	    {

		if (y == 2)
		{
		    if (x == 6 || x == 7)
			snek_normal [x] [y] = 1;
		}
		else if (y == 3)
		{
		    if (x >= 5 && x <= 8)
			snek_normal [x] [y] = 1;
		}
		else if (y == 4)
		{
		    if ((x >= 1 && x <= 4) || x == 7 || x == 8)
			snek_normal [x] [y] = 1;
		}
		else if (y == 5)
		{
		    if ((x >= 1 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if (y == 6)
		{
		    if ((x >= 1 && x <= 7))
			snek_normal [x] [y] = 1;
		}
		else if (y == 7)
		{
		    if ((x >= 5 && x <= 7))
			snek_normal [x] [y] = 1;
		}
		else if (y == 8 || y == 9)
		{
		    if (x == 6)
			snek_normal [x] [y] = 1;
		}
		else if (y == 10)
		{
		    if ((x >= 4 && x <= 7))
			snek_normal [x] [y] = 1;
		}
		else if (y == 11)
		{
		    if ((x >= 4 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if (y == 12)
		{
		    if ((x >= 3 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if (y == 13)
		{
		    if ((x >= 1 && x <= 3) || (x >= 7 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if ((y >= 14 && y <= 16))
		{
		    if ((x >= 1 && x <= 2) || (x >= 7 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if (y == 17)
		{
		    if ((x >= 1 && x <= 2) || (x >= 6 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if (y == 18)
		{
		    if ((x >= 1 && x <= 8))
			snek_normal [x] [y] = 1;
		}
		else if (y == 19)
		{
		    if ((x >= 3 && x <= 6))
			snek_normal [x] [y] = 1;
		}
		else if (y == 20 || y == 21)
		{
		    if (x == 5)
			snek_normal [x] [y] = 1;
		}
		else if (y == 22)
		{
		    if (x == 1 || (x >= 5 && x <= 9))
			snek_normal [x] [y] = 1;
		}
		else if (y == 23)
		{
		    if ((x >= 1 && x <= 3) || x == 9)
			snek_normal [x] [y] = 1;
		}
		else if (y == 24)
		{
		    if ((x >= 4 && x <= 9))
			snek_normal [x] [y] = 1;
		}
		else
		    snek_normal [x] [y] = 0;

	    }
	}
	//
	int[] [] snek_angy = new int [10] [25];
	for (int x = 0 ; x < 10 ; x++)
	{
	    for (int y = 0 ; y < 25 ; y++)
	    {

		if (y == 1)
		{
		    if (x == 1)
			snek_angy [x] [y] = 1;
		}
		else if (y == 2)
		{
		    if (x == 2)
			snek_angy [x] [y] = 1;
		}
		else if (y == 3)
		{
		    if ((x >= 6 && x <= 8) || x == 3)
			snek_angy [x] [y] = 1;
		}
		else if (y == 4)
		{
		    if ((x >= 4 && x <= 9))
			snek_angy [x] [y] = 1;
		}
		else if (y == 5)
		{
		    if ((x >= 5 && x <= 6) || (x >= 8 && x <= 9))
			snek_angy [x] [y] = 1;
		}
		else if (y == 6)
		{
		    if ((x >= 5 && x <= 8))
			snek_angy [x] [y] = 1;
		}
		else if (y == 7)
		{
		    if ((x >= 4 && x <= 8))
			snek_angy [x] [y] = 1;
		}
		else if (y == 8)
		{
		    if (x == 3 || x == 7)
			snek_angy [x] [y] = 1;
		}
		else if (y == 9)
		{
		    if (x == 2 || x == 7)
			snek_angy [x] [y] = 1;
		}
		else if (y == 10)
		{
		    if (x == 1 || (x >= 6 && x <= 8))
			snek_angy [x] [y] = 1;
		}
		else if (y == 11)
		{
		    if ((x >= 5 && x <= 8))
			snek_angy [x] [y] = 1;
		}
		else if (y == 12)
		{
		    if ((x >= 4 && x <= 9))
			snek_angy [x] [y] = 1;
		}
		else if (y == 13)
		{
		    if ((x >= 3 && x <= 9))
			snek_angy [x] [y] = 1;
		}
		else if ((y >= 14 && y <= 18))
		{
		    if ((x >= 2 && x <= 9))
			snek_angy [x] [y] = 1;
		}
		else if (y == 19)
		{
		    if ((x >= 3 && x <= 8))
			snek_angy [x] [y] = 1;
		}
		else if (y == 20)
		{
		    if ((x >= 4 && x <= 7))
			snek_angy [x] [y] = 1;
		}
		else if (y == 21)
		{
		    if (x == 6)
			snek_angy [x] [y] = 1;
		}
		else if (y == 22)
		{
		    if ((x >= 1 && x <= 6))
			snek_angy [x] [y] = 1;
		}
		else if (y == 23)
		{
		    if (x == 1)
			snek_angy [x] [y] = 1;
		}
		else if (y == 24)
		{
		    if ((x >= 1 && x <= 3))
			snek_angy [x] [y] = 1;
		}
		else
		    snek_angy [x] [y] = 0;

	    }
	}





	/////
	int[] [] grid_C2 = new int [21] [12];
	int[] [] grid_Y1 = new int [21] [12];
	int[] [] grid_C1 = new int [21] [12];
	int[] [] grid_R1 = new int [21] [12];
	int[] [] grid_YL1 = new int [21] [12];
	int[] [] grid_WL1 = new int [21] [12];

	for (int y = 0 ; y < 12 ; y++)
	{
	    for (int x = 0 ; x < 21 ; x++)
	    {
		grid_C2 [x] [y] = grid_C2_Y1 [x] [y];
		grid_Y1 [x] [y] = grid_C2_Y1 [x] [y];
		grid_C1 [x] [y] = grid_C1_R1 [x] [y];
		grid_R1 [x] [y] = grid_C1_R1 [x] [y];
		grid_YL1 [x] [y] = grid_BL1 [x] [y];
		grid_WL1 [x] [y] = grid_BL1 [x] [y];
	    }
	}
	//starting screen
	c.fillRect (7, 12, 700, 500);
	//////////////////////
	delay (100);
	c.getChar ();
	c.clear ();

	///start of game
	draw_background ();
	char p1Move = ' ';
	int n = 0;

	//a-key
	grid_WL1 [10] [7] = -3;
	grid_WL1 [10] [8] = -3;
	grid_YL1 [10] [7] = -4;
	grid_YL1 [10] [8] = -4;
	grid_BL1 [10] [7] = -5;
	grid_BL1 [10] [8] = -5;

	//snek

	grid_Y2 [10] [5] = -1;

	//starts at 11,8
	char CUP = 'O';
	int Win = 0;
	int[] p1Position = {2, 10, 3, 4, 5};
	int[] OppPosition = {10, 5,0,0};
	int[] [] level = grid_C1;
	grid_Y2 [2] [2] = 3;
	grid_O1 [4] [0] = 4;
	grid_R5 [3] [9] = 5;
	//FakeWall
	grid_R4 [4] [3] = 0;
	grid_R4 [4] [4] = 0;
	grid_B5 [6] [7] = 0;
	grid_B5 [6] [8] = 0;
	grid_B5 [7] [7] = 0;
	grid_B5 [7] [8] = 0;
	grid_O5 [8] [7] = 0;
	grid_O5 [8] [8] = 0;
	grid_O5 [9] [7] = 0;
	grid_O5 [9] [8] = 0;
	

	for (int numTurn = 0 ; numTurn < 1000000 ; numTurn++)
	{
	    int[] [] level_copy = new int [21] [12];
	    for (int y = 0 ; y < 12 ; y++)
	    {
		for (int x = 0 ; x < 21 ; x++)
		{
		    level_copy [x] [y] = level [x] [y];
		}
	    }
	    if (level == grid_R1 || level == grid_R2 || level == grid_R3 || level == grid_R4 || level == grid_R5 || level == grid_R6)
		n = 1;
	    else if (level == grid_C1 || level == grid_C2 || level == grid_C3)
		n = 2;
	    else if (level == grid_B1 || level == grid_B2 || level == grid_B3 || level == grid_B4 || level == grid_B5)
		n = 3;
	    else if (level == grid_O1 || level == grid_O2 || level == grid_O3 || level == grid_O4 || level == grid_O5 || level == grid_O6 || level == grid_O7)
		n = 4;
	    else if (level == grid_WL1)
		n = 6;
	    else if (level == grid_YL1 || level == grid_Y1 || level == grid_Y2)
		n = 7;
	    else if (level == grid_G1 || level == grid_G2)
		n = 8;
	    else if (level == grid_BL1)
		n = 9;
	    //draw_background ();
	    int ctr = 0;
	    int speed = 6;
	    while (true)
	    {
		ctr++;
		if (c.isCharAvail ()) //If a char is in the buffer break
		{
		    p1Move = c.getChar ();
		    p1Position = setMove (level, p1Move, p1Position, n, grid_WL1, grid_YL1, grid_BL1);
		    if (level == grid_Y2)
			OppPosition = setOppMove (level, p1Position, OppPosition, numTurn, n);

		    //delay(75);
		    break;
		}
		else
		{

		    delay (25);
		   if (level == grid_Y2)
		    {
			if (ctr % speed == 0)
			    OppPosition = setOppMove (grid_Y2, p1Position, OppPosition, numTurn, n);
		    }
		    draw_level (level, n, keyW, keyY, keyB, p1Position, gateW, gateY, gateB);
		    delay (125);
		    if (level == grid_Y2)
		   {
			if (((OppPosition [0] - 3) <= p1Position [0] && p1Position [0] <= (OppPosition [0] + 3)) && ((OppPosition [1] - 3) <= p1Position [1] && p1Position [1] <= (OppPosition [1] + 3)))
			{
			    speed = 5;
			    draw_Opp (grid_Y2, OppPosition, OppPosition [2], OppPosition [3], snek_angy);
			}

			else
			    draw_Opp (grid_Y2, OppPosition, OppPosition [2], OppPosition [3], snek_normal);
		   }
		    if (level == grid_O5)
		    {
			draw_item (cup);

		    }
		    if (level == grid_R4 || level == grid_O5 || level == grid_B5)
			draw_FakeWall (level, grid_R4, grid_O5, grid_B5, 0);

		}
	    }
	    if (level_copy != level)
	    {
		for (int y = 0 ; y < 12 ; y++)
		{
		    for (int x = 0 ; x < 21 ; x++)
		    {
			if (level_copy [x] [y] == 2 && level [x] [y] != 2)
			    level [x] [y] = 2;
		    }
		}
	    }
	    draw_level (level, n, keyW, keyY, keyB, p1Position, gateW, gateY, gateB);
	    if (level == grid_Y2)
	    {
		if (((OppPosition [0] - 3) <= p1Position [0] && p1Position [0] <= (OppPosition [0] + 3)) && ((OppPosition [1] - 3) <= p1Position [1] && p1Position [1] <= (OppPosition [1] + 3)))
		    draw_Opp (level, OppPosition, OppPosition [2], OppPosition [3], snek_angy);
		else
		    draw_Opp (level, OppPosition, OppPosition [2], OppPosition [3], snek_normal);
	    }
	    
	    if (p1Position [0] == 0 || p1Position [0] == 20 || p1Position [1] == 0 || p1Position [1] == 11)
		level = tp (level, p1Position, grid_B1, grid_B2, grid_B3, grid_B4, grid_B5, grid_O1, grid_O2, grid_O3, grid_O4, grid_O5, grid_O6, grid_O7,
			grid_R1, grid_R2, grid_R3, grid_R4, grid_R5, grid_R6, grid_C1, grid_C2, grid_C3, grid_Y1, grid_Y2, grid_G1, grid_G2, grid_BL1,
			grid_YL1, grid_WL1);

	    if (level == grid_O5 && p1Position [0] == 8 && p1Position [1] == 9 && CUP == 'O')
	    {
		Win++;
		CUP = 'N';
	    }
	    if (Win == 1)
		break;

	}
    } // main method


    public static int[] setOppMove (int[] [] level, int[] p1Position, int[] position, int n, int colour)
    {
	int x = 0, y = 0;
	if (n % 2 == 0)
	{
	    if (p1Position [0] > position [0])
		x++;
	    else if (p1Position [0] < position [0])
		x--;
	}
	else
	{
	    if (p1Position [1] > position [1])
		y++;
	    else if (p1Position [1] < position [1])
		y--;

	}

       
	if (((position [0] + x - 1) >= 0 && (position [0] + x + 1) <= 20) && ((position [1] + y - 1) >= 0 && (position [1] + y + 1) <= 11))
	{


	    level [position [0]] [position [1] - 1] = 0;
	    level [position [0]] [position [1]] = 0;
	    level [position [0]] [position [1] + 1] = 0;


	    level [position [0] + x] [position [1] - 1 + y] = -1;
	    level [position [0] + x] [position [1] + y] = -1;
	    level [position [0] + x] [position [1] + 1 + y] = -1;
	    position [0] += x;
	    position [1] += y;
	    position [2] = x;
	    position [3] = y;

	}
	return (position);
    }


    public static void draw_Opp (int[] [] grid, int[] position, int x, int y, int[] [] snek)
    {

	int w = 34, h = 35, shiftx = 7, shifty = 12;


	c.setColor (Color.lightGray);
	c.fillRect ((position [0] - 1 - x) * w + shiftx, (position [1] - 2 - y) * h + shifty, w * 3, h * 5);

	c.setColor (Color.yellow);
	for (int y0 = 0 ; y0 < 25 ; y0++)
	{
	    for (int x0 = 0 ; x0 < 10 ; x0++)
	    {
		if (snek [x0] [y0] == 1)
		    c.fillRect (((position [0]) * (w) + shiftx) + x0 * 5, ((position [1] - 1) * (h) + shifty) + y0 * 5, (w / 6), (h / 6));
	    }
	}






    }


    public static void draw_FakeWall (int[] [] level, int[] [] grid_R3, int[] [] grid_O5, int[] [] grid_B5, int n)
    {


	if (n == 1)

	    {
		c.setColor (Color.lightGray);
		if (level == grid_R3)
		{

		    c.fillRect (34 * 4 + 7, 35 * 3 + 12, 34, 35 * 2);
		}
		else if (level == grid_B5)
		{

		    c.fillRect (34 * 6 + 7, 35 * 7 + 12, 34 * 2, 35 * 2);
		}
		else if (level == grid_O5)
		{

		    c.fillRect (34 * 8 + 7, 35 * 7 + 12, 34 * 2, 35 * 2);
		}
	    }


	else if (n == 0)
	{
	    if (level == grid_R3)
	    {
		c.setColor (Color.red);
		c.fillRect (34 * 4 + 7, 35 * 3 + 12, 34, 35 * 2);
	    }
	    else if (level == grid_B5)
	    {
		c.setColor (Color.blue);
		c.fillRect (34 * 6 + 7, 35 * 7 + 12, 34 * 2, 35 * 2);
	    }
	    else if (level == grid_O5)
	    {
		c.setColor (Color.orange);
		c.fillRect (34 * 8 + 7, 35 * 7 + 12, 34 * 2, 35 * 2);
	    }
	}
    }


    public static void draw_item (int[] [] cup)
    {
	c.setColor (Color.blue);
	for (int x0 = 0 ; x0 < 8 ; x0++)
	{
	    for (int y0 = 0 ; y0 < 8 ; y0++)
	    {

		if (cup [x0] [y0] == 1)
		    c.fillRect (x0 * 34 / 8 + 270 + 7, y0 * 35 / 8 + 320 + 12, 34 / 6, 35 / 6);
	    }
	}
    }


    public static void colourlevel (int n)
    {

	if (n == 1)
	    c.setColor (Color.red);

	else if (n == 2)
	    c.setColor (Color.cyan);

	else if (n == 3)
	    c.setColor (Color.blue);

	else if (n == 4)
	    c.setColor (Color.orange);


	else if (n == 6)
	    c.setColor (Color.white);

	else if (n == 7)
	    c.setColor (Color.yellow);

	else if (n == 8)
	    c.setColor (Color.green);
	else if (n == 9)
	    c.setColor (Color.black);


    }


    public static int[] setMove (int[] [] grid, char move, int[] position, int n, int[] [] grid_WL1, int[] [] grid_YL1, int[] [] grid_BL1)
    {
	int x = 0, y = 0;
	if (move == 'w')
	    y = -1;
	else if (move == 'a')
	    x = -1;
	else if (move == 's')
	    y = 1;
	else if (move == 'd')
	    x = 1;

	if ((0 <= position [0] + x && position [0] + x <= 20) && (0 <= (position [1] + y) && (position [1] + y) <= 11))
	{

	    if (grid [position [0] + x] [position [1] + y] == 0 || grid [position [0] + x] [position [1] + y] == 10 || grid [position [0] + x] [position [1] + y] == 3 || grid [position [0] + x] [position [1] + y] == 4 || grid [position [0] + x] [position [1] + y] == 5 ||
		    grid [position [0] + x] [position [1] + y] == -3 || grid [position [0] + x] [position [1] + y] == -4 || grid [position [0] + x] [position [1] + y] == -5)
	    {
		if ((0 <= position [0] && position [0] <= 20) && (0 <= (position [1]) && (position [1]) <= 11))
		{
		    if (grid [position [0] + x] [position [1] + y] == 3 && position [2] == 3)
		    {
			position [2] = 1;
			grid [position [0] + x] [position [1] + y] = 0;
		    }
		    if (grid [position [0] + x] [position [1] + y] == 4 && position [3] == 4)
		    {
			position [3] = 1;
			grid [position [0] + x] [position [1] + y] = 0;
		    }
		    if (grid [position [0] + x] [position [1] + y] == 5 && position [4] == 5)
		    {
			position [4] = 1;
			grid [position [0] + x] [position [1] + y] = 0;
		    }

		    //

		    if ((0 <= position [0] + x && position [0] + x <= 20) && (0 <= (position [1] + y) && (position [1] + y) <= 11))
		    {

			if ((grid [position [0] + x] [position [1] + y] == -3 && position [2] == 1) ||
				(grid [position [0] + x] [position [1] + y] == -4 && position [3] == 1) ||
				(grid [position [0] + x] [position [1] + y] == -5 && position [4] == 1))
			{

			    c.setColor (Color.lightGray);
			    c.fillRect (position [0] * 34 + 7, position [1] * 35 + 12, 34, 35);
			    grid [position [0]] [position [1]] = 0;
			    grid [10] [1] = 1;
			    position [0] = 10;
			    position [1] = 1;


			}



			if (grid [position [0] + x] [position [1] + y] == 0)
			{
			    grid [position [0]] [position [1]] = 0;
			    grid [position [0] + x] [position [1] + y] = 1;
			    position [0] += x;
			    position [1] += y;
			    draw_p1 (grid, position, x, y, n);

			}

			if ((position [4] == 1 && (position [0] >= 9 && position [0] <= 12) && position [1] == 1) ||
				(position [3] == 1 && (position [0] >= 9 && position [0] <= 12) && position [1] == 1) ||
				(position [2] == 1 && (position [0] >= 9 && position [0] <= 12) && position [1] == 1))
			{
			    if (grid == grid_BL1 || grid == grid_YL1 || grid == grid_WL1)
			    {
				c.setColor (Color.lightGray);
				c.fillRect (position [0] * 34, position [1] * 35, 34, 35);
				grid [position [0]] [position [1]] = 0;

				grid [10] [9] = 1;
				position [0] = 10;
				position [1] = 9;

			    }
			}


		    }






		}
	    }
	}



	return (position);
    }


    public static void draw_background ()
    {
	c.setColor (Color.black);
	c.fillRect (1, 1, 900, 650);
	int w = 34, h = 35, shiftx = 7, shifty = 12;
	c.setColor (Color.lightGray);
	c.fillRect (shiftx, shifty, 21 * w, 12 * h);

    }


    public static void draw_p1 (int[] [] grid, int[] position, int x, int y, int n)
    {

	int w = 34, h = 35, shiftx = 7, shifty = 12;
	colourlevel (n);
	c.fillRect (position [0] * w + shiftx, position [1] * h + shifty, w, h);
	c.setColor (Color.lightGray);
	c.fillRect ((position [0] - x) * w + shiftx, (position [1] - y) * h + shifty, w, h);
    }


    public static void draw_level (int[] [] grid, int n, int[] [] keyW, int[] [] keyY, int[] [] keyB, int[] p1Position, int[] [] gateW, int[] [] gateY, int[] [] gateB)
    {
	colourlevel (n);
	int w = 34, h = 35, shiftx = 7, shifty = 12;

	for (int x = 0 ; x < 21 ; x++)
	{

	    for (int y = 0 ; y < 12 ; y++)
	    {

		if (grid [x] [y] == 2)
		{
		    colourlevel (n);
		    c.fillRect (x * w + shiftx, y * h + shifty, w, h);

		}


		if (grid [x] [y] == p1Position [2])
		{

		    c.setColor (Color.white);
		    for (int x0 = 0 ; x0 < 8 ; x0++)
		    {
			for (int y0 = 0 ; y0 < 3 ; y0++)
			{

			    if (keyW [x0] [y0] == 1)
				c.fillRect ((x * w + shiftx) + x0 * w / 8, (y * h + shifty + 10) + y0 * h / 8, w / 6, h / 6);
			}
		    }

		}
		if (grid [x] [y] == p1Position [3])
		{


		    c.setColor (Color.yellow);
		    for (int x0 = 0 ; x0 < 8 ; x0++)
		    {
			for (int y0 = 0 ; y0 < 3 ; y0++)
			{

			    if (keyY [x0] [y0] == 1)
				c.fillRect ((x * w + shiftx) + x0 * w / 8, (y * h + shifty + 10) + y0 * h / 8, w / 6, h / 6);
			}
		    }

		}
		if (grid [x] [y] == p1Position [4])
		{

		    c.setColor (Color.black);
		    for (int x0 = 0 ; x0 < 8 ; x0++)
		    {
			for (int y0 = 0 ; y0 < 3 ; y0++)
			{

			    if (keyB [x0] [y0] == 1)
				c.fillRect ((x * w + shiftx) + x0 * w / 8, (y * h + shifty + 10) + y0 * h / 8, w / 6, h / 6);
			}
		    }

		}
		//gates
		if ((grid [x] [y] == -3 && grid [x] [y + 1] == -3) && p1Position [2] == 3)
		{
		    c.setColor (Color.black);
		    for (int x0 = 0 ; x0 < 7 ; x0++)
		    {
			for (int y0 = 0 ; y0 < 14 ; y0++)
			{

			    if (gateW [x0] [y0] == 1)
				c.fillRect (x0 * 34 / 7 + 340 + 7, y0 * 35 / 7 + 245 + 12, 34 / 5, 35 / 5);
			}
		    }
		}
		if ((grid [x] [y] == -4 && grid [x] [y + 1] == -4) && p1Position [3] == 4)
		{
		    c.setColor (Color.black);
		    for (int x0 = 0 ; x0 < 7 ; x0++)
		    {
			for (int y0 = 0 ; y0 < 14 ; y0++)
			{

			    if (gateY [x0] [y0] == 1)
				c.fillRect (x0 * 34 / 7 + 340 + 7, y0 * 35 / 7 + 245 + 12, 34 / 5, 35 / 5);
			}
		    }
		}
		if ((grid [x] [y] == -5 && grid [x] [y + 1] == -5) && p1Position [4] == 5)
		{
		    c.setColor (Color.black);
		    for (int x0 = 0 ; x0 < 7 ; x0++)
		    {
			for (int y0 = 0 ; y0 < 14 ; y0++)
			{

			    if (gateB [x0] [y0] == 1)
				c.fillRect (x0 * 34 / 7 + 340 + 7, y0 * 35 / 7 + 245 + 12, 34 / 5, 35 / 5);
			}
		    }
		}
	    }

	}
    }


    public static int[] [] tp (int[] [] level, int[] p1Position, int[] [] grid_B1, int[] [] grid_B2, int[] [] grid_B3, int[] [] grid_B4, int[] [] grid_B5, int[] [] grid_O1,
	    int[] [] grid_O2, int[] [] grid_O3, int[] [] grid_O4, int[] [] grid_O5, int[] [] grid_O6, int[] [] grid_O7, int[] [] grid_R1, int[] [] grid_R2, int[] [] grid_R3, int[] [] grid_R4, int[] [] grid_R5
	    , int[] [] grid_R6, int[] [] grid_C1, int[] [] grid_C2, int[] [] grid_C3, int[] [] grid_Y1, int[] [] grid_Y2, int[] [] grid_G1, int[] [] grid_G2, int[] [] grid_BL1, int[] [] grid_YL1, int[] [] grid_WL1)
    {
	level [p1Position [0]] [p1Position [1]] = 0;
	if (level == grid_WL1)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_R2;
		p1Position [1] = 11;

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_C3;
		p1Position [1] = 0;

	    }

	}





	else if (level == grid_C1)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_C3;
		p1Position [1] = 11;

	    }
	}


	else if (level == grid_C3)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_WL1;
		p1Position [1] = 11;

	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] >= 0 && p1Position [1] <= 11))
	    {
		level = grid_O1;
		p1Position [0] = 0;
	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_C1;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_R1)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_C2;
		p1Position [1] = 11;

	    }
	}


	else if (level == grid_C2)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_R1;
		p1Position [1] = 0;

	    }
	    else if (p1Position [0] == 0 && ((p1Position [1] >= 0 && p1Position [1] <= 11)))
	    {
		level = grid_O1;
		p1Position [0] = 20;
	    }
	}


	else if (level == grid_Y1)
	{

	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_O3;
		p1Position [1] = 0;

	    }
	    else if (p1Position [0] == 0)
	    {
		level = grid_G1;
		p1Position [0] = 20;
	    }
	}


	else if (level == grid_G1)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_YL1;
		p1Position [1] = 11;

	    }
	    else if (p1Position [0] == 0)
	    {
		level = grid_G2;
		p1Position [0] = 20;
	    }
	    else if (p1Position [0] == 20)
	    {
		level = grid_Y1;
		p1Position [0] = 0;
	    }
	}


	else if (level == grid_G2)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_B3;
		p1Position [1] = 11;

	    }
	    else if (p1Position [0] == 20)
	    {
		level = grid_G1;
		p1Position [0] = 20;
	    }

	}


	else if (level == grid_YL1)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_Y2;
		p1Position [1] = 11;

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_G1;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_Y2)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_YL1;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_BL1)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_R6;
		p1Position [1] = 11;

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_B5;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_R6)
	{
	    if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_O4;
		p1Position [1] = 11;

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_BL1;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_B1)
	{
	    if (p1Position [1] == 0 && (p1Position [0] == 4 || p1Position [0] == 6 || (p1Position [0] >= 8 && p1Position [0] <= 12) || p1Position [0] == 14 || p1Position [0] == 16))
	    {
		level = grid_B4;
		p1Position [1] = 11;
		draw_background ();
	    }
	    else if (((0 == p1Position [0]) && (1 <= p1Position [1] && p1Position [1] <= 2)) || ((9 <= p1Position [1] && p1Position [1] <= 10) && p1Position [0] == 0))
	    {
		level = grid_B2;
		p1Position [0] = 20;
		draw_background ();

	    }
	    else if (((20 == p1Position [0]) && (1 <= p1Position [1] && p1Position [1] <= 2)) || ((20 == p1Position [0]) && (9 <= p1Position [1] && p1Position [1] <= 10)))
	    {
		level = grid_B5;
		p1Position [0] = 0;


	    }





	}


	else if (level == grid_B2)
	{
	    if (((9 == p1Position [1] || p1Position [1] == 10) && p1Position [0] == 0) || ((0 == p1Position [0]) && (1 <= p1Position [1] && p1Position [1] <= 2)))
	    {
		level = grid_B5;
		p1Position [0] = 20;

	    }



	    else if (((20 == p1Position [0]) && (9 <= p1Position [1] && p1Position [1] <= 10)) || ((20 == p1Position [0]) && (1 <= p1Position [1] && p1Position [1] <= 2)))
	    {
		level = grid_B1;
		p1Position [0] = 0;


	    }


	    else if ((4 == p1Position [0] || 6 == p1Position [0] || 5 == p1Position [0] || 8 == p1Position [0] || 12 == p1Position [0] || 14 == p1Position [0] || 16 == p1Position [0]) && p1Position [1] == 11)
	    {
		level = grid_B3;
		p1Position [1] = 0;
		draw_background ();
	    }
	}


	else if (level == grid_B3)
	{
	    if (p1Position [0] == 0 && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {

		level = grid_B4;
		p1Position [0] = 20;
		draw_background ();

	    }
	    else if (p1Position [0] == 20 && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {

		level = grid_B4;
		p1Position [0] = 0;
		draw_background ();

	    }
	    else if (p1Position [1] == 0 && (p1Position [0] == 4 || p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14 || p1Position [0] == 16))
	    {

		level = grid_B2;
		p1Position [1] = 11;
		draw_background ();

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_G2;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_B4)
	{

	    if (p1Position [0] == 0 && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {

		level = grid_B3;
		p1Position [0] = 20;


	    }
	    else if (p1Position [0] == 20 && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {

		level = grid_B3;
		p1Position [0] = 0;


	    }
	    else if (p1Position [1] == 11 && (p1Position [0] == 4 || p1Position [0] == 6 || (p1Position [0] >= 8 && p1Position [0] <= 12) || p1Position [0] == 14 || p1Position [0] == 16))
	    {
		level = grid_B1;
		p1Position [1] = 0;

	    }
	    else if (p1Position [1] == 0 && (p1Position [0] == 4 || p1Position [0] == 2 || (p1Position [0] >= 9 && p1Position [0] <= 11) || p1Position [0] == 16 || p1Position [0] == 18))
	    {
		level = grid_B5;
		p1Position [1] = 11;

	    }
	}


	else if (level == grid_B5)
	{
	    if (((1 == p1Position [1] || p1Position [1] == 2) && p1Position [0] == 0) || ((9 == p1Position [1] || p1Position [1] == 10) && p1Position [0] == 0))
	    {
		level = grid_B1;
		p1Position [0] = 20;

	    }

	    else if (((20 == p1Position [0]) && (1 <= p1Position [1] && p1Position [1] <= 2)) || ((20 == p1Position [0]) && (9 <= p1Position [1] && p1Position [1] <= 10)))
	    {
		level = grid_B2;
		p1Position [0] = 0;


	    }

	    else if ((11 == p1Position [1]) && (2 == p1Position [0] || 4 == p1Position [0] || (9 <= p1Position [0] && p1Position [0] <= 11) || 16 == p1Position [0] || 18 == p1Position [0]))
	    {
		level = grid_B4;
		p1Position [1] = 0;

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_BL1;
		p1Position [1] = 11;

	    }
	}


	///Orange u glad im done with blue?
	//lower orange
	else if (level == grid_O1)
	{
	    if ((p1Position [0] == 2 || p1Position [0] == 4 || p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14 || p1Position [0] == 16 || p1Position [0] == 18) && (p1Position [1] == 0))
	    {
		level = grid_O2;
		p1Position [1] = 11;
	    }
	    else if (p1Position [0] == 0)
	    {
		level = grid_C3;
		p1Position [0] = 20;
	    }
	    else if (p1Position [0] == 20)
	    {
		level = grid_C2;
		p1Position [0] = 0;
	    }
	    /*
	    else if ((p1Position [0] == ) && (p1Position [1] == ))
	    {

	    }*/
	}


	else if (level == grid_O2)
	{
	    if ((p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14) && (p1Position [1] == 0))
	    {
		level = grid_O3;
		p1Position [1] = 11;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O3;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O3;
		p1Position [0] = 0;

	    }
	    else if ((p1Position [0] == 2 || p1Position [0] == 4 || p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14 || p1Position [0] == 16 || p1Position [0] == 18) && (p1Position [1] == 11))
	    {
		level = grid_O1;
		p1Position [1] = 0;
	    }
	}


	else if (level == grid_O3)
	{
	    if ((p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14) && (p1Position [1] == 11))
	    {
		level = grid_O2;
		p1Position [1] = 0;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O2;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O2;
		p1Position [0] = 0;

	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 0))
	    {
		level = grid_Y1;
		p1Position [1] = 11;

	    }
	}


	else if (level == grid_O4)
	{
	    if ((p1Position [0] == 1 || p1Position [0] == 3 || p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14 || p1Position [0] == 17 || p1Position [0] == 19) && (p1Position [1] == 0))
	    {
		level = grid_O6;
		p1Position [1] = 11;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O5;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O7;
		p1Position [0] = 0;
	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_R6;
		p1Position [1] = 0;

	    }
	}


	else if (level == grid_O5)
	{
	    if ((p1Position [0] == 4 || p1Position [0] == 5 || p1Position [0] == 15 || p1Position [0] == 16) && (p1Position [1] == 0))
	    {
		level = grid_O7;
		p1Position [1] = 11;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 5 || p1Position [1] == 6))
	    {
		level = grid_O6;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 4 || p1Position [0] == 5 || p1Position [0] == 15 || p1Position [0] == 16) && (p1Position [1] == 11))
	    {
		level = grid_O7;
		p1Position [1] = 0;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O4;
		p1Position [0] = 0;
	    }
	}


	else if (level == grid_O6)
	{
	    if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O7;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 1 || p1Position [0] == 3 || p1Position [0] == 6 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 14 || p1Position [0] == 17 || p1Position [0] == 19) && (p1Position [1] == 11))
	    {
		level = grid_O4;
		p1Position [1] = 0;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 5 || p1Position [1] == 6))
	    {
		level = grid_O5;
		p1Position [0] = 0;
	    }
	}


	else if (level == grid_O7)
	{
	    if ((p1Position [0] == 4 || p1Position [0] == 5 || p1Position [0] == 15 || p1Position [0] == 16) && (p1Position [1] == 0))
	    {
		level = grid_O5;
		p1Position [1] = 11;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O4;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 4 || p1Position [0] == 5 || p1Position [0] == 15 || p1Position [0] == 16) && (p1Position [1] == 11))
	    {
		level = grid_O5;
		p1Position [1] = 0;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_O6;
		p1Position [0] = 0;
	    }
	}


	//red levels
	else if (level == grid_R2)
	{
	    if ((p1Position [0] == 2 || p1Position [0] == 6 || (p1Position [0] >= 8 && p1Position [0] <= 12) || p1Position [0] == 14 || p1Position [0] == 18) && (p1Position [1] == 0))
	    {
		level = grid_R4;
		p1Position [1] = 11;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_R3;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_R3;
		p1Position [0] = 0;
	    }
	    else if ((p1Position [0] >= 8 && p1Position [0] <= 12) && (p1Position [1] == 11))
	    {
		level = grid_WL1;
		p1Position [1] = 0;

	    }

	}


	else if (level == grid_R3)
	{
	    if ((p1Position [0] == 2 || p1Position [0] == 4 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 16 || p1Position [0] == 18) && (p1Position [1] == 0))
	    {
		level = grid_R5;
		p1Position [1] = 11;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_R2;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 5 || p1Position [1] == 6 || p1Position [1] == 9 || p1Position [1] == 10))
	    {
		level = grid_R2;
		p1Position [0] = 0;
	    }

	}


	else if (level == grid_R4)
	{
	    if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6))
	    {
		level = grid_R5;
		p1Position [0] = 20;
	    }
	    else if ((p1Position [0] == 2 || p1Position [0] == 6 || (p1Position [0] >= 8 && p1Position [0] <= 12) || p1Position [0] == 14 || p1Position [0] == 18) && (p1Position [1] == 11))
	    {
		level = grid_R2;
		p1Position [1] = 0;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6))
	    {
		level = grid_R5;
		p1Position [0] = 0;
	    }
	}


	else if (level == grid_R5)
	{
	    if ((p1Position [0] == 2 || p1Position [0] == 4 || p1Position [0] == 8 || p1Position [0] == 12 || p1Position [0] == 16 || p1Position [0] == 18) && (p1Position [1] == 11))
	    {
		level = grid_R3;
		p1Position [1] = 0;
	    }
	    else if ((p1Position [0] == 20) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6))
	    {
		level = grid_R4;
		p1Position [0] = 0;
	    }
	    else if ((p1Position [0] == 0) && (p1Position [1] == 1 || p1Position [1] == 2 || p1Position [1] == 5 || p1Position [1] == 6))
	    {
		level = grid_R4;
		p1Position [0] = 20;
	    }
	}


	draw_background ();
	return level;
    }



    public static void delay (int millisecs)  // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}


	catch (InterruptedException e)
	{
	}
    }
} // Advtr class



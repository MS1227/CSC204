
public class Matrix 
{
	
private int rows;
private int columns;
private int top, bottom, left, right, diagonal1, diagonal2;
private int [][] square;

Matrix()
{
	rows = 3;
	columns = 3;
	square = new int [rows][columns];
	
}
Matrix(int a, int b)
{
	rows = a;
	columns = b;
	square = new int [rows][columns];
}

public int size()
{
	return square.length;
}
public void add(int c, int d, int val)
{
	square[c][d] = val;
}
public int getVal(int c, int d)
{
	return square[c][d];
}

public void isMagicSquare()
{
	top = 0;
	for(int r = 0, c =0; c<square.length; c++)
	{
		
		top += square[r][c] ;
		
	}
	bottom = 0;
	for(int r = rows-1, c = 0; c<square.length; c++)
	{
		
		bottom += square[r][c];
	}
	left = 0;
	for(int r = 0, c = 0; r<square.length; r++)
	{
		left += square[r][c];
	}
	right = 0;
	for(int r = 0, c = columns-1; r<square.length; r++)
	{
		right += square[r][c];
	}
	diagonal1 = 0;
	for(int r = 0, c = 0; r<square.length && c<square.length; r++, c++)
	{
		diagonal1 += square[r][c];
	}
	diagonal2 = 0;
	for(int r = 0, c = columns-1; r<square.length && c>=0; r++, c--)
	{
		diagonal2 += square[r][c];
	}
	if(top == 15 && bottom == top && top == left && top == right && top == diagonal1 && top == diagonal2)
	{
		System.out.println("This is a magic square!!!");
	}
	else
	{
		System.out.println("This is not a magic square :(");
	}
	
}

}

import java.util.*;
import java.util.ArrayList;
 
public class BoundedGrid implements Grid
{
    private String[][] board;
 
    //----------------------------------------------------------------------------
    public BoundedGrid(int size)
    {
        //your code here
        board=new String[size][size];
    }
    //----------------------------------------------------------------------------
    //Precondition:
    //Postcondition: Returns the number of rows in this grid.
    public int getNumRows()
    {
        //your code here
        return(board.length);
    }
 
    //----------------------------------------------------------------------------
    //Precondition:
    //Postcondition: Returns the number of columns in this grid.
    public int getNumCols()
    {
        //your code here
        return(board[0].length);
    }
 
    //----------------------------------------------------------------------------
    //Precondition:  loc is not null
    //Postcondition: Returns true if loc is valid in this grid, false otherwise
    public boolean isValid(Location loc)//0,0 is true
    {
        //your code here
        if(loc.getRow()<board.length && loc.getCol()<board[0].length && loc.getRow()>=0 && loc.getCol()>=0)
            return(true);
        return(false);
         
    }
    //----------------------------------------------------------------------------
    //Precondition:  (1) loc is valid in this grid
    //               (2) theColor is not null
    //Postcondition:  Puts the String object at loc.
    //                Returns the object previously at that location.
    public String put(Location loc, String theColor)
    {
        //your code here
        String temp=board[loc.getRow()][loc.getCol()];
        board[loc.getRow()][loc.getCol()]=theColor;
        return(temp);
    }
    //----------------------------------------------------------------------------
    //Precondition:  (1) loc is valid in this grid
    //Postcondition: Removes the object at loc.
    //               returns the object that was removed or null if the location is unoccupied
    public String remove(Location loc)
    {
        //your code here
        String send=board[loc.getRow()][loc.getCol()];
        board[loc.getRow()][loc.getCol()]=null;
        return(send);
    }
 
    //----------------------------------------------------------------------------
    //Precondition:  loc is valid in this grid
    //Postcondition: Returns the String at loc or null if the location is unoccupied.
    public String get(Location loc)
    {
        //your code here
        return(board[loc.getRow()][loc.getCol()]);
    }
    //----------------------------------------------------------------------------
    //Precondition:
    //Postcondition:  returns an ArrayList of all occupied locations in this grid
    public ArrayList<Location> getOccupiedLocs()
    {
        //your code here
        ArrayList<Location> occ= new ArrayList<Location>();
        for(int row=0; row<board.length;row++)
        {
            for(int col=0;col<board[0].length;col++)
            {
                if(board[row][col]!=null)
                {
                    occ.add(new Location(row, col));
                }
            }
        }
        return(occ);
         
    }
 
    //----------------------------------------------------------------------------
    //Precondition:  loc is valid in this grid
    //Postcondition: returns an ArrayList of valid locations adjacent to loc in
    //               all eight compass directions (north, northeast, east, southeast,
    //               south, southwest,west, and northwest).
    public ArrayList<Location> getValidAdjacentLocations(Location loc)
    {
        //your code here
        ArrayList<Location> adj= new ArrayList<Location>();
        Location hold;
        for(int dir=0;dir<=Location.NORTHWEST;dir=dir+Location.NORTHEAST)
        {
            hold=loc.getAdjacentLoc(dir);
            if(isValid(hold))
            {
                adj.add(hold);
            }
        }
        return(adj);
    }
 
    //----------------------------------------------------------------------------
 
    //Precondition:  loc is valid in this grid
    //Postcondition: returns an ArrayList of valid empty locations adjacent to loc
    //               in all eight compass directions (north, northeast, east,
    //               southeast, south, southwest, west, and northwest).
    public ArrayList<Location> getEmptyAdjacentLocations(Location loc)
    {
        //your code here
        ArrayList<Location> empty= new ArrayList<Location>();
        Location hold;
        for(int dir=0;dir<=Location.NORTHWEST;dir=dir+Location.NORTHEAST)
        {
            hold=loc.getAdjacentLoc(dir);
            if(isValid(hold) && board[hold.getRow()][hold.getCol()]==null)
            {
                empty.add(hold);
            }
        }
        return(empty);
    }
 
 
    //----------------------------------------------------------------------------
    //Precondition:   loc is valid in this grid
    //Postcondition:  returns an ArrayList of valid occupied locations adjacent to
    //                loc in all eight compass directions (north, northeast, east,
    //                southeast, south, southwest, west, and northwest).
    public ArrayList<Location> getOccupiedAdjacentLocs(Location loc)
    {
        //your code here
        ArrayList<Location> occ= new ArrayList<Location>();
        Location hold;
        for(int dir=0;dir<=Location.NORTHWEST;dir=dir+Location.NORTHEAST)
        {
            hold=loc.getAdjacentLoc(dir);
            if(isValid(hold) && board[hold.getRow()][hold.getCol()]!=null)
            {
                occ.add(hold);
            }
        }
        return(occ);
    }
 
 
 
 
    //----------------------------------------------------------------------------
    //Postcondition: displays the board and its values onto the screen.
    public void display()
    {
        System.out.println();
        System.out.print(String.format("%4s", " "));
        for (int i = 0; i < board[0].length; i++)
            System.out.print(String.format("%4d", i));
 
        System.out.println("\n");
 
        for (int i = 0; i < board[0].length; i++)
        {
            System.out.print(String.format("%4d", i));
            for (int j = 0; j < board.length; j++)
            {
                if (board[i][j] != null)
                    System.out.print(String.format("%4s", board[i][j]));
                else
                    System.out.print(String.format("%4s", "."));
            }
            System.out.println("\n");
        }
 
        System.out.println();
    }
 
    //----------------------------------------------------------------------------
}
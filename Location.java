public class Location
{
    private int row;
    private int col;
 
    //COMPASS DIRECTIONS
    public static final int NORTH = 0;
    public static final int EAST = 90;
    public static final int SOUTH = 180;
    public static final int WEST = 270;
    public static final int NORTHEAST = 45;
    public static final int SOUTHEAST = 135;
    public static final int SOUTHWEST = 225;
    public static final int NORTHWEST = 315;
 
    public Location(int inRow, int inCol)
    {
        //your code here
        row=inRow;
        col=inCol;
    }
 
 
    //----------------------------------------------------------------------
    //Description:  Gets the row coordinate.
    //Postcondition:  return the row of this location
 
    public int getRow()
    {
        //your code here
        return(row);
    }
 
 
    //----------------------------------------------------------------------
    //Description:  Gets the column coordinate.
    //Postcondition: returns the column for this Location
    public int getCol()
    {
        //your code here
        return(col);
    }
 
 
    //----------------------------------------------------------------------
    //Description:  Gets the adjacent location in any one of the eight
    //              compass directions.
    //              It is possible to return a Location that is out of bounds.
    //Precondition:  dir is one of the 8 compass directions.
    //Postcondition: returns the adjacent location in the direction that is closest to dir
    public Location getAdjacentLoc(int dir)
    {
        //your code here
        if(dir==NORTH)
        {
            return(new Location(row-1,col));
        }
        else if(dir==EAST)
        {
            return(new Location(row,col+1));
        }
        else if(dir==SOUTH)
        {
            return(new Location(row+1,col));
        }
        else if(dir==WEST)
        {
            return(new Location(row,col-1));
        }
        else if(dir==NORTHEAST)
        {
            return(new Location(row-1,col+1));
        }
        else if(dir==SOUTHEAST)
        {
            return(new Location(row+1,col+1));
        }
        else if(dir==SOUTHWEST)
        {
            return(new Location(row+1,col-1));
        }
        else
        {
            return(new Location(row-1,col-1));//northwest
        }
 
    }
 
 
    //----------------------------------------------------------------------
    //Description: Returns the direction from this location toward another
    //             location. The direction is one of the eight compass
    //             directions.
    //Precondition:  target - a location that is different from this location.
    //               target is an adjacent Location.
    //               target is valid in the matrix
    //Postcondition: returns the closest compass direction from this location
    //               toward target
    public int getDirectionToward(Location target)
    {
        //your code here
        if(target.getRow()<row && target.getCol()==col)
        {
            return (NORTH);
        }
        else if(target.getRow()==row && target.getCol()>col)
        {
            return (EAST);
        }
        else if(target.getRow()>row && target.getCol()==col)
        {
            return (SOUTH);
        }
        else if(target.getRow()==row && target.getCol()<col)
        {
            return (WEST);
        }
        else if(target.getRow()<row && target.getCol()>col)
        {
            return (NORTHEAST);
        }
        else if(target.getRow()>row && target.getCol()>col)
        {
            return (SOUTHEAST);
        }
        else if(target.getRow()>row && target.getCol()<col)
        {
            return (SOUTHWEST);
        }
        else
        {
            return (NORTHWEST);
        }
    }
 
 
    //----------------------------------------------------------------------
    //override .equals method
    //Description: Determines if this Location is equal to otherLoc
    //Precondition: otherLoc is a Location object and is valid in the matrix
    //Postcondition: return true if otherLoc is a Location with the same row
    //               and column as this location; false otherwise.
    public boolean equals(Object otherLoc)
    {
        //your code here
        if(((Location)otherLoc).getRow()==row && ((Location)otherLoc).getCol()==col)
            return(true);
        return(false);
         
    }
 
 
    //----------------------------------------------------------------------
    //Postcondition: returns a String with the row and col of this location
    //               in the format: (row, col)
    public String toString()
    {
        //your code here
        return("(" +row+","+col+")");
    }
 
}
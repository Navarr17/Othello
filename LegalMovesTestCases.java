import java.util.ArrayList;
public class LegalMovesTestCases
{
 
    //Each method depicts different test cases for a 4 x 4 matrix.
    //It is recommended that you create test cases for an 8 x 8 matrix.
    public static void testCase1(Grid board, ArrayList<Location> answers)
    {
        /*
                0   1   2   3
 
            0   .   .   .   .
 
            1   W   B   B   .
 
            2   .   .   .   .
 
            3   .   .   .   .
        */
 
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #1");
 
        board.put(new Location(1, 0), "W");
        board.put(new Location(1, 1), "B");
        board.put(new Location(1, 2), "B");
 
        answers.add(new Location(1, 3));
        board.display();
 
    }
    //--------------------------------------------------------------------------
    public static void testCase2(Grid board, ArrayList<Location> answers)
    {
        /*
                0   1   2   3
 
            0   .   .   .   .
 
            1   W   B   W   .
 
            2   .   .   .   .
 
            3   .   .   .   .
        */
 
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #2");
 
        board.put(new Location(1, 0), "W");
        board.put(new Location(1, 1), "B");
        board.put(new Location(1, 2), "W");
 
        board.display();
    }
 
    //--------------------------------------------------------------------------
    public static void testCase3(Grid board, ArrayList<Location> answers)
    {
        /*
                0   1   2   3
 
            0   W   .   .   .
 
            1   .   B   .   .
 
            2   .   .   B   .
 
            3   .   .   .   .
        */
 
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #3");
 
        board.put(new Location(0, 0), "W");
        board.put(new Location(1, 1), "B");
        board.put(new Location(2, 2), "B");
 
        answers.add(new Location(3, 3));
        board.display();
    }
 
 
 
 
 
 
    //--------------------------------------------------------------------------
    public static void testCase4(Grid board, ArrayList<Location> answers)
    {
        /*
                0   1   2   3
 
            0   .   .   B   W
 
            1   W   B   B   B
 
            2   W   W   B   .
 
            3   W   W   W   .
        */
 
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #4");
 
        board.put(new Location(0, 2), "B");
        board.put(new Location(0, 3), "W");
 
        board.put(new Location(1, 0), "W");
        board.put(new Location(1, 1), "B");
        board.put(new Location(1, 2), "B");
        board.put(new Location(1, 3), "B");
 
        board.put(new Location(2, 0), "W");
        board.put(new Location(2, 1), "W");
        board.put(new Location(2, 2), "B");
 
        board.put(new Location(3, 0), "W");
        board.put(new Location(3, 1), "W");
        board.put(new Location(3, 2), "W");
 
        answers.add(new Location(0, 1));
        answers.add(new Location(2, 3));
        board.display();
 
    }
    //--------------------------------------------------------------------------
    public static void testCase5(Grid board, ArrayList<Location> answers)
    {
        /*
                0   1   2   3
 
            0   W   B   B   .
 
            1   B   B   .   .
 
            2   B   .   B   .
 
            3   .   .   .   .
        */
 
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #5");
 
        board.put(new Location(0, 0), "W");
        board.put(new Location(0, 1), "B");
        board.put(new Location(0, 2), "B");
 
        board.put(new Location(1, 0), "B");
        board.put(new Location(1, 1), "B");
 
        board.put(new Location(2, 0), "B");
        board.put(new Location(2, 2), "B");
 
        answers.add(new Location(3, 3));
        answers.add(new Location(3, 0));
        answers.add(new Location(0, 3));
        board.display();
 
    }
    public static void testCase6(Grid board, ArrayList<Location> answers)
    {
        /*
       0   1   2   3   4   5   6   7
 
   0   W   B   B   .   .   .   .   .
 
   1   W   B   W   .   .   .   .   .
 
   2   W   .   B   W   .   .   .   .
 
   3   W   B   B   .   .   W   B   .
 
   4   W   B   B   W   W   W   B   W
 
   5   W   B   B   W   W   W   W   W
 
   6   W   B   B   .   .   .   .   .
 
   7   W   B   B   W   .   .   .   .
                */
 
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #6");
 
        board.put(new Location(0, 0), "W");
        board.put(new Location(0, 1), "B");
        board.put(new Location(0, 2), "B");
 
        board.put(new Location(1, 0), "W");
        board.put(new Location(1, 1), "B");
        board.put(new Location(1, 2), "W");
 
        board.put(new Location(2, 0), "W");
        board.put(new Location(2, 2), "B");
        board.put(new Location(2, 3), "W");
         
        board.put(new Location(3, 0), "W");
        board.put(new Location(3, 1), "B");
        board.put(new Location(3, 2), "B");
        board.put(new Location(3, 5), "W");
        board.put(new Location(3, 6), "B");
         
        board.put(new Location(4, 0), "W");
        board.put(new Location(4, 1), "B");
        board.put(new Location(4, 2), "B");
        board.put(new Location(4, 3), "W");
        board.put(new Location(4, 4), "W");
        board.put(new Location(4, 5), "W");
        board.put(new Location(4, 6), "B");
        board.put(new Location(4, 7), "W");
         
        board.put(new Location(5, 0), "W");
        board.put(new Location(5, 1), "B");
        board.put(new Location(5, 2), "B");
        board.put(new Location(5, 3), "W");
        board.put(new Location(5, 4), "W");
        board.put(new Location(5, 5), "W");
        board.put(new Location(5, 6), "W");
        board.put(new Location(5, 7), "W");
         
        board.put(new Location(6, 0), "W");
        board.put(new Location(6, 1), "B");
        board.put(new Location(6, 2), "B");
         
        board.put(new Location(7, 0), "W");
        board.put(new Location(7, 1), "B");
        //board.put(new Location(7, 2), "B");
        board.put(new Location(7, 3), "W");
         
        answers.add(new Location(0, 3));
        answers.add(new Location(1, 3));
        answers.add(new Location(2, 1));
        answers.add(new Location(2, 5));
        answers.add(new Location(2, 6));
        answers.add(new Location(2, 7));
        answers.add(new Location(3, 3));
        answers.add(new Location(3, 7));
        answers.add(new Location(6, 3));
        answers.add(new Location(7, 2));
        board.display();
 
    }
 
    public static void testCase7(Grid board, ArrayList<Location> answers)
    {
        System.out.println("-----------------------------------------------");
        System.out.println("Test Case #7");
        board.put(new Location(0,0), "W");
        board.put(new Location(0,1), "B");
        //board.put(new Location(0,2), "W");
        board.put(new Location(0,3), "B");
        board.put(new Location(1,3), "B");
        //board.put(new Location(2,3), "W");
        board.put(new Location(3,3), "W");
        board.put(new Location(3,2), "W");
        board.put(new Location(3,1), "W");
        board.put(new Location(3,0), "W");
        board.put(new Location(2,0), "W");
        board.put(new Location(1,0), "W");
        board.put(new Location(2,1), "B");
         
        answers.add(new Location(0,2));
        answers.add(new Location(1,1));
        answers.add(new Location(1,2));
        answers.add(new Location(2,2));
         
        board.display();
    }
    
    public static void testCase8(Grid board, ArrayList<Location> answers)
    {
    	System.out.println("-----------------------------------------------");
        System.out.println("Test Case #7");
        
        board.put(new Location(0,1), "B");
        board.put(new Location(0,3), "W");
        board.put(new Location(1,1), "B");
        board.put(new Location(1,2), "B");
        board.put(new Location(2,1), "W");
        board.put(new Location(2,2), "B");
        board.put(new Location(2,3), "B");
        board.put(new Location(3,2), "B");
        
        answers.add(new Location(4,3));
        answers.add(new Location(2,4));
        
        board.display();
        
        
        
    }
    
    
 
}
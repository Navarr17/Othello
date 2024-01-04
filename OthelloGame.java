import java.util.ArrayList;
 
public class OthelloGame
{
    //Instance Variables - Do not create others
 
    //To be used later
    //private OthelloPlayer humanPlayer;    //an OthelloPlayer that will be
                                            //constructed as a HumanOthelloPlayer
    //To be used later
    //private OthelloPlayer compPlayer;     //an OthelloPlayer that will be
                                            //constructed as a StupidComputerPlayer
 
    private Grid board;                     //OthelloGame HAS-A BoundedGrid
 
    //----------------------------------------------------------------------------------
    //Constructor
 
    public OthelloGame()
    {
        board = new BoundedGrid(8);
         
         /************************************************/
         /*                                              */                         
         /*             TESTING getLegalMoves            *
         /*                                              */                    
         /************************************************/
                 
        testLegalMoves();
 
    }
     
    //----------------------------------------------------------------------------------
    //Precondition:  The player's current color is received.
    //Postcondition: Returns an ArrayList of non-duplicate Locations that
    //               contain the legal moves for that color.
    public ArrayList<Location> getLegalMoves(String curColor)
    {
        //whites turn
        //your code here + variables for row and columns and diagonals
        Location coor;
        Location adja;
        boolean isTrue=true;
        ArrayList<Location> occ= new ArrayList<Location>();
        ArrayList<Location> cur= new ArrayList<Location>();
        ArrayList<Location> adj= new ArrayList<Location>();
         
        occ=board.getOccupiedLocs();
         
        for(int i=0; i<occ.size();i++)
        {
            if(board.get(occ.get(i)).equals(curColor))
            {
                adj=board.getOccupiedAdjacentLocs(occ.get(i));
                for(int p=0; p<adj.size();p++)
                {
                    if(!(board.get(adj.get(p)).equals(curColor)))
                    {
                        coor=adj.get(p);
                        do
                        {
                            adja=coor.getAdjacentLoc(occ.get(i).getDirectionToward(adj.get(p)));
                            if(!(board.isValid(adja)))
                            {
                                isTrue=false;
                            }
                            else if(board.get(adja)==null)
                            {
                                if(tommyTrevisanSucks(adja,cur))
                                {
                                    cur.add(adja);
                                }
                                isTrue=false;
                            }
                            else if(board.get(adja).equals(curColor))
                            {
                                isTrue=false;
                            }
                            coor=adja;
                             
                        }while(isTrue);
                        isTrue=true;
                    }
                }
            }
        }
 
        return(cur);
    }
     
    //returns true if there is no duplicates false if there is
    public boolean tommyTrevisanSucks(Location dup, ArrayList<Location> ans)
    {
        boolean theans=true;
         
        for(int i=0; i<ans.size(); i++)
        {
            if(ans.get(i).equals(dup))
            {
                theans=false;
            }
        }
        return(theans);
    }
     
     
    //----------------------------------------------------------------------
 
    /*************************************************************************
     *                                                                       *
     *                          TESTING getLegalMoves                        *
     *                                                                       *
     *************************************************************************/
    public void testLegalMoves()
    {
        /***************************************************************/
        /*                      How this testing works                 */
        /***************************************************************/
         
        //Note:  regarding this method call:  LegalMovesTestCases.testCase1(board, testAnswers); 
        //       The static method will fill up board with a "W" or "B" at designated locations.
        //       The method will also fill up the testAnswers ArrayList with the KEY.
        //       Next, your getLegalMoves method is called with a color.
        //       Then, the CompareListUtility method is called to compare the ArrayList with the
        //       KEY and the ArrayList returned from your getLegalMoves method.
        //
        //       The test cases operate on a 4 x 4 grid and are not comprehensive.
        //       It is recommended that you create test cases for an 8 x 8 matrix.
         
        ArrayList<Location> testAnswers;
        ArrayList<Location> legalMovesAns;
 
        //Test Case 1
        board = new BoundedGrid(4);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase1(board, testAnswers);  
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
 
        //Test Case 2
        board = new BoundedGrid(4);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase2(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
 
        //Test Case 3
        board = new BoundedGrid(4);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase3(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
 
        //Test Case 4
        board = new BoundedGrid(4);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase4(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
 
        //Test Case 5
        board = new BoundedGrid(4);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase5(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
         
        //Test Case 6
        board = new BoundedGrid(8);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase6(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
     
        //Test Case 7
        board = new BoundedGrid(4);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase7(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
        
      //Test Case 8
        board = new BoundedGrid(8);
        testAnswers = new ArrayList<Location> ();
        LegalMovesTestCases.testCase8(board, testAnswers);
        legalMovesAns = getLegalMoves("W");
        CompareListUtility.compareLocationLists(testAnswers, legalMovesAns, "getLegalMoves");
        System.out.println("Actual Answers:\t\t" + testAnswers);
        System.out.println("Your Legal Moves:\t" + legalMovesAns);
      
    }
}
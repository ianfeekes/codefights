/*chessKnight.java
 *codefights
 *Arcade
 *Introduction
 *Rainbow of Clarity
 *#50
 *Created by Ian Feekes December 6th 2017
 */

/*A final battle between chess-algorithms and my stubbornness to solve them mathematically rather than iteratively - as you can see by the if statements */ 


int chessKnight(String cell) 
{
    int numMoves = 8;
    int xCoord = 0;
    int yCoord = 0;
    xCoord = (int)cell.charAt(0)-96;
    yCoord = (int)cell.charAt(1)-48;
    System.out.println(xCoord);
    System.out.println(yCoord);
    if((xCoord==8)||(xCoord==1))
    {
        numMoves-=4;
        if((yCoord==8)||(yCoord==1))numMoves-=2;
        else if((yCoord==7)||(yCoord==2))numMoves-=1;
    }
    else if((xCoord==7)||(xCoord==2))
    {
        numMoves-=2;
        if((yCoord==8)||(yCoord==1))numMoves-=3;
        else if((yCoord==7)||(yCoord==2))numMoves-=2;
    }
    else if((yCoord==8)||(yCoord==1))numMoves-=4;
    else if((yCoord==7)||(yCoord==2))numMoves-=2;
    return numMoves;
}




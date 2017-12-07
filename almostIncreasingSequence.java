//AlmostIncreasingSequence.java
//Codefights
//Arcade
//Introduction
//Edge of the Ocean
//#8
//Created by Ian Feekes December 6th 2017

boolean almostIncreasingSequence(int[] sequence) {
    boolean flag1, flag2;
    for(int i=0;i<sequence.length-1;i++)
    {
        flag1 = false;
        flag2 = false;
        if(sequence[i]>=sequence[i+1])
        {
            for(int j=i+1;j<sequence.length-1;j++)
            {
                if(sequence[j]>=sequence[j+1]) flag1 = true;//fix return 
            }
            if((i>0)&&(i+1<sequence.length)&&(sequence[i-1]>=sequence[i+1])) flag1 = true;
            for(int j=i+2;j<sequence.length-1;j++)
            {
                if(sequence[j]>=sequence[j+1]) flag2 = true;//fix return 
            }
            if((i+2<sequence.length)&&(sequence[i]>=sequence[i+2])) flag2 = true;
            if((flag2)&&(flag1)) return false;
        }
    }
    return true; 
}




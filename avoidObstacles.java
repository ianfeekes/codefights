/*avoidObstacles.java
 *codefights
 *Arcade
 *Introduction
 *Island of Knowledge
 *#22
 *Created by Ian Feekes December 6th 2017
 */

int avoidObstacles(int[] inputArray) 
{
    //sort array
    //for i->array.length
    //see if jumps work
    int n = inputArray.length;
    for (int i=1; i<n; ++i)
    {
        int key = inputArray[i];
        int j = i-1; 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
        while (j>=0 && inputArray[j] > key)
        {
            inputArray[j+1] = inputArray[j];
            j = j-1;
        }
        inputArray[j+1] = key;
    }
    /*for(int i=0;i<inputArray.length;i++)
    {
        System.out.print(inputArray[i]);
    }*/
    int[] jumpValues = new int[inputArray.length];
    int index = 0;
    for(int i=0; i<inputArray.length;i++)
    {
        System.out.print(inputArray[i]+" ");
    }
    System.out.println();
    for(int i=0;i<inputArray.length-1;i++)
    {
        if(inputArray[i+1]==inputArray[i]+1) jumpValues[index]++;
        else if(inputArray[i+1]!=inputArray[i]+1) index++;
        
    }
    for(int i=0;i<jumpValues.length;i++)
    {
        System.out.print(jumpValues[i]+" ");
    }
    System.out.println();
    int max = 0;
    for(int i=0; i<jumpValues.length;i++)
    {
        if(jumpValues[i]>max) max = jumpValues[i];
    }
    if(max==0) max++;
    System.out.println("maximum array value is found to be "+max);
    boolean jumpDoesntWork = true; 
    
    while(jumpDoesntWork)
    {
        boolean startNewLoop = false;
        int i=0; 
        while(i<=inputArray[inputArray.length-1])
        {
            for(int j=0; j<inputArray.length;j++)
            {
                System.out.println("comparing "+i+" and "+inputArray[j]);
                if(i==inputArray[j])
                {
                    System.out.println("i and arrayVal are found to be equal ");
                    startNewLoop = true; 
                }
            }
            if(startNewLoop) 
            {
                System.out.println("Starting new loop...");
                i+=inputArray[inputArray.length-1];
            }
            i+=max;
        }
        if(startNewLoop)
        {
            max++;
            System.out.println("Max is now "+max);
        }
        else jumpDoesntWork=false;
    }
    return max;
}



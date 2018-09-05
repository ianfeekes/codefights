/*arrayConversion.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *springOfIntegration
 *#87
 */

int arrayConversion(int[] inputArray) 
{
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for(int i=0;i<inputArray.length;i++)temp.add(inputArray[i]);
    int iterationNum = 0;
    while(temp.size()>1)
    {
        //System.out.println(temp.size());
        ArrayList<Integer> t1 = new ArrayList<Integer>();
        iterationNum++; 
        //print(temp);
        //System.out.println();
        if(iterationNum%2!=0)
        {
            for(int i=0;i<temp.size();i+=2)
            {
                if((i>temp.size())||(i+1>temp.size()))break;
                t1.add(temp.get(i)+temp.get(i+1));
            }
        }
        else
        {
            for(int i=0;i<temp.size();i+=2)
            {
                if((i>temp.size())||(i+1>temp.size()))break;
                t1.add(temp.get(i)*temp.get(i+1));
            }
        }
        temp=t1; 
    }
    return temp.get(0);
}

void print(ArrayList<Integer> arr)
{
    //System.out.println("foo");
    for(Integer i: arr)System.out.print(i+" ");
}



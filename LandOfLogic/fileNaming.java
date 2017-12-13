/*fileNaming.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#57
 *Created by Ian Feekes December 6th 2017
 */

String[] fileNaming(String[] names) 
{
    for(int i=0;i<names.length;i++)
    {
        int x = 1;
        for(int j=0;j<names.length;j++)
        {
            if(j!=i)
            {
                if(names[j].equals(names[i]))
                {
                    while(nameIsTaken(names[j]+"("+x+")", names, j))
                    {
                        x++;
                    }
                    names[j]+="("+x+")";
                }
            }
        }
    }
    return names;
}

boolean nameIsTaken(String str, String[] arr, int index)
{
    for(int i=0;i<index;i++)
    {
        if(str.equals(arr[i])) return true;
    }
    return false; 
}



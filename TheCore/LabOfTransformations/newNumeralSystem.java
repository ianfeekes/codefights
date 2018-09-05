/*newNumeralSystem.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#82
 */

String[] newNumeralSystem(char number) 
{
    ArrayList<String> toReturn = new ArrayList<String>();
    int num = (int)number-65;
    for(int i=0;i<=num;i++)
    {
        for(int j=i;j<=num;j++)
        {
            if(j+i>num)break;
            char c =(char)(i+65);
            char d =(char)(j+65);
            if(j+i==num)toReturn.add(c+" + "+d);
        }
    }
    String[] modifiedArray = new String[toReturn.size()];
    for(int i=0;i<toReturn.size();i++)
    {
        modifiedArray[i]=toReturn.get(i);
    }
    return modifiedArray; 
}



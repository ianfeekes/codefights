/*higherVersion.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#85
 */

boolean higherVersion(String ver1, String ver2) 
{
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    int x=0;
    int placeHolder=1;
    for(int i=ver1.length()-1;i>=0;i--)
    {
        if(ver1.charAt(i)=='.')
        {
            arr1.add(x);
            x=0;
            placeHolder=1; 
        }
        else
        {
            x+=((int)ver1.charAt(i)-48)*placeHolder;
            placeHolder*=10;
        }
        if(i==0)
        {
            arr1.add(x);
        }
    }
    x=0;
    placeHolder=1; 
    for(int i=ver2.length()-1;i>=0;i--)
    {
        if(ver2.charAt(i)=='.')
        {
            arr2.add(x);
            x=0;
            placeHolder=1;
        }
        else
        {
            x+=((int)ver2.charAt(i)-48)*placeHolder;
            placeHolder*=10;
        }
        if(i==0)arr2.add(x);
    }
    /*for(int i=arr1.size()-1;i>=0;i--)System.out.print(arr1.get(i)+" ");
    System.out.println();
    for(int i=arr2.size()-1;i>=0;i--)System.out.print(arr2.get(i)+" ");*/
    for(int i=arr1.size()-1;i>=0;i--)
    {
        if(arr1.get(i)>arr2.get(i))return true; 
        else if(arr2.get(i)>arr1.get(i))return false; 
    }
    return false; 
}




/*messageFromBinaryCode.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#58
 *Created by Ian Feekes December 6th 2017
 */

String messageFromBinaryCode(String code) 
{
    String str = "";
    for(int i=0;i<code.length();i+=8)
    {
        int[] arr = new int[8];
        for(int j=i;j<i+8;j++)
        {
            //System.out.print("j-i is "+(j-i));
            arr[j-i]= (int)code.charAt(j)-48;
        }
        int numericalConversion = 0;
        int binaryDigit = 1;
        /*for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();*/
        for(int k=arr.length-1;k>=0;k--)
        {
            System.out.println("arr[k] is "+arr[k]);
            numericalConversion+=arr[k]*binaryDigit;
            binaryDigit*=2;
        }
        System.out.println("ascii code is "+numericalConversion);
        str+=(char)numericalConversion;
    }
    return str;
}



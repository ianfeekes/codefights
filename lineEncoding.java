/*lineEncoding.java
 *codefights
 *Arcade
 *Introduction
 *Rainbow of Clarity
 *#49
 *Created by Ian Feekes December 6th 2017
 */

String lineEncoding(String s) 
{
    String[] arr = new String[s.length()];
    int index = 0;
    for(int i=0;i<s.length();i++)
    {
        arr[index]="";
        arr[index]+=Character.toString(s.charAt(i));
        /*if(i==s.length()-1)
        {
            System.out.println("bug");
            if(s.charAt(i)==s.charAt(i-1)) 
            {
                arr[index]+=Character.toString(s.charAt(i));
            }
        }*/
        if(i!=s.length()-1)
        {
            while(s.charAt(i)==s.charAt(i+1))
            {
                arr[index]+=Character.toString(s.charAt(i));
                //if(i>=s.length()-1)break;
                i++; 
                if(i>=s.length()-1)break;
                //arr[index]+=Character.toString(s.charAt(i));
            }
        }
        index++;
    }
    s = "";
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!=null)
        {
        System.out.println(arr[i]);
        String str1 = "";
        if(arr[i].length()>1) str1+=Integer.toString(arr[i].length());
        str1+=Character.toString(arr[i].charAt(0));
        arr[i]=str1;
        s+=str1;
        }
        //System.out.println(arr[i]);
    }
    return s; 
}



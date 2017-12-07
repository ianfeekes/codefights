/*buildPalindrome.java
 *codefights
 *Arcade
 *Introduction
 *Eruption of Light
 *#45
 *Created by Ian Feekes December 6th 2017
 */

String buildPalindrome(String st)
{
    String str = "";
    int i=0;
  for(i=0;i<st.length();i++)
  {
      if(isAPalindrome(st.substring(i, st.length()))) 
      {
          str=st.substring(i,st.length());
          break;
      }
  }
    System.out.println("i is "+i);
    String str1 = "";
    while(i>0)
    {
        i--;
        str1+=st.charAt(i);
    }
    String str2 = "";
    for(int j=str1.length()-1;j>=0;j--)
    {
        str2+=str1.charAt(j);
    }
    str2+=str;
    str2+=str1;
    return str2; 
}

boolean isAPalindrome(String str)
{
    int j=str.length()-1;
    for(int i=0;i<j;i++)
    {
        if(str.charAt(i)!=str.charAt(j)) return false; 
        j--;
    }
    return true; 
}

//i is decremented. 
//String str1 +=charAt(i);
//
//backwards loop through str1.length()
    //str1+=str1.charAt(j);

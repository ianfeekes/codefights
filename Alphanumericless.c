//
//  Alphanumericless.c
//  
//
//  Created by Ian Gerrit Feekes on 11/28/17.
//
//

#include "Alphanumericless.h"

boolean alphanumericLess(String s1, String s2)
{
    //if(s1.equals("000"))return false;
    ArrayList<String> t1 = new ArrayList<String>();
    ArrayList<String> t2 = new ArrayList<String>();
    int i=0;
    int j=0;
    while(i<s1.length())
    {
        String temp1 = "";
        while((s1.charAt(i)>47)&&(s1.charAt(i)<58))//if current is int
        {
            temp1+=s1.charAt(i);
            i++;
            if(i>=s1.length())break;//this may need adjusting
        }
        if(temp1.equals(""))
        {
            temp1+=s1.charAt(i);
            i++;
        }
        t1.add(temp1);
    }
    while(j<s2.length())
    {
        String temp2 = "";
        while((s2.charAt(j)>47)&&(s2.charAt(j)<58))//if current is int
        {
            temp2+=s2.charAt(j);
            j++;
            if(j>=s2.length())break;//this may need adjusting
        }
        if(temp2.equals(""))
        {
            temp2+=s2.charAt(j);
            j++;
        }
        t2.add(temp2);
    }
    for(String str : t1)System.out.print(str+" ");
    System.out.println();
    for(String str1 : t2)System.out.print(str1+" ");
    System.out.println();
    int l = 0;
    for(String str2 : t1)
    {
        if(!compare(t1, str2, t2.get(l)))
        {
            //System.out.println("bug");
            return false;
        }
        l++;
        if(l>=t2.size())break;//this may need to be adjusted to a return stat.
    }
    if(equalsOrLonger(t1,t2))return false;
    return true;
}

boolean equalsOrLonger(ArrayList<String>a, ArrayList<String>b)
{
    int parser = 0;
    for(String s: a)
    {
        if(!s.equals(b.get(parser)))return false;
        parser++;
    }
    if(a.size()<b.size())return false;
    //System.out.println("bug x");
    return true;
}

boolean compare(ArrayList<String>arr, String a, String b)
{
    boolean aInt = false;
    boolean bInt = false;
    if(a.charAt(0)<58)aInt = true;
    if(b.charAt(0)<58)bInt = true;
    if((aInt)&&(!bInt))return true;
    else if((!aInt)&&(bInt))
    {
        System.out.println("bug1");
        return false;
    }
    else if((aInt)&&(bInt)) //if both Strings are integers
    {
        /*System.out.println(a);
         System.out.println(b);*/
        int x = convertToInt(a);
        int y = convertToInt(b);
        //if((x==y)&&(a==arr.get(arr.size()-1)))return false;
        if(x==y)
        {
            //this code may need some work
            //System.out.println(a.length()+" "+b.length());
            //System.out.println("bug2");
            return true;
        }
        else
        {
            System.out.println("bug3");
            return(x<y);
        }
    }
    else                                 //both Strings r chars. There can only b 1
    {
        //System.out.println("bug4");
        return((int)a.charAt(0)<=(int)b.charAt(0));
    }
}

int convertToInt(String s)
{
    int toReturn = 0;
    int placeHolder = 1;
    for(int i=s.length()-1;i>=0;i--)
    {
        toReturn+=((int)s.charAt(i)-48)*placeHolder;
        placeHolder*=10;
    }
    return toReturn;
}


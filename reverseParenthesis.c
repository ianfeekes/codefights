String reverseParentheses(String s)
{
    int[] indicesOfFront = new int[s.length()];     // all indices of (
    int[] indicesOfBack = new int[s.length()];      // all indices of )
    int ind1 = 0;
    int ind2 = 0;
    char[] charArray = new char[s.length()];        //character representation of the string so that reversing characters can be easily done
    for(int i=0; i<s.length();i++)
    {
        indicesOfFront[i]=-1;
        indicesOfBack[i]=-1;
        charArray[i]=s.charAt(i);                   //character array now properly represents the string
        if(charArray[i]=='(')
        {
            indicesOfFront[ind1]=i;
            ind1++;
        }
        if(charArray[i]==')')
        {
            indicesOfBack[ind2]=i;
            ind2++;
        }
    }
    for(int i=0;i<ind1;i++)findMinParenthesis(indicesOfFront, indicesOfBack, charArray);
    String str = "";
    for(int k=0; k<s.length();k++)                  //now we go through the character array
    {
        if((charArray[k]!='(')&&(charArray[k]!=')'))str+=charArray[k];
    }
    return str;
}

void reverse(int l, int r, char[] cArray)
{
    char temp;
    for(int i=l; i<r; i++)
    {
        if(cArray[i]!='(')
        {
            while(cArray[r]==')') r--;
            System.out.println("Swapping "+cArray[i]+" with "+cArray[r]);
            temp = cArray[i];
            cArray[i]=cArray[r];
            cArray[r]=temp;
            r--;
        }
    }
    for(int i=0;i<cArray.length;i++)
    {
        System.out.print(cArray[i]+" ");
    }
    System.out.println();
}

void findMinParenthesis(int[] indicesOfFront, int[] indicesOfBack, char[] charArray)
{
    int minimum=indicesOfFront.length;
    int lIndex = -1;
    int rIndex = -1;
    int i=0;
    int ind1=0;
    int ind2=0;
    while(indicesOfBack[i]!=-1)
    {
        int j=0;
        while(indicesOfFront[j]!=-1)
        {
            if((indicesOfBack[i]!=-2)&&(indicesOfFront[j]!=-2)&&(indicesOfBack[i]>indicesOfFront[j]))
            {
                if(indicesOfBack[i]-indicesOfFront[j]<minimum)
                {
                    minimum = indicesOfBack[i]-indicesOfFront[j];
                    lIndex=indicesOfFront[j];
                    rIndex=indicesOfBack[i];
                    ind1=j;
                    ind2=i;
                }
            }
            j++;
        }
        i++;
    }
    reverse(lIndex, rIndex, charArray);
    indicesOfFront[ind1]=-2;
    indicesOfBack[ind2]=-2;
    System.out.println("left index is "+lIndex+" right index is "+rIndex);
}

//here's anotha one

int numbersGrouping(int[] a)
{
    int[] groups = new int[a.length];
    int index=0;
    for(int i=0;i<groups.length;i++)groups[i]=-1;
    for(int i=0;i<a.length;i++)
    {
        int gNum = (int)Math.ceil(a[i]/10000);
        if(a[i]%10000>0)gNum++;
        boolean isNewGroup=true;
        for(int j=0;j<groups.length;j++)
        {
            if(groups[j]==-1)break;
            if(groups[j]==gNum) isNewGroup = false;
        }
        if(isNewGroup)
        {
            groups[index]=gNum;
            index++;
        }
    }
    int result = 0;
    for(int i=0;i<groups.length;i++)
    {
        //result++;
        if(groups[i]==-1)break;
        result++;
        System.out.print(groups[i]+" ");
    }
    return result+a.length;
}

//here's anotha one
int timedReading(int maxLength, String text)
{
    int numChars = 0;
    int numWords = 0;
    for(int i=0;i<text.length();i++)
    {
        if(((int)text.charAt(i)>96)&&((int)text.charAt(i)<123)) numChars++;
        else if(((int)text.charAt(i)>64)&&((int)text.charAt(i)<91)) numChars++;
        else
        {
            if((numChars<=maxLength)&&(numChars!=0))numWords++;
            numChars=0;
        }
    }
    return numWords;
}

//here's another one

boolean adaNumber(String line)
{
    int numHash = 0;
    int[] hashIndices = new int[2];
    for(int i=0;i<line.length();i++)
    {
        if(line.charAt(i)=='#')
        {
            if(numHash>=2)return false;
            hashIndices[numHash]=i;
            numHash++;
        }
    }
    if(numHash==0)
    {
        for(int i=0;i<line.length();i++)
        {
            if(((int)line.charAt(i)>57)||((int)line.charAt(i)<48))
            {
                if(line.charAt(i)!='_')return false;
            }
        }
        return true;
    }
    else if(numHash==2)
    {
        //System.out.println("numHash is two");
        if(hashIndices[1]!=line.length()-1)
        {
            System.out.println("debug1");
            return false;
        }
        if(hashIndices[1]-hashIndices[0]==1)
        {
            System.out.println("debug2");
            return false;      //if the ## are next to eachother and there is nothing in between the
        }
        int baseVal = 0;
        int placeHolder=1;
        for(int i=hashIndices[0]-1;i>=0;i--)                     //this code generates the value for the base.
        {
            //System.out.print(line.charAt(i)+" ");
            //System.out.println(baseVal);
            //System.out.println(line.charAt(i));
            baseVal+=((int)line.charAt(i)-48)*placeHolder;
            placeHolder*=10;
        }
        //System.out.println(baseVal);
        if((baseVal<2)||(baseVal>16))
        {
            //System.out.println(baseVal);
            System.out.println("debug3");
            return false;             //this might need to be modified based on the description
        }
        for(int i=hashIndices[0]+1;i<hashIndices[1];i++)
        {
            if(baseVal<=10)                                    //only numbers. some may be less than 10
            {
                if((int)line.charAt(i)<48)
                {
                    System.out.println("debug4");
                    return false;
                }
                else if((int)line.charAt(i)>47+baseVal)
                {
                    System.out.println("debug5");
                    return false; //this line might have a bug in it
                }
            }
            else                                               //here we are accounting for letters
            {
                if((int)line.charAt(i)<48)
                {
                    System.out.println("debug6");
                    return false;
                }
                if((int)line.charAt(i)>86+baseVal)
                {
                    System.out.println("debug7");
                    return false;
                }
                if(((int)line.charAt(i)>57)&&((int)line.charAt(i)<65))
                {
                    System.out.println("debug8");
                    return false;
                }
                if(((int)line.charAt(i)>54+baseVal)&&((int)line.charAt(i)<97))
                {
                    System.out.println("debug9");
                    return false;
                }
            }
        }
        return true;
    }
    else return false;
}

//holy shit I'm gonna have to organize but not now

int threeSplit(int[] a)
{
    int lSum=0;
    int mSum=0;
    int rSum=0;
    int numPossibilities =0;
    for(int i=0;i<a.length-2;i++)
    {
        lSum+=a[i];
        for(int j=i+1;j<a.length-1;j++)
        {
            mSum+=a[j];
            for(int k=j+1;k<a.length;k++)
            {
                rSum+=a[k];
            }
            //System.out.println("lSum is "+lSum+", mSum is "+mSum+", rSum is "+rSum);
            if((lSum==mSum)&&(lSum==rSum))numPossibilities++;
            rSum=0;
        }
        mSum=0;
    }
    return numPossibilities;
}










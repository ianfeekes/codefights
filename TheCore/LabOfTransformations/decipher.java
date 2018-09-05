/*decipher.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#86
 */

String decipher(String cipher) 
{
    ArrayList<String> arr = new ArrayList<String>();
    int i=0;
    int index=0; 
    String str = "";
    while(i<cipher.length())
    {
        str = "";
        while(isValid(str+cipher.charAt(i)))
        {
            str+=cipher.charAt(i);
            i++;
            if(i>=cipher.length())break;
        }
        arr.add(str);
    }
    for(int j=0;j<arr.size();j++)
    {
        System.out.print(arr.get(j)+" ");
    }
    String s = "";
    for(int j=0;j<arr.size();j++)
    {
        s+=convert(arr.get(j));
    }
    return s; 
}

char convert(String str)
{
   //System.out.println("String : "+str);
   int x=0; 
   int placeHolder = 1; 
   for(int i=str.length()-1;i>=0;i--)
   {
       //System.out.print((int)str.charAt(i)-48+" ");
       x+=((int)str.charAt(i)-48)*placeHolder;
       placeHolder*=10;
   }
   //System.out.println();
    return (char)x; 
}

boolean isValid(String str)
{
    
    if(str.equals(""))return true; 
    if(str.length()>3)
    {
        System.out.println("foo");
        return false;
    }
    int x = 0;
    int placeHolder = 1; 
    for(int i=str.length()-1;i>=0;i--)
    {
        x+=((int)str.charAt(i)-48)*placeHolder; 
        placeHolder*=10; 
    }
    return(x<123);
}

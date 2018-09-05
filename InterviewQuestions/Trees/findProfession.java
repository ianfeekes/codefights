/* findProfession.java
 * based on a lineage of either doctors or engineers it recursively will go through to find the level and
 * compute if its a doctor or an engineer
 */

String findProfession(int level, int pos)
{
    if(level==1)return "Engineer";
    if(findProfession(level-1,(pos+1)/2).equals("Doctor"))
    {
        if(pos%2!=0) return "Doctor";
        return "Engineer";
    }
    if(pos%2!=0) return "Engineer";
    return "Doctor";
}


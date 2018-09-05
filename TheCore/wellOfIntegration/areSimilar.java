/*areSimilar.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#77
 */

boolean areSimilar(int[] a, int[] b) 
{
 ArrayList<Integer> incongruentElements = new ArrayList<Integer>();
 for(int i=0;i<a.length;i++)
 {
  if(a[i]!=b[i])
  {
   incongruentElements.add(a[i]);
   incongruentElements.add(b[i]);
  }
  //if(incongruentElements.size()!=4)return false; 
 }
 if(incongruentElements.size()==0)return true; 
 if(incongruentElements.size()!=4)return false; 
 System.out.println(incongruentElements.get(0));
 //System.out.println(incongruentElements.get(1));
 //System.out.println(incongruentElements.get(2));
 System.out.println(incongruentElements.get(3));
// System.out.println(x==y);
 int x = incongruentElements.get(3);
 int y = incongruentElements.get(0);
 int c = incongruentElements.get(1);
 int d = incongruentElements.get(2);
  System.out.println(x==y);
 //System.out.println(incongruentElements.get(1)==incongruentElements.get(2));
 if((x!=y)||(c!=d))return false; 
 return true; 
}



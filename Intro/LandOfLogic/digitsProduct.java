/*digitsProduct.java
 *codefights
 *Arcade
 *Introduction
 *Land of Logic 
 *#56
 *Created by Ian Feekes December 6th 2017
 */

int digitsProduct(int product) 
{
   if(product==1)return 1;
   //if(product%2==1) return -1;
   else
   {
      int i=product;
      while(i<10000)
      {
         if(digitsOfI(i,product))return i;
         i++;
      }
   }
   return -1;
}


boolean digitsOfI(int x, int product)
{
   //System.out.println("comparing "+x+" to "+product);
   int temp=1;
   while(x>0)
   {
      temp*=(x%10);
      x/=10;
   }
   if(temp==product) return true;
   return false; 
}



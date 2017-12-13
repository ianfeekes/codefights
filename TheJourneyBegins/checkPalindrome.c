//checkPalindrome
//Codefights
//Arcade 
//Introduction
//The Journey Begins
//#3
//Created by Ian Feekes december 6th 2017

#include <string.h>
bool checkPalindrome(char * inputString) {
   for(int i=0; i<strlen(inputString);i++)
   {
      if(inputString[i]!=inputString[strlen(inputString)-1-i]) return false;
   }
   return true;
}



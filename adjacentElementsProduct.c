//adjacentElementsProduct.c 
//Codefights
//Arcade
//Introduction
//Edge of the Ocean
//#4
//Created by Ian Feekes december 6th 2017

// Definition for arrays:
// typedef struct arr_##name {
//   int size;
//   type *arr;
// } arr_##name;
//
// arr_##name alloc_arr_##name(int len) {
//   arr_##name a = {len, len > 0 ? malloc(sizeof(type) * len) : NULL};
//   return a;
// }
//
//
int adjacentElementsProduct(arr_integer inputArray) {
 int greatestProduct = inputArray.arr[1]*inputArray.arr[0];
 for(int i=0;i<inputArray.size-1;i++)
 {
  if(inputArray.arr[i]*inputArray.arr[i+1]>greatestProduct) greatestProduct=inputArray.arr[i]*inputArray.arr[i+1];
 }
 return greatestProduct;
}



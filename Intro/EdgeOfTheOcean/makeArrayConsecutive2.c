//MakeArrayConsecutive2.c              
//Codefights
//Arcade
//Introduction
//Edge of the Ocean
//#6
//Created by Ian Feekes December 6th 2017

/*NOTE: The code here is not very elegant as it implements an insersion sort algorithm which obviously has terrible runtime. It's more of I felt that this algorithm was relatively basic and should be done more for the purposes of learning to code rather than actual precise coding practices. To improve this runtime simply use quicksort instead */ 


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


int makeArrayConsecutive2(arr_integer statues) {
    for(int i=0; i<statues.size;i++)
    {
        for(int j=statues.size-1;j>i;j--)
        {
            if(statues.arr[j]<statues.arr[i])
            {
                int temp=statues.arr[i];
                statues.arr[i]=statues.arr[j];
                statues.arr[j]=temp;
            }
        }
    }
    int diff = 0;
    for(int i=0;i<statues.size-1;i++)
    {
        diff+=(statues.arr[i+1]-(statues.arr[i]+1));
    }
    return diff;
}



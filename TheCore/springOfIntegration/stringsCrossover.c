/*stringsCrossover.c
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *springOfIntegration
 *#92
 */

int stringsCrossover(arr_string inputArray, char * result) 
{
    int numCrossovers = 0;
    for(int i=0;i<inputArray.size;i++)
    {
        char* str = inputArray.arr[i];
        /*printf("%s ", str); */ 
        for(int j=i+1;j<inputArray.size;j++)
        {
            bool isMatch = 0; 
            char* str1 = inputArray.arr[j];
            for(int k=0;k<strlen(str);k++)
            {
                /*printf("%d ", k);*/
                if(!((result[k]==str[k])||(result[k]==str1[k])))
                {
                    /*printf("No match for k val of %d", k);*/
                    isMatch=1; 
                }
            }
            if(isMatch==0)
            {
                /*printf("Is match between %s and %s \n",str,str1);*/
                numCrossovers++; 
            }
        }
        /*printf("%d, ",strlen(str));*/  
    }
    
    return numCrossovers; 
}



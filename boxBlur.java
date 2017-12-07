/*boxBlur.java
 *codefights
 *Arcade
 *Introduction
 *Island of Knowledge
 *#23
 *Created by Ian Feekes December 6th 2017
 */

int[][] boxBlur(int[][] image) 
{
    /*for(int i=0;i<image.length;i++)
    {
        for(int j=0; j<image[i].length;j++)
        {
            System.out.println(image[i][j]);
        }
    }*/
    int[][] pixel = new int[image.length-2][image[1].length-2]; 
    for(int i=1;i<image.length-1;i++)
    {
        for(int j=1; j<image[i].length-1;j++)
        {
            //System.out.println(image[i][j]);
            int avg=0;
            for(int k=i-1;k<i+2;k++)
            {
                for(int l = j-1;l<j+2;l++)
                {
                    //System.out.println("image[k][l] "+image[k][l]);
                    avg+=image[k][l];
                }
            }
            //System.out.println("dividing avg by 9 "+avg);
            avg/=9;
            //System.out.print(avg+" ");
            pixel[i-1][j-1]=avg;
        }
    }
    return pixel;
}

//find the average of all adjacent pixels. It then removes the border 

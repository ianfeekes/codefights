/* hasPathWithGivenSum.java
 * codefights interview question on trees #1
 * created by Ian Feekes December 21 2017
 */

/*If the tree has any path from root to leaf that sums to the given sum returns true, else return false*/ 

boolean hasPathWithGivenSum(Tree<Integer> t, int s)
{
    if(t==null) return s==0;
    else return recursiveSum(t, s, 0);
}

boolean recursiveSum(Tree<Integer> t, int sum, int currentSum)
{
    if(t.left==null && t.right==null)
    {
    return currentSum+t.value==sum;
    }
    boolean recursiveLeft = false;
    boolean recursiveRight = false;
    if(t.left!=null)
    {
    recursiveLeft = recursiveSum(t.left, sum, currentSum+t.value);
    }
    if(t.right!=null)
    {
    recursiveRight=recursiveSum(t.right, sum, currentSum+t.value);
    }
    return(recursiveLeft || recursiveRight);
}

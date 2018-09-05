/* isTreeSymmetric.java
 * finds out if the tree ADT is symmetric
 * created by Ian Feekes on December 23rd 2017
 */

boolean isTreeSymmetric(Tree<Integer> t)
{
if(t==null)return true;
else return helper(t.left, t.right);
}

/* recursive function can only return true if it has gone to a leaf node and both the left and right nodes
 * are leafs and all their parents have met the conditions of equal values (symmetry) and child nodes
 */
boolean helper(Tree<Integer> leftNode, Tree<Integer> rightNode)
{
if((leftNode==null)&&(rightNode==null))return true;
else if((leftNode==null)||(rightNode==null))return false;
else if(!leftNode.value.equals(rightNode.value))return false;
return ((helper(leftNode.left, rightNode.right))&&(helper(leftNode.right, rightNode.left)));
}

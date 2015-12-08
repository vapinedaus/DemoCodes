package lesson10binarysearchtree;

class BSTNode
{
int data;
BSTNode left;
BSTNode right;
BSTNode( int d ) // constructor
{ data = d; }
}
class BinarySearchTree
{
public BSTNode insertTree(BSTNode p, int key) // create BST
{
if( p == null )
p = new BSTNode(key);  // Root node
else if( key < p.data)
p.left = insertTree( p.left, key);  // Insert into Left 
else p.right = insertTree( p.right, key); // Insert into Right
return p; // return root
}
public BSTNode search(BSTNode root, int key)
{
BSTNode p = root; // initialize p with root
while( p != null )
{ if( key == p.data ) return p;  
else if( key < p.data ) p = p.left;
else p = p.right;
}
return null;
}

public void inorder(BSTNode p) // 'p' starts with root
{ if( p != null )
{ inorder(p.left);
System.out.print(p.data + " ");
inorder(p.right);
}
}

// Implement this method

public int leafNodes(BSTNode p)
{
}


// Implement this method

public BSTNode Minimum(BSTNode p)
{
	
}

// Implement this method

public BSTNode Maximum(BSTNode p)
{
}


// Implement this method

public void preorder(BSTNode p)
{ 
}

// Implement this method

public void postorder(BSTNode p)
{ 
}


} // end of BinarySearchTree class
////////////////////// BinarySearchTreeDemo.java ////////////////////
class BinarySearchTreeDemo
{ public static void main(String args[])
{
int arr[] = { 45, 25, 15, 10, 20, 30, 65, 55, 50, 60, 75, 80 };
BinarySearchTree bst = new BinarySearchTree();

BSTNode root = null;
// build tree by repeated insertions
for( int i = 0; i < arr.length; i++ )
root = bst.insertTree( root, arr[i]);
BSTNode root2 = root; // copy BST
int key = 66;
BSTNode item = bst.search(root2, key);
if( item != null )
System.out.print("\n item found: " + item.data);
else System.out.print("\n Node " + key + " not found");
System.out.print("\n Number of leaf nodes: " + bst.leafNodes(root));
System.out.print("\n Inorder: ");
bst.inorder(root);
System.out.print("\n Preorder: ");
bst.preorder(root);
System.out.print("\n Postorder: ");
bst.postorder(root);
bst.inorder(root);
key = 44; // insert 44
bst.insertTree(root, key);
System.out.print("\n Inorder, after insertion of " + key + ": ");
bst.inorder(root);
System.out.println("\nMinimum Value in the tree: " + bst.Minimum(root2).data);
System.out.println("Maximum Value in the tree : " + bst.Maximum(root2).data);
}
}

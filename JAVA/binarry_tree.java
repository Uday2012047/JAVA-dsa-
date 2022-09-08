import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class binarry_tree {
 static class Node {
     int data;
     Node left;
     Node right;

     Node(int data) {
         this.data = data;
         this.right = null;
         this.left = null;
     }
 }
     static class BinaryTree{
       static   int index=-1;
         public static Node buildtree(int node[]){
                index++;
             if(node[index]==-1){
                 return null;
             }
           Node newnode=new Node(node[index]);
             newnode.left=buildtree(node);
             newnode.right=buildtree(node);
             return newnode;
         }
     }
     public static int height(Node root){
     if(root==null){
         return 0;
     }
     int leftheight=height(root.left);
     int rightheight=height(root.right);
     int myheight=Math.max(leftheight,rightheight);
     return  myheight;
     }

public static void preorder(Node root){
if(root==null){
    return;
}
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);

}
public static void postorder(Node root){
     if(root==null){
         return;
     }
     postorder(root.left);
     postorder(root.right);
    System.out.println("");
    System.out.print(root.data+" ");
}
public static void inorder(Node root){
     if(root==null){
         return;
     }
     inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static void levelorder(Node root){
    Queue<Node>q=new LinkedList<>();
    if(root ==null){
        return;
    }
   q.add(root);
  q.add(null);
     while(!q.isEmpty()){
         Node current=q.remove();
        if(current==null){
        System.out.println("");
        if(q.isEmpty()){
            break;
        }
        else{
            q.add(null);
        }
    }else {
        System.out.println(current.data+"");
        if(current.left !=null){
           q.add(current.left) ;
        }
        if(current.right !=null){
            q.add(current.right) ;
        }
    }
}

}
public static int countNode(Node root){
     if(root==null){
         return 0;
     }
     int leftnode=countNode(root.left);
     int rightnode=countNode(root.right);
     return leftnode+rightnode+1;
}
    public static int sumNode(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumNode(root.left);
        int rightsum=sumNode(root.right);
        return leftsum+rightsum+ root.data;
    }
     public static void main(String args[]){
         int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         BinaryTree tree=new BinaryTree();
         Node root= tree.buildtree(node);
      //  System.out.println(root.data);
     // preorder(root);
    //  inorder(root);
    //  postorder(root);
      //levelorder(root);
         System.out.println(countNode(root));
         System.out.println(sumNode(root));
         System.out.println(height(root));
     }
}

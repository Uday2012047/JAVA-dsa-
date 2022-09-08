
public class Binary_SearchTree {
  static  class Node{
     int data;
     Node left;
     Node right;
     Node(int data){
         this.data=data;
         this.left=null;
         this.right=null;
     }

 }
 public static Node insert(Node root,int val){
      if(root==null){
          root=new Node(val);
          return root;
      }
      if(root.data>val){
          root.left=insert(root.left,val);
      }
      else{
          root.right=insert(root.right,val);
      }
      return root;
 }
 public static void inorder(Node root){
      if(root==null){
          return;
      }
      inorder(root.left);
     System.out.println(root.data);
     inorder(root.right);
 }
 public static boolean search(Node root,int key){
      if(root==null){
          return false;
      }
      if(root.data>key){
          return search(root.left,key);
      }
      else if(root.data==key){
          return true;
      }else{
          return search(root.right,key);
      }
 }
 public static Node delet(Node root,int val){
      if(root.data>val){
          root.left=delet(root.left,val);
      } else if (root.data<val) {
          root.right=delet(root.right,val);
      }
      else {
          //case 1 no child
          if(root.left==null && root.right==null){
              return null;
          }
          //case 2 one child
          if(root.left==null){
              return root.right;
          } else if (root.right==null) {
              return root.right;
          }
          //case 3 two child
          Node IS=inoodersuccesor(root.right);
          root.data= IS.data;
         root.right= delet(root.right, IS.data);
      }
      return root;
 }
 public static Node inoodersuccesor(Node root){
      if(root==null){
          return null;
      }
      while ( root.left!=null){
          root=root.left;
      }
      return root;
 }
 public static Node printnodeinrange(Node root,int x,int y){
      if(root==null){
          return root;
      }
      if(root.data>=x &&root.data<=y){
          printnodeinrange(root.left,x,y);
          System.out.print(root.data+" ");
          printnodeinrange(root.right,x,y);
      } else if (root.data>=y) {
          printnodeinrange(root.left ,x,y);
      }
      else {
          printnodeinrange(root.right,x,y);
      }
      return root;
 }

    public static void main(String args[]){
int value[]={5,1,3,4,2,7};
Node root=null;

for (int i=0;i<value.length;i++){
    root=insert(root,value[i]);

}
inorder(root);
        System.out.println();


       // if (search(root,2)){
         //   System.out.println("found");
        //}else System.out.println("not found");
        delet(root,7);

        inorder(root);
        printnodeinrange(root,1,1);
    }
}

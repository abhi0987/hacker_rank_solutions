/**
 * Created by bitu on 5/1/17.
 */
public class AVLtree {

  Node root;

  public int Height(Node n){

      if (n==null){
          return 0;
      }
      return n.height;
  }


  public int getBalance(Node n){
      if (n==null){
          return 0;
      }
      return Height(n.left)-Height(n.right);
  }

  public int max(int x,int y){
      return (x > y)? x : y ;
  }

    Node insert(Node root, int val)
    {
        if (root==null){
            root = new Node(val);
            return root;
        }

        else if(val <= root.data){
            root.left =  insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }


        int balance = getBalance(root);

        if(balance > 1){

            if(height(root.left.left) >= height(root.left.right)){
                return rightRotate(root);
            }else{
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }

        else if(balance < -1){
            if(height(root.right.right) >= height(root.right.left)){
                return leftRotate(root);
            }else{
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        else{

            root.height = 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));
        }

        return root;
    }


     Node rightRotate(Node y){
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return x;
    }

     Node leftRotate(Node x){
        Node y  = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = max(Height(x.left), Height(x.right)) + 1;
        y.height = max(Height(y.left), Height(y.right)) + 1;

        return y;
    }




    static int height(Node n) {
        if(n==null){
            return 0;
        }
        return n.height;
    }
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String args[]){



    }

}



class Node{
    int data , height;
    Node left,right;

    public Node(int d){
        data = d;
        height = 1;
    }
}

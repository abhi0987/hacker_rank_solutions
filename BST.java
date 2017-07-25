/**
 * Created by bitu on 4/1/17.
 */
public class BST {

   BSTnode root;

   public BST(){

       root = null;
   }

   public boolean isEmpty(){
       return root==null;
   }

   public void insert(int data){

       root = insert(root,data);
   }

    private BSTnode insert(BSTnode node, int data) {

       if (node == null){
           node = new BSTnode(data);
       }else {
           if (data <= node.getData()){

               node.left = insert(node.left,data);

           }else {

               node.right = insert(node.right,data);
           }




       }

       return node;
    }


    public void delete(int val){

       if (isEmpty()){

           System.out.println("Tree is EMPTY");
       }else if (search(val)==false){

           System.out.println( val+" is not present");
       }else {
           root = delete(root,val);
           System.out.println(val + " deleted from tree");
       }
    }

    private BSTnode delete(BSTnode root, int val) {
        BSTnode p, p2, n;
        if (root.getData()==val){

            BSTnode lt,rt;
            lt = root.getLeft();
            rt = root.getRight();

            if (lt == null && rt == null){
                return null;
            }else if (rt==null){
                p = lt;
                return p;

            }else if (lt==null){

                p = rt;
                return p;
            }else {

                p2 = rt;
                p = rt;

                while (p.getLeft()!=null){
                    p = p.getLeft();

                }

                p.setLeft(lt);
                return p2;
            }

        }

        if (root.getData()> val){
            n = delete(root.getLeft(), val);
            root.setLeft(n);
        }else {

            n = delete(root.getRight(), val);
            root.setRight(n);
        }



        return root;
    }

    public boolean search(int val){

       return search(root,val);
    }

    private boolean search(BSTnode r, int val) {

        boolean found = false;

        while ((r!=null) && !found){

           int rVal = r.getData();

           if (val < rVal){

               r = r.getLeft();

           }else if (val > rVal){
               r = r.getRight();
           }else {
               found = true;
               break;

           }

            found = search(r,val);


        }

        return found;
    }


    public int countNodes(){

        return countNodes(root);
    }

    private int countNodes(BSTnode root) {
        if (root == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(root.getLeft());
            l += countNodes(root.getRight());
            return l;
        }
    }



    public void inorder(){

        inorder(root);

    }

    private void inorder(BSTnode r) {

        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }


    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BSTnode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BSTnode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }

    public static void main(String args[]){






    }

}



class BSTnode{

    int data;
    BSTnode left,right;

    public BSTnode(){
        left=null;
        right=null;
        data=0;

    }

    public BSTnode(int n){
        left=null;
        right=null;
        data = n;
    }

    public void setLeft(BSTnode n){
        left  = n;
    }

    public void setRight(BSTnode n){

        right = n;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BSTnode getLeft() {
        return left;
    }

    public BSTnode getRight() {
        return right;
    }
}

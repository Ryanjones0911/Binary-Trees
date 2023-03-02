public class app
{
    public static void main(String[] args) {
        Tree newTree = new Tree();

        newTree.Insert('G');
        newTree.Insert('E');
        newTree.Insert('B');
        newTree.Insert('F');
        newTree.Insert('D');
        newTree.Insert('K');
        newTree.Insert('M');
        newTree.Insert('R');
        
        System.out.println("preorder");
        newTree.PreOrderTraversal();

        System.out.println("inorder");
        newTree.InOrderTraversal();

        System.out.println("postorder");
        newTree.PostOrderTraversal();
    }
}
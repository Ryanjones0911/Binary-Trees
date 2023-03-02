class Tree 
{
    //topmost node of the tree
    Node root;
    
    //defines the structure of the nodes of our tree to have left and right children. set to null initially
    static private class Node
    {
        char data;
        Node left;
        Node right;

        //constructor
        Node(char data)
        {
            this.data = data;
        }
    }


    public void Insert(char data)
    {
        root = InsertNode(root, data);
    }

    private Node InsertNode(Node curr, char data)
    {
        //only triggers on an empty tree. will make current node the root of new empty tree
        if(curr == null)
        {
            return new Node(data);
        }
        else
        {
            //push all data smaller than or equal to the root to the left...
            if(data <= curr.data)
            {
                curr.left = InsertNode(curr.left, data);
            }

            //and all larger to the right
            else if(data > curr.data)
            {
                curr.right = InsertNode(curr.right, data);
            }
        }
        return curr;
    }

    public void PreOrderTraversal()
    {
        PreOrderHelper(root);
    }

    private void PreOrderHelper(Node current)
    {
        System.out.println(current.data);

        if(current.left != null)
        {
            PreOrderHelper(current.left);
        }
        if(current.right != null)
        {
            PreOrderHelper(current.right);
        }
    }

    public void InOrderTraversal()
    {
        InOrderHelper(root);
    }

    public void InOrderHelper(Node current)
    {
        if(current.left != null)
        {
            InOrderHelper(current.left);
        }
        System.out.println(current.data);
        if(current.right != null)
        {
            InOrderHelper(current.right);
        }
    }

    public void PostOrderTraversal()
    {
        PostOrderHelper(root);
    }
    private void PostOrderHelper(Node current)
    {
        if(current.left != null)
        {
            PostOrderHelper(current.left);
        }
        if(current.right != null)
        {
            PostOrderHelper(current.right);
        }
        System.out.println(current.data);
    }
}
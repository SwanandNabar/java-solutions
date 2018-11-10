package com.practice;
/**
 * Hello world!
 *
 */
public class App {

    static int counter  = 0;
    static int result;
    public static int kthsmallest(TreeNode root, int k) {

        if (root.left != null) {
            kthsmallest(root.left, k);
        }
        counter ++;

        if (counter == k) {
            return root.val;
        }

        if (root.right != null) {
            kthsmallest(root.right, k);
        }

        return result;
    }



    public static int factorial(int n) {
        int result;
        if (n == 0 || n == 1) {
            return 1;
        }
        result = n * factorial(n-1);
        return result;
    }


    public static void main( String[] args ) {


        TreeNode a = new  TreeNode(3);
        TreeNode d = new TreeNode(1);

        a.left = d;

        TreeNode b = new TreeNode(4);
        a.right = b;

        TreeNode c = new TreeNode(2);
        d.right = c;

//        System.out.println(kthsmallest(a,3));
//        System.out.println(kthsmallest(a,2));
        System.out.println(kthsmallest(a,4));
        System.out.println(kthsmallest(a,1));

        System.out.println( "Hello World!" );

        System.out.println(factorial(5));
    }
}

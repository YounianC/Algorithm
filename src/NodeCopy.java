/**
 * Created by Administrator on 2016/9/17.
 */
public class NodeCopy {

    public static class Node {
        private Node lchild;
        private Node rchild;

        private int val;

        public Node getLchild() {
            return lchild;
        }

        public void setLchild(Node lchild) {
            this.lchild = lchild;
        }

        public Node getRchild() {
            return rchild;
        }

        public void setRchild(Node rchild) {
            this.rchild = rchild;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        Node root = new Node();

        Node ll = new Node();
        ll.setVal(1);
        Node lr = new Node();
        lr.setVal(2);

        Node l = new Node();
        l.setVal(3);
        l.setLchild(ll);
        l.setRchild(lr);

        Node r = new Node();
        r.setVal(4);

        root.setVal(5);
        root.setLchild(l);
        root.setRchild(r);
        Node ne = Copy(root);
    }

    public static Node Copy(Node root) {
        Node r = new Node();
        r.setVal(root.getVal());
        if (root.getLchild() != null) {
            r.setLchild(Copy(root.getLchild()));
        }
        if (root.getRchild() != null) {
            r.setRchild(Copy(root.getRchild()));
        }

        return r;
    }
}

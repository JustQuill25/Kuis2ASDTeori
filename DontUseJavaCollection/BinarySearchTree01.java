package DontUseJavaCollection;

class BinarySearchTree01 {
    private Node01 root;

    public BinarySearchTree01() {
        root = null;
    }

    public void tambahBuku(Buku01 data) {
        root = tambahRekursif(root, data);
    }

    private Node01 tambahRekursif(Node01 root, Buku01 data) {
        if (root == null) {
            root = new Node01(data);
            return root;
        }

        if (data.getIsbn().compareTo(root.data.getIsbn()) < 0)
            root.left = tambahRekursif(root.left, data);
        else if (data.getIsbn().compareTo(root.data.getIsbn()) > 0)
            root.right = tambahRekursif(root.right, data);

        return root;
    }

    public void hapusBuku(String isbn) {
        root = hapusRekursif(root, isbn);
    }

    private Node01 hapusRekursif(Node01 root, String isbn) {
        if (root == null) return root;

        if (isbn.compareTo(root.data.getIsbn()) < 0)
            root.left = hapusRekursif(root.left, isbn);
        else if (isbn.compareTo(root.data.getIsbn()) > 0)
            root.right = hapusRekursif(root.right, isbn);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = hapusRekursif(root.right, root.data.getIsbn());
        }

        return root;
    }

    private Buku01 minValue(Node01 root) {
        Buku01 minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public void tampilkanBuku() {
        tampilkanRekursif(root);
    }

    private void tampilkanRekursif(Node01 root) {
        if (root != null) {
            tampilkanRekursif(root.left);
            System.out.println(root.data);
            tampilkanRekursif(root.right);
        }
    }
}

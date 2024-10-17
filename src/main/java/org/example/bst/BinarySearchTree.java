package org.example.bst;

import java.util.*;

public class BinarySearchTree<E extends Comparable<E>> implements Collection<E> {

    private class Node {
        E value;
        Node left, right;

        Node(E value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;
    private int size;


    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    @Override
    public boolean add(E value) {
        root = insert(root, value);
        return true;
    }

    private Node insert(Node node, E value) {
        if (node == null) {
            size++;
            return new Node(value);
        }
        if (value.compareTo(node.value) < 0) {
            node.left = insert(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public boolean search(E value) {
        return search(root, value) != null;
    }

    private Node search(Node node, E value) {
        if (node == null || node.value.equals(value)) {
            return node;
        }
        if (value.compareTo(node.value) < 0) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public boolean delete(E value) {
        if (search(root, value) == null) return false;
        root = delete(root, value);
        return true;
    }

    private Node delete(Node node, E value) {
        if (node == null) return null;

        if (value.compareTo(node.value) < 0) {
            node.left = delete(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            node.value = findMin(node.right).value;
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    public E findMin() {
        if (root == null) return null;
        return findMin(root).value;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public E findMax() {
        if (root == null) return null;
        return findMax(root).value;
    }

    private Node findMax(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) return true;
        int heightDiff = Math.abs(height(node.left) - height(node.right));
        return heightDiff <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(Node node, int level) {
        if (node == null) {
            return;
        }

        printTree(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + node.value);
        } else {
            System.out.println(node.value);
        }

        printTree(node.left, level + 1);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return search((E) o);
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        return delete((E) o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }
}

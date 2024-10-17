package org.example.bst;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTreeTest {

    @Test
    public void testInsertAndSearch() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(5);
        bst.add(3);
        bst.add(7);

        assertTrue(bst.search(5));
        assertFalse(bst.search(10));
    }

    @Test
    public void testDelete() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(5);
        bst.add(3);
        bst.add(7);

        assertTrue(bst.delete(3));
        assertFalse(bst.search(3));
    }
}


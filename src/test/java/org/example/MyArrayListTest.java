package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class MyArrayListTest {
    /**
     * Method under test: {@link MyArrayList#add(Object)}
     */
    @Test
    public void testAdd() {
        MyArrayList<Object> myArrayList = new MyArrayList<>(3);
        myArrayList.add("Element");
        assertEquals(1, myArrayList.getSize());
    }

    /**
     * Method under test: {@link MyArrayList#add(Object)}
     */
    @Test
    public void testAdd2() {
        MyArrayList<Object> myArrayList = new MyArrayList<>(1);
        myArrayList.add("Element");
        assertEquals(1, myArrayList.getSize());
    }

    /**
     * Method under test: {@link MyArrayList#add(Object)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAdd3() {
        // TODO: Complete this test.
        //   java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at org.example.MyArrayList.add(MyArrayList.java:18)
        //   In order to prevent add(Object)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   add(Object).

        (new MyArrayList<>(0)).add("Element");
    }

    /**
     * Method under test: {@link MyArrayList#get(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGet() {
        // TODO: Complete this test.

        (new MyArrayList<>(3)).get(1);
    }

    /**
     * Method under test: {@link MyArrayList#get(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGet2() {
        // TODO: Complete this test.
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3
        //       at org.example.MyArrayList.getData(MyArrayList.java:47)
        //       at org.example.MyArrayList.get(MyArrayList.java:23)
        //   In order to prevent get(int)
        //   from throwing ArrayIndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   get(int).

        (new MyArrayList<>(3)).get(-1);
    }

    /**
     * Method under test: {@link MyArrayList#get(int)}
     */
    @Test
    public void testGet3() {
        MyArrayList<Object> myArrayList = new MyArrayList<>(3);
        myArrayList.add("Element");
        myArrayList.add("Element");
        assertEquals("Element", myArrayList.get(1));
    }

    /**
     * Method under test: {@link MyArrayList#remove(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRemove() {
        // TODO: Complete this test.

        (new MyArrayList<>(3)).remove(1);
    }

    /**
     * Method under test: {@link MyArrayList#remove(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRemove2() {
        // TODO: Complete this test.

        (new MyArrayList<>(3)).remove(-1);
    }

    /**
     * Method under test: {@link MyArrayList#remove(int)}
     */
    @Test
    public void testRemove3() {
        MyArrayList<Object> myArrayList = new MyArrayList<>(3);
        myArrayList.add("Element");
        myArrayList.add("Element");
        assertEquals("Element", myArrayList.remove(1));
        assertEquals(1, myArrayList.getSize());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MyArrayList#MyArrayList(int)}
     *   <li>{@link MyArrayList#getSize()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertEquals(0, (new MyArrayList<>(3)).getSize());
        assertThrows(NegativeArraySizeException.class, () -> new MyArrayList<>(-1));
    }
}


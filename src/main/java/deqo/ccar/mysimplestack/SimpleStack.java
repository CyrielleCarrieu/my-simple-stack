package deqo.ccar.mysimplestack;

import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();

    /**
     * Returns the numbre of items in this stack.
     */
    public int getSize();

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack whithout removing it from th stack.
     */
    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;

}




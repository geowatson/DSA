/**
 * Interface for List structure
 * @param <Type>
 */
public interface List<Type> {               // structure like this (top)[item] <-> [item] <-> ... <-> [item](end)
    int size();                             // returns size of a list
    boolean isEmpty();                      // returns True if empty

    void append(Type item);                 // add an element to the end of list
    void prepend(Type item);                // add an element to the top of list
    void insert(Type item, int pos);        // add an element to Nth position (0-based)

    Type pop();                             // remove an element from the end of list
    Type pop(int pos);                      // remove Nth element from list (0-based)
    Type[] asArray(Class<Type> type);       // represent list as an array
}
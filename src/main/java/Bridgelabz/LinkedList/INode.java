package Bridgelabz.LinkedList;

public interface INode<K> extends Comparable<INode<K>> {
    K getKey();
    void setKey(K key);

    INode<K> getNext();
    void setNext(INode<K> next);
}
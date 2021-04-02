package Bridgelabz.LinkedList;

public class MyNode<K> implements INode<K> {


    private K key;
    private INode nextNode;

    public MyNode() {
        this.key = null;
        this.nextNode = null;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return this.nextNode;
    }

    @Override
    public void setNext(INode passedNode) {
        this.nextNode = passedNode;
    }
}
package Bridgelabz.LinkedList;

public class MyNode<K> implements INode<K> {

    private K data;
    private INode nextNode;

    public MyNode() {
        this.data = null;
        this.nextNode = null;
    }

    @Override
    public K getData() {
        return this.data;
    }

    @Override
    public void setData(K data) {
        this.data = data;
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
package Bridgelabz.LinkedList;

    public interface INode<T> {
        T getData();
        void setData(T data);

        INode getNext();
        void setNext(INode next);
    }

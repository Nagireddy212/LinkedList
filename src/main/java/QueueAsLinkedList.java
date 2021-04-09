import Bridgelabz.LinkedList.INode;
import Bridgelabz.LinkedList.MyLinkedList;

public class QueueAsLinkedList<K> extends MyLinkedList<K> {
    public void enqueue(INode<K> nodeToEnqueue){
        this.append(nodeToEnqueue);
    }
}
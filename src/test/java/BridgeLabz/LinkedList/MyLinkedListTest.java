package BridgeLabz.LinkedList;

import Bridgelabz.LinkedList.INode;
import Bridgelabz.LinkedList.MyLinkedList;
import Bridgelabz.LinkedList.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    @Test
    public void given3Nodes_AddThemToTheLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given2Nodes_AddThirdNodeInTheMiddleOfLinkedList_AndCheckThatTheyAreAddedInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> nodeToInsertInBetweenList = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(70);
        nodeToInsertInBetweenList.setKey(30);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.insert(nodeToInsertInBetweenList , 56);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_RemoveHeadNodeOfLinkedList_AndCheckThatListIsInCorrectOrder(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popHead();

        boolean testVariable = myLinkedList.getHead().getKey().equals(30)
                && myLinkedList.getHead().getNext().getKey().equals(70);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_RemoveTailNodeOfLinkedList_AndCheckThatListIsInCorrectOrder() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> firstNode = new MyNode<>();
        MyNode<Integer> secondNode = new MyNode<>();
        MyNode<Integer> thirdNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.popTail();

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30);
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given5Nodes_searchEveryNodeOfLinkedListByKey_AndCheckThatSearchMethodReturnsCorrectPosition() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        INode<Integer> fifthNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        fourthNode.setKey(26);
        fifthNode.setKey(48);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);
        myLinkedList.append(fifthNode);

        boolean testVariable = myLinkedList.searchNodeByKey(56) == 0
                && myLinkedList.searchNodeByKey(30) == 1
                && myLinkedList.searchNodeByKey(70) == 2
                && myLinkedList.searchNodeByKey(26) == 3
                && myLinkedList.searchNodeByKey(48) == 4;
        Assertions.assertTrue(testVariable);
    }

    @Test
    public void given3Nodes_insertOneNodeBeforeSpecificNode_AndCheckItWasInsertedInCorrectPosition(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> nodeToInsertInBetween = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(70);
        nodeToInsertInBetween.setKey(40);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(nodeToInsertInBetween,30);
        /*boolean testVariable = myLinkedList.searchNodeByData(56) == 0
                && myLinkedList.searchNodeByData(30) == 1
                && myLinkedList.searchNodeByData(40) == 2
                && myLinkedList.searchNodeByData(70) == 3;
        */
        boolean testVariable2 = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getHead().getNext().getNext().getKey().equals(40)
                && myLinkedList.getTail().getKey().equals(70);

        Assertions.assertTrue(testVariable2);
    }

    @Test
    public void given4NodesInOneLinkedList_DeleteOneSpecificNodeThenGetListSize_AndCheckIfItWasDeletedFromList(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        INode<Integer> firstNode = new MyNode<>();
        INode<Integer> secondNode = new MyNode<>();
        INode<Integer> thirdNode = new MyNode<>();
        INode<Integer> fourthNode = new MyNode<>();
        firstNode.setKey(56);
        secondNode.setKey(30);
        thirdNode.setKey(40);
        fourthNode.setKey(70);
        myLinkedList.append(firstNode);
        myLinkedList.append(secondNode);
        myLinkedList.append(thirdNode);
        myLinkedList.append(fourthNode);
        myLinkedList.deleteNodeByKey(40);

        boolean testVariable = myLinkedList.getHead().getKey().equals(56)
                && myLinkedList.getHead().getNext().getKey().equals(30)
                && myLinkedList.getTail().getKey().equals(70)
                && myLinkedList.getSize() == 3;

        Assertions.assertTrue(testVariable);
    }
    }

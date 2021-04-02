package Bridgelabz.LinkedList;

    public class MyNode<K extends Comparable<K>> implements INode<K>{


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

        @Override
        public int compareTo(INode<K> currentNode) {
            if (this.getKey().equals(null) || currentNode.getKey().equals(null)){
                return 0;
            }
            return this.getKey().compareTo(currentNode.getKey());
        }

        @Override
        public int compareTo(K key) {
            if (this.key == null || key == null){
                return 0;
            }
            return this.key.compareTo(key);
        }
}
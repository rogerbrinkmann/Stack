public class Stack<T> {
    private StackNode top;

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(T obj) {
        StackNode newNode = new StackNode(obj, null);
        if (!isEmpty()) {
            newNode.setNextNode(this.top);
        }
        this.top = newNode;
    }

    public T pop() {
        T obj = top.getContent();
        this.top = top.getNextNode();
        return obj;
    }

    public T peek() {
        return this.top.getContent();
    }

    public class StackNode {
        private StackNode nextNode;
        private T obj;

        public StackNode(T obj, StackNode nextNode) {
            this.obj = obj;
            this.nextNode = nextNode;
        }

        public StackNode getNextNode() {
            return nextNode;
        }
        
        public void setNextNode(StackNode nextNode) {
            this.nextNode = nextNode;
        }

        public T getContent() {
            return this.obj;
        }
    }
}

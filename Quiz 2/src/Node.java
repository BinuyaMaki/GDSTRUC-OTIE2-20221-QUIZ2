public class Node {
    private Element element;
    private Node nextElement;

    public Node(Element element) {
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Node getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
}

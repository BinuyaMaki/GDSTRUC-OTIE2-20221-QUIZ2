public class ElementLinkedList {
    private Node head;

    // function to add new element to front
    public void addToFront(Element element) {
        Node elementNode = new Node(element);
        elementNode.setNextElement(head);
        head = elementNode;
    }

    // function to remove first node in linked list
    public void deleteFirst() {
        // only delete if head is not null
        if (this.head != null) {
            //if head is not null, create temp node pointing to head
            Node temp = head;
            // move head to next
            this.head = this.head.getNextElement();
            // delete temp
            temp = null;
        }
    }

    // function to count number of nodes
    public void countElements() {
        int count = 0;
        //current pointer to head
        Node current = head;

        while(current != null) {
            // +1 for each node
            count++;
            current = current.getNextElement();
        }
        System.out.print("Elements in list: " + count + "\n");
    }

    // function that does "contains()"
    public void containsElement(Element element) {
        int count = 0;
        boolean condition = false;
        //current pointer to head
        Node current = head;

        while(current != null) {
            // +1 for each node
            count++;

            if (current.getElement() == element) {
                condition = true;
            }

            current = current.getNextElement();
        }
        System.out.print("Does " + element + " exist in the list?: " + condition + "\n");
    }

    // function that does "indexOf()"
    public int indexOfElement(Element element) {
        int count = 0;
        int index = 0;

        //current pointer to head
        Node current = head;

        while(current != null) {

            if (current.getElement() == element) {
                return count;
            }

            // +1 for each node
            count++;
            current = current.getNextElement();
        }
        return -1;
    }

    // function to print the elements in linked list
    public void printList() {
        System.out.print("HEAD -> ");
        Node current = head;

        while (current != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNextElement();
        }

        System.out.print(" NULL\n");
    }

}

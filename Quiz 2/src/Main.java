public class Main {
    public static void main(String[] args) {
        // elements in linked list
        Element heathcliff = new Element("Heathcliff");
        Element asuna = new Element("Asuna");
        Element lethalbacon = new Element("LethalBacon");
        Element hpdeskjet = new Element("HPDeskjet");

        // adding to linked list
        ElementLinkedList linkedList = new ElementLinkedList();
        linkedList.addToFront(heathcliff);
        linkedList.addToFront(asuna);
        linkedList.addToFront(lethalbacon);
        linkedList.addToFront(hpdeskjet);

        // initial print of linked list
        linkedList.printList();

        // remove first node from linked list + count nodes
        linkedList.deleteFirst();
        linkedList.countElements();

        // print again after deletion + recount
        linkedList.printList();
        linkedList.countElements();

        // verifying the deletion of respective node
        linkedList.containsElement(hpdeskjet);
        int index = linkedList.indexOfElement(hpdeskjet);
        System.out.print("The element is found in " + index + "\n");

        linkedList.containsElement(asuna);
        int secondIndex = linkedList.indexOfElement(asuna);
        System.out.print("The element is found in " + secondIndex + "\n");


    }
}
// AssignmentTask2: Sum of Nodes
public class AssignmentTask2 {
    
    // MUST SUBMIT this method
    public static int sumDist(Node head, Integer[] distArr) {
        // To Do

        int Some = 0;

        for (Integer val :  distArr) {
            Node temp = head;
            for (int i = 1; i <= val; i++) {
                temp = temp.next;

                if (temp == null) {
                    break;
                }
            }
            if (temp != null) {
                int num = (int) temp.elem;   // elem is an object so it needs to be cast to int;
                Some += num;
            }
        }

        return Some; // Remove this line. Didn't.
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}

public class App {
    public static void main(String[] args) {
        LinkedListOfInteger l = new LinkedListOfInteger();
        l.addIncreasingOrder(10);
        l.addIncreasingOrder(5);
        l.addIncreasingOrder(30);
        l.addIncreasingOrder(20);
        l.addIncreasingOrder(7);
		System.out.println("====================");
		System.out.println("LISTA");
		System.out.println(l);
    }
}

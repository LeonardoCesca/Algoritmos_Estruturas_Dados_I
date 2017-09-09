public class App {

    public static void main(String[] args) {
        LinkedListOfInteger l = new LinkedListOfInteger();

        l.add(32);
        l.add(15);
        l.add(10);
        l.add(35);
        l.add(35);
        //l.removeByIndex(1);
       /* if (l.findNodo(l.) == true)
          System.out.println("Excluiu");
        else
          System.out.println("Não excluiu");
          */
       l.unique();
        System.out.println(l);

        /*
      l.addIncreasingOrder(10);
      l.addIncreasingOrder(4);
      l.addIncreasingOrder(5);
      l.addIncreasingOrder(20);
       
       System.out.println(l);
           //   System.out.println(l.get(2));

       // l.imprimeInvertidoR(l.qtdLista());
           
         */

    }
}

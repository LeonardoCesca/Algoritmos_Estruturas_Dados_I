/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Cesca
 */
public class app {

    public static void main(String[] args) {
        teste l = new teste();

        l.add(32);
        l.add(15);
        l.add(10);
        l.add(35);
        l.add(35);
        l.removeByIndex(2);
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

        /*
        l.addIncreasingOrder(10);
        l.addIncreasingOrder(5);
        l.addIncreasingOrder(30);
        l.addIncreasingOrder(20);
        l.addIncreasingOrder(7);
		System.out.println("====================");
		System.out.println("LISTA");
		System.out.println(l);
    }
*/
}
}

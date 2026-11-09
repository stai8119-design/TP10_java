package tp10.ex1;

public class Triplet<T> {
 
 private T elem1;
 private T elem2;
 private T elem3;

 public Triplet(T elem1, T elem2, T elem3) {
     this.elem1 = elem1;
     this.elem2 = elem2;
     this.elem3 = elem3;
 }

 public T getElem1() {
     return elem1;
 }

 public T getElem2() {
     return elem2;
 }

 public T getElem3() {
     return elem3;
 }

 public void affiche() {
     System.out.println("Les elements de Triplet sont : [" + elem1 + ", " + elem2 + ", " + elem3 + "]");
 }
}

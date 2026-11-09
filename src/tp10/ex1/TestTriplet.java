package tp10.ex1;

public class TestTriplet {
    
    public static void main(String[] args) {
        Triplet<Integer> tInt = new Triplet<>(25, 77, 14);
        tInt.affiche();
        Triplet<String> tStr = new Triplet<>("Salma", "EEEE", "POO");
        tStr.affiche();
        System.out.println("Le deuxieme element : " + tInt.getElem2());
    }
}

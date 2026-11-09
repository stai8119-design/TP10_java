package tp10.ex2;

public class TestTripletH {
    
    public static void main(String[] args) {
      
        TripletH<Integer, String, Double> th = new TripletH<>(15, "reponse", 7.81);
        th.affiche();
        TripletH<String, Integer, Boolean> th2 = new TripletH<>("Salma", 25, true);
        th2.affiche();
    }
}
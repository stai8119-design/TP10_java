package tp10.ex2;

public class TripletH<A, B, C> {
    
    private A e1;
    private B e2;
    private C e3;

    

    public TripletH(A e1, B e2, C e3) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}


    public A getE1() {
		return e1;
	}



	public B getE2() {
		return e2;
	}



	public C getE3() {
		return e3;
	}


    public void affiche() {
        System.out.println("Les elements de TripletH sont : [" + e1 + ", " + e2 + ", " + e3 + "]");
    }
}

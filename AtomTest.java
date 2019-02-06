package lab2;


public class AtomTest {
	public static void main(String[] args) {
		Atom U = new Atom(92, 146, 92);
		
		System.out.println(U.getAtomicMass());
		System.out.println(U.getAtomicCharge());
		
		U.decay();
		
		System.out.println(U.getAtomicMass());
		System.out.println(U.getAtomicCharge());
	}
}
package Manual_Control;
import SUT.Testable;

public class Manual {

	public static void main(String[] args) {
		
		Testable example = new Testable();
		double test = example.AreaRectangle(2.0, 4.0);
		System.out.println(test);
	}

}

package xyzpackage;
import abcpackage.*;
public class Test extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		/*It will throw error because we are trying to access
		 * the default method in another package
		 */
		System.out.println(obj.addTwoNumbers(30, 15
				));

	}

}

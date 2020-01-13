package Student;

/**
 *
 * @author Zehao Chen
 */
public class Student {

	private int[] a = new int[5];
	private int id = 2;
	private String name = "Sam";
	private String address = "199 Main Road";

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}

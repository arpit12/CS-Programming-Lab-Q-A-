public class Cube1 {

	int length;
	int breadth;
	int height;
	public int getVolume() {
		return (length * breadth * height);
	}
	Cube1() {
		this.length = 10;
		this.breadth = 10;
		this.height = 10;
	}
	Cube1(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}
	public static void main(String[] args) {
		Cube1 cubeObj1, cubeObj2;
		cubeObj1 = new Cube1();
		cubeObj2 = new Cube1(10, 20, 30);
		System.out.println("Volume of Cube1 is : " + cubeObj1.getVolume());
		System.out.println("Volume of Cube1 is : " + cubeObj2.getVolume());
	}
}


class Box{
		private int l,b;
		public Box(int l, int b) {
			this.l=l;
			this.b=b;
		}
		public void print() {
			System.out.println(" l: "+l+" b: "+b);
		}
	}

	class Box3d extends Box{
		private int h;
		
		public Box3d(int l,int b, int h) {
		super(l,b);
		this.h=h;
		}
		public void print() {
			super.print();
			System.out.println(" h: "+h);
		}
	}
	
	class Box3dWithColor extends Box3d{
		private String color;
		
		public Box3dWithColor(int l, int b, int h, String color) {
			super(l,b,h);
			this.color=color;
		}
		
		public void print() {
			super.print();
			System.out.println(" color: "+color);
		}
	}

public class BoxExample {
	
	public static void main(String[] args) {
		
		Box3dWithColor box= new Box3dWithColor(2,4,6,"red");
		box.print();
		
	}
}

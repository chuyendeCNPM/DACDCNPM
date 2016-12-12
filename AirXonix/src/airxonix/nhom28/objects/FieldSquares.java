package airxonix.nhom28.objects;
import airxonix.nhom28.interfaces.IChangeColor;
public class FieldSquares extends NonMoveObject {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public FieldSquares(IChangeColor changeColor) {
		super(changeColor);
		this.size = 5;
	}

}

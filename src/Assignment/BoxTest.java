package Choo;

public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> i = new Box<>();
		i.set(new Integer(100));
		System.out.println(i.get());

		Box<String> s = new Box<>();
		s.set("�����̳�!");
		System.out.println(s.get());
	}
}
class Box<T>{
	private T data;
	public void set(T data) {this.data=data;}
	public T get() {return data;}
}
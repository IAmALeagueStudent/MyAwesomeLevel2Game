
public class MyCustomSomething <T>{
	T[] customList;
	
	public MyCustomSomething() {
		customList = (T[])new Object[0];
	}
	
	public T get(int location) {
		return customList[location];
	}
	
	public void add(T value) {
		T[] newArray = (T[])new Object[customList.length + 1];
		for(int i = 0; i < customList.length; i++) {
			newArray[i] = customList[i];
		}
		newArray[newArray.length - 1] = value;
		customList = newArray;
	}
	
}

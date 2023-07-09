
public class Cat extends Animal implements ILand {
	
	//field
	private final int numberOfLegs;//האם זה נכון לעשות את זה פינל
	
	//c-tor
	public Cat(boolean mammals, boolean carnivorous, int mood) {
		super(mammals,carnivorous,mood);
		this.numberOfLegs=4;
	}
	
	@Override
	public void sayHello() {
		System.out.println("meow~");
	}
	
	@Override
	public void sayHello(int mood) {
		if(mood==MOOD_HAPPY)
			System.out.println("purr, purr");
		if(mood==MOOD_SCARE)
			System.out.println("hiss");
	}
	
    // function that returns how many legs the dog has
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}

}

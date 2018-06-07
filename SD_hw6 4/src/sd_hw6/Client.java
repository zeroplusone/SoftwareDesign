package sd_hw6;

public class Client {
	public static void main(String[] args){
		LibraryController lib=new MappingA();
		lib.func();
		lib=new MappingB();
		lib.func();
	}
}

package demothreads;

public class MainClass {
public static void main(String[] args) {
	Hi i=new Hi();
	i.setPriority(1);
	i.start();
	Hello h=new Hello();
	h.setPriority(2);
	
	h.start();
	
}
}

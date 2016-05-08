package persp.lesson1;

public class MyBox {
	private String material;
	protected int price;
	private int weight;
	int height;
	private String colour;
	boolean isOpen; //default=false.
	public static int counter=0;
	public static String[] colours={"Red","Blue","Grey","Black"};
	
	public MyBox(String material, int price, int weight, int height, String colour, boolean isOpen) {
		super();
		this.setMaterial(material);
		this.price = price;
		this.weight = weight;
		this.height = height;
		this.colour = colour;
		this.isOpen = isOpen;
		counter++;
	}
	public MyBox(){
		isOpen=true;
		counter++;
	}
	
	public MyBox(String c){
		colour=c;
		counter++;
	}
	public MyBox(int height){
		this.height=height;
		counter++;
	}
	
	public MyBox(int weight, String colour, boolean isOpen) {
		super();
		this.weight = weight;
		this.colour = colour;
		this.isOpen = isOpen;
		counter++;
	}
	
	public void getInfo(){
		System.out.println(colour+" "+weight+" "+isOpen);
	}
	public void setColour(String c){
		colour=c;
	}
	public String getColour(){
		showResult();
		return colour;
	}
	public void setParam(String c, int weight) {
		showResult();
		
	}
	private void showResult(){
		System.out.println("Nothing has");  
	}
	
    public static MyBox [] fillBoxes(int num) {
    	MyBox storage1[]=new MyBox[num];
        for (int i = 0; i < storage1.length; i++) {

            storage1[i]  = new MyBox((int) (Math.random()*100), MyBox.colours[(int) (Math.random()*4)], Math.random()>0.5?true:false); 
    	
		
	}
        return storage1;
	
    }
    static void getAllInfo(MyBox [] boxes){
    	for (int i = 0; i < boxes.length; i++) {
    		System.out.println(counter);
			boxes[i].getInfo();
		}
    	
    }
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}

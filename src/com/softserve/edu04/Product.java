package edu04;

public class Product {

	private String name;
	private int price;
	private int quantity;
	
	Product (){
		
	}
	
	Product (String name, int price, int quantity) {
		   this.name = name;
	       this.price = price;
	       this.quantity = quantity;
	}
	
	   public String getName() {
	       return name;
	   }

	   public double getPrice() {
	       return price;
	   }
	   
	   public double getQuantity() {
	       return quantity;
	   }
	   
	   public void setName(String name) {
	       this.name = name;
	   }
	   
	   public void setPrice(int price) {
	       this.price = price;
	   }

	     public void setQuantity(int quantity) {
	       this.quantity = quantity;
	   }
	     Product p1 = new Product("TV", 1000, 1000 );
	     Product p2 = new Product("Phone", 2000, 2000 );
	     Product p3 = new Product("Laptop", 3000, 3000 );
	     Product p4 = new Product("VR", 4000, 4000 );
	     Product[] products = {p1, p2, p3, p4};
	     
	   
	   
	     public void mostExpencive () {
	    	 Product mp = new Product("", 0, 0);
	    	 for ( int i = 0; i < products.length; i++) {
	    		 if (mp.getPrice() < products[i].getPrice()){
	    		mp=products[i];
	    }
	    	 }
	    	 
	    	 System.out.println("The most expansive product is - " + mp.getName() + "Its quantity=" + mp.getQuantity() );
	    	
	     }
	     
	     public void maxQuantity () {
	    	 Product mq = new Product("", 0, 0);
	    	 for ( int i = 0; i < products.length; i++) {
	    		 if (mq.getQuantity() < products[i].getQuantity()){
	    		mq=products[i];
	    }
	    	 }
	    	 
	    	 System.out.println("The biggest Quantity has - " + mq.getName() + "Its quantity=" + mq.getQuantity() );
	    	
	     }
	     
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxQuantity();
		mostExpencive();
	}

}

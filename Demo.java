public class Demo{

	public static void main(String args[]){
	
	Artist a1 = new Artist("Picasso");
	Artist a2 = new Artist("Ahmad");	
	

	
	
	Artwork art1 = new Artwork("Legend",2024,a1);
	
	art1.display();
	
	Artwork art2 = new Artwork("Flag",2021);
	
	art2.display();
	
	
	art2.shallow(a1);
	art1.display();
	a1.display();
		
	art1.deep(a2);
	art1.display();
	art2.display();






	}
		
	
}
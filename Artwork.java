public class Artwork{

	private String title;
	private int year;
	Artist artist;
	
	public void setArtist(Artist artist){
		this.artist=artist;
	}
	public Artist getArtist(){

	return artist;
	}
	
	Artwork(String title , int year,Artist artist){
	this.title = title;
	this.year = year;
	this.artist = artist;
	
	}
	Artwork(String title , int year){
	this.title = title;
	this.year = year;
	this.artist = new Artist("Ali ");
	}
	
	
	public void setTitle(String title ){
	this.title = title;
	}
	public String getTitle(){
	return title;
	}
	
	public void setYear(int year){
	this.year = year;
	}
	
	public int getYear(){
	return year;
	}
	
	public void display(){
	
	System.out.println("Title :"+title);
	System.out.println("Year :"+year);
	System.out.println("Artist name :"+artist.getName());


	}
		
		
	public Artist shallow(Artist artist){
	
		this.artist = artist;
		return this.artist;
	
	}
	public Artist deep(Artist artist){
		Artist art2 = new Artist(artist);
		return art2;
	}
	

}
public class Artist{
	
	private String name;


	Artist(String name){
		this.name=name;	
	}

	public void setName(String name){
	this.name=name;
	}
	public String getName(){
	return name;
	}
	
	public void display(){
	
	System.out.printf("Name : %-20s",name);
	}


	Artist(Artist artist){
	this.name = artist.name;	
	}



}
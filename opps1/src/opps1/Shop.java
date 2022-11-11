package opps1;

public class Shop {
	String name;
	String location;
	Soap soap;
	Shampoo shampoo;
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Soap getSoap() {
		return soap;
	}
	public void setSoap(Soap soap) {
		this.soap = soap;
	}
	public Shampoo getShampoo() {
		return shampoo;
	}
	public void setShampoo(Shampoo shampoo) {
		this.shampoo = shampoo;
	}*/
	
	public void setName(String name) {
		this.name=name;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public void setSoap(Soap soap) {
		this.soap=soap;
	}
	public void setShampoo(Shampoo shampoo) {
		this.shampoo=shampoo;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public Soap getSoap() {
		return soap;
	}
	public Shampoo getShampoo() {
		return shampoo;
	}
	
	public Shop(String name,String location,Soap soap,Shampoo shampoo) {
		this.name=name;
		this.location=location;
		this.soap=soap;
		this.shampoo=shampoo;
	}
	
	public String toString() {
		return name+" "+location+" "+soap.toString()+" "+shampoo.toString();
	}

}

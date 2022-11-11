package collection3;

public class Sport {
	private String name;
	private int noOfPlayers;
	private int noOfSubstitute;
	private String jersyColor;
	private boolean isIndoor;
	
	public Sport(String a,int b,int c,String d,boolean e) {
		name=a;
		noOfPlayers=b;
		noOfSubstitute=c;
		jersyColor=d;
		isIndoor=e;
	}
	public String toString() 
	{
		return (name.toUpperCase()+" "+noOfPlayers+" "+noOfSubstitute+" "+jersyColor.toLowerCase()+" "+isIndoor);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public int getNoOfSubstitute() {
		return noOfSubstitute;
	}
	public void setNoOfSubstitute(int noOfSubstitute) {
		this.noOfSubstitute = noOfSubstitute;
	}
	public String getJersyColor() {
		return jersyColor;
	}
	public void setJersyColor(String jersyColor) {
		this.jersyColor = jersyColor;
	}
	public boolean getIsIndoor() {
		return isIndoor;
	}
	public void setIndoor(boolean isIndoor) {
		this.isIndoor = isIndoor;
	}
	

}

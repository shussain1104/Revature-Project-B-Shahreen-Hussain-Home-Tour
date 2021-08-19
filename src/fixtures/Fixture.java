
package fixtures;
public abstract class Fixture {

	String name;
	String shortDescription;
	String longDescription;
	public Fixture() {
		// TODO Auto-generated constructor stub
	}
	public Fixture(String name, String shortDescription, String longDescription)
	{
		this.name = name;
		this.shortDescription=shortDescription;
		this.longDescription=longDescription;
	}
	public String getName()
	{
		return name;
	}
	//Getters - return the value
	public String getShortDescription()
	{
		return shortDescription;
	}
	public String getLongDescription()
	{
		return longDescription;
	}
	//Setters- sets String value equal to the variables declared in this class
	public void setName(String name)
	{
		this.name = name;
	}
	public void setlongDescription(String longDescription)
	{
		this.longDescription = longDescription;
	}
	public void setShortDescription(String shortDescription)
	{
		this.shortDescription = shortDescription;
	}
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub

	}**/

}

public class Department{
	
	private int id;
	private String nam_of_dep;
	private String nam_of_hed;
	
	public Department(int id ,String nam_of_dep,String nam_of_hed){
		
		this.id = id;
		this.nam_of_dep = nam_of_dep;
		this.nam_of_hed = nam_of_hed;
	}
	
	public void sethed(String nam_of_hed){
		
		this.nam_of_hed = nam_of_hed;
	}
	public String gethed(){
		
		return nam_of_hed;
		
	}
	
}
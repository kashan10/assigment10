public class Faculty {
	
	private int id;
	private String nam_of_fac;
	private String nam_of_dean;
	 Department dep[];
	
	public Faculty(int id , String nam_of_fac , Department dep[]){
		
		this.id = id;
		this.nam_of_fac =nam_of_fac;
		this.dep = dep;
		
	}
	
	public void setdean( String nam_of_dean ){
		
		
		this.nam_of_dean=nam_of_dean;
		
	}
	public String getdean(){
		
		return nam_of_dean;
	}
	
}

public class Driver{
	
	public static void main(String args[]){
		
		Department[] arr = new Department[3];
		
		arr[0]=new Department(9865,"Physics","Saman");
		arr[1]=new Department(6846,"Chemistry","Nuwan");
		arr[2]=new Department(3254,"Mathematics","Namal");
		Faculty fac = new Faculty (1234,"Science","Nimal",arr);
		
		Department[] arr2 = new Department[2];
		arr2[0]=new Department(2576,"Civil","Kasun");
		arr2[1]=new Department(4523,"Mechanical","Dinesh");
		Faculty fac2 = new Faculty (3784,"Engineering","Supun",arr2);
		
		
		System.out.println("Science dean "+fac.getdean());
		for(int i=0;i<fac.dep.length;i++){
			System.out.println("Department head "+fac.dep[i].gethed());
		}
		System.out.println("");
		System.out.println("Engineering dean "+fac2.getdean());
		for(int i=0;i<fac2.dep.length;i++){
			System.out.println("Department head "+fac2.dep[i].gethed());
		}
		
		//delete Engineering fac
		System.out.println("delete Engineering fac");
		fac2 = null;
		System.out.println("Engineering department access");
		//Engineering department access 
		System.out.println("Department head "+fac2.dep[1].gethed());
		
	}
}
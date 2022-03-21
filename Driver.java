public class Driver{
	
	public static void main(String args[]){
		
		Department[] arr = new Department[3];
		
		arr[0]=new Department(9865,"Physics");
		arr[1]=new Department(6846,"Chemistry");
		arr[2]=new Department(3254,"Mathematics");
		Faculty fac = new Faculty (1234,"Science",arr);
		
		Department[] arr2 = new Department[2];
		arr2[0]=new Department(2576,"Civil");
		arr2[1]=new Department(4523,"Mechanical");
		Faculty fac2 = new Faculty (3784,"Engineering",arr2);

		// set dean
		fac.setdean("Nimal");
		fac2.setdean("Supun");

		//set head of Science
		fac.dep[0].sethed("Saman");
		fac.dep[1].sethed("Nuwan");
		fac.dep[2].sethed("Namal");

		//set head of Engineering fac
		fac2.dep[0].sethed("Kasun");
		fac2.dep[1].sethed("Dinesh");
		
		
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

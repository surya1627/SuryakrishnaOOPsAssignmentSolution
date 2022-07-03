public class Main
{
	public static void main(String[] args)
	{
		AdminDepartment ad=new AdminDepartment();						//creating AdminDepartment object
		System.out.println("Welcome to "+ad.departmentName());			//printing results of all methods
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		HrDepartment hr=new HrDepartment();								//Creating HrDepartment object
		System.out.println("Welcome to "+hr.departmentName());			//printing results of all methods
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		TechDepartment td=new TechDepartment();							//creating TechDepartment object
		System.out.println("Welcome to "+td.departmentName());			////printing results of all methods
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}
}
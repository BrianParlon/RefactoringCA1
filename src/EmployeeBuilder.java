public class EmployeeBuilder {
	
    private int employeeId;
    private String pps,firstName, surname, department;
    private char gender;
    private double salary;
    private boolean fullTime;

    public EmployeeBuilder() {
    	
    }

    //employeeId
    public EmployeeBuilder id(int employeeId) {
        
    	this.employeeId = employeeId;
        return this;
    	}
    
    //pps number
    public EmployeeBuilder pps(String pps) {
        this.pps = pps;
        return this;
    	}

    //surname
    public EmployeeBuilder surname(String surname) {
        this.surname = surname;
        return this;
    	
    	}
    
    //firstName
    public EmployeeBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    	}
   
    //gender status
    public EmployeeBuilder gender(char gender) {
        this.gender = gender;
        return this;
    	}

    //department
    public EmployeeBuilder department(String department) {
        this.department = department;
        return this;
    	}

    //salary amount
    public EmployeeBuilder salary(double salary) {
        this.salary = salary;
        return this;
    	}

    //fulltime status
    public EmployeeBuilder fullTime(boolean fullTime) {
        this.fullTime = fullTime;
        return this;
    	}
    //returns new employee object
    public Employee build() {
    	return new Employee(employeeId, pps, surname, firstName, gender, department, salary, fullTime);
    	
    }
 }

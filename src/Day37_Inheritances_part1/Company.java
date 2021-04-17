package Day37_Inheritances;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name="Tom";
		emp1.age=27;
		emp1.jobTitle="SDET";
		emp1.gender='M';
		
		emp1.work();
		
		emp1.eat("Salad");
		
	}

	@Override
	public String toString() {
		return "Company [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

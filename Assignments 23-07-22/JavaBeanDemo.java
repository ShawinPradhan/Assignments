package oopsdemo;
/*
 * no-args constructor
 * parameterized constructor
 * toString() method
 * setter and getter method
 * maintain encapsulation- all var will be private
 */

class College
{
	
private int collegeId;
private String collegeName;

public College() {
	super();
	// TODO Auto-generated constructor stub
}

public College(int collegeId, String collegeName) {
	super();
	this.collegeId = collegeId;
	this.collegeName = collegeName;
}

public int getCollegeId() {
	return collegeId;
}

public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("College [collegeId=").append(collegeId).append(", collegeName=").append(collegeName).append("]");
	return builder.toString();
}




}



public class JavaBeanDemo {

	public static void main(String[] args) {
		College c1=new College();
		c1.setCollegeId(101);
        c1.setCollegeName("SJC");
        System.out.println(c1);
        
        System.out.println(c1.getCollegeId()+" "+c1.getCollegeName());
        
        
        College c2=new College(102, "Great Learning");
        System.out.println(c2.getCollegeId()+" "+c2.getCollegeName());
	}

}

class Icard
{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String student_course;
private String student_adhaar;
public void setCollege_name(String college_name){this.college_name=college_name;}
public String getCollege_name(){return college_name;}
public void setCollege_address(String college_address){this.college_address=college_address;}
public String getCollege_address(){return college_address;}
public void setAy_start(int ay_start){this.ay_start=ay_start;}
public int getAy_start(){return ay_start;}
public void setAy_end(int ay_end){this.ay_end=ay_end;}
public int getAy_end(){return ay_end;}
public void setId(int id){this.id=id;}
public int getId(){return id;}
public void setStudent_name(String student_name){this.student_name=student_name;}
public String getStudent_name(){return student_name;}
public void setStudent_course(String student_course){this.student_course=student_course;}
public String getStudent_course(){return student_course;}
public void setStudent_adhaar(String student_adhaar){this.student_adhaar=student_adhaar;}
public String getStudent_adhaar(){return student_adhaar;}
}
class BCA
{
public static void main(String args[])
{
Icard ob=new Icard();
ob.setCollege_name("MOTHER THERESA INSTITUTIONS OF INGINNERING AND TECHNOILGY");
ob.setCollege_address("melumoi-palamaner");
ob.setAy_start(2022);
ob.setAy_end(2026);
ob.setId(505);
ob.setStudent_name("roshini");
ob.setStudent_course("COMPUTER SCIENCE AND ENGINNERING");
ob.setStudent_adhaar("774353212321");
System.out.println(ob.getCollege_name());
System.out.println(ob.getCollege_address());
System.out.println("ay_start:"+ob.getAy_start());
System.out.println("ay_end:"+ob.getAy_end());
System.out.println("id:"+ob.getId());
System.out.println(ob.getStudent_name());
System.out.println(ob.getStudent_course());
System.out.println(ob.getStudent_adhaar());
}
}
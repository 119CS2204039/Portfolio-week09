package week09;
import java.util.Scanner;
public class Studenttt 
{
	String name;
	float[]CIE= {0,0,0};
	float avg;
	byte rollNo;
	void setStudenttt(String n,float ia[],byte rno)
	{
		name=n;
		avg=0.0f;
		rollNo=rno;
		for(byte i=0;i<3;i++)
		CIE[i]=ia[i];
		this.calculateAverage();
	}
	void calculateAverage() 
	{
		float sum=0.0f;
		for(byte i=0;i<3;i++)
		sum=sum+CIE[i];
		avg=sum/3.0f;
	}
	void showStudenttt()
	{
		System.out.println(rollNo+".\t\t"+name+"\r\r"+avg+"\t\t");
	}
}
class Grade extends Studenttt
{
	final byte grace =10; float attendance;
	Scanner inScanner =new Scanner(System.in);
	void setStudent(String n,float ia[],byte rno)
	{
		System.out.println("Enter the attendance of the student...");
		attendance=inScanner.nextFloat();
		if (attendance >= 75.0f)
		{
			ia[2]=grace;
			super.setStudenttt(n, ia, rno);
		}
		else
			super.setStudenttt(n, ia, rno);
	}
}
public class Studenttt
{
	public static void main(String args[])
	{
		Grade deeps=new Grade();
		float[] cie= {1/8.4f,23.7f,0};
		deeps.setStudenttt("Deepika",cie,(byte)15);
		System.out.println("The internal deatils of the student");
		System.out.println("RollNo.\tName\t\tAverage");
		deeps.showStudenttt();
	}
}

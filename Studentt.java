package week09;
public class Studentt
{
	String name;
	float[] CIE= {0,0,0};
	float avg;
	byte rollNo;
	void setStudentt(String n,float ia[],byte rno)
	{
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollNo=rno;
		for(byte i=0;i<3;i++)
		{
			CIE[i]=ia[i];
			sum=sum+CIE[i];
		}
		avg=sum/3.0f;
	}
	void setStudentt(String n,float ia1,float ia2,byte rno)
	{
		name=n;
		rollNo=rno;
		CIE[0]=ia1;
		CIE[1]=ia2;
		avg=(CIE[0]+CIE[1])/3.0f;
	}
	void showStudent()
	{
		System.out.println(rollNo+". \t\t"+name+"\t\t"+avg+"\t\t");
	}
}
public class Studentt 
{
	public static void main(String args[])
	{
		Studentt deeps = new Studentt();
		System.out.println("The internal details of student.");
		System.out.println("Roll No.\tName\t\tAverage");
		deeps.setStudentt("Deepika",19.4f,(byte)12);
		deeps.showStudentt();
		deeps.setStudent("Jaya",19.4f,17.6f,(byte)10);
		deeps.showStudentt();
		float[] cie= {17.0f,12.6f,19.2f};
		deeps.setStudentt("Rekha",cie,(byte)8);
		deeps.showStudentt();
		}
		
}


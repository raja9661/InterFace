import java.util.Scanner;
class PatientInformation
{
    String name,address,symptoms;
    int age;
    long contact;
    char gender;

    public void Info()
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Please Enter the detail of patient:");
        System.out.print("Name:-");
        name=scn.nextLine();
        System.out.print("age:-");
        age=scn.nextInt();
        System.out.print("gender:-");
        gender=scn.next().charAt(0);
        System.out.print("Contact number:-");
        contact=scn.nextInt();
        scn.nextLine();
        System.out.print("address:-");
        address=scn.nextLine();
        System.out.print("Symptoms:-");
        symptoms=scn.next();
    }
    public void getInfo()
    {
        System.out.println("******************Your Details***************");
        System.out.println("Name:-"+ name);
        System.out.println("Age:-"+ age);
        System.out.println("Gender:-"+ gender);
        System.out.println("Contact Number:-"+ contact);
        System.out.println("adderss:-"+ address);
        System.out.println("Symptous:-"+ symptoms);
        System.out.println("****************Press 1 to conform you Appointment:***************");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("*****Your appointment is conformed*****:");
    }
}
class HospitalInfo
{
    public void hsp()
    {
        System.out.println("*****Our mission is to bring healthcare of International standards within the reach of every individual*****");
        System.out.println("Facts & Figures");
        System.out.println("Hospitals	72");
        System.out.println("No. of Beds over 12000");
        System.out.println("No. of Pharmacies 4500+");
        System.out.println("No. of Primary Care clinics over 120");
        System.out.println("No. of Diagnostic centres 700+");
        System.out.println("No. of Telemedicine Centres 500+");
        System.out.println("No. of Medical education centres and research foundation over 15");
    }

}
class HospitalManagement
{
    public static void main(String args[])
    {
        PatientInformation ptn=new PatientInformation();
        HospitalInfo h=new HospitalInfo();
        System.out.println("***********Welcome to apollo Hospital**********");
        System.out.println("Please select your options");
        System.out.println("Select 1 for Book Appointment:");
        System.out.println("Select 2 for Know about Hospital Facilities:");
        System.out.println("Select 3 for Exit:");
        Scanner sc=new Scanner(System.in);
        String options=sc.nextLine();
        switch(options)
        {
            case "1":ptn.Info();
                   ptn.getInfo();
            break;
            case "2":h.hsp();
            break;
            case "3":System.out.println("*****thanks for visiting our service:*****");
            break;
            default:System.out.println("please select correct option:");
        }
    }
}

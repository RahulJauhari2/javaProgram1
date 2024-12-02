
public class Assign07 {
        public static void Test(){
            Contact c =new Contact();
            c.setName("Rahul");
            System.out.println(c.getName());
        }

    
}
 class Contact{
    private String name,lastName ,emal;
    private int mobile;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmal() {
        return emal;
    }
    public void setEmal(String emal) {
        this.emal = emal;
    }
    public int getMobile() {
        return mobile;
    }
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    
 }

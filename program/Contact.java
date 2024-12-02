class Demo{
    private String fname, lname,email;
    private int num;


    public void  setFname(String fname){
        this.fname = fname;
        }
    public String  getFName(){
        return fname;
    }
        public String getLName(){
            return fname;
            }
        public void  setLName(String lname){
                this.lname = lname;
                }
        public String getEmail(){
                    return fname;
                    }
        public void  setEmail(String email){
                this.email = email;
                        }
        public int getNum(){
                    return num;
                            }
        public void  setNum(int num){
                this.num = num;
         }

}
public class Contact {

    public static void main(String [] args) {
         Demo c = new Demo();
         c.setFname("Rahul");
         System.out.println(c.getFName());
    }
}

public class String1 {
    public static void main(String[] args) {
        //55 + 23
        String s= "25+5";
        String a="";
        String b="";
        char op ='x';
        System.out.println(s +"lenth "+s.length());
        for(int i=0;i<s.length();i++){
        
            if(s.charAt(i)=='+' || s.charAt(i)=='-' ||s.charAt(i)=='*'){
                op = s.charAt(i);
                a= s.substring(0,i);
                b= s.substring(i+1,s.length());
                
            }
        }
        System.out.println("op= "+op);
        System.out.println("A= "+a);
        System.out.println("B= "+ b);
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int c=0;
        switch (op) {   
            case '+':
              c = x +y;  
                break;
            case '-':
              c = x -y;  
                break;
            case '*':
              c = x *y;  
                break;
        
            default:
                break;
        }
        
        System.out.println("c= "+ c);
    }
}
    


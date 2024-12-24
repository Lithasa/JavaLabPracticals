
package student;

public class Student {
    
   private String name;
   private String email;
   public char gender;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setGender(char gender){
        
        if((gender =='M') || gender =='F'){
            this.gender=gender;
        }
        else{
            this.gender='M';
            System.out.println("Input invalid. Default gender set as 'M'");
        }
    }        
    public char getGender(){
        return gender;
    }
}

public class Main   
{   
    public static void main(String arg[])   
    {   
        String module_code = "CSC1009";   
        switch(module_code)   
        {   
            case "CSC1006":   
                System.out.println("Mathematics 2"); 
                break;   
            case "CSC1007":   
                System.out.println("Operating Systems"); 
                break;   
            case "CSC1008":   
                System.out.println("Data Structures and Algorithms"); 
                break;   
            case "CSC1009":   
                System.out.println("Object Oriented Programming"); 
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
            default:    
                System.out.println("Unknown Module Code"); 
                break;   
        }   
        System.out.println("After switch");   
    }   
}  

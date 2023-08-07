public class Operator {
    public static  String operators(int choice){
        String Ops1[] = {"ADDITION", "SUBTRACTION", "MULTIPLICATION", "DIVISION"};
        if(choice == 0){
            return Ops1[0];
        }
        else if(choice == 1){
            return Ops1[1];
        }
        else if(choice == 2){
            return Ops1[2];
        }
        else if(choice == 3){
            return Ops1[3];
        }
        else{
            return "Invalid Choice";
        }
    }  
}    
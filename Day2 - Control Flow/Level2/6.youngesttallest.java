import java.util.Scanner;
class program6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();
        
        int amarHeight = input.nextInt();
        int akbarHeight = input.nextInt();
        int anthonyHeight = input.nextInt();
        
        String youngest = "";
        if(amarAge < akbarAge && amarAge < anthonyAge){
            youngest = "Amar";
        }
        else if(akbarAge < amarAge && akbarAge < anthonyAge){
            youngest = "Akbar";
        }
        else {
            youngest = "Anthony";
        }
        
        String tallest = "";
        if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
            tallest = "Amar";
        }
        else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
            tallest = "Akbar";
        }
        else {
            tallest = "Anthony";
        }

        System.out.println(youngest);
        System.out.println(tallest);
        
        input.close();
    }
}

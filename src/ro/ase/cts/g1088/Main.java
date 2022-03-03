package ro.ase.cts.g1088;

import java.util.Scanner;

class ExceptieAllower  extends  Exception{
    @Override
    public String getMessage(){
        return "Nu au fost introduse litere mari";
    }
}

class ExceptieAllowerSmallerCase extends Exception{
    public String getMessage(){
        return "Nu au fost introduse litere mici";
    }
}


public class Main {
    public static void main(String[] args){
        System.out.println("Tastati o propozitie care sa contina litere mari si mici: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti propozitia: ");
        String str = scanner.nextLine();

        try {

            if(str.toLowerCase()==str)
            {
                throw new ExceptieAllower();
            }
            if(str.toUpperCase()==str){
                throw new ExceptieAllowerSmallerCase();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
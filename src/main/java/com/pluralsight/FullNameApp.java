package com.pluralsight;
import java.util.Scanner;
public class FullNameApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Please enter your middle name: ");
        String middleName = input.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Please enter any Suffix you might have: ");
        String suffix = input.nextLine();

        if (!firstName.isEmpty()) {
            firstName = firstName.trim();
        }
        if (!middleName.isEmpty()) {
            middleName = middleName.trim();
        }
        if (!lastName.isEmpty()) {
            lastName = lastName.trim();
        }
        if (!suffix.isEmpty()) {
            suffix = suffix.trim();
        }

        String middleInitialStr = "";
        if (!middleName.isEmpty()) {
            middleInitialStr = String.valueOf(middleName.charAt(0));
        }


        String[] fullName = {firstName, middleInitialStr, lastName, suffix};
        if(fullName[1].isEmpty()&&fullName[3].isEmpty()){
        System.out.println(fullName[0]+" "+fullName[2]);
        }
        else if((!fullName[1].isEmpty()&&!fullName[3].isEmpty())){
        System.out.println((fullName[0]+" "+fullName[1]+". "+fullName[2]+", "+fullName[3]));
        }
        else if(fullName[1].isEmpty()){
            System.out.println((fullName[0]+" "+fullName[2]+", "+fullName[3]));
        }
        else if(fullName[3].isEmpty()) {
            System.out.println((fullName[0]+" "+fullName[1]+". "+fullName[2]));
        }
        input.close();

    }
}
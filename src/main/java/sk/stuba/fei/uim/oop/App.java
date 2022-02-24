package sk.stuba.fei.uim.oop;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Birth date format(YYYY-MM-DD): ");

        LocalDate BirthDate = LocalDate.parse(input.nextLine());
        int[] Date = new int[]{BirthDate.getDayOfMonth(), BirthDate.getMonthValue(), BirthDate.getYear()};
        String Horoskop = App.Horoskop(Date);

        System.out.println("\nDen: " + Date[0] + " Mesiac: " + Date[1] + " Rok: " + Date[2]);
        System.out.println("Tvoj Horoskop je: " + Horoskop);

    }
    public static String Horoskop(int... Date){
           switch (Date[1]) {
               case 1 :{
                   if (Date[0] >= 21){
                       return "Vodnar";
                   } else {
                       return "Kozoroh";
                   }
               }
               case 2 :{
                   if (Date[0] <= 20){
                       return "Vodnar";
                   } else {
                       return "Ryby";
                   }
               }
               case 3:{
                   if (Date[0] <= 20){
                       return "Ryby";
                   } else {
                       return "Baran";
                   }
               }
               case 4:{
                   if (Date[0] <= 20){
                       return "Ryby";
                   } else {
                       return "Byk";
                   }
               }
               case 5:{
                   if (Date[0] <= 21){
                       return "Byk";
                   } else {
                       return "Blizenci";
                   }
               }
               case 6: {
                   if (Date[0] <= 21){
                      return "Blizenci";
                   }else {
                       return "Rak";
                   }
               }
               case 7: {
                   if (Date[0] <= 22){
                       return "Rak";
                   }else{
                       return "Lev";
                   }
               }
               case 8: {
                   if (Date[0] <= 22){
                       return "Lev";
                   } else {
                       return "Panna";
                   }
               }
               case 9: {
                   if (Date[0] <= 22){
                       return "Panna";
                   }else {
                       return "Vahy";
                   }
               }
               case 10: {
                   if (Date[0] <= 23){
                       return "Vahy";
                   }else {
                       return "Skorpion";
                   }
               }
               case 11: {
                   if (Date[0] <= 22){
                       return "Skorpion";
                   }else {
                       return "Strelec";
                   }
               }
               case 12: {
                   if (Date[0] <= 21){
                       return "Strelec";
                   }else {
                       return "Vodnar";
                   }
               }
           }
           return "Wrong Birth Date please check!";
    }
}

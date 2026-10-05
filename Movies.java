//* program on bookmyshow tickets booking bill generator using switch case*//
import java.util.Scanner;
class BookMyShow
{
int mov;
int theater;
int cinema;
int city;
double t;
int time;
double total;
void movie()
{
int cost = 200;
double tax = 18;
int qun;
double gst = cost * 5 / 100;
int tick;
double disc = cost * 10 / 100;
int seat;
Scanner sc=new Scanner(System.in);
System.out.println("---------------------------------------------------------------");
System.out.println("--------------------Welcome to Book My Show--------------------");
System.out.println("***************************************************************");
System.out.println("------------------------List of movies-------------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.SPIRIT");
System.out.println("2.VARANAASI");
System.out.println("3.PEDDI");
System.out.println("4.DRAGON");
System.out.println("5.TOXIC");
System.out.println("6.RAAKA");
System.out.println("***************** SELECT YOUR FAVOURITE MOVIE
*****************");
System.out.println("---------------------------------------------------------------");
cinema = sc.nextInt();
switch(cinema)
{
case 1: System.out.println("---------------------------------------------------------------");
System.out.println("---------------- you select the 'SPIRIT' movie ----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------Select Your Favourite Theater-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.Santhi Theater");
System.out.println("2.Vekateswara Theater");
System.out.println("3.PVP MALL Theater");
System.out.println("4.IMAX Theater");
System.out.println("5.Sapthagiri Theater");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------SELECT YOUR FAVOURUITE THEATER----------------");
theater=sc.nextInt();
switch(theater)
{
case 1:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Santhi Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'SPIRIT' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 2:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Vekateswara Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'SPIRIT' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 3:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'PVP MALL Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'SPIRIT' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 4:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'IMAX Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'SPIRIT' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 5:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Sapthagiri Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'SPIRIT' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
}
break;
case 2:
System.out.println("-----------------------------------------");
System.out.println("---You Selected the 'VARANAASI' moive----");
System.out.println("-----------------------------------------");
System.out.println("-----------------Select Your Favourite Theater-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.Santhi Theater");
System.out.println("2.Vekateswara Theater");
System.out.println("3.PVP MALL Theater");
System.out.println("4.IMAX Theater");
System.out.println("5.Sapthagiri Theater");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------SELECT YOUR FAVOURUITE THEATER----------------");
System.out.println("---------------------------------------------------------------");
theater=sc.nextInt();
switch(theater)
{
case 1:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Santhi Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'VARANAASI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 2:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Vekateswara Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'VARANAASI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 3:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'PVP MALL Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'VARANAASI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 4:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'IMAX Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'VARANAASI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 5:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Sapthagiri Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'VARANAAASI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
}
break;
case 3:
System.out.println("-----------------------------------------");
System.out.println("----- You Selected the'PEDDI' moive -----");
System.out.println("-----------------------------------------");
System.out.println("-----------------Select Your Favourite Theater-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.Santhi Theater");
System.out.println("2.Vekateswara Theater");
System.out.println("3.PVP MALL Theater");
System.out.println("4.IMAX Theater");
System.out.println("5.Sapthagiri Theater");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------SELECT YOUR FAVOURUITE THEATER----------------");
System.out.println("---------------------------------------------------------------");
theater=sc.nextInt();
switch(theater)
{
case 1:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Santhi Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'PEDDI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 2:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Vekateswara Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'PEDDI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 3:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'PVP MALL Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'PEDDI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 4:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'IMAX Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'PEDDI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 5:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Sapthagiri Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'PEDDI' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
}
break;
case 4:
System.out.println("-----------------------------------------");
System.out.println("---- You Selected the'DRAGON' moive -----");
System.out.println("-----------------------------------------");
System.out.println("-----------------Select Your Favourite Theater-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.Santhi Theater");
System.out.println("2.Vekateswara Theater");
System.out.println("3.PVP MALL Theater");
System.out.println("4.IMAX Theater");
System.out.println("5.Sapthagiri Theater");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------SELECT YOUR FAVOURUITE THEATER----------------");
System.out.println("---------------------------------------------------------------");
theater=sc.nextInt();
switch(theater)
{
case 1:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Santhi Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'DRAGON' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 2:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Vekateswara Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'DRAGON' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 3:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'PVP MALL Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'DRAGON' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 4:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'IMAX Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'DRAGON' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 5:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Sapthagiri Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'DRAGON' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
}
break;
case 5:
System.out.println("-----------------------------------------");
System.out.println("-----You Selected the 'TOXIC' moive------");
System.out.println("-----------------------------------------");
System.out.println("-----------------Select Your Favourite Theater-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.Santhi Theater");
System.out.println("2.Vekateswara Theater");
System.out.println("3.PVP MALL Theater");
System.out.println("4.IMAX Theater");
System.out.println("5.Sapthagiri Theater");
System.out.println("6.AMB Theater");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------SELECT YOUR FAVOURUITE THEATER----------------");
System.out.println("---------------------------------------------------------------");
theater=sc.nextInt();
switch(theater)
{
case 1:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Santhi Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'TOXIC' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 2:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Vekateswara Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'TOXIC' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 3:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'PVP MALL Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'TOXIC' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 4:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'IMAX Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'TOXIC' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 5:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Sapthagiri Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'TOXIC' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
}
break;
case 6:
System.out.println("-----------------------------------------");
System.out.println("----- You Selected the'RAAKA'movie ------");
System.out.println("-----------------------------------------");
System.out.println("-----------------Select Your Favourite Theater-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.Santhi Theater");
System.out.println("2.Vekateswara Theater");
System.out.println("3.PVP MALL Theater");
System.out.println("4.IMAX Theater");
System.out.println("5.Sapthagiri Theater");
System.out.println("6.AMB Theater");
System.out.println("---------------------------------------------------------------");
System.out.println("-----------------SELECT YOUR FAVOURUITE THEATER----------------");
System.out.println("---------------------------------------------------------------");
theater=sc.nextInt();
switch(theater)
{
case 1:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Santhi Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'RAAKA' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 2:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Vekateswara Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'RAAKA' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 3:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'PVP MALL Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'RAAKA' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 4:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'IMAX Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'RAAKA' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
case 5:System.out.println("---------------------------------------------------------------");
System.out.println("---------------you select the 'Sapthagiri Theater'-----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------- SELECT YOUR ADDRESS OF CITY -----------------");
System.out.println("---------------------------------------------------------------");
System.out.println("***************************************************************");
System.out.println("1.MANDAPETA");
System.out.println("2.RAJMUNDRY");
System.out.println("3.GANNAVARAM");
System.out.println("4.VIJAYAWADA");
System.out.println("5.ELURU");
System.out.println("6.VIZAG");
System.out.println("***************************************************************");
System.out.println("--------------------- ENTER THE CITY NAME ---------------------");
city=sc.nextInt();
switch(city)
{
case 1:
System.out.println("YOU CHOOSE THE CITY IS MANDAPETA");
break;
case 2:
System.out.println("YOU CHOOSE THE CITY IS RAJMUNDRY");
break;
case 3:
System.out.println("YOU CHOOSE THE CITY IS GANNAVARAM");
break;
case 4:
System.out.println("YOU CHOOSE THE CITY IS VIJAYAWADA");
break;
case 5:
System.out.println("YOU CHOOSE THE CITY IS ELURU");
break;
case 6:
System.out.println("YOU CHOOSE THE CITY IS VIZAG");
break;
default:
System.out.println("YOU CHOOSE THE WRONG CITY");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("---------------- CHOOSE YOUR MOVIE SHOW TIMINGS ---------------");
System.out.println("---------------------------------------------------------------");
System.out.println("1.09:00AM");
System.out.println("2.12:00PM");
System.out.println("3.06:15PM");
System.out.println("4.09:00PM");
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------- ENTER THE TIME -------------------------");
time=sc.nextInt();
switch(time)
{
case 1:
System.out.println("YOU CHOOSE THE TIME IS 09:00AM");
break;
case 2:
System.out.println("YOU CHOOSE THE TIME IS 12:00PM");
break;
case 3:
System.out.println("YOU CHOOSE THE TIME IS 06:15PM");
break;
case 4:
System.out.println("YOU CHOOSE THE TIME IS 09:00PM");
break;
default:
System.out.println("YOU CHOOSE THE WRONG TIME");
break;
}
System.out.println("---------------------------------------------------------------");
System.out.println("------------------SELELCT YOUR SEATS No's----------------------");
System.out.println("---------------------------------------------------------------");
System.out.println("----------------------- BALCANY SEATS -------------------------");
System.out.println("1.A1");
System.out.println("2.A2");
System.out.println("3.A3");
System.out.println("4.A4");
System.out.println("5.A5");
System.out.println("6.A6");
System.out.println("-------------------- SECOND CLASS SEATS -----------------------");
System.out.println("7.L7");
System.out.println("8.L8");
System.out.println("9.L9");
System.out.println("10.10");
System.out.println("11.L11");
System.out.println("12.L12");
System.out.println("--------------------- FIRST CLASS SEATS -----------------------");
System.out.println("13.R13");
System.out.println("14.R14");
System.out.println("15.R15");
System.out.println("16.R16");
System.out.println("17.R17");
System.out.println("18.R18");
System.out.println("---------------------------------------------------------------");
System.out.println("- - - - - - - - - YOU CHOOSE THE SINGLE SEAT - - - - - - - - -");
System.out.println("---------------------------------------------------------------");
System.out.println("Enter the seats:");
seat=sc.nextInt();
System.out.println("---------------------------------------------------------------");
System.out.println("---------------------SELECTED YOUR SEATS:----------------------");
switch(seat)
{
case 1:
System.out.println("A1 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 2:
System.out.println("A2 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 3:
System.out.println("A3 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 4:
System.out.println("A4 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 5:
System.out.println("A5 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 6:
System.out.println("A6 it is a balcany");
System.out.println("---------------------------------------------------------------");
break;
case 7:
System.out.println("L7 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 8:
System.out.println("L8 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 9:
System.out.println("L9 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 10:
System.out.println("L10 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 11:
System.out.println("L11 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 12:
System.out.println("L12 it is a second class");
System.out.println("---------------------------------------------------------------");
break;
case 13:
System.out.println("R13 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 14:
System.out.println("R14 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 15:
System.out.println("R15 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 16:
System.out.println("R16 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 17:
System.out.println("R17 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
case 18:
System.out.println("R18 it is a first class");
System.out.println("---------------------------------------------------------------");
break;
default:
System.out.println("SORRY YOU SELECT THE INVALID OPITION !");
System.out.println("---------------------------------------------------------------");
break;
}
System.out.println("ENTER QUANTITY=");
qun = sc.nextInt();
tick = cost * qun;
System.out.println("---------------------------------------------------------------");
System.out.println("Your ticket price =" + tick);
System.out.println("Total '" + qun + "' tickets in 'RAAKA' movie ticket price = " + tick);
System.out.println("GST =" + gst);
System.out.println("DISCOUNT =" + disc);
t=tick+gst;
total=t-disc;
System.out.println("TOTAL AMOUNT =" +total);
System.out.println("---------------------------------------------------------------");
break;
}
break;
default:
System.out.println("-----------------------------------------");
System.out.println("----- SORRY FOR YOU SELECTED THE INVALID DATA ! -----");
System.out.println("-----------------------------------------");
break;
}
}
}
class Movies
{
public static void main(String[] args)
{
BookMyShow bs = new BookMyShow();
bs.movie();
System.out.println("------- YOUR TICKETS BOOKING WAS SUCCESSFULLY COMPLETEED --
----");
System.out.println("---------------------------------------------------------------");
}
}


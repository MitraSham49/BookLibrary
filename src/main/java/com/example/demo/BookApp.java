package com.example.demo;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;


public class BookApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        String result = "";
        String theDate = "";
        LocalDate returnDate = null;
        DateTimeFormatter shortDateForamat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ArrayList<Book> allbooks = new ArrayList<>();
        Book aBook;
        String name ="";
        boolean doneAddBook = false;
         boolean stop =false;
         boolean addanother = true;
          boolean canBorrow =true;
        System.out.println();
    /*  while (done !=true){
            //x++;
            aBook = new Book();
            System.out.println("Enter Book Titile ");
            aBook.setTitle(keyboard.nextLine());
            System.out.println("Enter Book Author ");
            aBook.setAuthor(keyboard.nextLine());
            System.out.println("Enter Book ISBN Number");
            aBook.setIsbnNumber(keyboard.nextLine());
            System.out.println("enter the year of Publication");
            //aBook.setYearOfPublication
            theDate =   (keyboard.nextLine());
            returnDate = LocalDate.parse(theDate,shortDateForamat);
            aBook.setYearOfPublication(returnDate );
            System.out.println("You entered "+returnDate);
            System.out.println("Enter Book is in Stock , Enter false or true");
            aBook.setInStock(keyboard.nextBoolean());
            keyboard.nextLine();

            allbooks.add(aBook);
            //System.out.println(aBook);

            System.out.print("Do you want to go again? (Y)");
            result = keyboard.nextLine();
            if (result.equalsIgnoreCase("Y")){
                done = false;
            }else
                done=true;

        }
        System.out.println(" The loop is over.print the ArrayList");
        // System.out.println(allbooks);
        for (Book eachBooks :allbooks){

            // System.out.print(eachBooks.getAuther()+" " +eachBooks.getTitle()+"  "+eachBooks.getDescription());
            eachBooks.getDisplayText();
        }
*/

do {
     addanother = true;

    showMenu();

        System.out.println("Enter a menu number");
        switch (Integer.valueOf(keyboard.nextLine())) {
            case 1:
                do {
                    //x++;
                    aBook = new Book();
                    System.out.println("Enter Book Titile ");
                    aBook.setTitle(keyboard.nextLine());
                    System.out.println("Enter Book Author ");
                    aBook.setAuthor(keyboard.nextLine());
                    System.out.println("Enter Book ISBN Number");
                    aBook.setIsbnNumber(keyboard.nextLine());
                    System.out.println("enter the year of Publication");
                    //aBook.setYearOfPublication
                    theDate = (keyboard.nextLine());
                    returnDate = LocalDate.parse(theDate, shortDateForamat);
                    aBook.setYearOfPublication(returnDate);
                    System.out.println("You entered " + returnDate);
                  //  keyboard.nextLine();
                   System.out.println("Enter Book is in Stock , Enter  true");
                   aBook.setInStock(keyboard.nextBoolean());
                   keyboard.nextLine();

                    allbooks.add(aBook);
                    System.out.println(aBook);

                    System.out.print("Do you want to go again? (Y)");
                    result = keyboard.nextLine();
                    if (result.equalsIgnoreCase("Y")) {
                        doneAddBook = false;
                    } else
                        doneAddBook = true;
                } while (!doneAddBook);
                break;
            case 2: {
                System.out.println(" The loop is over.print the ArrayList");
                // System.out.println(allbooks);
                for (Book eachBooks : allbooks) {

                    // System.out.print(eachBooks.getAuther()+" " +eachBooks.getTitle()+"  "+eachBooks.getDescription());
                    eachBooks.getDisplayText();
                }
            }
            break;


            case 3: {
                System.out.println(" Borrow a book , these  are  list off  all the books are in library now ");
                for (Book eachBooks : allbooks)  {
                  if (eachBooks.isInStock())
                        // System.out.print(eachBooks.getAuther()+" " +eachBooks.getTitle()+"  "+eachBooks.getDescription());
                    eachBooks.getDisplayText();
//toy.setInStock(yesno.equalsIgnoreCase("yes")?true:false);
                }

                System.out.println("Enter Book Titile to borrow ");
               name = (keyboard.nextLine());

                 for (Book eachbooks : allbooks){
                      if (eachbooks.getTitle().equals(name)) {

                            eachbooks.setInStock(false);
                      }

                    }
                for (Book eachBooks : allbooks) {
                    if (eachBooks.isInStock())

                        // System.out.print(eachBooks.getAuther()+" " +eachBooks.getTitle()+"  "+eachBooks.getDescription());
                        eachBooks.getDisplayText();
                }

            }
                break;



        }
    System.out.print("Return to main menue? (Y)");
    result = keyboard.nextLine();
    if (result.equalsIgnoreCase("Y")){
        stop = false;
    }else
        stop=true;

} while(!stop);



    }
    public static void showMenu()
    {
        System.out.println("1. Add a book");
        System.out.println("2. List of  book");
        System.out.println("3. Borrow a book");

    }
}

//toy.setInStock(yesno.equalsIgnoreCase("yes")?true:false);
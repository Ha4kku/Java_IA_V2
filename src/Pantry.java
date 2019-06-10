import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

// REMEMBER TO MAKE THE WHOLE THING MORE USER FRIENDLY IF POSSIBLE. MAKE IT SO THAT THERE ARE MORE PLACES WHERE THE USER
// IS REMINDED WHAT ARE THE CATEGORIES AND WHATNOT.

// For future placeholder, you were getting to the point where you were going to loop the code a few times in strategic
// places so that there can't be any wrong answers and such. This is going to be a pain in the butt but you are going to
// have to do it in order to ensure that your code is repeatable.

public class Pantry {
    public String cans = "Cans/ Jarred Goods";
    public String baking = "Dry/ Baking Goods";
    public String bread = "Bread/ Bakery";
    public String beverages = "Beverages";
    public String produce = "Produce";
    public String other = "Other";

    //these are the strings that should make up the pantry, will add more once I get to that point
    //otherwise don't bother.

    public String[] one = new String[100];//  this equals the first shelf of the pantry aka bottom shelf
    public String[] two = new String[100];// this is the second shelf of the pantry aka middle shelf
    public String[] three = new String[100];// this is now the third array in the pantry aka top shelf
    //  ____________
    //  |  three   |
    //  |----------|
    //  |   two    |
    //  |----------|
    //  |   one    |
    //  |__________|
    //

    public String[] total = new String[30];// this is the set of strings that is the big thing

    // let's start with this amount and then transfer later to other systems.


    public Pantry() {


        // remember to put these inputs into some sort of general array so that you are
        // able to actually reference them when needed.
        // this is supposed to be a scanner class that will intake what the user's
        // groceries are, but it doesn't like me right now.


        // This string class will tell us where the items will go in terms of the Strings available in the
        // beginning of the program. We will have to look at how to make those show.

        // Probably just will have to start by doing System.out.println("these variables are classes
        //for later in the problem.")

        int limit = 2;
        int c = 0;
        int b = 0;
        int bd = 0;
        int be = 0;
        int p = 0;
        int o = 0;

        // Make sure to make some kind of for loop that corrects and adds one to every int every loop through
        // Probably going to have to do some kind of c++, b++, bd++, be++, p++, o++.

        Scanner groceries = new Scanner(System.in);
        System.out.println("How many groceries do you have?");
        int number = groceries.nextInt();

        if (number > one.length + two.length + three.length){

            System.out.println("Sorry, you have too many groceries.");
        }else {

            for (int i = 0; i < number; i++) {

                Scanner start = new Scanner(System.in);
                System.out.println("What type of grocery do you have?");
                String st = start.nextLine();

                // FIGURE OUT HOW TO MAKE AN IF STATEMENT THAT REPEATS THE QUESTION IF THE ANSWER IS NOT ONE OF THE ONES
                // BELOW. PROBABLY GOING TO HAVE TO MAKE SOMETHING THAT DOES AN IF STATEMENT AROUND THE ENTIRE IF AND
                // ELSE STATEMENTS.

                // this one
                if (!st.equals(cans) && !st.equals(baking) && !st.equals(bread) && !st.equals(beverages) && !st.equals(produce) && !st.equals(other)) {
                    System.out.println("Sorry that is not a category. Please reenter your grocery category. Please check that" +
                            " your spelling and capitalization is correct.");
                    number++;

                    // one problem with this function is that it doesn't move on. Have to figure out how to make it move on
                    // from this one function area.

                } else {
                    if (st.equals(cans)) {

                        System.out.println("Make sure to spell everything correctly as this is a case sensitive program.");


                        Scanner refrigerator = new Scanner(System.in);
                        System.out.println("Does this item need to be refrigerated?");
                        String fridge = refrigerator.nextLine();

                        // This part determines if the can needs to go into the pantry or not.
                        if (fridge.equals("Yes")) {
                            System.out.println("This canned good does not go in the pantry.");
                        } else {
                            if (fridge.equals("No")) {
                                System.out.println("How big is your Can/Jarred Food?");

                                //this part takes in size and then sorts this on whichever shelf
                                Scanner sizes = new Scanner(System.in);
                                System.out.println("16x8, 5x8, 6x10, Other");
                                String size = sizes.nextLine();

                                if (size.equals("16x8")) {
                                    System.out.println("This will go on the bottom shelf.");

                                    Scanner item = new Scanner(System.in);
                                    System.out.println("What is the name of this item?");
                                    String name = item.nextLine();
                                    //this will make it so that the biggest can goes on the bottom shelf of the pantry

                                    one[c] = name;

                                    System.out.println("This will now go on the bottom shelf.");

                                    System.out.println("Great! On to the next one!");
                                    // this will save the name of the item to the index of c on the first shelf
                                }
                                if (size.equals("6x10")) {
                                    System.out.println("This will go on the middle shelf");

                                    Scanner item = new Scanner(System.in);
                                    System.out.println("What is the name of this item?");
                                    String name = item.nextLine();

                                    // this will make it so that the middle sized item will go on the middle shelf of the pantry

                                    two[c] = name;
                                    // this will save the name of the item in the index of the second shelf


                                    System.out.println("This will go in the middle shelf.");

                                    System.out.println("Great! On to the next one!");
                                }
                                if (size.equals("5x8")) {
                                    System.out.println("This will go on the top shelf");

                                    Scanner item = new Scanner(System.in);
                                    System.out.println("What is the name of this item?");
                                    String name = item.nextLine();
                                    // this will make it so that the smallest item goes on the top and final shelf

                                    three[c] = name;
                                    // this will save the name of the item in the index of c on the top shelf

                                    System.out.println("This will go on the top shelf.");
                                    System.out.println("Great! On to the next one!");
                                }

                                // this will help if the above categories aren't covered.

                                if (size.equals("Other")) {
                                    System.out.println("What is the size of this Item? ");
                                    Scanner width = new Scanner(System.in);
                                    String height = width.nextLine();

                                    System.out.println("Which shelf do you want this item to go on?");
                                    Scanner shelf = new Scanner(System.in);
                                    ;
                                    String numb = shelf.nextLine();

                                    System.out.println("Remember this is case sensitive.");

                                    if (numb.equals("Top shelf")) {

                                        System.out.println("What is the name of this item?");
                                        Scanner namae = new Scanner(System.in);
                                        String name = namae.nextLine();

                                        three[c] = name + " " + height;

                                        System.out.println("Great! On to the next one!");
                                    }
                                    if (numb.equals("Middle Shelf")) {

                                        System.out.println("What is the name of this item?");
                                        Scanner namae = new Scanner(System.in);
                                        String name = namae.nextLine();

                                        two[c] = name + " " + height;

                                        System.out.println("Great! On to the next one!");
                                    }
                                    if (numb.equals("Bottom Shelf")) {

                                        System.out.println("What is the name of this item?");
                                        Scanner namae = new Scanner(System.in);
                                        String name = namae.nextLine();

                                        one[c] = name + " " + height;

                                        System.out.println("Great! On to the next one!");
                                    }
                                }
                            }
                        }

                        // This will redefine the categories so that the user doesn't have to keep scrolling up. I will be
                        // putting these comment lines next to every repeat of this println method

                        System.out.println("The Categories are: Cans/ Jarred Goods, Dry/ Baking Goods, Bread/ Bakery, Beverages," +
                                " Produce, and Other.(Remember to type each category as they appear.)");
                        System.out.println("            ");

                    }//this loop should complete the cans part of the code. You should write about this process

                    if (st.equals(beverages)) {
                        // soda, water veggie juices, juice, energy drinks,
                        Scanner beverage = new Scanner(System.in);
                        System.out.println("Is this beverage soda, water, vegetable juice, fruit juice, or energy drinks?");
                        String drink = beverage.nextLine();


                        if (drink.equals("Yes")) {

                            Scanner type = new Scanner(System.in);
                            System.out.println("What is the name of this beverage?");
                            String tee = type.nextLine();

                            three[be] = tee;
                            System.out.println("Great! On to the next one!");

                        } else {
                            if (drink.equals("No")) {
                                System.out.println("This beverage does not go in the pantry");
                                System.out.println("On to the next one!");
                            }
                        }

                        // This will redefine the categories so that the user doesn't have to keep scrolling up. I will be
                        // putting these comment lines next to every repeat of this println method

                        System.out.println("The Categories are: Cans/ Jarred Goods, Dry/ Baking Goods, Bread/ Bakery, Beverages," +
                                " Produce, and Other.(Remember to type each category as they appear.)");
                        System.out.println("            ");

                        // This whole function should push tea into the first shelf three spot as well as make it so that
                        // the person using it can determine if the beverage they have goes into the pantry or not.

                    } // MAKE SURE TO CREATE A GENERAL SCANNER THING THAT DEFINES SCANNERS AS A GLOBAL VARIABLE. IN ORDER TO
                    // MAKE THIS PROCESS SIMPLER. FUTURE PROJECT FOR YOU TO CONSIDER.

                    if (st.equals(baking)) {
                        Scanner baking = new Scanner(System.in);
                        System.out.println("Is this a Dry or Wet baking ingredient that goes in the pantry? ");
                        String answer = baking.nextLine();

                        if (answer.equals("Dry")) {
                            System.out.println("This will go on the middle shelf to the front");

                            System.out.println("What is the name of this baking material.");
                            Scanner item = new Scanner(System.in);
                            String name = item.nextLine();

                            two[b] = name;

                            System.out.println("Great! On to the next one!");

                        }
                        if (answer.equals("Wet")) {
                            System.out.println("This will go on the top shelf to the front.");

                            System.out.println("What is the name of this baking ingredient");
                            Scanner item = new Scanner(System.in);
                            String name = item.nextLine();

                            three[b] = name;
                            System.out.println("Great! On to the next one!");

                        }

                        // This will redefine the categories so that the user doesn't have to keep scrolling up. I will be
                        // putting these comment lines next to every repeat of this println method

                        System.out.println("The Categories are: Cans/ Jarred Goods, Dry/ Baking Goods, Bread/ Bakery, Beverages," +
                                " Produce, and Other.(Remember to type each category as they appear.)");
                        System.out.println("            ");
                    }

                    if (st.equals(bread)) {// this part should ask the user if they have loafs of bread or baguettes of bread
                        System.out.println("Bread goes in the middle of the pantry where it's cool and safe.");

                        System.out.println("What kind of bread do you have?");
                        Scanner item = new Scanner(System.in);
                        String name = item.nextLine();

                        two[bd] = name;
                        System.out.println("Great! On to the next one!");

                        // This will redefine the categories so that the user doesn't have to keep scrolling up. I will be
                        // putting these comment lines next to every repeat of this println method

                        System.out.println("The Categories are: Cans/ Jarred Goods, Dry/ Baking Goods, Bread/ Bakery, Beverages," +
                                " Produce, and Other.(Remember to type each category as they appear.)");
                        System.out.println("        ");
                    }
                    if (st.equals(produce)) {

                        System.out.println(("Is this grocery Dried Goods, Beans, or Something Else?"));
                        Scanner dried = new Scanner(System.in);
                        String answer = dried.nextLine();

                        if (answer.equals("Dried Goods")) {

                            System.out.println("This will go in the middle of the pantry.");

                            System.out.println("What is the name of this grocery?");
                            Scanner q = new Scanner(System.in);
                            String qq = q.nextLine();

                            two[p] = qq;

                            System.out.println("Great! On to the next one!");
                        }

                        if (answer.equals("Beans")) {

                            System.out.println("Do you want this on the Middle or Bottom shelf of the pantry? (make sure to specify " +
                                    "Middle Shelf and Bottom shelf exactly as written. For this question, include the word shelf in " +
                                    "you're answer ie: Middle Shelf)");
                            Scanner mid = new Scanner(System.in);
                            String middle = mid.nextLine();


                            if (middle.equals("Middle Shelf")) {
                                System.out.println("Heavier items should go in the middle or bottom shelves of th pantry.");

                                System.out.println("What is the name of this item?");
                                Scanner name = new Scanner(System.in);
                                String namae = name.nextLine();

                                two[p] = namae;

                                System.out.println("Great! On to the next one!");
                            }
                            if (middle.equals("Bottom Shelf")) {
                                System.out.println("Heavier items should go in the bottom or middle shelves of the pantry. ");

                                System.out.println("What is the name of this item?");
                                Scanner name = new Scanner(System.in);
                                String namae = name.nextLine();

                                one[p] = namae;

                                System.out.println("Great! On to the next one!");
                            }
                        }
                        if (answer.equals("Something Else")) {
                            System.out.println("Which shelf do you want this item on? Top Shelf, Middle Shelf, or Bottom Shelf." +
                                    "(Remember that this program is case sensitive so type each answer as they appear in the text.)");
                            Scanner shelf = new Scanner(System.in);
                            String shelves = shelf.nextLine();

                            // this function should define if I missed any other types of produce that might be availiable to go into the pantry
                            // essentially anything I missed
                            // this should also be covered by the other class but...
                            // tis fine

                            if (shelves.equals("Top Shelf")) {
                                System.out.println("What is the name of this item?");
                                Scanner namae = new Scanner(System.in);
                                String name = namae.nextLine();

                                // this part organizes the item to be on the top shelf

                                three[p] = name;

                                System.out.println("Great! On to the next one!");
                            }

                            if (shelves.equals("Middle Shelf")) {
                                System.out.println("What is the name of this item?");
                                Scanner namae = new Scanner(System.in);
                                String name = namae.nextLine();

                                // this part organizes the item to be on the middle shelf.

                                two[p] = name;

                                System.out.println("Great! On to the next one!");
                            }

                            if (shelves.equals("Bottom Shelf")) {
                                System.out.println("What is the name of this item?");
                                Scanner namae = new Scanner(System.in);
                                String name = namae.nextLine();

                                // this part organizes the item to be on the bottom shelf

                                one[p] = name;

                                System.out.println("Great! On to the next one!");
                            }
                        }

                        // This will redefine the categories so that the user doesn't have to keep scrolling up. I will be
                        // putting these comment lines next to every repeat of this println method

                        System.out.println("The Categories are: Cans/ Jarred Goods, Dry/ Baking Goods, Bread/ Bakery, Beverages," +
                                " Produce, and Other.(Remember to type each category as they appear.)");
                        System.out.println("        ");
                    }

                    if (st.equals(other)) {
                        System.out.println("Does this go in the fridge?");
                        Scanner an = new Scanner(System.in);
                        String ans = an.nextLine();

                        if (ans.equals("Yes")) {
                            System.out.println("This does not go in the pantry!");

                        }
                        if (ans.equals("No")) {

                            System.out.println("Where do you want it to go? Top Shelf, Middle Shelf, or Bottom Shelf?");
                            Scanner question = new Scanner(System.in);
                            String shelf = question.nextLine();

                            if (shelf.equals("Top Shelf")) {
                                System.out.println("What is the name of this item?");
                                Scanner namae = new Scanner(System.in);
                                String name = namae.nextLine();

                                three[o] = name;

                                System.out.println("Great! On to the next one!");
                            }

                            if (shelf.equals("Middle Shelf")) {
                                System.out.println("What is the name of this item?");
                                Scanner namae = new Scanner(System.in);
                                String name = namae.nextLine();

                                two[o] = name;

                                System.out.println("Great! On to the next one!");
                            }

                            if (shelf.equals("Bottom Shelf")) {
                                System.out.println("What is the name of this item?");
                                Scanner namae = new Scanner(System.in);
                                String name = namae.nextLine();

                                one[o] = name;

                                System.out.println("Great! On to the next one!");
                            }

                        }

                        // This will redefine the categories so that the user doesn't have to keep scrolling up. I will be
                        // putting these comment lines next to every repeat of this println method

                        System.out.println("The Categories are: Cans/ Jarred Goods, Dry/ Baking Goods, Bread/ Bakery, Beverages," +
                                " Produce, and Other.(Remember to type each category as they appear.)");
                        System.out.println("        ");
                    }
                    c++;
                    b++;
                    be++;
                    bd++;
                    p++;
                    o++;
                }
            }
            System.out.println("Would you like to know what you have?");
            Scanner question = new Scanner(System.in);
            String ans = question.nextLine();

            if (ans.equals("Yes")) {
                System.out.println(Arrays.toString(three));
                System.out.println(Arrays.toString(two));
                System.out.println(Arrays.toString(one));

                // Continue to put parts here so the java actually works out and such.

                System.out.println("Here are your ingredients. Your pantry is now organized!");
            } else {
                System.out.println("Your pantry is now organized!");
            }
        }
    }
}

// place holder: put Great! onto the next one on the other methods as well as this one
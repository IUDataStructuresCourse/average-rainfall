# Lab 1: Average Rainfall

1. Read the following tutorial for using Github and clone your version
   of the average-rainfall repository onto your computer.

   http://homes.soic.indiana.edu/classes/spring2016/csci/c343-yye/github.php

2. Code Editor: IntelliJ IDEA
    1. Follow the instructions on the course web page for installing
	   IntelliJ IDEA.
    2. Create a new project using the 'check out from version control' option (GitHub) .
    3. Create a new Java class and name the class `Rainfall`.
	  Create a `main` method in this class.
    5. Verify that you can run this Java program by changing the `main`
        method as follows:
     
        ~~~~
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
        ~~~~
	
        and click on the button with the 'play' symbol, that is, a
        rightward pointing triangle. In the console window, you should
        see the output `Hello, World`.
   6. Use git to add, commit, and push the Rainfall directory and its contents
     to your repository. Verify on github.com that the push was successfull.

3. Implement a static method named `average_rainfall` that takes as
   input an array of integers (int) and returns the average
   (double). The input array represents daily rainfall amounts.  The
   array may contain the number -999 indicating the end of the data of
   interest, so you must ingore integers that follow -999.  Return the
   average of the non-negative values in the array up to the first
   -999 (if it shows up). (There may be negative numbers other than
   -999 in the sequence.) If for some reason it is impossible to 
   compute the average rainfall, throw an IllegalArgumentException.
   Test your program on diverse inputs that
   exercise the different parts of your code and fix the bugs that you
   find.  Save your program and commit and push on your program to
   your git repository. Verify on github.com that the push was
   successfull and contains your working program.

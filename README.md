# Lab 1: Average Rainfall

1. Read the following tutorial for using Github and clone your version
   of the average-rainfall repository onto your computer.

   http://homes.soic.indiana.edu/classes/spring2016/csci/c343-yye/github.php

2. Eclipse
   1. Download and install [Eclipse](https://eclipse.org/downloads/) and
     work through the [tutorial](./Eclipse-IDE-Tutorial.pdf).
   2. Open Eclipse and set the workspace directory to the directory
     created when you cloned the average-rainfall repository.
   3. Create a new Java project with project name 'Rainfall'.
     In 'Project layout', choose 'Use project folder as root
     for sources and class files'. Click 'Finish'.
   4. Create a new Java class using the menu sequence File=>New=>Class.
     Name the class `Rainfall` and click on the option to
     create a `main` method.
   5. Verify that you can run this Java program by changing the `main`
     method as follows:
~~~~
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
~~~~
     and click on the green button with the 'play' symbol, that is, a
     rightward pointing triangle. In the console window, you should
     see the output `Hello, World`.
   6. Use git to add, commit, and push the Rainfall directory and its contents
     to your repository. Verify on github.com that the push was successfull.

3. Implement a Java program that consumes a space-separated sequence
   of numbers representing daily rainfall amounts as entered by a
   user.  Use
   [java.util.Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
   to obtain the user input.  The sequence may contain the number -999
   indicating the end of the data of interest.  Output the average of
   the non-negative values in the sequence up to the first -999 (if it
   shows up).  There may be negative numbers other than -999 in the
   sequence. Turn in your program by using git to do a commit and push
   on your version of this repository. Verify on github.com
   that the push was successfull and contains your working program.

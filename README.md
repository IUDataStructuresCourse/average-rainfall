# Lab 1: Average Rainfall

1. Java Installation

   If your computer does not already have Java Version 8 installed,
   you can download and install it from the following URL:
   
   https://java.com/en/download/

2. IntelliJ Project Setup 

  * Create a new project using the 'check out from version control'
    option, selecting GitHub and password access. Use the URL for
	your repository for this assignment, somehting like:
	https://github.com/IUDataStructuresCourse/lab-1-average-rainfall-<username>.git
	
  * Create a 'configuration' for running the program by going to
    the menu 'Run > Edit Configurations'. 
	Click on the '+' and choose 'Application'.
	Name the configuration something like 'Run Main'. 
	Choose 'Main' as the 'Main class'. In the VM options, enter '-ea'.
	Verify that your IntelliJ setup is correct by clicking on
	the run button (green rightward-pointing triangle in the toolbar).
	You should see an exception in the console window pointing to
	an assert.

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

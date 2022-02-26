# FoodTruckProject


### Description
This project allows a user to input up to 5 food trucks and is displayed with
a menu of different options such as, display all food trucks, calculate average
food truck rating, and display highest rated food truck.

Upon the program start up the user is displayed a menu and asked to enter the
name of the food truck, what type of food that food truck serves, and a 1-5
rating of the food truck. If the user doesn't have five trucks to enter, they can
enter "quit" into the "truck name" prompt to quit. The program will keep asking
for food truck information until five trucks are entered or the user has
entered "quit".

Once either of those conditions have been meet the program then displays another
menu to choose from. This menu gives the following options: display all food
trucks, calculate average rating, display the highest rated truck, and quit. The
display all options prints all of the trucks entered onto the screen. It only
prints out as many trucks as the user entered. The average rating takes the
rating of all of the food trucks and displays the average of all the trucks
entered. Lastly the display highest rated truck, compares all of the ratings of
the trucks entered and displays the highest rated to the user.

This menu will keep running until the user has entered the menu option to quit
the program. This allows user to display and of the menu options several times
until they are finished with the program. Exiting out of this last menu
terminates the program.

### Technologies

#### Project is created with:
* Java verion: 1.8

It utilizes OOP to allow user to create
FoodTruck objects and use its methods.


### What I learned
Creating this project brought about serval learning experiences from it. Firstly
it introduced me to the nullPointer exception error when using some of my
methods, this was a simple fix and will be easy to implement in future projects.

I also got to see how buggy Scanner can be at times when using its .nextLine()
and .nextInt() in loops. I was having issues after the program looped once, it
would automatically enter a FoodTruck name, and only allow food type to be
entered. Come to find out  when next line was called after the next int, it was
taking in everything after nextInt and moving to the next .nextLine() call. This
was solved by simply adding a .nextLine() assigned to nothing after the nextInt()
to move the cursor onto the next line before the loop restarted.

Lastly I saw the true power of using static field's with objects. Having a
static feild allowed me to assign incremented IDs to the FoodTruck objects. My
program assigned a food truck the value of the static feild + 1, then that trucks 
incremented ID was then assign to the static ID so that the next truck created
"knows" the last trucks id and adds to it.  

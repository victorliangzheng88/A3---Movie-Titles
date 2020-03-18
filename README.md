# A3---Movie-Titles

This project demonstrates how to read in a csv files of movie titles and parse that data into a binary search tree. With that data, we are required to find movie titles between the range of the two movie titles that the user provide to the program in a binary search tree.

In this project, I've used Linked List, Array List and Binary Search Tree.

I use linkedlist to read in the data in the file. The reason that I use linked list is that the operation with linked list is much easier and furthermore, it can grow and shrink during run time, which makes insertion and deletion much easier. Arraylist were used to save the data of the movie list that are in the range.

Binary search tree were used to sort the movie titles alphabetically, where everything on the left of the tree is alphabetically smaller than the root and everything on the right is alphabetically greater than the root. Shown as this: left < root < right.

The datas were saved into many linkedlist according to their header, which are the movieId, titles and genres. The release year of the movie was inside the movie title, therefore, a for loop in my program were extracted and save into the linkedlist of releaseYear. Then, the titles in the linkedlist were save into a binary search tree in order to perform the action for searching movie title between the range.

I've decided to make the program to have interaction with the user so that the user can manipulate over the program and to search the movie titles between the range as many times as the user wants. The release year wasn't removed from the title because there may be different version of the movies and they might have different release year. Therefore, I decided to not remove the year for the user to speficify the exact year of the movie and for precise searching.

## Setup

These are the steps to compile `A3.java` and run the program `A3`. Source code is found in the src folder. These steps are for use with command line workflow such as with a terminal.

1. Sign up for a GitHub account if you don't have one. Set up your SSH keys with github.
2. Clone this repository `git clone git@github.com:victorliangzheng88/A3---Movie-Titles.git` to your machine to get a copy.
3. Move into the project's root directory with `cd A3---Movie-Titles` [^1]
4. Move again into the subdirectory `src` using the command `cd src`
5. Compile the java file using the java compiler command `javac A3.java`
6. Run the compiled java program with the java command `java A3`

Another way to run the program is to use the integrated development environment (IDE), eclipse.

1. Download and Install Java, and Eclipse if the programs are not yet installed.
2. Go to https://github.com/victorliangzheng88/A3---Movie-Titles.git using web browser.
3. Download the files in the folder called `data` and `src` and save them into the same folder in your computer.
4. Open eclipse after installed and click File on the left top corner and click Open File.
5. Choose the file name of `A3.java` and click Open.
6. Click Run.

You should see an output similar to the following with similar input:

```sh
Please Enter the First Movie Title with Year:
Bamboozled (2000)
Please Enter the Second Movie Title with Year:
Batman v Superman: Dawn of Justice (2016)

List of Movie Titles in the Range:

Banana Joe (1981)
Bananas (1971)
Band of Brothers (2001)
Band of Outsiders (Bande ?? part) (1964)
Band of the Hand (1986)
Bandidas (2006)
Bandits (2001)
Bangkok Dangerous (2008)
Baraka (1992)
Baran (2001)
Barb Wire (1996)
Barbarella (1968)
Barbarians at the Gate (1993)
Barbershop (2002)
Barbershop 2: Back in Business (2004)
Barbershop: The Next Cut (2016)
Barcelona (1994)
Barefoot (2014)
Barefoot in the Park (1967)
Barely Lethal (2015)
Barfly (1987)
Barking Dogs Never Bite (Flandersui gae) (2000)
Barney's Great Adventure (1998)
Barney's Version (2010)
Barry Lyndon (1975)
Bart Got a Room (2008)
Bartleby (2001)
Barton Fink (1991)
Basic (2003)
Basic Instinct (1992)
Basic Instinct 2 (2006)
Basket Case (1982)
Basquiat (1996)
Bastard Out of Carolina (1996)
Bat*21 (1988)
Batman & Robin (1997)
Batman (1966)
Batman (1989)
Batman Begins (2005)
Batman Beyond: Return of the Joker (2000)
Batman Forever (1995)
Batman Returns (1992)

```

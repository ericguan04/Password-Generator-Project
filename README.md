# Password-Generator-Project

Password Generator Project by Eric Guan

This personal project is a Java remake of an old Scratch assignment I did in High School with a friend:

https://scratch.mit.edu/projects/339715531

# Purpose

Creating a strong password is becoming increasingly important in today's digital age. However, how do you create a strong password and remember it? One way is to run a series of algorithms that only you know on a term that relates to the account. This creates a unique and strong password that you can easily derive by running your algorithm. This project is an example of this method in action.

# How it works

Enter a term that relates to the purpose of this password (ex. Website Name)
This term will be lower-cased and mutated several times to create the password

1. The term's vowels will all be extracted and capitalized. This will be the first part of the password.
2. The term will be reversed. This will be the second part of the password.
3. The term's length will correspond with a special character (see character's above 0-9 on keyboard). The length of the term * 2 will be added at the end. This will be the third part of the password.

The password will be a concatenation of all these "algorithms" in that order.

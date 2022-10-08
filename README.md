# Password-Generator-Project

Password Generator Project by Eric Guan

This personal project is a Java remake of an old Scratch assignment I did with a friend in High School:

https://scratch.mit.edu/projects/339715531

# Purpose

Creating a strong password is becoming increasingly important in today's digital age. However, how do you create a strong password and remember it? One way is to run a series of algorithms that only you know on a term that relates to the account. This creates a unique and strong password that you can easily derive by running your algorithm. This project is an example of this method in action.

# How it works

Enter a term that relates to the purpose of this password (ex. Website Name)

*ex. Youtube*

This term will be lower-cased and mutated several times to create the password: 

*ex. youtube*

1. The term's vowels will all be extracted and capitalized. This will be the first part of the password.

*ex. OUUE*

2. The term will be reversed. This will be the second part of the password.

*ex. ebutuoy*

3. The term's length will correspond with a special character (see character's above 0-9 on keyboard). If the term length is over 10 characters long, subtract 10 from the length and use that value. Repeat until the number is 1-10. The length of the term * 2 also will be added at the end. This will be the third part of the password.

*ex. &14*

The password will be a concatenation of all these "algorithms" in that order.

*ex. OUUEebutuoy&14*

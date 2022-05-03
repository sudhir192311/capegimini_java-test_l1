/*

3. Handling Stuff
= Coding

Description
In Java, we can use more than one catch block with the try block.
Generally, multiple catch block is used to handle different types of
exceptions, which means each catch block is used to handle different
types of exceptions.
If you use multiple catch blocks for
the same type of exception, then
it will give you a compile t me error because Java does not allow
you to use multiple catch block for
the same type of exception. A
catch block is always preceded by the try block.
Write program to demonstrate Multiple Exceptions.
Specifications:

 Specifications:

class Activity:
data fields:
String stringi
String string2
String operator
Constructor to initialize the class variables.

class Source:
method definitions:
handleException(Activity a): implement try
return type: String
visibility: public

doOperation(Activity a): implement switch
return type: String
visibility: public

You have to implement the following methods under Source class:

handleException (Activity a) - In this function you have to
check for exceptions.
doOperation (Activity a) - this function should implement the
string operation between string1 and string2 for the
operator operator.

operator = +' concat the strings string 1 and string2.
e.g, for string1 = "hello" and string? = "world",
then result - "helloworld"
L

operator
replace the contents of string 2 in string 1 with
empty string.

e.g. If string 1 = "helloworld" ard string? = world"
then result = "hello"

Tasks:

In the function handle Exception (Activity a):

Check that the value of either string1 or string? variable
is null then throw appropriate exception
for NullPointerException and return "Null values found*
Check if the value of operator variable is not equal to these
string operators ((+ or -) using logical AND operator if the
condition is true then throw and return the default exception
with the Operator as the return message.
If no exception is found return "No Exception Found

In the function doOperation (Activity a):
perform the string operations, using switch statement and
turn the correct value.

IMPORTANT:

u want to test your progran you can implemen:
main() function given in the stub and you can use RUN
CODE to test your main) provided you have made valid
function calls with valid data required,

*/

class Activity {
    String stringi;
    String string2;
    String operator;

    Activity(String stringi, String string2, String operator) {
        this.stringi = stringi;
        this.string2 = string2;
        this.operator = operator;
    }
}

class Source {
    public String handleException(Activity a) {
        if (a.stringi == null || a.string2 == null) {
            throw new NullPointerException("Null values found");
        }
        if (a.operator.equals("+")) {
            return a.stringi + a.string2;
        } else if (a.operator.equals("-")) {
            return a.stringi.replace(a.string2, "");
        } else {
            throw new IllegalArgumentException("Operator not found");
        }
    }

    public String doOperation(Activity a) {
        switch (a.operator) {
        case "+":
            return a.stringi + a.string2;
        case "-":
            return a.stringi.replace(a.string2, "");
        default:
            throw new IllegalArgumentException("Operator not found");
        }
    }

    public static void main(String[] args) {
        Source s = new Source();
        Activity a = new Activity("hello", "world", "+");
        Activity b = new Activity("helloworld", "world", "-");
        System.out.println(s.handleException(a));
        System.out.println(s.handleException(b));
    }

}

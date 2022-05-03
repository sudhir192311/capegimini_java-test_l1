/*

Coding

Description
Your task here is to implement a Java code based on the following
specifications. Note that your code should match the specifications in
precise manner. Consider default visibility of classes, data fields and
methods unless mentioned otherwise

Specifications:

class definitions:
class ArrayListOps:
method definitions:
makeArrayListInt(int n): Method to create an arrayLi
return type: ArrayList<Integer>
visibilty: public

reverseList(ArrayList<Integer› list): Method to Reve
return type: ArrayList<Integer›
visibilty: public

changeList(ArrayList<Integer> list, int m, int n):
return type: ArrayList<Integer>
visibilty: public

Task:

Your task is to create a class ArrayListOps and implement the
following:
1 makeArrayListInt(int n): Method to create an ArrayList with
number of elements as n and set elements to 0.

If number of elements n is 4 then the method should return a
ist containing [0,0,0,0]

2 reverseList(ArrayList<Integer> list): Method to Reverse list
2, changeList(ArrayList < Integer> list, int m, int n): Method to
change all occurences of m to n in list
Important:

10 check
your program, you can use the main) method (in
Source class) given in the stub. You can
make suitable function
calls
and use RUN CODE button to check your main) function
outout.

Sample Input

ArrayList<Integer> list = new ArrayList<Integer>(Array
n
4 (method makeArrayListInt)
m
- 28, n = 20 (method changeList)

Sample Output

[0, 0, 0, 0]
[12, 10, 28, 33, 25, 10]
[12, 10, 20, 33, 25, 10]

NOTE:

above Sample Output is only for demonstration purposes
and will be obtained If you implement the main) method with
all method calls accordingly
Upon implementation of main) method, you can use the
RUN
CODE button to pass input data in the method calls and arrive
at the Sample Output.

*/

import java.util.*;

class ArrayListOps {
    public static void main(String[] args) {
        // for intial [0,0,0,0]
        ArrayList<Integer> list = new ArrayList<Integer>(ArrayListOps.makeArrayListInt(4));
        System.out.println(list);

        // for change the value
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(12, 10, 28, 33, 25, 10));
        list = ArrayListOps.changeList(list1, 28, 10);
        System.out.println(list);

        // for reverse the list
        list = ArrayListOps.reverseList(list);
        System.out.println(list);
    }

    public static ArrayList<Integer> makeArrayListInt(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(0);
        }
        return list;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> revList = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revList.add(list.get(i));
        }
        return revList;
    }

    public static ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == m) {
                list.set(i, n);
            }
        }
        return list;
    }
}
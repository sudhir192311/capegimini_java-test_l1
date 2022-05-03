/*

2. Mobile Shop
Coding

Description
Your task here is to implement Java code based on the following
specifications. Note that your code should match the specifications in
a precise manner. Consider default visibility of classes, data fields,
and methods unless mentioned.
A
Specifications

class definitions:
class Mobile:

data member:
HashMap<String, ArrayList<String>> mobiles = new
method definition:
addMobile(String company, String model)
return type: String
visibility: public

getModels(String company)
return type: ArrayList<String>
visibility: public

buyMobile(String company,
String model)
return type: String
visibilitv. nublic.

Task
Class Mobile

define the object of HashMap «String, ArrayList «String> > with
variable name mobiles.

The String defines the name of the company and the
Arraylist «String > will have list of models.

Implement the below methods for this class:
•String addMobile(String company _String model):

Write a code to add a company and its model in mobiles
map as given below
If the company does not exist in the map already, add the
company and its model into the map. (Note: Add model into
a new ArrayList < String > and add this list into map as value)
If the company already exist in the map, append the diver
model into the corresponding model
Return. 'model successfully added" after performing:
apove operations

-ArrayList < String> getModel(String company)

Write a code to get the Model list for the given campany from
Man mobiles

Task
Class Mobile

define the object of HashMap «String, ArrayList « String> > with
variable name mobiles.

The String defines the name of the company and the
Arraylist «String> will have ist of models.

Implement the below methods for this class:
-String addMobile (String company, String model):

Write a code to add a company and its in model in mobiles
map as given below
the company does not exist in the map already, add the
company and its model into the map. (Note: Add model
new ArrayList < String > and add
as.

f the company already exist in the map,
the given

model into the corresponding model

Return. "model successfully added' after performing f
above operations

-ArrayList < String> getModel(String company)

Write a code to get the Model for th
niven
from

Man mobiles
Test


*/

import java.util.*;

class Mobile {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args) {

        Mobile m = new Mobile();
        m.addValue("apple", "mac");
        m.addValue("apple", "ipad");
        System.out.print(m.getModels("apple"));
        System.out.print(m.buyMobile("apple", "mac"));
    }

    public ArrayList<String> getModels(String company) {
        if (mobiles.containsKey(company)) {
            return this.mobiles.get(company);
        } else {
            return new ArrayList<String>();
        }
    }

    public String addValue(String company, String model) {

        if (mobiles.containsKey(company)) {
            mobiles.get(company).add(model);

        } else {
            ArrayList<String> list = new ArrayList<String>();
            list.add(model);
            mobiles.put(company, list);
        }
        return "Added successfully";

    }

    public String buyMobile(String company, String model) {
        if (mobiles.containsKey(company)) {
            if (mobiles.get(company).contains(model)) {
                mobiles.get(company).remove(model);
                return "mobile sold successfully";
            } else {
                return "item not available";
            }
        } else {
            return "item not available";
        }
    }
}
package classes.types;

import java.util.*;

public final class Final {

      // Properties:
      // Class final cannot be extended
      // Method final cannot be overridden by sub-class
      // Variable final value cannot be changed, initialised at declaration

      // Assigning values via initialisation
      final int numericData = 2;
      final String strData = "str";

      final List<String> strList;

      // Assigning values via constructor
      public Final(List<String> strList) {
            this.strList = strList;
      }
      public Final() {
            this.strList = new ArrayList<>();
      }

      // Final keyword not required for methods inside a class that is declared Final
      public final void printVariables() {
            System.out.println("Numeric Data: " + numericData);
            System.out.println("String Data: " + strData);

            for(String str : strList) {
                  System.out.println(str + " ");
            }
      }

      // Lists are mutable: ALLOWED to add new values
      public void addValue(String value) {
            strList.add(value);
      }

}

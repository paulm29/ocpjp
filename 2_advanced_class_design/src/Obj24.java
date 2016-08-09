/**
    2.4 Use enumerated types including methods, and constructors in an enum type

 Enums are implicitly declared public, static, and final, which means you cannot
 extend them.
 •	 When you define an enumeration, it implicitly inherits from java.lang.Enum.
 Internally, enumerations are converted to classes. Further, enumeration constants
 are instances of the enumeration class for which the constant is declared as a
 member.
 •	 You can apply the valueOf() and name() methods to the enum element to return the
 name of the enum element.
 •	 If you declare an enum within a class, then it is by default static
 You cannot use the new operator on enum data types, even inside the enum class.
 •	 You can compare two enumerations for equality using == operator.
 •	 If enumeration constants are from two different enumerations, the equals() method
 does not return true.
 •	 When an enumeration constant’s toString() method is invoked, it prints the name
 of the enumeration constant.
 •	 The static values() method in the Enum class returns an array of the enumeration
 constants when called on an enumeration type.
 •	 Enumeration constants cannot be cloned. An attempt to do so will result in a
 CloneNotSupportedException.
 */
public enum Obj24 {
    ALPHA(1), BETA(2), GAMMA(3);

    private int number;

    public int getNumber() {
        return number;
    }

    /*
        Constructor must be private
     */
    private Obj24(int number) {
        this.number = number;
    }

}

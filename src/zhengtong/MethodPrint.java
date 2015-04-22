package zhengtong;

import java.lang.reflect.Method;
/**
 * 
 * @author JackG
 *
 */
public class MethodPrint {
	/**
	 * Print the names of class and mathods of the object input;
	 * @param o
	 */
	public static void pringClassAndMethods(Object o) {
		Class<? extends Object> oc = o.getClass();
		System.out.println(oc.getName());
		Method[] m = oc.getMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
	}
	
	public static void main(String[] args) {
		MethodPrint.pringClassAndMethods(new Integer(0));
		MethodPrint.pringClassAndMethods(new String());
		MethodPrint.pringClassAndMethods(new StringCount(""));
	}
}/* Output:
java.lang.Integer
numberOfLeadingZeros
numberOfTrailingZeros
bitCount
equals
toString
toString
toString
hashCode
reverseBytes
compareTo
compareTo
byteValue
shortValue
intValue
longValue
floatValue
doubleValue
valueOf
valueOf
valueOf
toHexString
compare
decode
reverse
parseInt
parseInt
getInteger
getInteger
getInteger
highestOneBit
lowestOneBit
rotateLeft
rotateRight
signum
toBinaryString
toOctalString
wait
wait
wait
getClass
notify
notifyAll
java.lang.String
equals
toString
hashCode
compareTo
compareTo
indexOf
indexOf
indexOf
indexOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
charAt
codePointAt
codePointBefore
codePointCount
compareToIgnoreCase
concat
contains
contentEquals
contentEquals
copyValueOf
copyValueOf
endsWith
equalsIgnoreCase
format
format
getBytes
getBytes
getBytes
getBytes
getChars
intern
isEmpty
lastIndexOf
lastIndexOf
lastIndexOf
lastIndexOf
length
matches
offsetByCodePoints
regionMatches
regionMatches
replace
replace
replaceAll
replaceFirst
split
split
startsWith
startsWith
subSequence
substring
substring
toCharArray
toLowerCase
toLowerCase
toUpperCase
toUpperCase
trim
wait
wait
wait
getClass
notify
notifyAll
zhengtong.StringCount
main
getRepeatLetters
getRepeatLettersCount
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
*///

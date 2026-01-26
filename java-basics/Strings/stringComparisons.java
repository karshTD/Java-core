String s1 = "Hello";
String s2 = new String("Hello");
  
// 1. equals() - case sensitive
s1.equals(s2);




// 2. equalsIgnoreCase() - ignores case
"HELLO".equalsIgnoreCase("hello");


// 3. compareTo() - lexicographical comparison
"apple".compareTo("banana");  // negative (apple < banana)
"banana".compareTo("apple");  // positive (banana > apple)
"apple".compareTo("apple");   // 0 (equal)

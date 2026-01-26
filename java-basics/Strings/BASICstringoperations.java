String str = "Hello";
int len = str.length();  // 5

#STRING CONCATATIONS

String s1 = "Hello";
String s2 = "World";

// Method 1: + operator
String result = s1 + " " + s2;  // "Hello World"

// Method 2: concat()
String result2 = s1.concat(" ").concat(s2);

// Method 3: StringBuilder (for multiple concatenations)
StringBuilder sb = new StringBuilder();
sb.append(s1).append(" ").append(s2);
String result3 = sb.toString();


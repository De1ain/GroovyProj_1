class Strings {
    static void main(String[] args){

        def name = "Tim"
        def family = "Borodin"

        println "name.class " + name.class

        println 'I am ${name}'
        println "I am ${name}"
        println "I am $name"

        def multiString = '''I am
        a multi
        string
    that goes
whereever it wants''';
        println multiString

        println "3rd char of name is \"" + name[2] + "\""
        println "index if \"i\" in name is \"" + name.indexOf('i') + "\""

        println "first 2 chars of name: " + name[0..1]
        println "family[0,2, 4,6]: " + family[0,2, 4,6]
        println "last 3 chars of family: " + family.substring(family.length()-3, family.length())

        println "concat: " + "My name is".concat(name);
        println "What I said is " * 2

        println "equals: " + name.equals("Tim");
        println "equals: " + name.equals("tim");
        println "equals: " + name.toLowerCase().equals("tim");
        println "equals: " + name.equalsIgnoreCase("tim");

        def longStr = "A Quick Brown Fox " * 2
        println "\"" + longStr.trim() + "\" lengths is: " + longStr.length()
        println "remove part of the string: " + longStr - "A Quick"
        println "longStr.split(' '): " + longStr.split(' ')
        println "longStr.toList()" + longStr.toList()
        println "longStr.indexOf(\"A\"): " + longStr.indexOf("A")
        println "longStr.lastIndexOf(\"A\"): " + longStr.lastIndexOf("A")
        println "" + longStr.replaceAll("Fox", "Mammoth")

        println "aaa <=> aab: " + ("aaa" <=> "aab")
        println "aab <=> aab: " + ("aab" <=> "aab")
        println "aac <=> aab: " + ("aac" <=> "aab")
        println "Ant <=> Banana: " + ("Ant" <=> "Banana")
    }
}

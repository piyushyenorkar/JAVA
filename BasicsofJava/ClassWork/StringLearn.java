package BasicsofJava.ClassWork;

public class StringLearn {
            public static void main(String[] args){
                String name = "piyush";
                String course = new String("java");
                System.out.println(name.length());
                System.out.println(name.charAt(0));
                System.out.println(name.toUpperCase());
                System.out.println(name.toLowerCase());
                System.out.println(name.substring(2));
                System.out.println(name.substring(1,4));
                System.out.println(name.contains("ey"));
                System.out.println(name.equals("piyush"));
                System.out.println(name.trim());
                System.out.println(name.replace("piyush", "Piyush"));
                System.out.println(name.isEmpty());
                System.out.println(name.split(" "));
                System.out.println(course);
                

                //string comparison
                String a = new String("java");
                String b = new String("java");
                System.out.println(a == b);//it will compare the reference of string
                System.out.println(a.equals(b));//it will compare the value of string
                System.out.println(a.equalsIgnoreCase(b));//it will compare the value of string ignoring case

                //string concatention
                String firstname = "piyush";
                int age = 20;
                String message = "Name: "+ firstname + ", Age: " + age;
                System.out.println(message);

            }
}

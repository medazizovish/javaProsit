public class Animal {

    String name, family;
    int age;
    boolean isMammal ;


     public  Animal(String name, String family, int age, boolean isMammal){
         this.name = name;
         this.family = family;
         this.age = age;
         this.isMammal = isMammal;
     }

    public String getName() {
        return name;
    }
}

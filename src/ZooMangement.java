import java.util.Scanner;

public class ZooMangement {
//////////////////////////prosit 1
    public static void main(String[] args) {
        int nbrCargs1 = 20;
        String zooName = "my zoo ";
        System.out.println(zooName + "comporte  " + nbrCargs1 + "cages");


//////////////////////////////////////////methode  2


        Scanner x = new Scanner(System.in);
        System.out.println("Enter zooName");

        String userName = x.nextLine();


        Scanner y = new Scanner(System.in);
        System.out.println("Enter nomber ");

        int nbr = y.nextInt();



        System.out.println("my zoo  " + userName + "comporte " + nbr + "cags");


        //////////////////////////////////////prosit 2
        Animal lion=new Animal("simba","cats",1,true);
        Animal Dog=new Animal("dog","test",10,true); ///// prosiit3 1
        Animal cat=new Animal("cat","test",10,true); ///// prosiit3 1
        Animal cat2=new Animal("dog","test",10,true); ///// prosiit3 1

        Zoo myZoo=new Zoo("myZoo","tunis");
        myZoo.displayZoo();
      System.out.println(myZoo);


      myZoo.addAnimal(lion);
      myZoo.addAnimal(Dog);
        myZoo.addAnimal(cat2);/////mzedheesh






        myZoo.afficherAnimaux();


      System.out.println(myZoo.searchAnimal(cat2));



     }


}


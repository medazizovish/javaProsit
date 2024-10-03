public class Zoo {
   String name , city ;
   final int nbrCages=25 ;
   Animal[]animals;
   int animalCount=0 ;


   public  Zoo(String name, String city ){
       this.name = name;
       this.city = city;
       animals = new Animal[nbrCages];
   }

    @Override
    public String toString() {
        return "Zoo{" +
                "nbrCages=" + nbrCages +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public  void displayZoo (){
       System.out.println("name "+name +"city " +city +"nbrCages "+nbrCages );

   }


   //////////////////////prosiit3  10
   public boolean addAnimal(Animal animal) {
       if ((animalCount < animals.length)&&(animalCount<25) && (searchAnimal(animal)==-1)) {
           animals[animalCount] = animal;  // add
           animalCount++;
           return true;
       } else {
           return false;
       }
   }







    ////////////////////prosiit3   11  afiiche
    public void afficherAnimaux() {
        System.out.println("Animaux dans le zoo:");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i].name);
        }
    }

/////////////////////////////////

    public String getName() {
        return name;
    }




    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name==(animal.name)) {
                return i;
            }
        }
        System.out.println(animal.name + " non trouvé dans le zoo.");
        return -1;
    }



    //////////////remove


    public  boolean  removeAnimal(Animal animal) {

       int index = searchAnimal(animal);
       if (index==-1) {
           System.out.println("animal n'existe pas");
           return false ;
       }
       for  (int i=index ; i<animalCount-1 ; i++ ){
           animals[i]=animals[i+1];
       }
              animals[animalCount-1]=null;
       animalCount--;
        System.out.println(animal.getName()+"cette animal a ete supp");
        return true;

   }


   ////////////////15
    public  boolean isZooFull(){
       return animalCount == 25;
    }
}
/////////////////last


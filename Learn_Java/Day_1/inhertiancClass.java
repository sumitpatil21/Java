
class Animal {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal {
    public void aniSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  
  class Dog extends Pig {
     
    public void animSound() {
      System.out.println("The dog says: bow wow");
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      Animal myDog = new Dog();
          myDog.animalSound();
    }
  }
  
package POO.polimorfismosobrescritca;

public class RodaAplicacao {
  
  public static void main(String[] args) {
    
    ClassMae[] classes = new ClassMae[]{new ClassFilha1(), new ClassFilha2(), new ClassMae()};

    for (ClassMae classe : classes) {
      classe.metodo1();
    }

    for (ClassMae classe : classes) {
      classe.metodo2();
    }

    System.out.println(" ");

    ClassFilha2 classFilha2 = new ClassFilha2();
    classFilha2.metodo2();
  }
}
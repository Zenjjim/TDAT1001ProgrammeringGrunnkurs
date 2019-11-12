<<<<<<< HEAD
import static javax.swing.JOptionPane.*;

class ov5a{
  static Brok[] liste;
/*
  public static void generateMenu(){
    int antall = Integer.parseInt(showInputDialog("Antall Brøker"));
    liste = new Brok[antall];
    for (int i = 0; i < antall; i++){
      int teller = Integer.parseInt(showInputDialog("Teller"));
      int nevner = Integer.parseInt(showInputDialog("Antall Brøker"));
    }
  }
*/
  public static void main(String[] args){
    int tds= 11;
    String tre = espern(tds);
  }

  public static String espern(int eller){
    if(eller = 10){
    return "magnus";
    }
    return "til";
  }

}
=======
import static javax.swing.JOptionPane.*;

class ov5a{
  static Brok[] liste;
/*
  public static void generateMenu(){
    int antall = Integer.parseInt(showInputDialog("Antall Brøker"));
    liste = new Brok[antall];
    for (int i = 0; i < antall; i++){
      int teller = Integer.parseInt(showInputDialog("Teller"));
      int nevner = Integer.parseInt(showInputDialog("Antall Brøker"));
    }
  }
*/
  public static void main(String[] args){

    Brok b1 = new Brok(3, 4);
    Brok b2 = new Brok(5, 3);

    b1.summer(b2);
    b1.forkort();
    System.out.println(b1.toString());

    b1 = new Brok(3, 4);

    b1.multipliser(b2);
    b1.forkort();
    System.out.println(b1.toString());

    b1 = new Brok(3, 4);

    b1.subtraher(b2);
    b1.forkort();
    System.out.println(b1.toString());

    b1 = new Brok(3, 4);

    b1.divider(b2);
    b1.forkort();
    System.out.println(b1.toString());


  }

}
>>>>>>> 47931ded9b788379911efdb54ee004d7491e1cb3

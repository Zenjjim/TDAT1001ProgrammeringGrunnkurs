<<<<<<< HEAD
class tester{

  public static void NyString(){
    NyString string = new NyString("Dette er en tekst");
    System.out.println(string.forkorting());
    System.out.println(string.fjernTegn('t'));
  }

  public static void TextEditor(){
    TextEditor test = new TextEditor("Jeg er kul! hva gjør du imorgen? finner åpenbart ledig. seff:");
    System.out.println(test.antallOrd());
    System.out.println(test.gjenOrdLengde());
    System.out.println(test.gjenOrdPerPeriode());
    System.out.println(test.ordBytte("er", "idag"));
    System.out.println(test.orginal());
    System.out.println(test.rage());
  }

  public static void main (String[] args){
    NyString();
    System.out.println();
    TextEditor();

  }

}
=======
class tester{

  public static void NyString(){
    NyString string = new NyString("Dette er en tekst");
    System.out.println(string.forkorting());
    System.out.println(string.fjernTegn('t'));
  }

  public static void TextEditor(){
    TextEditor test = new TextEditor("Jeg er kul! hva gjør du imorgen? finner åpenbart ledig. seff:");
    System.out.println(test.antallOrd());
    System.out.println(test.gjenOrdLengde());
    System.out.println(test.gjenOrdPerPeriode());
    System.out.println(test.ordBytte("er", "idag"));
    System.out.println(test.orginal());
    System.out.println(test.rage());
  }

  public static void main (String[] args){
    NyString();
    System.out.println();
    TextEditor();

  }

}
>>>>>>> 47931ded9b788379911efdb54ee004d7491e1cb3

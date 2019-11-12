<<<<<<< HEAD
class ov10{

  public static void main(String[] args){
    Student stud = new Student("Zaim");
    stud.okAntOppg(4);
    System.out.println(stud.toString());

    OppgaveOversikt opg = new OppgaveOversikt();
    opg.nyStudent(stud);
    System.out.println(opg.getOppgLost(1));
    System.out.println(opg.lostOppgaver(stud));
    System.out.println(opg.toString());
    System.out.println();
  }
}
=======
class ov10{

  public static void main(String[] args){
    Student stud = new Student("Zaim");
    stud.okAntOppg(4);
    System.out.println(stud.toString());

    OppgaveOversikt opg = new OppgaveOversikt();
    opg.nyStudent(stud);
    System.out.println(opg.getOppgLost(1));
    System.out.println(opg.lostOppgaver(stud));
    System.out.println(opg.toString());
    System.out.println();
  }
}
>>>>>>> 47931ded9b788379911efdb54ee004d7491e1cb3

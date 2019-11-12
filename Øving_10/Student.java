<<<<<<< HEAD
public class Student{

  private String navn;
  private int antOppg;

  public Student(String navn){
    this.navn = navn;
    this.antOppg = 0;
  }

  public String getNavn(){
    return this.navn;
  }

  public int getAntOppg(){
    return this.antOppg;
  }

  public void okAntOppg(int okning){
    this.antOppg += okning;
  }

  public String toString(){
    return this.navn + " har fullført " + this.antOppg + " øvinger";
  }

}
=======
public class Student{

  private String navn;
  private int antOppg;

  public Student(String navn){
    this.navn = navn;
    this.antOppg = 0;
  }

  public String getNavn(){
    return this.navn;
  }

  public int getAntOppg(){
    return this.antOppg;
  }

  public void okAntOppg(int okning){
    this.antOppg += okning;
  }

  public String toString(){
    return this.navn + " har fullført " + this.antOppg + " øvinger";
  }

}
>>>>>>> 47931ded9b788379911efdb54ee004d7491e1cb3

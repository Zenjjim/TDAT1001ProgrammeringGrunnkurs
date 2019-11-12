<<<<<<< HEAD
import static javax.swing.JOptionPane.*;
class ov2b{
  public static void main(String[] args){

      double Apris = Double.parseDouble(showInputDialog("A pris: "));
      double Avekt = Double.parseDouble(showInputDialog("B vekt gram: "));
      double Bpris = Double.parseDouble(showInputDialog("B pris: "));
      double Bvekt = Double.parseDouble(showInputDialog("B vekt gram: "));

      if ( Avekt/Apris < Bvekt/Bpris){
        showMessageDialog(null,"Merke A er billigst ");
      }else{
        showMessageDialog(null,"Merke B er billigst ");
      }
    }
  }
=======
import static javax.swing.JOptionPane.*;
class ov2b{
  public static void main(String[] args){

      double Apris = Double.parseDouble(showInputDialog("A pris: "));
      double Avekt = Double.parseDouble(showInputDialog("B vekt gram: "));
      double Bpris = Double.parseDouble(showInputDialog("B pris: "));
      double Bvekt = Double.parseDouble(showInputDialog("B vekt gram: "));

      if ( Avekt/Apris < Bvekt/Bpris){
        showMessageDialog(null,"Merke A er billigst ");
      }else{
        showMessageDialog(null,"Merke B er billigst ");
      }
    }
  }
>>>>>>> 47931ded9b788379911efdb54ee004d7491e1cb3

package Day1;

import javax.swing.*;

public class Addition2 {
    public static void main(String[] args)
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        */

        int sum = a + b ;

        System.out.println ( "Sum of "+a+" and "+b+" is "+sum+"." ) ;
        JOptionPane.showMessageDialog (null, "Sum of a and b is: "+sum ) ;
    }
}

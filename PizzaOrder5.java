import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class PizzaOrder5 extends JFrame implements ActionListener{
  
  JButton order, clear, stock;
  JComboBox toppings;
  JRadioButton small, medium, large;
  JTextArea requests;
  ButtonGroup sizeGroup;
  Scanner scan;
  String info;
  String t [] = {"Select Topping", "Pepperoni", "Sausage", "Veggie"};
  int count = 0;
  
  public void actionPerformed(ActionEvent event) {
  double p1 = 0;
  double p2 = 0;
    try {
      if(event.getSource() == stock) {
        JOptionPane.showMessageDialog(null,"Pizza dough is restocked!!!");                                                                              
          count = 0;                  
      }
      else if(event.getSource() == order) {                                           
        String top = toppings.getSelectedItem().toString();
        String sz = "";
        if (top.equals("Select Topping"))
          throw new PriceException();
        if (top.equals("Pepperoni"))
          p1 = 9.95;
        if (top.equals("Sausage"))
          p1 = 8.95;
        if (top.equals("Veggie"))
          p1 = 7.95;                                          
        if (small.isSelected()) 
        {
          sz = "Small";
          p2 = p1 + 0;
        }
        if (medium.isSelected())
        {
          sz = "Medium";
          p2 = p1 + 2.00;
        }
        if (large.isSelected())
        {
          sz = "Large";
          p2 = p1 + 5.00;
        }
        String req = requests.getText();
        count++;
        if (count > 5) {
          throw new OrderException();
        }
         
        info = "Pizza Order: " + count + "\nTopping: " + top + "\nSize: " + sz + "\nSpecial Request: " + req + "\nPrice: " + p2;
        String output = info;
        JOptionPane.showMessageDialog(null,output);
        FileOutputStream file = new FileOutputStream("pizza.txt");
        PrintWriter writer = new PrintWriter(file);
       
        writer.println(output);
        writer.close();
      }
      else {
        toppings.setSelectedIndex(0);
        sizeGroup.clearSelection();
        requests.setText("");
        scan = new Scanner(new FileInputStream("pizza.txt"));
        while (scan.hasNext()) {
          String txt = scan.nextLine();
          System.out.println(txt);
        }
      }
    }
    catch (IOException ioe) {
      ioe.printStackTrace();
    }
    catch(PriceException e) { 
      String error = (e.getMessage());
      JOptionPane.showMessageDialog(null, error);
    }
    catch(OrderException c) {
      String error2 = (c.getMessage());
      JOptionPane.showMessageDialog(null, error2);
    }
  }
  
  
  public PizzaOrder5() {
    super("Pizza Order");
    setLayout(new BorderLayout());
    JPanel north = new JPanel();
    String t [] = {"Select Topping", "Pepperoni", "Sausage", "Veggie"};
    toppings = new JComboBox(t);
    north.add(toppings);
    add(north, BorderLayout.NORTH);
    
    JPanel center = new JPanel();
    JLabel s = new JLabel("Size:");
    small = new JRadioButton("Small");
    medium = new JRadioButton("Medium");
    large = new JRadioButton("Large");
    JPanel center2 = new JPanel();
    sizeGroup = new ButtonGroup();
    JLabel r = new JLabel("Special Requests:");
    requests = new JTextArea (10, 15);
    center.add(s);
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    center.add(small);
    center.add(medium);
    center.add(large);
    center2.add(r);
    center2.add(requests);
    center.add(center2);
    add(center, BorderLayout.CENTER);
    
    JPanel south = new JPanel();
    order = new JButton("Order");
    order.addActionListener(this);
    clear = new JButton("Clear");
    clear.addActionListener(this);
    stock = new JButton("Stocking Pizza Dough");
    stock.addActionListener(this);
    south.add(order);
    south.add(clear);
    south.add(stock);
    add(south, BorderLayout.SOUTH);
    
    setSize(500, 300);
    setVisible(true);
  }
  public static void main (String [] args) {
    PizzaOrder5 gui = new PizzaOrder5();
  }
}
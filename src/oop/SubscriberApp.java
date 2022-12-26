package oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;
import java.io.PrintWriter;


public class SubscriberApp extends JFrame implements ActionListener {
  private JLabel nameLabel;
  private JTextField nameField;
  private JLabel emailLabel;
  private JTextField emailField;
  private JLabel phoneLabel;
  private JTextField phoneField;
  private JLabel startTimeLabel;
  private JTextField startTimeField;
  private JLabel endTimeLabel;
  private JTextField endTimeField;
  private JButton submitButton;

  public SubscriberApp() {
    setLayout(new GridLayout(6, 2));

    nameLabel = new JLabel("Enter the name of the subscriber: ");
    add(nameLabel);

    nameField = new JTextField();
    add(nameField);

    emailLabel = new JLabel("Enter the email of the subscriber: ");
    add(emailLabel);

    emailField = new JTextField();
    add(emailField);

    phoneLabel = new JLabel("Enter the phone number of the subscriber: ");
    add(phoneLabel);

    phoneField = new JTextField();
    add(phoneField);
    
    startTimeLabel = new JLabel("Enter the start time: ");
    add(startTimeLabel);

    startTimeField = new JTextField();
    add(startTimeField);

    endTimeLabel = new JLabel("Enter the end time: ");
    add(endTimeLabel);

    endTimeField = new JTextField();
    add(endTimeField);

    submitButton = new JButton("Submit");
    add(submitButton);
    submitButton.addActionListener(this);
    
    //////
    nameField.addActionListener(this);
    emailField.addActionListener(this);
    phoneField.addActionListener(this);
    startTimeField.addActionListener(this); 
    endTimeField.addActionListener(this);
    
  }

  public void actionPerformed(ActionEvent e) {
	    Object source = e.getSource();
	    if (source == nameField || source == emailField || source == phoneField || source == startTimeField || source == endTimeField) {
	      String name = nameField.getText();
	      String email = emailField.getText();
	      String phone = phoneField.getText();
	      String startTime = startTimeField.getText();
	      String endTime = endTimeField.getText();

	      Subscriber subscriber = new Subscriber(name, email, phone, startTime, endTime);

	      try {
	        FileWriter fw = new FileWriter("subscribers.csv", true);
	        PrintWriter pw = new PrintWriter(fw);
	        pw.println(subscriber.getName() + "," + subscriber.getEmail() + "," + subscriber.getPhone()+ "," + subscriber.getStartTime() + "," + subscriber.getEndTime());
	        pw.close();
	      } catch (Exception ex) {
	        ex.printStackTrace();
	      }

	      JOptionPane.showMessageDialog(this, "Subscriber details saved to subscribers.csv");
	    }
	  }
 

  


  public static void main(String[] args) {
    SubscriberApp app = new SubscriberApp();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setSize(1000, 150);
    app.setVisible(true);
    app.setTitle("Subscriber App");
  }
  
}


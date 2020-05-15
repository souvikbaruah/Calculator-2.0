         

/* Project Name: Calculator 2.0
 * 
 * Author: Souvik Baruah (CSE-4th SEM, Roll No: 180710007054)
 * 
 * Project Description: This is a simple calculator designed with Java AWT which can perform all the basic operations efficiently.
 * 
 * N.B: If upon running the program, the 'Calculator 2.0' window appears at a position on the screen which is not so perfect according to the user, 
 *      the user can change the location parameters in the setLocation() function of the main() method. This situation may occur since the program 
 *      has been designed according to the best position on my own system and hence, it may vary from system to system.
 *      
 *      Also, the 'Calculator 2.0' window is Resizable.
 *      
 * Happy Calculating!
 */
            import java.awt.*;
            import java.awt.event.*;
            
            class Calculator extends Frame implements ActionListener 
            {
            
                TextField tf;
                Panel panel;
            
                String btnLabels[] = {"AC", "DEL", "%", "/",
                         "7", "8", "9", "x",
                         "4", "5", "6", "-",
                         "1", "2", "3", "+","0","00",".","="};
                Button btn[] = new Button[20];   
                double n1 = 0, n2 = 0, result = 0;
                char op;
            
                public Calculator() 
                {
                
                    Font f = new Font("Cambria", Font.PLAIN,130);
                    Font f2 = new Font("SansSerif", Font.BOLD,18);
                    
                    tf = new TextField(1000);
                    tf.setFont(f);
                    tf.setBackground(Color.BLACK);
                    tf.setForeground(Color.WHITE);
                    
                    panel = new Panel();
                    add(tf, "North");
                    add(panel, "Center");
                    
                    panel.setLayout(new GridLayout(5,4));
                    
                    for(int i=0; i < 20; i++) 
                    {
                    
                        btn[i] = new Button(btnLabels[i]);
                        btn[i].setFont(f2);
                        btn[i].addActionListener(this);
                        panel.add(btn[i]);
                    }
                
                    btn[3].setBackground(Color.ORANGE);
                    btn[7].setBackground(Color.ORANGE);
                    btn[11].setBackground(Color.ORANGE);
                    btn[15].setBackground(Color.ORANGE);
                    btn[19].setBackground(Color.LIGHT_GRAY);
                    
                    btn[0].setBackground(Color.RED);
                    btn[1].setBackground(Color.BLACK);
                    btn[2].setBackground(Color.BLACK);
                    btn[4].setBackground(Color.BLACK);
                    btn[5].setBackground(Color.BLACK);
                    btn[6].setBackground(Color.BLACK);
                    btn[8].setBackground(Color.BLACK);
                    btn[9].setBackground(Color.BLACK);
                    btn[10].setBackground(Color.BLACK);
                    btn[12].setBackground(Color.BLACK);
                    btn[13].setBackground(Color.BLACK);
                    btn[14].setBackground(Color.BLACK);
                    btn[16].setBackground(Color.BLACK);
                    btn[17].setBackground(Color.BLACK);
                    btn[18].setBackground(Color.BLACK);
                    
                    panel.setBackground(Color.BLACK);
                    panel.setForeground(Color.BLACK);
                    
                    btn[0].setForeground(Color.WHITE);
                    btn[1].setForeground(Color.WHITE);
                    btn[2].setForeground(Color.WHITE);
                    btn[4].setForeground(Color.WHITE);
                    btn[5].setForeground(Color.WHITE);
                    btn[6].setForeground(Color.WHITE);
                    btn[8].setForeground(Color.WHITE);
                    btn[9].setForeground(Color.WHITE);
                    btn[10].setForeground(Color.WHITE);
                    btn[12].setForeground(Color.WHITE);
                    btn[13].setForeground(Color.WHITE);
                    btn[14].setForeground(Color.WHITE);
                    btn[16].setForeground(Color.WHITE);
                    btn[17].setForeground(Color.WHITE);
                    btn[18].setForeground(Color.WHITE);
                    btn[19].setForeground(Color.WHITE);
        
                    addWindowListener(new WindowAdapter()
                    {
            
                        public void windowClosing(WindowEvent we) 
                        {
                            System.exit(0);
                        }
                    });
                }
        
            public void actionPerformed(ActionEvent ae) 
            {
            
                String str = ae.getActionCommand();
                
                if(str.equals("+")) 
                {
                
                    op = '+';
                    n1 = Double.parseDouble(tf.getText());
                    tf.setText("");
                }
                else if(str.equals("-")) 
                {
                    op = '-';
                    n1 = Double.parseDouble(tf.getText());
                    tf.setText("");
                }
                else if(str.equals("x")) 
                {
                    op = '*';
                    n1 = Double.parseDouble(tf.getText());
                    tf.setText("");
                }
                else if(str.equals("/")) 
                {
                    op = '/';
                    n1 = Double.parseDouble(tf.getText());
                    tf.setText("");
                }
                else if(str.equals("%")) 
                {
                    op = '%';
                    n1 = Double.parseDouble(tf.getText());
                    tf.setText("");
                }
                else if(str.equals("=")) 
                {
                
                    n2 = Double.parseDouble(tf.getText());
                
                    switch(op) 
                    {
                    
                    case '+' : result = n1 + n2;
                            break;
                    case '-' : result = n1 - n2;
                            break;
                    case '*' : result = n1 * n2;
                            break;
                    case '/' : result = n1 / n2;
                            break;
                    case '%' : result = n1 % n2;
                            break;
                        
                    }
                   tf.setText(result + "");
                   result = 0;
                }
                else if(str.equals("AC")) 
                {
                   
                   tf.setText(""); 
                   n1 = n2 = result = 0;
                }
                  
                else if(str.equals("DEL")) 
                {
                    if(tf.getText().equals(""))
                    {
                            tf.setText(""); 
                    }
                    else
                    {
                        String res="";
                        String s=tf.getText();
                        for(int i=0;i<s.length()-1;i++)
                        {
                            res+=s.charAt(i);
                        }
                        tf.setText(res);
                    }
                }
          
                else 
                {
                        tf.setText(tf.getText() + str);
                }
            }
 
             public static void main(String args[]) 
             {
              
                  Calculator c = new Calculator();
                  c.setTitle("Calculator 2.0");
                  c.setSize(450,575);
                  c.setLocation(500,250);
                  c.setVisible(true);
            }
}
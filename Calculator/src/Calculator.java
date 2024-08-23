import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

    boolean isOperatorClicked=false;
    
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton,divButton,mulButton,minusButton,plusButton,clearButton;
    
    String oldValue,newValue,signOp;
    
    Float result;

    public Calculator(){
        jf = new JFrame("Calculator");   //title
        jf.setLayout(null);
        jf.setSize(600, 600);           //size of the frame
        jf.setLocation(300, 150);
        jf.setVisible(true);                        //for the frame to be visible
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to kill the program automatically while closing the frame

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true); //to see the background default opaque is false
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel); //to add display label to frame

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenButton);
        sevenButton.addActionListener(this);
        
        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80); //seven has width 80 so 30 from side + size of 7 + gap(20) should be the x value
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);
        nineButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fourButton);
        fourButton.addActionListener(this);
        
        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80); 
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sixButton);
        sixButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(oneButton);
        oneButton.addActionListener(this);
        
        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80); 
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(threeButton);
        threeButton.addActionListener(this);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(dotButton);
        dotButton.addActionListener(this);
        
        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80); 
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(equalButton);
        equalButton.addActionListener(this);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(divButton);
        divButton.addActionListener(this);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(mulButton);
        mulButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(minusButton);
        minusButton.addActionListener(this);

        plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(plusButton);
        plusButton.addActionListener(this);

        clearButton = new JButton("CLR");
        clearButton.setBounds(430, 130, 80, 80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
        jf.add(clearButton);
        clearButton.addActionListener(this);

    }
    public static void main(String[] args) {
        new Calculator();   

      }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sevenButton) {
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }  
        }
        else if (e.getSource()==eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }
       else if (e.getSource()==nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
       else if (e.getSource()==fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
       else if (e.getSource()==fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
                
            }
        }
       else if (e.getSource()==sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
       else if (e.getSource()==oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
       else if (e.getSource()==twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
       else if (e.getSource()==threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if (e.getSource()==dotButton) {
            if (isOperatorClicked) {
                displayLabel.setText(".");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+".");
            }
        }
        else if (e.getSource()==zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        }
        else if (e.getSource()==equalButton) { 
            newValue = displayLabel.getText();
            Float oldValueF = Float.parseFloat(oldValue);
            Float newValueF = Float.parseFloat(newValue);
            
            if (signOp=="+") {
                result = oldValueF+newValueF;
                
            }else if (signOp=="-") {
                result = oldValueF-newValueF;
            }else if (signOp=="x") {
                result = oldValueF*newValueF;
            }else if (signOp=="/") {
                result = oldValueF/newValueF;
            }
            
            displayLabel.setText(result+"");   // to display result as string
        }
        else if (e.getSource()==divButton) { 
            signOp="/";                         
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }
        else if (e.getSource()==mulButton) { 
            signOp="x";                         
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }
        else if (e.getSource()==minusButton) { 
            signOp="-";                         
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }
        else if (e.getSource()==plusButton) { 
            signOp="+";                         //to check the operator
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
        }
        else if (e.getSource()==clearButton) { 
            displayLabel.setText("");
        }
       

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

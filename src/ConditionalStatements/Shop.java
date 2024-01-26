package ConditionalStatements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
//товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
//хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
//[сумма сдачи]”
public class Shop implements ActionListener  {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[3];
    JButton[] functionButtons = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1=0,num2=0,result=0;
    char operator;


    Shop() {
        frame = new JFrame("Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        frame.add(textField);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

//        for (int i = 0; i < 10; i++) {
//            numberButtons[i] = new JButton(String.valueOf(i));
//            numberButtons[i].addActionListener(this);
//            numberButtons[i].setFont(myfont);
//            numberButtons[i].setFocusable(false);
//        }
        for(int i =0;i<10;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);


        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);

    }


    public static void eighthTaskSolution () {
        Shop shop = new Shop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

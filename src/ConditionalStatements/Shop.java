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
    JButton addButton,subButton,muButton,divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myfont = new Font("Ink Free", Font.BOLD, 30);
    double num1=0,num2=0,result=0;
    char operator;


    Shop() {

    }

    public static void eighthTaskSolution () {
        Shop shop = new Shop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

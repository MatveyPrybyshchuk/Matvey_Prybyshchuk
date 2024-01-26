package ConditionalStatements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

//Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
//товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
//хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
//[сумма сдачи]”
public class Shop implements ActionListener {

    JFrame frame;
    JTextField helloTextField, priceFieldForGoodFirst, priceFieldForGoodSecond, priceFieldForGoodThird, priceField, inputField, resultTextField;
    JButton[] goodButtons = new JButton[2];
    JButton goodFirst, goodSecond, goodThird, calculateBtn;
    JPanel panel;

    Font bigFont = new Font("Arial", Font.PLAIN, 35);
    Font smallFont = new Font("Arial", Font.PLAIN, 15);
    double selectedPrice = 0, money = 0;
    double price1 = 100, price2 = 200, price3 = 300;


    //Функция приведения внешнего вида в норму
    public static JTextField fontsToNormal(JTextField el) {
        el.setHorizontalAlignment(JLabel.CENTER);
        return el;
    }

    Shop() {
        frame = new JFrame("Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 750);
        frame.setLayout(null);

        helloTextField = new JTextField();
        helloTextField.setBounds(50, 10, 400, 50);
        helloTextField.setFont(bigFont);
        helloTextField.setText("Меню");
        //priceFieldForGoodFirst.setHorizontalAlignment(JLabel.CENTER);
        helloTextField.setEditable(false);
        //textFieldHello.setBackground(Color.GRAY);

        //fontsToNormal(helloTextField);

        panel = new JPanel();
        panel.setBounds(50, 80, 400, 200);
        panel.setLayout(new GridLayout(2, 3, 10, 10));
        //panel.setBackground(Color.GRAY);

        priceFieldForGoodFirst = new JTextField(String.valueOf(price1));
        priceFieldForGoodFirst.setFont(smallFont);
        priceFieldForGoodFirst.setEditable(false);
        priceFieldForGoodFirst.setHorizontalAlignment(JLabel.CENTER);



        priceFieldForGoodSecond = new JTextField(String.valueOf(price2));
        priceFieldForGoodSecond.setFont(smallFont);
        priceFieldForGoodSecond.setEditable(false);
        priceFieldForGoodSecond.setHorizontalAlignment(JLabel.CENTER);
        priceFieldForGoodThird = new JTextField(String.valueOf(price3));
        priceFieldForGoodThird.setFont(smallFont);
        priceFieldForGoodThird.setEditable(false);
        priceFieldForGoodThird.setHorizontalAlignment(JLabel.CENTER);



        goodFirst = new JButton("Товар 1");
        goodFirst.addActionListener(this);
        goodSecond = new JButton("Товар 2");
        goodSecond.addActionListener(this);
        goodThird = new JButton("Товар 3");
        goodThird.addActionListener(this);



        priceField = new JTextField("Цена: ");
        priceField.setBounds(200, 320, 100, 50);
        priceField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        priceField.setFont(smallFont);
        priceField.setEditable(false);

        inputField = new JTextField();
        inputField.setBounds(50, 410, 400, 50);
        inputField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        inputField.setFont(smallFont);
        inputField.setText("Введите сумму: ......");
        inputField.setEditable(true);
        inputField.setHorizontalAlignment(JLabel.CENTER);

        calculateBtn = new JButton("Рассчитать");
        calculateBtn.addActionListener(this);
        calculateBtn.setBounds(100, 500, 300, 80);

        resultTextField = new JTextField();
        resultTextField.setBounds(50, 610, 400, 50);
        resultTextField.setFont(bigFont);
        resultTextField.setText("");
        resultTextField.setEditable(false);
        resultTextField.setHorizontalAlignment(JLabel.CENTER);

        panel.add(priceFieldForGoodFirst);
        panel.add(priceFieldForGoodSecond);
        panel.add(priceFieldForGoodThird);
        panel.add(goodFirst);
        panel.add(goodSecond);
        panel.add(goodThird);


        frame.add(panel);
        frame.add(helloTextField);
        frame.add(priceField);
        frame.add(inputField);
        frame.add(calculateBtn);
        frame.add(resultTextField);
        frame.setVisible(true);

        showMessageDialog(null, "Выберите товар, введите сумму средств, которой располагаете и нажмите на кнопку 'Рассчитать'");

    }


    public static void eighthTaskSolution() {
        Shop shop = new Shop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == goodFirst) {
            priceField.setText("Цена: " + price1);
            selectedPrice = price1;
        }
        if (e.getSource() == goodSecond) {
            priceField.setText("Цена: " + price2);
            selectedPrice = price2;
        }
        if (e.getSource() == goodThird) {
            priceField.setText("Цена: " + price3);
            selectedPrice = price3;
        }

        if (e.getSource() == calculateBtn && selectedPrice > 0) {
            money = Double.parseDouble(inputField.getText());
            if (selectedPrice > money) {
                resultTextField.setText("Денег не хватает!");
                resultTextField.setBackground(Color.ORANGE);
            }
            else if (selectedPrice == money) {
                resultTextField.setText("Спасибо за покупку!");
                resultTextField.setBackground(Color.GREEN);
            }
            else if (selectedPrice < money) {
                resultTextField.setText("Ваша сдача: " + (money - selectedPrice));
                resultTextField.setBackground(Color.GREEN);
            }
            else {
                resultTextField.setText("Что-то пошло не так, попробуйте позже");
                resultTextField.setBackground(Color.RED);
            }
        }
    }
}
//resultTextField.setBackground(Color);
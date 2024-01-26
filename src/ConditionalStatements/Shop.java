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
    JTextField helloTextField, priceFieldForGoodFirst, priceFieldForGoodSecond, priceFieldForGoodThird, priceField, inputFieldText, inputField, resultTextField;
    JButton goodFirst, goodSecond, goodThird, calculateBtn;
    JPanel panel;

    static Font myFont = new Font("Arial", Font.BOLD, 15);
    double selectedPrice = 0, money = 0;
    double price1 = 100, price2 = 200, price3 = 300;


    public static JTextField fieldViewToNormal(JTextField el) {
        el.setHorizontalAlignment(JLabel.CENTER);
        el.setFont(myFont);
        el.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        el.setFocusable(false);
        return el;
    }
    public static JButton buttonViewToNormal(JButton el) {
        el.setHorizontalAlignment(JLabel.CENTER);
        el.setFont(myFont);
        el.setFocusable(false);
        return el;
    }

    Shop() {
        frame = new JFrame("Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 750);
        frame.setLayout(null);

        helloTextField = new JTextField();
        helloTextField.setBounds(50, 10, 400, 50);
        helloTextField.setText("МЕНЮ");
        helloTextField.setEditable(false);
        fieldViewToNormal(helloTextField);

        panel = new JPanel();
        panel.setBounds(50, 80, 400, 200);
        panel.setLayout(new GridLayout(2, 3, 10, 10));
        //panel.setBackground(Color.GRAY);

        priceFieldForGoodFirst = new JTextField(String.valueOf("Br " + price1));
        priceFieldForGoodFirst.setEditable(false);
        fieldViewToNormal(priceFieldForGoodFirst);

        priceFieldForGoodSecond = new JTextField(String.valueOf("Br " + price2));
        priceFieldForGoodSecond.setEditable(false);
        fieldViewToNormal(priceFieldForGoodSecond);

        priceFieldForGoodThird = new JTextField(String.valueOf("Br " + price3));
        priceFieldForGoodThird.setEditable(false);
        fieldViewToNormal(priceFieldForGoodThird);


        goodFirst = new JButton("Банан");
        buttonViewToNormal(goodFirst);
        goodFirst.addActionListener(this);
        goodSecond = new JButton("Виноград");
        buttonViewToNormal(goodSecond);
        goodSecond.addActionListener(this);
        goodThird = new JButton("Манго");
        buttonViewToNormal(goodThird);
        goodThird.addActionListener(this);



        priceField = new JTextField("Цена: ");
        priceField.setBounds(195, 320, 105, 50);
        priceField.setEditable(false);
        fieldViewToNormal(priceField);

        inputFieldText = new JTextField();
        inputFieldText.setBounds(50, 410, 160, 50);
        inputFieldText.setText("Введите сумму:");
        inputFieldText.setEditable(false);
        fieldViewToNormal(inputFieldText);

        inputField = new JTextField();
        inputField.setBounds(220, 410, 230, 50);
        inputField.setText("");
        inputField.setEditable(true);
        inputField.setHorizontalAlignment(JLabel.CENTER);
        inputField.setFont(myFont);
        inputField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        //fieldViewToNormal(inputField);

        calculateBtn = new JButton("Рассчитать");
        calculateBtn.addActionListener(this);
        calculateBtn.setBounds(100, 500, 300, 80);
        buttonViewToNormal(calculateBtn);

        resultTextField = new JTextField();
        resultTextField.setBounds(50, 610, 400, 50);
        resultTextField.setText("");
        resultTextField.setEditable(false);
        fieldViewToNormal(resultTextField);



        panel.add(priceFieldForGoodFirst);
        panel.add(priceFieldForGoodSecond);
        panel.add(priceFieldForGoodThird);
        panel.add(goodFirst);
        panel.add(goodSecond);
        panel.add(goodThird);


        frame.add(panel);
        frame.add(helloTextField);
        frame.add(priceField);
        frame.add(inputFieldText);
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
            priceField.setText("Цена: " + price1 + " Br");
            selectedPrice = price1;
        }
        if (e.getSource() == goodSecond) {
            priceField.setText("Цена: " + price2 + " Br");
            selectedPrice = price2;
        }
        if (e.getSource() == goodThird) {
            priceField.setText("Цена: " + price3 + " Br");
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

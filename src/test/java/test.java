import javax.swing.*;
import java.awt.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Гонки в 2D");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Car car = new Car("Volvo",50,100);
        System.out.println(car.getName());


        JPanel statusBar = new JPanel();
        JLabel hpBar = new JLabel("Прочность - " + car.getHp());
        JLabel speedBar = new JLabel("Скорость - " + car.getSpeed());
        statusBar.add(hpBar);
        statusBar.add(speedBar);
        frame.add(statusBar, BorderLayout.NORTH);

        JPanel canvas = new JPanel();
        frame.add(canvas,BorderLayout.CENTER);

        JPanel menu= new JPanel();
        JButton startButton = new JButton("Старт");
        menu.add(startButton);
        frame.add(menu, BorderLayout.SOUTH);





        frame.pack();
        frame.setVisible(true);
    }

}

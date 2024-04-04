package org.vladislava_g;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Walk {

    protected static void flyingTogether(){
        Scanner scanner = new Scanner(System.in);

        final int distance = 20;

        System.out.println("Введите скорость кукушки " + "\n" +
                "Введите время (дедлайн) для кукушки, чтобы выполнить путь от Start до Fish (в минутах)");

        long maxSpeed = scanner.nextLong();
        byte deadline = scanner.nextByte();

        System.out.println("Вы ввели скорость (км/ч): "  + maxSpeed +
                ", введенный дедлайн (в минутах): " + deadline);

        if(((distance / maxSpeed) * deadline) % 2 == 0){
            System.out.println("Вау, у кукушки все получилось!");
        }else {
            System.out.println("Кукушке надо немного постараться :(, попробуйте еще раз!");
        }
    }

    protected static void coordinateCuckoo(){
        final String startCoordinate = ("0.0.0");
        List<Cuckoo> listCoordinate = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 300; i++) {
            listCoordinate.add(new Cuckoo(random.nextInt(1,100), random.nextInt(1, 100), random.nextInt(1, 100)));
        }
        int randomCoordinate = new Random().nextInt(listCoordinate.size());
        String stringRandomCoordinate = listCoordinate.get(randomCoordinate).toString();
        System.out.println("Птичка очень старалась, она пролетела с координаты " + startCoordinate +
                " до координат " + stringRandomCoordinate );
    }
}

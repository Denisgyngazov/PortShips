package com.company;

import com.company.Fleet.FleetShips;
import com.company.Ships.Cargo;
import com.company.Ships.Ships;
import com.company.Ships.Passenger;
import com.company.Ships.War;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {
        setupFleetShips();
    }

    public static void setupFleetShips() {
        FleetShips newFleetShips = new FleetShips();
        War newWarOne = new War("Военный");
        War newWarTwo = new War("Военный");
        Cargo newCargo = new Cargo("Грузовой");
        Passenger newPassengerOne = new Passenger("Пассажирский");
        Passenger newPassengerTwo = new Passenger("Пассажирский");

        newFleetShips.addShips(newPassengerOne);
        newFleetShips.addShips(newPassengerTwo);
        newFleetShips.addShips(newCargo);
        newFleetShips.addShips(newWarOne);
        newFleetShips.addShips(newWarTwo);

        while (true) {
            setupMenu();
            int switchMenu;
            Scanner scanner = new Scanner(System.in);
            String scannerMenu = scanner.nextLine();
            switchMenu = Integer.parseInt(scannerMenu);

            switch (switchMenu) {
                case 1:
                    for (Ships s : newFleetShips.getShips()) {
                        System.out.println(s.getShips());
                    }
                    System.out.println("Кол-во кораблей во флоте: " + newFleetShips.countShips());
                    break;
                case 2:
                    for (Ships s : newFleetShips.getShips()) {
                        System.out.println(s.signal());

                    }
                    break;
                case 3:
                    TreeMap<String, Integer> result = new TreeMap<>();
                      for (Ships s: newFleetShips.getShips()) {
                           if(result.containsKey(s.getClass().getSimpleName())) {
                               result.put(s.getClass().getSimpleName(),result.get(s.getClass().getSimpleName()) + 1);
                           } else {
                               result.put(s.getClass().getSimpleName(),1);
                           }
                       }

                   for (Map.Entry<String, Integer> entry: result.entrySet()) {
                       switch (entry.getKey()) {
                           case "Passenger" -> System.out.print("Пассажирский" + " - " + entry.getValue() + ", ");
                           case "Cargo" -> System.out.print("Грузовой" + " - " + entry.getValue() + ", ");
                           case "War" -> System.out.print("Военный" + " - " + entry.getValue() + " ");
                           default -> System.out.println();
                       }
                   }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Введено некорректное значение");
            }
        }
    }

    private static void setupMenu() {
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Вывести флот");
        System.out.println("2 - Отправить флот");
        System.out.println("3 - Типы кораблей");
        System.out.println("0 - Выйти");
        System.out.println("--------------------------");
    }
}
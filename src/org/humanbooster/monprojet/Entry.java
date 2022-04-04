package org.humanbooster.monprojet;

import org.humanbooster.monprojet.model.*;
import org.humanbooster.monprojet.model.restaurant.Dessert;
import org.humanbooster.monprojet.model.restaurant.Drink;
import org.humanbooster.monprojet.model.restaurant.MainCourse;
import org.humanbooster.monprojet.model.restaurant.Order;

import java.util.*;
import java.util.stream.Collectors;

public class Entry {
    public static void main(String[] args) {

        //exo1();
        //exo2();
         //exo3();
        //exo4();
        //exo5();
        //exo6();
       // exo7();
       //exo8();
        exo9();

    }

    public static void exo9(){

        System.out.println(Dessert.CHOCOSNACK.getPrice());
        System.out.println(Drink.BEER.getPrice());
        System.out.println(MainCourse.CHICKEN.getPrice());

        Order o = new Order("001", Drink.BEER, MainCourse.CHICKEN, Dessert.ICECREAM);
        System.out.println("total " + o.totalPrice()+ "Euros");


    }

    public static void exo8(){

        //association Printer au Repartitor


            Computer c1 = new Computer("Poste 1");
            Computer c2 = new Computer("Poste 2");
            Computer c3 = new Computer("Poste 3");

            Printer p1 = new Printer("Printer 1");
            Printer p2 = new Printer("Printer 2");

            Repartitor.getInstance().getPrinters().add(p1);
            Repartitor.getInstance().getPrinters().add(p2);
            c2.print();
            c1.print();
            c1.print();
            c3.print();


        //c1.name imprime hello sur p1.name, etc///

    }

    public static void exo7(){


        CarInfo ci1 = new CarInfo("789456","Audi");

            Car c1 =new Car("123456","Ford",300);
            Car c2 = new Car("654321", "Bentley", 500);
            Car c3 = new Car(ci1, 185);
            Car c4 = new Car("654987", "Ford", 210);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        Parking p = new Parking("laylow", "LA", "5th avenue");
        p.add(c1);
        p.add(c2);
        System.out.println(p.getCar());


    }

    public static void exo6(){
            BankInfo bi = new BankInfo("azerty", "wxcv");
            Status st = new Status(2012);
            Company c = new Company("CGI");

            Employee e1 =  new Employee("a", "b", 456, c, bi, st);

        System.out.println(e1);
    }

    public static  void exo5(){
        ArrayList<Computer> idC = new ArrayList<>();
//        idC.add(new Computer("HP",3));
//        idC.add(new Computer("PB",5));
//        idC.add(new Computer("HP",4));


        for (Computer computer : idC) {
            System.out.println(computer);
        }
    }

    public static void exo4(){

        HashSet<Car> car = new HashSet<>();

//        car.add(new Car("a", "z", "e"));
//        car.add(new Car("a", "z", "e"));
//        car.add(new Car("a","y", "e"));

        System.out.println(car.size());
        for (Car c : car) {
            System.out.println(c);
        }





    }

    public static void exo2(){
        Person p1 = new Person("Maxime");
        Person p2 =  new Person("Eve", 27);

        p1.introducing();
        p2.introducing();

        System.out.println(p1);
        System.out.println(p2);

        HashMap<String, String> personnes = new HashMap<>();

        personnes.put("111", "JC");
        personnes.put("222", "MJ");
        personnes.put("333", "MD");
        personnes.put("444", "JM");

        Set<String> keys = personnes.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("..........................");
        Collection values = personnes.values();
        for (Object value : values) {
            System.out.println(value);
        }

    }

    public static void exo1(){

        Bike b1 = new Bike("Commencal", 27);

        Bike b2 = new Bike("Giant", 29);

        Bike b3 = new Bike("Trek", 29, "green");


        b1.display();
        b2.display();
        b3.display();
        System.out.println(b3);

    }



    public static void exo3(){


//        HashMap<Orc, ArrayList<Orc>> equipes = new HashMap<>();
//
//
//        Orc c1 = new Orc(50,50, "c1");
//        Orc c2 = new Orc(50,50, "c2");
//
//        ArrayList<Orc> team1 = new ArrayList<>();
//        ArrayList<Orc> team2 = new ArrayList<>();
//
//
//        team1.add(new Orc(10,10,"a1"));
//        team1.add(new Orc(10,10,"b1"));
//        team1.add(new Orc(10,10,"d1"));
//
//        team2.add(new Orc(10,10,"a2"));
//        team2.add(new Orc(10,10,"b2"));
//        team2.add(new Orc(10,10,"d2"));
//
//        equipes.put(c1, team1);
//        equipes.put(c2, team2);
//
//        int teamCount = 0;
//
//        for (Orc orc : equipes.keySet()){
//            System.out.println("Equipe"+ ++teamCount);
//            System.out.println("chef" + orc.getName());
//
//            ArrayList<Orc> equipe = equipes.get(orc);
//            System.out.println("membres");
//            for (Orc orcTeam :  equipe){
//                System.out.println(orcTeam.getName());
//            }
//        }


        Scanner sc = new Scanner(System.in);
        ArrayList<Orc> list = new ArrayList<>();
        boolean exit = false;
        System.out.println("Bonjour");

        while(!exit){

            System.out.println(("1: ajouter un Orc"));
            System.out.println(("2: supprimer un Orc"));
            System.out.println(("3: afficher la force totale"));
            System.out.println(("4: lister les orcs"));
            System.out.println(("5: quitter"));
            System.out.print("Que voulez-vous faire ? ");
            int choice = Integer.parseInt(sc.nextLine());


            switch(choice){
                case 1:
                    System.out.println("Créer votre orc :");
                    System.out.println("Nom : ");
                    String name = sc.nextLine();
                    System.out.println("Force : ");
                    int force = Integer.parseInt(sc.nextLine());
                    System.out.println("Health : ");
                    int health = Integer.parseInt(sc.nextLine());
                    System.out.println("Bienvenue " + name);
                    list.add(new Orc(force, health, name));
                    break;
                case 2:
                    System.out.println("Quelle Orc voulez-vous supprimer ? ");
                    String orcName = sc.nextLine();
                    boolean deleteSucess = false;
                    Iterator it = list.iterator();

                    while(it.hasNext()){
                        Orc o = (Orc)  it.next();
                        if(o.getName().equalsIgnoreCase(orcName)){
                            it.remove();
                            deleteSucess = true;

                        }
                    }
                    System.out.println(deleteSucess ? "Adieu " + orcName: "Loupé");
                    break;

                case 3:
                    int total = 0;
                    for ( Orc orc : list) {
                        total += orc.getForce();
                    }
                    System.out.println("Le total des forces est de : " + total);
                    break;
                case 4:

                    for (Orc orc : list) {
                        System.out.println("Ils s'appellent : " + orc.getName());
                    }

                    break;
                case 5:
                    System.out.println("Merci, à bientôt!");
                    exit = true;
                    break;
            }
        }
    }

}




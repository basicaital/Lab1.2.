import java.util.Scanner;

class Lake{
    String name, location;
    double square;
}
public class InfoAboutLake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введите количесто: ");
        int kol= sc.nextInt();
        sc.nextLine();
        Lake ozer[]=new Lake[kol];
        System.out.println("Введите информацию об озерах: ");
        for (int i=0;i< ozer.length;i++){
            ozer[i]=new Lake();
            System.out.println("Введите имя озера: ");
            ozer[i].name=sc.nextLine();
            System.out.println("Где оно находится: ");
            ozer[i].location=sc.nextLine();
            System.out.println("Введите ее площадь:");
            ozer[i].square =sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\nХарактеристика озер: ");
        for(int i=0;i<ozer.length;i++){
            System.out.println(""+ozer[i].name+"\t"+ozer[i].location+"\t"+ozer[i].square+"кв.км");
        }
        int nommax=0;

        double max=ozer[nommax].square;
        for(int i=0;i< ozer.length;i++)
            if(ozer[i].square>max){
                max=ozer[i].square;
                nommax=i;
            }
        System.out.println("\nОзера с максимальной площадью: ");
        System.out.println(""+ozer[nommax].name+"\t"+ozer[nommax].square+"кв.км");

        double s=0;
        for(int i=0;i< ozer.length;i++)
            s+=ozer[i].square;
        double sr=s/ ozer.length;
        System.out.println("Средняя площадь ="+sr);
        System.out.println("\nОзера, с площадью меньше средней");
        for(int i=0;i< ozer.length;i++) {
            if (ozer[i].square < sr)
                System.out.println(ozer[i].name + "\t" + ozer[i].square + "кв.км");
        }
        sc.nextLine();
        System.out.println("Введите название искомой страны: ");
        String name=sc.nextLine();
        int nom=-1;
        for (int i=0;i< ozer.length;i++)
            if(name.equalsIgnoreCase(ozer[i].name))
                nom=i;
        if(nom!=-1){
            System.out.println("Такое озеро есть в списке. Это"+ozer[nom].name+" "+ozer[nom].square+"кв.км");
        }
        else System.out.println("Такого озера нет в списке!");


    }
}

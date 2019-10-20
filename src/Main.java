
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Enemy dragon = new Dragon();
        Enemy nord = new Nord();
        int x = 1;

        while (true) {
            if (x % 2 == 0) {
                System.out.println("Сейчас атакует дракон");
                Thread.sleep(100);
                nord.setHp(dragon.punch());
                System.out.println("У норда " + nord.getHp() + " здоровья");
                Thread.sleep(100);
                x++;
            } else {
                System.out.println("Сейчас атакует норд");
                Thread.sleep(100);
                dragon.setHp(nord.punch());
                System.out.println("У дракона " + dragon.getHp() + " здоровья");
                Thread.sleep(100);
                x++;
            }

            if (dragon.getHp() <= 0) {
                System.out.println("Норд выиграл");
                break;
            } else if (nord.getHp() <= 0) {
                System.out.println("Дракон выиграл");
                break;
            }
        }
    }
}
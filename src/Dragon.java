
public class Dragon extends Enemy {
    private int hp = 800;
    private int punch;

    @Override
    int punch() {
        int x = rnd(1, 50);

        if (x < 20) {
            punch = rnd(15, 80);
            System.out.println("Дракон нанёс " + punch + " урона");
            return punch;
        } else {
            System.out.println("Дракон промохнулся");
            return 0;
        }
    }

    @Override
    void setHp(int punch) {
        hp -= punch;
    }

    @Override
    int getHp() {
        return hp;
    }
}

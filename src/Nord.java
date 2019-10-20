public class Nord extends Enemy {
    private int hp = 500;
    private int punch;

    @Override
    int punch() {
        int x = rnd(1, 50);

        if (x < 45) {
            punch = rnd(30, 60);
            System.out.println("Норд нанёс " + punch + " урона");
            return punch;
        } else {
            System.out.println("Норд промохнулся промохнулся");
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

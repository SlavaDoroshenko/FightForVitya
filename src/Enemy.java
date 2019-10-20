abstract class Enemy {

    abstract int punch();
    abstract void setHp(int hp);
    abstract int getHp();

    static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}

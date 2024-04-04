package org.vladislava_g;

public class Cuckoo {
    private int x, y, z;

    public Cuckoo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return getX() + "." + getY() + "." + getZ();
    }
}

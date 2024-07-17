package org.example.interface_exer;

public class ComparableCircle extends Circle implements CompareObject {
    @Override
    public int compareTo(Object o) {
        ComparableCircle comparableCircle = new ComparableCircle();
//        比较的是地址值是否相等
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            if (this.getRedius() > ((ComparableCircle) o).getRedius()) {
                return 1;
            } else if (this.getRedius() < ((ComparableCircle) o).getRedius()) {
                return 2;

            }
        }
        return 3;
    }
}

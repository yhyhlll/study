package org.example.enum_exer;

public class Season {
    private final String seaSonName;
    private final String seasonDesc;


    private Season(String seaSonName, String seasonDesc) {
        this.seaSonName = seaSonName;
        this.seasonDesc = seasonDesc;
    }

  /*  public String getSeaSonName() {
        return seaSonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }*/

    public static final Season SPRING = new Season("春天", "aaa");

    @Override
    public String toString() {
        return "Season{" +
                "seaSonName='" + seaSonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

}

class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SPRING.getClass().getSuperclass());
        Integer integer = new Integer(1);
    }
}
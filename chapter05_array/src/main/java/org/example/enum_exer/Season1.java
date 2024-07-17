package org.example.enum_exer;

public enum Season1 {
     SPRING("春天","aaa");

    private String seaSonName;
    private String seasonDesc;


    Season1(String seaSonName, String seasonDesc) {
        this.seaSonName = seaSonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeaSonName() {
        return seaSonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    }
    class test{
        public static void main(String[] args) {
            String str=null;
            String s = new String(str.toString());
            extracted();
        }

        private static void extracted() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }

    }

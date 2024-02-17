package com.example.Selenium.SpeechToText;

interface DongVat {
    public static final String mau_long = "Vang";

    public void hanhDong();

    //  public void chucNang();

    public static void ancut() {
        System.out.println("oke");
    }
}

abstract class SucVat {

    String maulon = "maulon";

    void test() {
        System.out.println("ngu");
    }

    abstract void test2();
}

class test implements DongVat {

    @Override
    public void hanhDong() {
        DongVat.ancut();
    }

//    @Override
//    public void chucNang() {
//
//    }
}

class Main {
    public static void main(String[] args) {
        DongVat t = new test();
        t.hanhDong();

        DongVat dongVat = new DongVat() {

//            @Override
//            public void hanhDong() {
//
//            }

            @Override
            public void hanhDong() {

            }
        };
    }
}

class Main2 {
    public static void main(String[] args) {
        DongVat dongVat = () ->
            System.out.println("ok");
        dongVat.hanhDong();
    }
}

class a {
    <T extends Number> void test(T value) {
        System.out.println(value);
    }

}
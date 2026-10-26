package M05.TOPIC6;

class OS {
    OS() {
        System.out.println("O.S is installed");
    }

    void checkOs() {
        System.out.println("O.S is still executing");
    }
}

class Mobile {
    OS o = new OS();

    Mobile() {
        System.out.println("Mobile o.s is installed");
    }
}

class Main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOs();
    }
}
public class Main {

    public static void main(String[] args) {
        double round = Math.round(10.4);
        double ceil = Math.ceil(10.1);
        double floor = Math.floor(10.9);
        double random = Math.random();
        double randomFloat = Math.random() * 100;
        double randomFloatRound = Math.round(Math.random() * 100);
        int randomInt = (int) Math.round(Math.random() * 100);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);
        System.out.println(random);
        System.out.println(randomFloat);
        System.out.println(randomFloatRound);
        System.out.println(randomInt);
    }
}
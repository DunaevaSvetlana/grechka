public class Grechka {
    public static void main(String[] args) {
        int grechka = 102;
        int eatVasya = 6;
        int arendaVMes = 100;
        int stoimost;
        int sum = 0;

        while ((grechka - eatVasya) > eatVasya) {
            grechka = grechka - eatVasya;
            stoimost = grechka * arendaVMes;
            sum = sum + stoimost;
        }
        System.out.println("Для хранения гречки Василию понадобится " + sum + " рублей");
    }
}

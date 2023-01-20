public class Main {
    public static void main(String[] args) {
        CompositeDealers genelMudurluk = new CompositeDealers();

        CompositeDealers guneyDoguAnadoluMudurlugu = new CompositeDealers();
        CompositeDealers icAnadoluMudurlugu = new CompositeDealers();


        CompositeDealers ankaraBolgesi = new CompositeDealers();
        CompositeDealers siirtBolgesi = new CompositeDealers();

        CompositeDealers ankara1 = new CompositeDealers();
        CompositeDealers ankara2 = new CompositeDealers();
        CompositeDealers siirt1 = new CompositeDealers();

        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());

        ankara2.add(new WorkingPerson());

        siirt1.add(new WorkingPerson());

        ankaraBolgesi.add(ankara1);
        ankaraBolgesi.add(ankara2);

        siirtBolgesi.add(siirt1);
        icAnadoluMudurlugu.add(ankaraBolgesi);
        guneyDoguAnadoluMudurlugu.add(siirt1);

        genelMudurluk.add(icAnadoluMudurlugu);
        genelMudurluk.add(guneyDoguAnadoluMudurlugu);

        System.out.println("-------------------------------");
        System.out.println("Ankara 1 bayi maliyeti: " + ankara1.getCost());
        System.out.println("Ankara 2 bayi maliyeti: " + ankara2.getCost());
        System.out.println("Ankara bolge maliyeti: " + ankaraBolgesi.getCost());
        System.out.println("***********************");
        System.out.println("Siirt 1 bayi maliyeti: " + siirt1.getCost());
        System.out.println("Siirt bolge maliyeti: " + siirtBolgesi.getCost());
        System.out.println("***********************");
        System.out.println("Ic anadolu mudurlugu maliyeti: " + icAnadoluMudurlugu.getCost());
        System.out.println("***********************");
        System.out.println("Toplam malliyet: " + genelMudurluk.getCost());
        System.out.println("***********************");
    }
}
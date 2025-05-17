public class SLLMain18 {
    public static void main(String[] args) {
        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 m1 = new Mahasiswa18("22212201", "Rifat", "1A", 3.9);
        Mahasiswa18 m2 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
        Mahasiswa18 m3 = new Mahasiswa18("23212201", "Bimon", "2B", 3.8);
        Mahasiswa18 m4 = new Mahasiswa18("22212203", "Sharren", "1F", 4.0);

        sll.addFirst(m1);
        sll.addLast(m2);
        sll.addLast(m3);
        sll.addLast(m4);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}

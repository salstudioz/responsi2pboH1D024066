class analisisMesin {
    public static void main(String[] args) {
        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] daftarMesin = new defaultMesin[5];
        
        // Isi array dengan objek mesinMotor
        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinMotor("Yamaha R25", 250, "Sport");
        
        // Isi array dengan objek mesinTraktor
        daftarMesin[2] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        
        // Isi array dengan objek mesinTraktorListrik
        daftarMesin[3] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for (int i = 0; i < daftarMesin.length; i++) {
            daftarMesin[i].tampilInfo();
            System.out.println("Kategori: " + daftarMesin[i].kategoriMesin());
            System.out.println("Performa: " + daftarMesin[i].nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin mesin : daftarMesin) {
            if (mesin instanceof mesinMotor) {
                ((mesinMotor) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin).suaraMesin();
            } else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin mesinTerbaik = daftarMesin[0];
        for (int i = 1; i < daftarMesin.length; i++) {
            if (daftarMesin[i].nilaiPerforma() > mesinTerbaik.nilaiPerforma()) {
                mesinTerbaik = daftarMesin[i];
            }
        }
        System.out.println(mesinTerbaik.namaMesin + " → " + mesinTerbaik.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        for (int i = 0; i < daftarMesin.length - 1; i++) {
            for (int j = i + 1; j < daftarMesin.length; j++) {
                if (daftarMesin[i].nilaiPerforma() < daftarMesin[j].nilaiPerforma()) {
                    defaultMesin temp = daftarMesin[i];
                    daftarMesin[i] = daftarMesin[j];
                    daftarMesin[j] = temp;
                }
            }
        }
        
        // Tampilkan 3 teratas
        for (int i = 0; i < 3 && i < daftarMesin.length; i++) {
            System.out.println((i + 1) + ". " + daftarMesin[i].namaMesin + " → " + daftarMesin[i].nilaiPerforma());
        }
    }
}
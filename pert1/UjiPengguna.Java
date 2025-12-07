class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna dan isi datanya sesuai data uji coba
        Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60;
        p.tinggi = 170;

        // Panggil method tampilInfo
        p.tampilInfo();
        
        // Tampilkan demonstrasi tentang konstanta final
        System.out.println("--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Nilai ini tidak bisa diubah setelah diinisialisasi");
        
        // Jika mencoba menulis: p.faktorAktivitas = 1.5; Maka compiler akan menolak dengan error: 'cannot assign a value to final variable faktorAktivitas'
    }
}
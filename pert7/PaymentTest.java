public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi
        
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        
        // Membuat objek EWalletPayment dengan data: OVO, saldo 150000, nominal 50000
        EWalletPayment pembayaran = new EWalletPayment("OVO", 150000, 50000);
        
        // Menampilkan saldo awal
        System.out.println("Saldo awal: " + (int)pembayaran.getBalance());
        System.out.println("Memproses pembayaran sebesar 50000...\n");
        
        // Memproses pembayaran
        pembayaran.processPayment();
        
        // Menampilkan sisa saldo dan detail transaksi
        System.out.println("Sisa saldo: " + (int)pembayaran.getBalance());
        System.out.println("Detail Transaksi: " + pembayaran.getPaymentDetails());
    }
}
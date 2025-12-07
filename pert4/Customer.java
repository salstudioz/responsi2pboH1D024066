class Customer {
    // TODO: Buatkan atribut
    protected String nama;
    protected String nomorIdentitas;
    protected int totalBelanja;
    
    // TODO: Sediakan constructor
    Customer(String nama, String nomorIdentitas, int totalBelanja) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.totalBelanja = totalBelanja;
    }
    
    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " + nama + " | ID: " + nomorIdentitas + " | Total Belanja: Rp " + totalBelanja);
    }
}
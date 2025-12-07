class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    private int poinReward;
    private String levelKeanggotaan;
    
    // TODO: Buat constructor dengan super
    Member(String nama, String nomorIdentitas, int totalBelanja, 
           int poinReward, String levelKeanggotaan) {
        super(nama, nomorIdentitas, totalBelanja);
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }
    
    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + levelKeanggotaan);
    }
}
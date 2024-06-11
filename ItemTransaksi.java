
public class ItemTransaksi extends Produk {
    private Produk produk;
    private int jumlah;

    public ItemTransaksi(Produk produk, int jumlah) {
        super();
        this.produk = produk;
        this.jumlah = jumlah;
    }

    // setter & getter
    public Produk getProduk() {
        return produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotalHarga() {
        return produk.getHarga() * jumlah;
    }
}

public class VCD {
    protected String judul;
    protected String aktor;
    protected String sutradara;
    protected String publisher;
    protected String kategori;
    protected int stok;

    public VCD(String judul, String aktor, String sutradara, String publisher, String kategori, int stok) {
        this.judul = judul;
        this.aktor = aktor;
        this.sutradara = sutradara;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Aktor: " + aktor);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
    }
}
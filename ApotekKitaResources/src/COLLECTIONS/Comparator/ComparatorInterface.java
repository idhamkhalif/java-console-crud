package COLLECTIONS.Comparator;

public class ComparatorInterface{
    private String nama;
    private int jajan;
    
    public ComparatorInterface(String nm, int jj){
        this.nama = nm;
        this.jajan = jj;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJajan() {
        return jajan;
    }
    
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("Nama: "+nama+"\n");
        buffer.append("Uang Jajan: "+jajan+"\n");
        return buffer.toString();
    }
}
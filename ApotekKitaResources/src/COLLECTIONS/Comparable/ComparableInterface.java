package COLLECTIONS.Comparable;

public class ComparableInterface implements Comparable{
    private String nama;
    private int jajan;
    
    public ComparableInterface(String nm, int jj){
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
    
    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("Nama: "+nama+"\n");
        buffer.append("Uang Jajan: "+jajan+"\n");
        return buffer.toString();
    }

    @Override
    public int compareTo(Object t) {
        ComparableInterface ci = (ComparableInterface) t;
        
        if(this.jajan > ci.getJajan())
            return 1;
        else if(this.jajan < ci.getJajan())
            return -1;
        else
            return 0;
    }
}
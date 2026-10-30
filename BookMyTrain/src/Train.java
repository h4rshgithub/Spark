public class Train {
    private int number;
    private String name ;
   private  String src ;
    private String dest;
    private int totalSeats;
    private int avalSeats;

    public Train(int number, String name, String src, String dest, int totalSeats) {
        this.number = number;
        this.name = name;
        this.src = src;
        this.dest = dest;
        this.totalSeats = totalSeats;
        this.avalSeats = totalSeats;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSrc() {
        return src;
    }

    public String getDest() {
        return dest;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvalSeats() {
        return avalSeats;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setAvalSeats(int avalSeats) {
        this.avalSeats = avalSeats;
    }
    public boolean bookSeats(int cnt ){
        if(cnt <= avalSeats){
            avalSeats = avalSeats- cnt ;
            return true;
        }
        return  false;
    }



    public void  cancelSeats(int cnt ){
        avalSeats = avalSeats +cnt ;
//        System.out.println(cnt + " seats cancelled successfully refund intiated :)");
    }

    @Override
    public String toString() {
        return number + " | "+ name+ " | "+ src + " --> "+ dest + " | " + " Available : " + avalSeats;

    }
}

package practiceforneobis.week4;

public class SoldProducts {
    private int id;
    private String date;
    private int workerID;

    public SoldProducts(int id, String date, int workerID) {
        this.id = id;
        this.date = date;
        this.workerID = workerID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }
}

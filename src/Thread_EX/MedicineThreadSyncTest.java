package Thread_EX;


public class MedicineThreadSyncTest {

    public static void main(String[] args) {
        Cell cell = new Cell();

        for( int i=0; i< 10; i++) {
            MedicineThread t = new MedicineThread(cell);
            t.start();
        }

        try {
            Thread.sleep(500);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
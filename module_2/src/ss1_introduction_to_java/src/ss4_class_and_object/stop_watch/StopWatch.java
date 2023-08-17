package ss4_class_and_object.stop_watch;
public class StopWatch {
    private double startTime,endTime;
    private boolean flag;

    public double getStarTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
    public double starTime(){
      return this.startTime =  System.currentTimeMillis();
    }
    public void start(){
        if (flag) {
            System.out.println("stop watch dang chay");
            return;
        }
        this.startTime = System.currentTimeMillis();
        flag = true;
        System.out.println("stop watch da bat dau !");

    }
    public void stop(){
        if (!flag) {
            System.out.println("stop watch chua chay");
            return;
        }
         this.endTime = System.currentTimeMillis();
        flag = false;
        System.out.println("Stop watch da dung lai!");
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}

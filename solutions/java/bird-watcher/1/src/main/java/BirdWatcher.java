import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birds = new int[7];
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        // for(int i=0;i>7;i++){
        //     birds[i]=birdsPerDay[i];
        // }
        return birdsPerDay;
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
         birdsPerDay[6]+=1;
    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        // boolean isTrue = false;
        Arrays.sort(birdsPerDay);
        return Arrays.binarySearch(birdsPerDay, 0) != -1;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int count=0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        for(int i =0; i< numberOfDays;i++) {
            count+= birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int count =0;
        for(int i=0;i<7;i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}

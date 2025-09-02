public class Lasagna {
    int ExpectedTime = 40;
    public  int expectedMinutesInOven(){
        return ExpectedTime;
    }
   public   int remainingMinutesInOven(int time){
        return expectedMinutesInOven()-time;
    }
    public  int preparationTimeInMinutes(int layers){
        return 2*layers;
    }
    public int totalTimeInMinutes(int finalLayers, int timeInOven){
        return timeInOven+preparationTimeInMinutes(finalLayers);
    }
}

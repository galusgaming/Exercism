public class Lasagna {
    int ExpectedTime = 40;
    // TODO: define the 'expectedMinutesInOven()' method
    public  int expectedMinutesInOven(){
        return ExpectedTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
   public   int remainingMinutesInOven(int time){
        return ExpectedTime-time;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public  int preparationTimeInMinutes(int layers){
        return 2*layers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int finalLayers, int timeInOven){
        return timeInOven+preparationTimeInMinutes(finalLayers);
    }
}

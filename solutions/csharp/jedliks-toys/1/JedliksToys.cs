class RemoteControlCar
{
    private int distance = 0;
    private int battery = 100;
    public static RemoteControlCar Buy()
    {
        RemoteControlCar car = new RemoteControlCar();
        return car;
    }

    public string DistanceDisplay()
    {
        return $"Driven {distance} meters";
    }

    public string BatteryDisplay()
    {
        if (battery == 0)
        {
            return $"Battery empty";
        }

        return $"Battery at {battery}%";
    }

    public void Drive()
    {
        if (battery > 0)
        {
            this.distance+=20;
            this.battery-=1;
        }
        
    }
}

class Lasagna
{
    // TODO: define the 'ExpectedMinutesInOven()' method
    public int ExpectedMinutesInOven()
    {
        return 40; // The expected time in the oven is 40 minutes
    }

    // TODO: define the 'RemainingMinutesInOven()' method
    public int RemainingMinutesInOven(int minutes)
    {
        return ExpectedMinutesInOven() - minutes;
    }

    // TODO: define the 'PreparationTimeInMinutes()' method
    public int PreparationTimeInMinutes(int layers)
    {
        
        return layers*2;
    }

    // TODO: define the 'ElapsedTimeInMinutes()' method
    public int ElapsedTimeInMinutes(int layers, int minutes)
    {

        return (ExpectedMinutesInOven()-RemainingMinutesInOven(minutes))+PreparationTimeInMinutes(layers);
    }
}
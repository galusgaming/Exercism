public class Player
{
    public int RollDie()
    {
        int random = new Random().Next(1, 18);
        return random;
    }

    public double GenerateSpellStrength()
    {
        Random random = new Random();
        int strength1 = random.Next(0, 100);
        double strength = random.NextDouble();
        return (double)strength1+strength;
    }
}

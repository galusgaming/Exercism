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

        return random.NextDouble()*100;
    }
}

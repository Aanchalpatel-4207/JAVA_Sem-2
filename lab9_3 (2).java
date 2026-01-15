interface Playable 
{
    void play();
}


class Football implements Playable 
{
    public void play() 
    {
        System.out.println("Playing Football!");
    }
}

class Volleyball implements Playable 
{
   public void play() 
   {
        System.out.println("Playing Volleyball!");
    }
}
class Basketball implements Playable 
{
   public void play() 
   {
        System.out.println("Playing Basketball!");
    }
}

public class lab9_3 
{
    public static void main(String[] args) 
    {
        Playable f1 = new Football();
        Playable v1 = new Volleyball();
        Playable b1 = new Basketball();

        f1.play();
        v1.play();
        b1.play();
    }
}
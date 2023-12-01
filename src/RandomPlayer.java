class RandomPlayer {
    public void playGame(String gameName)
            throws InterruptedException
    {
        System.out.println(gameName + " game started");

        Thread.sleep(500);

        System.out.println(gameName + " game ended");
    }

    public void playMusic(String trackName)
            throws InterruptedException
    {
        System.out.println(trackName + " track started");

        Thread.sleep(500);

        System.out.println(trackName + " track ended");
    }
}
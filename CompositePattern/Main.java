class Main {
    public static void main(String[] args) {
        Directory animeDir = new Directory("Anime");
        Directory bollywoodDir = new Directory("Bollywood");

        File ZNMD = new File("ZNMD");
        File deathNote = new File("DeathNote");
        File dabang = new File("Dabang");

        animeDir.addFileToDirectory(deathNote);
        bollywoodDir.addFileToDirectory(ZNMD);
        bollywoodDir.addFileToDirectory(dabang);

        animeDir.addFileToDirectory(bollywoodDir);

        Directory rootDir = new Directory("root");
        rootDir.addFileToDirectory(animeDir);
        rootDir.ls();
    }
}
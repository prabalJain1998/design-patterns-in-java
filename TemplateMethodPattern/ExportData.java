public abstract class ExportData {
    public final void expotData() {
        readFile();
        formatFile();
        writeFile();
    }

    // fixed
    private void readFile() {
        System.out.println("We are reading some file");
    }

    // variable
    public abstract void formatFile();

    // fixed
    private void writeFile() {
        System.out.println("We are writing some file");
    }
}

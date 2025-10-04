class Main {
    public static void main(String[] args) {
        ExportData a1 = new CSVFormatExportData();
        ExportData a2 = new JSONFormatExportData();

        a1.expotData();
        a2.expotData();
    }
}
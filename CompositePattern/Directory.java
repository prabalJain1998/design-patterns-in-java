import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> files;
    String directoryName;

    Directory (String directoryName) {
        this.directoryName = directoryName;
        files = new ArrayList<>();
    }

    public void addFileToDirectory(FileSystem file) {
        files.add(file);
    } 

    @Override
    public void ls() {
        System.out.println(this.directoryName);
        for(FileSystem f:files) {
            f.ls();
        }
    }
}

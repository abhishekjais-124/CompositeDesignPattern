import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    List<FileSystem> directory = new ArrayList<>();
    String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystem){
        directory.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory inside " + directoryName);
        for (FileSystem fileSystem: directory){
            fileSystem.ls();
        }
    }
}

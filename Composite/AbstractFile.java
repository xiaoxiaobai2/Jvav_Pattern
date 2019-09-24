package Composite;

import java.util.ArrayList;
import java.util.List;

public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile{
    private String imageName;

    public ImageFile(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀图片文件:"+imageName);
    }
}

class File implements AbstractFile{
    private String Name;

    public File(String Name) {
        this.Name = Name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文件:"+Name);
    }
}

class VideoFile implements AbstractFile{
    private String Name;

    public VideoFile(String Name) {
        this.Name = Name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文件:"+Name);
    }
}

class Folder implements AbstractFile{
    private String Name;
    private List<AbstractFile> list=new ArrayList<>();

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }

    public Folder(String Name) {
        this.Name = Name;
    }

    @Override
    public void killVirus() {
        System.out.println("查杀文件夹:"+Name);
        for (AbstractFile f:
             list) {
            f.killVirus();
        }
    }
}
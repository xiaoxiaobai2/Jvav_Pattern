package Composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4,f5;
        Folder f1=new Folder("新建文件夹");
        f2=new ImageFile("老的的大头贴.img");
        f3=new VideoFile("小视频.mp4");
        f1.add(f2);
        f1.add(f3);
        Folder f6=new Folder("新建文件夹2");
        f4=new File("白夜行.txt");
        f5=new ImageFile("老的的大头贴.img");
        f6.add(f4);
        f6.add(f5);
        f1.add(f6);

        f1.killVirus();
    }
}

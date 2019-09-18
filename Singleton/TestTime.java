package Singleton;

import java.util.concurrent.CountDownLatch;

public class TestTime {
    public static void main(String[] args) throws InterruptedException {
        int threadNum=10;//线程数量
        long start=System.currentTimeMillis();
        final CountDownLatch countDownLatch=new CountDownLatch(threadNum);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                    for (int j = 0; j < 1000000; j++) {
                        Object o=SingletonDemo04.SINGLETON_DEMO_04;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end=System.currentTimeMillis();
        System.out.println("耗时：" +(end-start)+"ms");
    }
}

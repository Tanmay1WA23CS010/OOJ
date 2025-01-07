
class SharedResource {
    public synchronized void useResource(String threadName) {
        System.out.println(threadName + " is using the resource.");
        try {
                       Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " has finished using the resource.");
    }
}


class ThreadA extends Thread {
    private SharedResource resource1;
    private SharedResource resource2;


    public ThreadA(SharedResource resource1, SharedResource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }


    public void run() {
        synchronized (resource1) {
            System.out.println("Thread A: Holding resource 1...");
            try {
                // Simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread A: Waiting for resource 2...");
            synchronized (resource2) {
                resource1.useResource("Thread A");
            }
        }
    }
}


class ThreadB extends Thread {
    private SharedResource resource1;
    private SharedResource resource2;


    public ThreadB(SharedResource resource1, SharedResource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }


    public void run() {
        synchronized (resource2) {
            System.out.println("Thread B: Holding resource 2...");
            try {
                // Simulate some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread B: Waiting for resource 1...");
            synchronized (resource1) {
                resource2.useResource("Thread B");
            }
        }
    }
}


public class IPCAndDeadlockDemo {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();


        ThreadA threadA = new ThreadA(resource1, resource2);
        ThreadB threadB = new ThreadB(resource1, resource2);


        threadA.start();
        threadB.start();
    }
}


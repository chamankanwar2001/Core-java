class WelcomeThread extends Thread {
    public void run() {
        System.out.println("Welcome to India!");
    }

    public static void main(String[] args) {
        WelcomeThread thread = new WelcomeThread();
        thread.start();
    }
}

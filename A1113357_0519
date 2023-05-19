import java.util.Random;

public class A1113357_0519 {
    private static final int PORK_DUMPLINGS_AMOUNT = 5000;
    private static final int BEEF_DUMPLINGS_AMOUNT = 3000;
    private static final int VEGETABLE_DUMPLINGS_AMOUNT = 1000;

    private static int porkDumplingsLeft = PORK_DUMPLINGS_AMOUNT;
    private static int beefDumplingsLeft = BEEF_DUMPLINGS_AMOUNT;
    private static int vegetableDumplingsLeft = VEGETABLE_DUMPLINGS_AMOUNT;

    private static final int MIN_ORDER_SIZE = 10;
    private static final int MAX_ORDER_SIZE = 50;

    private static final Object lock = new Object(); // 用於同步的鎖

    public static void main(String[] args) {
        int numCustomers = getUserInput();
        serveCustomers(numCustomers);
    }

    private static int getUserInput() {
        // 獲取使用者輸入的同時光顧的顧客數目
        // 此處僅作示範，實際情況可能需要使用適當的I/O操作
        return 10;
    }

    private static void serveCustomers(int numCustomers) {
        for (int i = 1; i <= numCustomers; i++) {
            Thread customerThread = new Thread(() -> {
                // 點水餃數量
                int orderSize = generateOrderSize();
                // 點水餃種類
                String orderType = generateOrderType();
                // 點水餃
                orderDumplings(orderType, orderSize);
            });
            customerThread.start();

            try {
                Thread.sleep(3000); // 等待下一位顧客點餐前的暫停時間
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int generateOrderSize() {
        // 使用亂數生成顧客點水餃的數量
        return new Random().nextInt(MAX_ORDER_SIZE - MIN_ORDER_SIZE + 1) + MIN_ORDER_SIZE;
    }

    private static String generateOrderType() {
        // 使用亂數選取顧客點餐的水餃種類
        String[] dumplingTypes = {"豬肉水餃", "牛肉水餃", "蔬菜水餃"};
        int index = new Random().nextInt(dumplingTypes.length);
        return dumplingTypes[index];
    }

    private static void orderDumplings(String orderType, int orderSize) {
        synchronized (lock) { // 使用鎖確保同步
            if (orderType.equals("豬肉水餃")) {
                if (orderSize <= porkDumplingsLeft) {
                    porkDumplingsLeft -= orderSize;
                    System.out.println("點餐成功：顧客點了 " + orderSize + " 顆豬肉水餃");
                } else {
                    System.out.println("點餐失敗：豬肉水餃已售完");
                }
            } else if (orderType.equals("牛肉水餃")) {
                if (orderSize <= beefDumplingsLeft) {
                    beefDumplingsLeft -= orderSize;
                    System.out.println("點餐成功：顧客點了 " + orderSize + " 顆牛肉水餃");
                } else {
                    System.out.println("點餐失敗：牛肉水餃已售完");
                }
            } else if (orderType.equals("蔬菜水餃")) {
                if (orderSize <= vegetableDumplingsLeft) {
                    vegetableDumplingsLeft -= orderSize;
                    System.out.println("點餐成功：顧客點了 " + orderSize + " 顆蔬菜水餃");
                } else {
                    System.out.println("點餐失敗：蔬菜水餃已售完");
                }
            } else {
                System.out.println("點餐失敗：無效的水餃種類");
            }
        }
    }
}

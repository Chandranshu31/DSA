// can be directly solved without hashmap also

class Bank {
    HashMap<Integer, Long> map; // ith acc to balance
    int n;

    public Bank(long[] balance) {
        map = new HashMap<>();
        n = balance.length;
        for (int i = 0; i < n; i++) {
            map.put(i + 1, balance[i]); // 1-indexed accounts
        }
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 < 1 || account1 > n || account2 < 1 || account2 > n) return false;
        if (map.get(account1) < money) return false; // allow full-balance transfer
        map.put(account1, map.get(account1) - money);
        map.put(account2, map.get(account2) + money);
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account < 1 || account > n) return false;
        map.put(account, map.get(account) + money);
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account < 1 || account > n || map.get(account) < money) return false; // <-- fixed here
        map.put(account, map.get(account) - money);
        return true;
    }
}
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int totalImportance = 0;

        // Iterate over all employees
        for (Employee emp : employees) {
            if (emp.id == id) {
                totalImportance += emp.importance;
                // For each subordinate ID, recursively add their importance
                for (int subId : emp.subordinates) {
                    totalImportance += getImportance(employees, subId);
                }
                break; // once found, no need to continue scanning
            }
        }

        return totalImportance;
    }
}

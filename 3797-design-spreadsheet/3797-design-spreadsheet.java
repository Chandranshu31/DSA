class Spreadsheet {
    private Map<String, Integer> cells;

    public Spreadsheet(int rows) {
        cells = new HashMap<>();
        // rows is given but not actually needed since we only care about valid cells
    }

    public void setCell(String cell, int value) {
        cells.put(cell, value);
    }

    public void resetCell(String cell) {
        cells.remove(cell); // default value is 0 if absent
    }

    public int getValue(String formula) {
        // remove leading '='
        String expr = formula.substring(1);
        String[] parts = expr.split("\\+");

        int sum = 0;
        for (String part : parts) {
            if (Character.isDigit(part.charAt(0))) {
                // literal integer
                sum += Integer.parseInt(part);
            } else {
                // cell reference
                sum += cells.getOrDefault(part, 0);
            }
        }
        return sum;
    }
}

package pl.markopolo;

public class ColumnNumber {
    public int titleToNumber(String columnTitle) {

        int columnNumber = 0;

        for(int i = 0; i < columnTitle.length(); i++) {
            int currentColumn = columnTitle.charAt(i) - 'A' + 1;
            columnNumber = columnNumber * 26 + currentColumn;
        }

        return columnNumber;
    }
}

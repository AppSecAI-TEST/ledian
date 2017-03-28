package wang.sunce.util;

/**
 * Created by Sunce on 2017/3/25 0025.
 */
public class Field {
    private String columnName;
    private String columnTypeName;
    private String columnComment;
    private String columnLength;
    private int columnDataType;
    public String getColumnName() {
        return columnName;
    }
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
    public String getColumnTypeName() {
        return columnTypeName;
    }
    public void setColumnTypeName(String columnTypeName) {
        this.columnTypeName = columnTypeName;
    }
    public int getColumnDataType() {
        return columnDataType;
    }
    public void setColumnDataType(int columnDataType) {
        this.columnDataType = columnDataType;
    }
    public String getColumnComment() {
        return columnComment;
    }
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }
    public String getColumnLength() {
        return columnLength;
    }
    public void setColumnLength(String columnLength) {
        this.columnLength = columnLength;
    }

}

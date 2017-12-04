package dev.traendy.de.draganddrop;

/**
 * Created by speters on 03.12.17.
 */

public class ViewType {


    private int dataIndex;
    private int type;

    public ViewType(int dataIndex, int type) {
        this.dataIndex = dataIndex;
        this.type = type;
    }

    public int getDataIndex() {
        return dataIndex;
    }

    public int getType() {
        return type;
    }

}

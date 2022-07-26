package bgu.spl.mics.application.objects;

/**
 * Passive object representing a data used by a model.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */

public class DataBatch {
    private Data.Type dataType;
    private int gpuID;
    private int startIndex;
    private Data data;

    public DataBatch(Data data, int gpuID, int startIndex) {

    }

    public Data.Type getDataType() {
        return this.dataType;
    }
}

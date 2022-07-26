package bgu.spl.mics.application.objects;

import main.java.bgu.spl.mics.application.services.CPUService;

import java.util.Collection;

/**
 * Passive object representing a single CPU.
 * Add all the fields described in the assignment as private fields.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */


public class CPU {

    private int cores;
    private Cluster cluster;
    private Collection<DataBatch> toProcess;
    DataBatch currentBatch;
    private long ticks;
    private boolean processing = false;


    public CPU(int cores, Cluster cluster){
    }


    /**
     * @param: adding batch to Collection
     * @pre: none
     * @post: toProcess.size() == @pre(toProcess.size())+1
     */
    public void addBatch(DataBatch dataBatch){
    }

    /**
     * @pre: none
     * @post: none
     */
    public int batchesAwaiting()
    {
        return toProcess.size();
    }


    /**
     * @pre:none
     * @post: ticks = @pre(ticks)-1
     */
    public void updateTick()
    {
        ticks--;
        if (processing)
            checkProcessing();
    }


    /**
     * @pre:none
     * @post:none
     */
    public long getTime(){
        return this.ticks;
    }


    private void sendProcessedBatch(DataBatch dataBatch){}


    private void clear()
    {
        processing=false;
        currentBatch =null;
    }

    private void checkProcessing()
    {
        if(ticks==0){
            sendProcessedBatch(currentBatch);
            clear();
        }
    }

}

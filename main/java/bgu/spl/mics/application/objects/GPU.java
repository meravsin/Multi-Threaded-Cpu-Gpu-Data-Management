package bgu.spl.mics.application.objects;

import bgu.spl.mics.Event;
import bgu.spl.mics.application.services.GPUService;

import java.util.Queue;

/**
 * Passive object representing a single GPU.
 * Add all the fields described in the assignment as private fields.
 * Add fields and methods to this class as you see fit (including public methods and constructors).
 */
public class GPU {
    /**
     * Enum representing the type of the GPU.
     */
    enum Type {RTX3090, RTX2080, GTX1080}

    private Type type;
    private int id;
    private Cluster cluster;
    private Model currModel;
    private boolean processing=false;
    private long currTick;
    private Data currData;
    private int currCounter;
    private Queue<Event<?>>  dataQueue;
    private Queue<DataBatch> preCPUDataBatches;
    private Queue<DataBatch> postCPUDataBatches;
    private int processedCounter=0;
    private int currCapacity;
    private GPUService service;


    public GPU(GPU.Type type, int id, Cluster cluster){

    }

    /**
     *
     * @pre: this.getStatus == false
     * @post: this.getStatus == true
     */
    public void startTraining(Model model){
    }

    /**
     *
     * @pre: this.getStatus == false
     * @post: none
     */
    public boolean testModel(Model model){
        return false;
    }


    /**
     *
     * @pre: this.getCurrCapacity()>0
     * @post: this.getCurrCapacity==@pre(this.getCurrCapacity())-1
     * @post this.getCurrCapacity>=0
     */
    public void returnProcessedBatch(DataBatch batch){
    }

    /**
     *
     * @pre: this.getCurrCapacity()>=0
     * @post: this.getCurrCapacity()==@pre(this.getCurrCapacity())
     */
    public int getCurrCapacity(){
        return this.currCapacity;
    }

    /**
     *
     * @pre: none
     * @post: this.getStatus == @pre(this.getStatus())
     */
    public boolean getStatus(){
        return this.processing;
    }

    /**
     *
     * @pre: none
     * @post: this.currTime==@pre(this.currTime)+1
     */


    public void updateTick(){

    }

    private void splitToBatches(Data data){

    }
    private void sendData(){

    }

    private void modelTrainingComplete(){

    }

}

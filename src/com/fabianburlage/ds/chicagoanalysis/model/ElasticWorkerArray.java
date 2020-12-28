package com.fabianburlage.ds.chicagoanalysis.model;

public class ElasticWorkerArray {

    private Worker[] workerArray;
    private Worker[] auxiliaryWorkerArray;

    public ElasticWorkerArray() {


    }

    /**
     *
     * @param newWorker
     */

    public void addWorker(Worker newWorker){
        if(this.workerArray == null){
            this.workerArray = new Worker[1];
            this.workerArray[0] = newWorker;
        }
        this.auxiliaryWorkerArray = new Worker[this.workerArray.length + 1];
        for(int index = 0; index < this.workerArray.length; ++ index){
            this.auxiliaryWorkerArray[index] = this.workerArray[index];
        }
        this.auxiliaryWorkerArray[this.auxiliaryWorkerArray.length - 1] = newWorker;
        this.workerArray = this.auxiliaryWorkerArray;
    }

    /**
     *
     * @return
     */
    public Worker[] getWorkerArray() {
        return workerArray;
    }
}

package com.hspedu.extend_.exercise03;

public class ExtendsExercise03 {

    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "ibm");
        pc.printInfo();

        System.out.println("==============");

        NotePad notePad = new NotePad("intel", 16, 500, "silver");
        notePad.printInfo();

    }
}

class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int harddrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = harddrive;
    }

//    public Computer() {
//
//    }

    public String getDetails() {
       return "computer info = cpu " + cpu + " memory" + memory + " disk" + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}




package com.hspedu.file_.simulate_bufferReader_;

public class BufferReader_ {
    private Reader_ reader_;

    public BufferReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    public void readString(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }

}

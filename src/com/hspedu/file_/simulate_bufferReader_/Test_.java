package com.hspedu.file_.simulate_bufferReader_;

import com.hspedu.file_.writer_.StringReader;

public class Test_ {
    public static void main(String[] args) {
        BufferReader_ bufferReader_ = new BufferReader_(new FileReader_());
        bufferReader_.readFiles(10);
        BufferReader_ bufferReader_1 = new BufferReader_(new StringReader());
        bufferReader_1.readString(10);
    }
}
